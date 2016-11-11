package nmartinez016.univtln.fr.fantasyfootball.fragments;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.Collections;
import java.util.List;

import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.actions.load.CLoadPlayersByGoals;
import fr.univtln.nmartinez016.fantasyfootball.actions.load.CLoadTeamsAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayersLoadedByGoals;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CTeamsLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CTeamEntity;
import nmartinez016.univtln.fr.fantasyfootball.R;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CGoalsRankingAdapter;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CPlayersAdapter;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CTeamsAdapter;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CTeamsRankingAdapter;
import nmartinez016.univtln.fr.fantasyfootball.websocket.CMessageHandler;
import nmartinez016.univtln.fr.fantasyfootball.websocket.CTyrusClient;


/**
 * Fragment to display the ranking of several things.
 * It can be the teams ranking, the ranking of the players
 * by the amount of goals they scored, or assisted, of yellow
 * cards they received, or minutes they played, etc..
 */
public class CClubRankingFragment extends Fragment {

    private BroadcastReceiver mBroadCastReceiverWS;
    List<CTeamEntity> mTeams;
    private ListView mListView;
    private Button mButton;

    public CClubRankingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View lRootView = inflater.inflate(R.layout.fragment_cclub_ranking, container, false);

        mListView = (ListView) lRootView.findViewById(R.id.ranking_teams_listview);
        mButton = (Button) lRootView.findViewById(R.id.ranking_button_scorers);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CLoadPlayersByGoals lLoadPlayersByGoals = new CLoadPlayersByGoals();
                CTyrusClient.sendMessage(new CLoadPlayersByGoals());
            }
        });
        CTyrusClient.sendMessage(new CLoadTeamsAction());
        return lRootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        mBroadCastReceiverWS = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent pIntent) {
                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CTeamsLoadedAction.class.getName())){
                    CTeamsLoadedAction lTeamsLoadedAction = (CTeamsLoadedAction)pIntent.getSerializableExtra(CMessageHandler.TEAMS);
                    mTeams = lTeamsLoadedAction.getTeams();
                    for (int i = 0; i < mTeams.size(); i++){
                        if (mTeams.get(i).getName().equals(CConstants.UNDEFINED)){
                            mTeams.remove(i);
                        }
                    }
                    Collections.sort(mTeams, Collections.<CTeamEntity>reverseOrder());
                    CTeamsRankingAdapter lAdapter = new CTeamsRankingAdapter(getContext(), mTeams);
                    mListView.setAdapter(lAdapter);
                }

                else if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CPlayersLoadedByGoals.class.getName())){
                    CGoalsRankingAdapter lAdapter = new CGoalsRankingAdapter(getContext(), (((CPlayersLoadedByGoals)pIntent.getSerializableExtra(CMessageHandler.PLAYERS_BY_GOALS)).getPlayers()));
                    mListView.setAdapter(lAdapter);
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
}
