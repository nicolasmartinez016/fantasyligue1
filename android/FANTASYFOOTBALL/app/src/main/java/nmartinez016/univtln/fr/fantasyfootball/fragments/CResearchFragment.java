package nmartinez016.univtln.fr.fantasyfootball.fragments;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.load.CLoadPlayersAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.load.CLoadPositionsAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.load.CLoadTeamsAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayerBoughtAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayersLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPositionsLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CTeamsLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CTeamEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;
import nmartinez016.univtln.fr.fantasyfootball.CStaticVariables;
import nmartinez016.univtln.fr.fantasyfootball.R;
import nmartinez016.univtln.fr.fantasyfootball.activities.CAuthentificationActivity;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CPlayersAdapter;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CTeamsAdapter;
import nmartinez016.univtln.fr.fantasyfootball.websocket.CMessageHandler;
import nmartinez016.univtln.fr.fantasyfootball.websocket.CTyrusClient;

/*
 * Framgment for the page tu buy players for you team.
 * You can sort the players with several things like
 * their age, team or name.
 */

public class CResearchFragment extends Fragment {
    private BroadcastReceiver mBroadCastReceiverWS;

    private List<CPlayerEntity> mPlayers = new ArrayList<>();
    private ListView mListView;
    private List<CTeamEntity> mTeams = new ArrayList<>();
    private EditText mEditTextSearchPlayer;
    private Spinner mTeamsSpinner;
    private RadioGroup mAgeRadioGroup;
    private EditText mNameEditText;
    private Spinner mAgeSpinner;
    private Button mResearchButton;
    CPlayerEntity mSelectedPlayer;
    private TextView mConnectedAs;


    public CResearchFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View lRootView = inflater.inflate(R.layout.fragment_cresearch, container, false);

        mListView = (ListView) lRootView.findViewById(R.id.f_transfert_playerstobuy_listview);
        CTeamsAdapter lTeamAdapter = new CTeamsAdapter(getContext(), mTeams);
        mEditTextSearchPlayer = (EditText) lRootView.findViewById(R.id.f_transfert_playerstobuy_edittext);

        mTeamsSpinner = (Spinner) lRootView.findViewById(R.id.f_transfert_team_spinner);
        mTeamsSpinner.setAdapter(lTeamAdapter);

        mConnectedAs = (TextView) lRootView.findViewById(R.id.f_playerstobuy_connected_as);

        mAgeRadioGroup = (RadioGroup) lRootView.findViewById(R.id.f_transfert_age_radio_group);
        mNameEditText = (EditText) lRootView.findViewById(R.id.f_transfert_playerstobuy_edittext);

        //mAgeEditText = (EditText) findViewById(R.id.transfert_age_edit_text);

        mListView = (ListView)lRootView.findViewById(R.id.f_transfert_playerstobuy_listview);
        mAgeSpinner = (Spinner)lRootView.findViewById(R.id.f_transfert_spinner_age);

        mResearchButton = (Button) lRootView.findViewById(R.id.f_transfert_playerstobuy_rechercher);
        mResearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CAction lLoadPlayersAction = new CLoadPlayersAction();


                if (((CTeamEntity)mTeamsSpinner.getSelectedItem()).getName().equals(fr.univtln.nmartinez016.fantasyfootball.CConstants.UNDEFINED)){
                    if (mAgeRadioGroup.getCheckedRadioButtonId() == R.id.f_transfert_age_not_specified_radiobutton){
                        if (mNameEditText.getText().toString().isEmpty()){
                            // get all
                            lLoadPlayersAction = new CLoadPlayersAction.CLoadPlayersBuilder().searchNameOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).ageOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).teamIdOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).build();
                        }
                        else{
                            String lNameToSearch = mEditTextSearchPlayer.getText().toString();
                            Log.d("tag", "nom a chercher : " + lNameToSearch);
                            lLoadPlayersAction = new CLoadPlayersAction.CLoadPlayersBuilder().searchNameOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).ageOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).teamIdOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).searchName(lNameToSearch).build();

                        }
                    }
                    else if (mAgeRadioGroup.getCheckedRadioButtonId() == R.id.f_transfert_age_eq_radiobutton){
                        //int lAge = Integer.parseInt(mAgeEditText.getText().toString());
                        int lAge = Integer.parseInt(mAgeSpinner.getSelectedItem().toString());
                        if (mNameEditText.getText().toString().isEmpty()){
                            // get by age equals
                            lLoadPlayersAction = new CLoadPlayersAction.CLoadPlayersBuilder().searchNameOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).ageOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).teamIdOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).age(lAge).build();

                        }
                        else{
                            String lNameToSearch = mEditTextSearchPlayer.getText().toString();
                            Log.d("tag", "nom a chercher : " + lNameToSearch);
                            lLoadPlayersAction = new CLoadPlayersAction.CLoadPlayersBuilder().searchNameOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).ageOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).teamIdOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).searchName(lNameToSearch).age(lAge).build();

                        }
                    }

                    else if (mAgeRadioGroup.getCheckedRadioButtonId() == R.id.f_transfert_age_inf_radiobutton){
                        //int lAge = Integer.parseInt(mAgeEditText.getText().toString());
                        int lAge = Integer.parseInt(mAgeSpinner.getSelectedItem().toString());
                        if (mNameEditText.getText().toString().isEmpty()){
                            // get by age equals
                            lLoadPlayersAction = new CLoadPlayersAction.CLoadPlayersBuilder().searchNameOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).ageOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR_AGE_INF).teamIdOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).age(lAge).build();

                        }
                        else{
                            String lNameToSearch = mEditTextSearchPlayer.getText().toString();
                            Log.d("tag", "nom a chercher : " + lNameToSearch);
                            lLoadPlayersAction = new CLoadPlayersAction.CLoadPlayersBuilder().searchNameOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).ageOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR_AGE_INF).teamIdOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).searchName(lNameToSearch).age(lAge).build();

                        }
                    }

                    else if (mAgeRadioGroup.getCheckedRadioButtonId() == R.id.f_transfert_age_sup_radiobutton){
                        //int lAge = Integer.parseInt(mAgeEditText.getText().toString());
                        int lAge = Integer.parseInt(mAgeSpinner.getSelectedItem().toString());

                        if (mNameEditText.getText().toString().isEmpty()){
                            // get by age sup
                            lLoadPlayersAction = new CLoadPlayersAction.CLoadPlayersBuilder().searchNameOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).ageOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR_AGE_SUP).teamIdOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).age(lAge).build();
                        }
                        else{
                            String lNameToSearch = mEditTextSearchPlayer.getText().toString();
                            Log.d("tag", "nom a chercher : " + lNameToSearch);
                            lLoadPlayersAction = new CLoadPlayersAction.CLoadPlayersBuilder().searchNameOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).ageOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR_AGE_SUP).teamIdOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).searchName(lNameToSearch).age(lAge).build();

                        }
                    }
                }
                else{
                    int lTeamId = ((CTeamEntity)mTeamsSpinner.getSelectedItem()).getId();
                    if (mAgeRadioGroup.getCheckedRadioButtonId() == R.id.f_transfert_age_not_specified_radiobutton){
                        if (mNameEditText.getText().toString().isEmpty()){
                            // get by club
                            lLoadPlayersAction = new CLoadPlayersAction.CLoadPlayersBuilder().searchNameOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).ageOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).teamIdOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).teamId(lTeamId).build();

                        }
                        else{
                            String lNameToSearch = mEditTextSearchPlayer.getText().toString();
                            Log.d("tag", "nom a chercher : " + lNameToSearch);
                            lLoadPlayersAction = new CLoadPlayersAction.CLoadPlayersBuilder().searchNameOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).ageOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).teamIdOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).searchName(lNameToSearch).teamId(lTeamId).build();
                        }
                    }
                    else if (mAgeRadioGroup.getCheckedRadioButtonId() == R.id.f_transfert_age_eq_radiobutton){
                        //int lAge = Integer.parseInt(mAgeEditText.getText().toString());
                        int lAge = Integer.parseInt(mAgeSpinner.getSelectedItem().toString());
                        if (mNameEditText.getText().toString().isEmpty()){
                            // get by age equals and club
                            lLoadPlayersAction = new CLoadPlayersAction.CLoadPlayersBuilder().searchNameOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).ageOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).teamIdOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).teamId(lTeamId).age(lAge).build();
                        }
                        else{
                            // get by age equals, club and name
                            String lNameToSearch = mEditTextSearchPlayer.getText().toString();
                            Log.d("tag", "nom a chercher : " + lNameToSearch);
                            lLoadPlayersAction = new CLoadPlayersAction.CLoadPlayersBuilder().searchNameOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).ageOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).teamIdOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).teamId(lTeamId).searchName(lNameToSearch).age(lAge).build();
                        }
                    }

                    else if (mAgeRadioGroup.getCheckedRadioButtonId() == R.id.f_transfert_age_inf_radiobutton){
                        //int lAge = Integer.parseInt(mAgeEditText.getText().toString());
                        int lAge = Integer.parseInt(mAgeSpinner.getSelectedItem().toString());
                        if (mNameEditText.getText().toString().isEmpty()){
                            // get by age inf and club
                            lLoadPlayersAction = new CLoadPlayersAction.CLoadPlayersBuilder().searchNameOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).ageOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR_AGE_INF).teamIdOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).teamId(lTeamId).age(lAge).build();

                        }
                        else{
                            // get by age inf, club and name
                            String lNameToSearch = mEditTextSearchPlayer.getText().toString();
                            Log.d("tag", "nom a chercher : " + lNameToSearch);
                            lLoadPlayersAction = new CLoadPlayersAction.CLoadPlayersBuilder().searchNameOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).ageOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR_AGE_INF).teamIdOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).searchName(lNameToSearch).teamId(lTeamId).age(lAge).build();
                        }
                    }

                    else if (mAgeRadioGroup.getCheckedRadioButtonId() == R.id.f_transfert_age_sup_radiobutton){
                        //int lAge = Integer.parseInt(mAgeEditText.getText().toString());
                        int lAge = Integer.parseInt(mAgeSpinner.getSelectedItem().toString());
                        if (mNameEditText.getText().toString().isEmpty()){
                            // get by age sup and club
                            lLoadPlayersAction = new CLoadPlayersAction.CLoadPlayersBuilder().searchNameOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_INDETERMINE).ageOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR_AGE_SUP).teamIdOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).teamId(lTeamId).age(lAge).build();

                        }
                        else{

                            // get by age sup, club and name
                            String lNameToSearch = mEditTextSearchPlayer.getText().toString();
                            lLoadPlayersAction = new CLoadPlayersAction.CLoadPlayersBuilder().searchNameOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).ageOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR_AGE_SUP).teamIdOk(fr.univtln.nmartinez016.fantasyfootball.CConstants.TRI_PAR).searchName(lNameToSearch).teamId(lTeamId).age(lAge).build();
                        }
                    }
                }
                //CPayloadBean lBeanToSend = new CPayloadBean.CPayloadBeanBuilder().type(CPayloadBean.LOAD_PLAYERS).loadPlayersAction(lLoadPlayersAction).build();
                CTyrusClient.sendMessage(lLoadPlayersAction);

            }
        });

        CPlayersAdapter lAdapter = new CPlayersAdapter(getContext(), mPlayers);


        mListView.setAdapter(lAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for (int i = 0; i < mPlayers.size(); i++){
                    parent.getChildAt(i).setBackgroundColor(Color.WHITE);
                }
                parent.getChildAt(position).setBackgroundColor(Color.GRAY);
                mSelectedPlayer = (CPlayerEntity)(mListView.getItemAtPosition(position));
                System.out.println("click!");
            }
        });

        if (CAuthentificationActivity.getEmail() != null){
            mConnectedAs.setText("connected as : " + CAuthentificationActivity.getEmail());
        }

        loadTeams();
        loadPositions();

        return lRootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        mBroadCastReceiverWS = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent pIntent) {

                Log.d("tag", "DANS ON RECEIVE");

                /*
                 * When receiving an action CPlayersLoaded, we just get the list of
                 * players from the object, create an adapter with that list and
                 * set this adapter to the listview
                 */

                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CPlayersLoadedAction.class.getName())){
                    CPlayersLoadedAction lPlayersLoadedAction = (CPlayersLoadedAction)pIntent.getSerializableExtra(CMessageHandler.PLAYERS);
                    mPlayers = lPlayersLoadedAction.getPlayers();
                    CPlayersAdapter lAdapter = new CPlayersAdapter(getContext(), mPlayers);
                    mListView.setAdapter(lAdapter);
                }

                /*
                 * When receiving an action CTeamsLoaded, we just get the list of
                 * teams from the object, create an adapter with that list and
                 * set this adapter to the spinner
                 */

                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CTeamsLoadedAction.class.getName())){
                    Log.i("teams", "change team adapter");
                    CTeamsLoadedAction lTeamsLoadedAction = (CTeamsLoadedAction) pIntent.getSerializableExtra(CMessageHandler.TEAMS);
                    mTeams = lTeamsLoadedAction.getTeams();
                    CTeamsAdapter lAdapter = new CTeamsAdapter(getContext(), mTeams);
                    mTeamsSpinner.setAdapter(lAdapter);
                }

                /*
                 * When receiving an action CPositionsLoaded, we just set the static list
                 * of positions to the list we just got
                 */

                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CPositionsLoadedAction.class.getName())){
                    CPositionsLoadedAction lPositionsLoadedAction = (CPositionsLoadedAction) pIntent.getSerializableExtra(CMessageHandler.POSITIONS);
                    CStaticVariables.setPositions(lPositionsLoadedAction.getPositions());
                }

                /*
                 * buy
                 */

                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CPlayerBoughtAction.class.getName())){
                    CPlayerBoughtAction lPlayerBoughtAction = (CPlayerBoughtAction) pIntent.getSerializableExtra(CMessageHandler.PLAYER_BOUGHT);
                    CStaticVariables.setUser(lPlayerBoughtAction.getUser());
                    Toast.makeText(getContext(), "joueur achete : " + CStaticVariables.getUser().getCurrentFantasyTeam().getYourPlayerEntries().size() + "total ", Toast.LENGTH_SHORT);
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

    public void setPlayers(List<CPlayerEntity> pPlayers){
        mPlayers = pPlayers;
    }

    public void loadTeams(){
        CAction lLoadTeamsAction = new CLoadTeamsAction();
        CTyrusClient.sendMessage(lLoadTeamsAction);
    }

    public void loadPositions(){
        CAction lLoadPositionsAction = new CLoadPositionsAction();
        CTyrusClient.sendMessage(lLoadPositionsAction);
    }

}