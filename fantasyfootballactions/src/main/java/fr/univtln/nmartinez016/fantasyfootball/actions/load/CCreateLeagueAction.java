package fr.univtln.nmartinez016.fantasyfootball.actions.load;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyLeagueEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;

import java.io.Serializable;

/**
 * Created by marti on 09/11/2016.
 */
public class CCreateLeagueAction extends CAction implements Serializable {
    private CFantasyLeagueEntity mFantasyLeague;
    private CUserEntity mCreator;

    public CCreateLeagueAction(){}

    public CCreateLeagueAction(CCreateLeagueBuilder pBuilder)
    {
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

    public static class CCreateLeagueBuilder {
        private CFantasyLeagueEntity mFantasyLeague;
        private CUserEntity mCreator;

        public CCreateLeagueBuilder(){}

        public CCreateLeagueBuilder fantasyLeague(CFantasyLeagueEntity pFantasyLeague){
            mFantasyLeague = pFantasyLeague;
            return this;
        }

        public CCreateLeagueBuilder creator(CUserEntity pCreator){
            mCreator = pCreator;
            return this;
        }

        public CCreateLeagueAction build(){
            return new CCreateLeagueAction(this);
        }
    }
}
