package fr.univtln.nmartinez016.fantasyfootball.actions.load;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyLeagueEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyTeamEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;

import java.io.Serializable;

/**
 * Created by marti on 13/11/2016.
 */
public class CSelectFantasyLeagueAction extends CAction implements Serializable {
    private CUserEntity mUser;
    private CFantasyTeamEntity mFantasyTeam;

    public CSelectFantasyLeagueAction(){}

    public CSelectFantasyLeagueAction(CSelectFantasyLeagueBuilder pBuilder){
        mUser = pBuilder.mUser;
        mFantasyTeam = pBuilder.mFantasyTeam;
    }

    public CUserEntity getUser(){
        return mUser;
    }

    public void setUser(CUserEntity pUser){
        mUser = pUser;
    }

    public CFantasyTeamEntity getFantasyTeam(){
        return mFantasyTeam;
    }

    public void setFantasyTeam(CFantasyTeamEntity pFantasyTeam){
        mFantasyTeam = pFantasyTeam;
    }

    public static class CSelectFantasyLeagueBuilder{
        private CUserEntity mUser;
        private CFantasyTeamEntity mFantasyTeam;

        public CSelectFantasyLeagueBuilder(){}

        public CSelectFantasyLeagueBuilder user(CUserEntity pUser){
            mUser = pUser;
            return this;
        }

        public CSelectFantasyLeagueBuilder fantasyTeam(CFantasyTeamEntity pFantasyTeam){
            mFantasyTeam = pFantasyTeam;
            return this;
        }

        public CSelectFantasyLeagueAction build(){
            return new CSelectFantasyLeagueAction(this);
        }
    }
}
