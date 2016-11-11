package fr.univtln.nmartinez016.fantasyfootball.actions.load;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyLeagueEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;

import java.io.Serializable;

/**
 * Created by marti on 10/11/2016.
 */
public class CJoinFantasyLeagueAction extends CAction implements Serializable {
    private CUserEntity mUser;
    private CFantasyLeagueEntity mFantasyLeague;

    public CJoinFantasyLeagueAction(){}

    public CJoinFantasyLeagueAction(CJoinFantasyLeagueBuilder pBuilder){
        mUser = pBuilder.mUser;
        mFantasyLeague = pBuilder.mFantasyLeague;
    }

    public CUserEntity getUser(){
        return mUser;
    }

    public void setUserId(CUserEntity pUser){
        mUser = pUser;
    }

    public CFantasyLeagueEntity getFantasyLeague(){
        return mFantasyLeague;
    }

    public void setFantasyLeagueId(CFantasyLeagueEntity pFantasyLeague){
        mFantasyLeague = pFantasyLeague;
    }

    public static class CJoinFantasyLeagueBuilder{
        private CUserEntity mUser;
        private CFantasyLeagueEntity mFantasyLeague;

        public CJoinFantasyLeagueBuilder(){}

        public CJoinFantasyLeagueBuilder user(CUserEntity pUser){
            mUser = pUser;
            return this;
        }

        public CJoinFantasyLeagueBuilder fantasyLeagueId(CFantasyLeagueEntity pFantasyLeague){
            mFantasyLeague = pFantasyLeague;
            return this;
        }

        public CJoinFantasyLeagueAction build(){
            return new CJoinFantasyLeagueAction(this);
        }
    }
}
