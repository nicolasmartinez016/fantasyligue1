package nmartinez016.univtln.fr.fantasyfootball.activities;

import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyTeamEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPositionEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;
import nmartinez016.univtln.fr.fantasyfootball.dialogs.CClickActionDialog;
import nmartinez016.univtln.fr.fantasyfootball.fragments.CClubRankingFragment;
import nmartinez016.univtln.fr.fantasyfootball.fragments.CResearchFragment;
import nmartinez016.univtln.fr.fantasyfootball.fragments.CSquadManagementFragment;
import nmartinez016.univtln.fr.fantasyfootball.CStaticVariables;
import nmartinez016.univtln.fr.fantasyfootball.R;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CViewPagerAdapter;
import nmartinez016.univtln.fr.fantasyfootball.dialogs.CMyPlayersDialog;
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
        mViewPagerAdapter.addFragment(mResearchFragment, "transferts");
        mViewPagerAdapter.addFragment(mSquadManagementFragment, "squad");
        mViewPagerAdapter.addFragment(mClubRankingFragment, "ranking");
        mViewPager.setAdapter(mViewPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

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

}
