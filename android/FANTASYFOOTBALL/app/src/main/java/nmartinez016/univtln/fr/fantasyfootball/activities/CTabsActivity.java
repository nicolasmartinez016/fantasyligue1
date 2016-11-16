package nmartinez016.univtln.fr.fantasyfootball.activities;

import android.app.DialogFragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import java.util.Collections;

import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CFantasyLeagueJoinedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CLeagueCreatedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayerBoughtAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayerMovedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayerPutOnFieldAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayersLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayersLoadedByGoals;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPositionsLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPublicFantasyLeaguesLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CTeamsLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyTeamEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPositionEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CTeamEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CGoalsRankingAdapter;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CMyLeaguesAdapter;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CPlayersAdapter;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CTeamsAdapter;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CTeamsRankingAdapter;
import nmartinez016.univtln.fr.fantasyfootball.dialogs.CClickActionDialog;
import nmartinez016.univtln.fr.fantasyfootball.fragments.CClubRankingFragment;
import nmartinez016.univtln.fr.fantasyfootball.fragments.CLeagueManagementFragment;
import nmartinez016.univtln.fr.fantasyfootball.fragments.CResearchFragment;
import nmartinez016.univtln.fr.fantasyfootball.fragments.CSquadManagementFragment;
import nmartinez016.univtln.fr.fantasyfootball.CStaticVariables;
import nmartinez016.univtln.fr.fantasyfootball.R;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CViewPagerAdapter;
import nmartinez016.univtln.fr.fantasyfootball.dialogs.CMyPlayersDialog;
import nmartinez016.univtln.fr.fantasyfootball.websocket.CMessageHandler;
import nmartinez016.univtln.fr.fantasyfootball.websocket.CWebSocketService;

/*
 * Main activity with the tabs and viewpager
 * Contains all the fragment to navigate.
 */
public class CTabsActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private CViewPagerAdapter mViewPagerAdapter;
    private CResearchFragment mResearchFragment;
    private CSquadManagementFragment mSquadManagementFragment;
    private CClubRankingFragment mClubRankingFragment;
    private CLeagueManagementFragment mLeagueManagementFragment;
    private BroadcastReceiver mBroadCastReceiverWS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctabs);

        //CStaticVariables.setUser(new CUserEntity.CUserBuilder().emailAdress("martinez1nicolas@gmail.com").fantasyTeam(new CFantasyTeamEntity()).build());


        mToolbar = (Toolbar) findViewById(R.id.toolbar_custom);
        mTabLayout = (TabLayout) findViewById(R.id.tabs0);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPagerAdapter = new CViewPagerAdapter(getSupportFragmentManager());
        mSquadManagementFragment = new CSquadManagementFragment();
        mResearchFragment = new CResearchFragment();
        mClubRankingFragment = new CClubRankingFragment();
        mLeagueManagementFragment = new CLeagueManagementFragment();
        mViewPagerAdapter.addFragment(mResearchFragment, "transferts");
        mViewPagerAdapter.addFragment(mSquadManagementFragment, "squad");
        mViewPagerAdapter.addFragment(mClubRankingFragment, "ranking");
        mViewPagerAdapter.addFragment(mLeagueManagementFragment, "leagues");
        mViewPager.setAdapter(mViewPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }
/*
    @Override
    protected void onResume() {
        super.onResume();
        mBroadCastReceiverWS = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent pIntent) {

                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CPlayerMovedAction.class.getName())){
                    CPlayerMovedAction lPlayerMovedAction = (CPlayerMovedAction) pIntent.getSerializableExtra(CMessageHandler.PLAYER_MOVED);
                    CStaticVariables.setUser(lPlayerMovedAction.getUser());
                    mSquadManagementFragment.getFieldView().invalidate();
                    mSquadManagementFragment.getFieldView().setState(0);
                }

                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CPlayerPutOnFieldAction.class.getName())){
                    CPlayerPutOnFieldAction lPlayerPutOnFieldAction = (CPlayerPutOnFieldAction) pIntent.getSerializableExtra(CMessageHandler.PLAYER_PUT_ON_FIELD);
                    CStaticVariables.setUser(lPlayerPutOnFieldAction.getUser());
                    mSquadManagementFragment.getFieldView().invalidate();
                }

                /*
                 * When receiving an action CPlayersLoaded, we just get the list of
                 * players from the object, create an adapter with that list and
                 * set this adapter to the listview
                 */
/*
                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CPlayersLoadedAction.class.getName())){
                    CPlayersLoadedAction lPlayersLoadedAction = (CPlayersLoadedAction)pIntent.getSerializableExtra(CMessageHandler.PLAYERS);
                    mResearchFragment.setPlayers(lPlayersLoadedAction.getPlayers());
                    CPlayersAdapter lAdapter = new CPlayersAdapter(getBaseContext(), mResearchFragment.getPlayers());
                    mResearchFragment.getListView().setAdapter(lAdapter);
                }

                /*
                 * When receiving an action CTeamsLoaded, we just get the list of
                 * teams from the object, create an adapter with that list and
                 * set this adapter to the spinner
                 */
/*
                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CTeamsLoadedAction.class.getName())){
                    Log.i("teams", "change team adapter");
                    CTeamsLoadedAction lTeamsLoadedAction = (CTeamsLoadedAction) pIntent.getSerializableExtra(CMessageHandler.TEAMS);
                    mResearchFragment.setTeams(lTeamsLoadedAction.getTeams());
                    CTeamsAdapter lAdapter = new CTeamsAdapter(getBaseContext(), mResearchFragment.getTeams());
                    mResearchFragment.getTeamsSpinner().setAdapter(lAdapter);
                }

                /*
                 * When receiving an action CPositionsLoaded, we just set the static list
                 * of positions to the list we just got
                 */
/*
                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CPositionsLoadedAction.class.getName())){
                    CPositionsLoadedAction lPositionsLoadedAction = (CPositionsLoadedAction) pIntent.getSerializableExtra(CMessageHandler.POSITIONS);
                    CStaticVariables.setPositions(lPositionsLoadedAction.getPositions());
                }

                /*
                 * buy
                 */
/*
                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CPlayerBoughtAction.class.getName())){
                    CPlayerBoughtAction lPlayerBoughtAction = (CPlayerBoughtAction) pIntent.getSerializableExtra(CMessageHandler.PLAYER_BOUGHT);
                    CStaticVariables.setUser(lPlayerBoughtAction.getUser());
                    Toast.makeText(getBaseContext(), "joueur achete : " + CStaticVariables.getUser().getCurrentFantasyTeam().getYourPlayerEntries().size() + "total ", Toast.LENGTH_SHORT);
                }

                /*
                 * club ranking
                 */
/*
                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CTeamsLoadedAction.class.getName())){
                    CTeamsLoadedAction lTeamsLoadedAction = (CTeamsLoadedAction)pIntent.getSerializableExtra(CMessageHandler.TEAMS);
                    mClubRankingFragment.setTeams(lTeamsLoadedAction.getTeams());
                    for (int i = 0; i < mClubRankingFragment.getTeams().size(); i++){
                        if (mClubRankingFragment.getTeams().get(i).getName().equals(CConstants.UNDEFINED)){
                            mClubRankingFragment.getTeams().remove(i);
                        }
                    }
                    Collections.sort(mClubRankingFragment.getTeams(), Collections.<CTeamEntity>reverseOrder());
                    CTeamsRankingAdapter lAdapter = new CTeamsRankingAdapter(getBaseContext(), mClubRankingFragment.getTeams());
                    mClubRankingFragment.getListView().setAdapter(lAdapter);
                }

                else if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CPlayersLoadedByGoals.class.getName())){
                    CGoalsRankingAdapter lAdapter = new CGoalsRankingAdapter(getBaseContext(), (((CPlayersLoadedByGoals)pIntent.getSerializableExtra(CMessageHandler.PLAYERS_BY_GOALS)).getPlayers()));
                    mClubRankingFragment.getListView().setAdapter(lAdapter);
                }

                // show public leagues
                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CPublicFantasyLeaguesLoadedAction.class.getName())){
                    CPublicFantasyLeaguesLoadedAction lPublicLeagues = (CPublicFantasyLeaguesLoadedAction) pIntent.getSerializableExtra(CMessageHandler.PUBLIC_FANTASY_LEAGUES);
                    mLeagueManagementFragment.setLeagues(lPublicLeagues.getFantasyLeagues());

                    CMyLeaguesAdapter lAdapter = new CMyLeaguesAdapter(getBaseContext(), mLeagueManagementFragment.getLeagues());
                    mLeagueManagementFragment.getLeaguesListView().setAdapter(lAdapter);
                }
                // joined fantasy league
                else if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CFantasyLeagueJoinedAction.class.getName())){
                    CFantasyLeagueJoinedAction lFantasyLeagueJoined = (CFantasyLeagueJoinedAction) pIntent.getSerializableExtra(CMessageHandler.FANTASY_LEAGUE_JOINED);
                    CStaticVariables.setUser(lFantasyLeagueJoined.getUser());
                    CMyLeaguesAdapter lAdapter = new CMyLeaguesAdapter(getBaseContext(), CStaticVariables.getUser().getFantasyLeagues());
                    mLeagueManagementFragment.getLeaguesListView().setAdapter(lAdapter);
                    mLeagueManagementFragment.getCurrentLeagueTextView().setText("current league : " + CStaticVariables.getUser().getCurrentFantasyTeam().getFantasyLeague().getName());
                    mSquadManagementFragment.getFieldView().invalidate();
                }

                // league created
                else if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CLeagueCreatedAction.class.getName())){
                    CLeagueCreatedAction lLeagueCreatedAction = (CLeagueCreatedAction) pIntent.getSerializableExtra(CMessageHandler.FANTASY_LEAGUE_CREATED);
                    CStaticVariables.setUser(lLeagueCreatedAction.getCreator());
                    CMyLeaguesAdapter lAdapter = new CMyLeaguesAdapter(getBaseContext(), CStaticVariables.getUser().getFantasyLeagues());
                    mLeagueManagementFragment.getLeaguesListView().setAdapter(lAdapter);
                    mLeagueManagementFragment.getCurrentLeagueTextView().setText("current league : " + CStaticVariables.getUser().getCurrentFantasyTeam().getFantasyLeague().getName());
                    mSquadManagementFragment.getFieldView().invalidate();
                    }
                }
            };
        registerReceiver(mBroadCastReceiverWS, new IntentFilter(CMessageHandler.INTENT_TYPE));

    }

    @Override
    public void onPause() {
        super.onPause();
        unregisterReceiver(mBroadCastReceiverWS);
    }*/



    public void openDialog(CPositionEntity pPosition){
        DialogFragment lDialog = CMyPlayersDialog.newInstance(pPosition);
        lDialog.show(getFragmentManager(), "tag");
        lDialog.setCancelable(true);
    }

    public void openChoseOnClick(CPositionEntity pPosition){
        DialogFragment lDialog = CClickActionDialog.newInstance(pPosition);
        lDialog.show(getFragmentManager(), "tag");
        lDialog.setCancelable(true);
    }

    public void redraw(){
        mSquadManagementFragment.redraw();
    }

    public void beginMove(CPlayerEntity pPlayer){
        mSquadManagementFragment.beginMovePlayer(pPlayer);
    }

    public CSquadManagementFragment getSquadManagementFragment(){
        return mSquadManagementFragment;
    }

}
