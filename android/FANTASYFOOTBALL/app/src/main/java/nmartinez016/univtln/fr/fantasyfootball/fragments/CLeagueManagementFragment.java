package nmartinez016.univtln.fr.fantasyfootball.fragments;


import android.app.Activity;
import android.app.DialogFragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.actions.load.CLoadPublicFantasyLeaguesAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CFantasyLeagueJoinedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CFantasyLeagueSelectedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CLeagueCreatedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayersLoadedByGoals;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPublicFantasyLeaguesLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CTeamsLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyLeagueEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CTeamEntity;
import nmartinez016.univtln.fr.fantasyfootball.CStaticVariables;
import nmartinez016.univtln.fr.fantasyfootball.R;
import nmartinez016.univtln.fr.fantasyfootball.activities.CTabsActivity;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CGoalsRankingAdapter;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CMyLeaguesAdapter;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CTeamsRankingAdapter;
import nmartinez016.univtln.fr.fantasyfootball.dialogs.CCreateLeagueDialog;
import nmartinez016.univtln.fr.fantasyfootball.websocket.CMessageHandler;
import nmartinez016.univtln.fr.fantasyfootball.websocket.CTyrusClient;

/**
 * A simple {@link Fragment} subclass.
 */
public class CLeagueManagementFragment extends Fragment {
    private ListView mLeaguesListView;
    private Button mCreateLeagueButton;
    private Button mShowPublicLeaguesButton;
    private Button mMyLeaguesButton;
    private TextView mCurrentLeagueTextView;
    private BroadcastReceiver mBroadCastReceiverWS;
    private List<CFantasyLeagueEntity> mLeagues = new ArrayList<>();


    public CLeagueManagementFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View lRootView = inflater.inflate(R.layout.fragment_cleague_management, container, false);
        mCurrentLeagueTextView = (TextView) lRootView.findViewById(R.id.league_management_current_league);
        mLeaguesListView = (ListView) lRootView.findViewById(R.id.league_management_listview);
        mCreateLeagueButton = (Button) lRootView.findViewById(R.id.league_management_create_league);
        mShowPublicLeaguesButton = (Button) lRootView.findViewById(R.id.league_management_public_leagues);
        mMyLeaguesButton = (Button) lRootView.findViewById(R.id.league_management_my_leagues);
        mCurrentLeagueTextView.setText("current league : " + CStaticVariables.getUser().getCurrentFantasyTeam().getFantasyLeague().getName());
        mShowPublicLeaguesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CTyrusClient.sendMessage(new CLoadPublicFantasyLeaguesAction());
                mShowPublicLeaguesButton.setEnabled(false);
                mMyLeaguesButton.setEnabled(true);
            }
        });
        mCreateLeagueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity host = (Activity) getContext();
                DialogFragment lCreateLeagueDialog = new CCreateLeagueDialog();
                lCreateLeagueDialog.show(host.getFragmentManager(), "tag");
            }
        });

        mMyLeaguesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CMyLeaguesAdapter lAdapter = new CMyLeaguesAdapter(getContext(), CStaticVariables.getUser().getFantasyLeagues());
                mLeaguesListView.setAdapter(lAdapter);
                mMyLeaguesButton.setEnabled(false);
                mShowPublicLeaguesButton.setEnabled(true);
            }
        });

        CMyLeaguesAdapter lAdapter = new CMyLeaguesAdapter(getContext(), CStaticVariables.getUser().getFantasyLeagues());
        mLeaguesListView.setAdapter(lAdapter);
        mMyLeaguesButton.setEnabled(false);
        return lRootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        mBroadCastReceiverWS = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent pIntent) {
                // show public leagues
                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CPublicFantasyLeaguesLoadedAction.class.getName())){
                    CPublicFantasyLeaguesLoadedAction lPublicLeagues = (CPublicFantasyLeaguesLoadedAction) pIntent.getSerializableExtra(CMessageHandler.PUBLIC_FANTASY_LEAGUES);
                    mLeagues = lPublicLeagues.getFantasyLeagues();

                    CMyLeaguesAdapter lAdapter = new CMyLeaguesAdapter(getContext(), mLeagues);
                    mLeaguesListView.setAdapter(lAdapter);
                }
                // joined fantasy league
                else if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CFantasyLeagueJoinedAction.class.getName())){
                    CFantasyLeagueJoinedAction lFantasyLeagueJoined = (CFantasyLeagueJoinedAction) pIntent.getSerializableExtra(CMessageHandler.FANTASY_LEAGUE_JOINED);
                    CStaticVariables.setUser(lFantasyLeagueJoined.getUser());
                    CMyLeaguesAdapter lAdapter = new CMyLeaguesAdapter(getContext(), CStaticVariables.getUser().getFantasyLeagues());
                    mLeaguesListView.setAdapter(lAdapter);
                    mCurrentLeagueTextView.setText("current league : " + lFantasyLeagueJoined.getUser().getCurrentFantasyTeam().getFantasyLeague().getName());
                }

                // league created
                else if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CLeagueCreatedAction.class.getName())){
                    CLeagueCreatedAction lLeagueCreatedAction = (CLeagueCreatedAction) pIntent.getSerializableExtra(CMessageHandler.FANTASY_LEAGUE_CREATED);
                    if (CStaticVariables.getUser().getId().equals(lLeagueCreatedAction.getCreator().getId())){
                        CStaticVariables.setUser(lLeagueCreatedAction.getCreator());
                    }
                    CMyLeaguesAdapter lAdapter = new CMyLeaguesAdapter(getContext(), CStaticVariables.getUser().getFantasyLeagues());
                    mLeaguesListView.setAdapter(lAdapter);
                    mCurrentLeagueTextView.setText("current league : " + CStaticVariables.getUser().getCurrentFantasyTeam().getFantasyLeague().getName());
                    if (getActivity() instanceof CTabsActivity){
                        ((CTabsActivity)getActivity()).getSquadManagementFragment().getFieldView().invalidate();
                    }
                }

                // league selected
                else if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CFantasyLeagueSelectedAction.class.getName())){
                    CFantasyLeagueSelectedAction lFantasyLeagueSelected = (CFantasyLeagueSelectedAction) pIntent.getSerializableExtra(CMessageHandler.FANTASY_LEAGUE_SELECTED);
                    CStaticVariables.setUser(lFantasyLeagueSelected.getUser());
                    CMyLeaguesAdapter lAdapter = new CMyLeaguesAdapter(getContext(), CStaticVariables.getUser().getFantasyLeagues());
                    mLeaguesListView.setAdapter(lAdapter);
                    mCurrentLeagueTextView.setText("current league : " + CStaticVariables.getUser().getCurrentFantasyTeam().getFantasyLeague().getName());
                    if (getActivity() instanceof CTabsActivity){
                        ((CTabsActivity)getActivity()).getSquadManagementFragment().getFieldView().invalidate();
                    }
                }
            }
        };
        getActivity().registerReceiver(mBroadCastReceiverWS, new IntentFilter(CMessageHandler.INTENT_TYPE));
    }

    @Override
    public void onPause() {
        super.onPause();
        getActivity().unregisterReceiver(mBroadCastReceiverWS);
    }

    public List<CFantasyLeagueEntity> getLeagues(){
        return mLeagues;
    }

    public void setLeagues(List<CFantasyLeagueEntity> pLeagues){
        mLeagues = pLeagues;
    }

    public TextView getCurrentLeagueTextView(){
        return mCurrentLeagueTextView;
    }

    public ListView getLeaguesListView(){
        return mLeaguesListView;
    }
}
