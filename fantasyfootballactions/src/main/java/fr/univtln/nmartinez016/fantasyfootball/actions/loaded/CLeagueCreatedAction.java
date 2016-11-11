package fr.univtln.nmartinez016.fantasyfootball.actions.loaded;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyLeagueEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;

import java.io.Serializable;

/**
 * Created by marti on 10/11/2016.
 */
public class CLeagueCreatedAction extends CAction implements Serializable {
    private CFantasyLeagueEntity mFantasyLeague;
    private CUserEntity mCreator;

    public CLeagueCreatedAction(){}

    public CLeagueCreatedAction(CLeagueCreatedBuilder pBuilder){
        mFantasyLeague = pBuilder.mFantasyLeague;
        mCreator = pBuilder.mCreator;
    }

    public CFantasyLeagueEntity getFantasyLeague(){
        return mFantasyLeague;
    }

    public void setFantasyLeague(CFantasyLeagueEntity pFantasyLeague){
        mFantasyLeague = pFantasyLeague;
    }

    public CUserEntity getCreator(){
        return mCreator;
    }

    public void setCreator(CUserEntity pCreator){
        mCreator = pCreator;
    }

    public static class CLeagueCreatedBuilder{
        private CFantasyLeagueEntity mFantasyLeague;
        private CUserEntity mCreator;

        public CLeagueCreatedBuilder(){}

        public CLeagueCreatedBuilder fantasyLeague(CFantasyLeagueEntity pFantasyLeague){
            mFantasyLeague = pFantasyLeague;
            return this;
        }

        public CLeagueCreatedBuilder creator(CUserEntity pCreator){
            mCreator = pCreator;
            return this;
        }

        public CLeagueCreatedAction build(){
            return new CLeagueCreatedAction(this);
        }
    }
}
