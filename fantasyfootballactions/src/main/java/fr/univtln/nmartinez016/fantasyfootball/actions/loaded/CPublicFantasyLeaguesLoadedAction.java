package fr.univtln.nmartinez016.fantasyfootball.actions.loaded;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyLeagueEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marti on 10/11/2016.
 */
public class CPublicFantasyLeaguesLoadedAction extends CAction implements Serializable {

    private List<CFantasyLeagueEntity> mFantasyLeagues;

    public CPublicFantasyLeaguesLoadedAction(){}

    public CPublicFantasyLeaguesLoadedAction(List<CFantasyLeagueEntity> pFantasyLeagues){
        mFantasyLeagues = pFantasyLeagues;
    }

    public List<CFantasyLeagueEntity> getFantasyLeagues(){
        return mFantasyLeagues;
    }

    public void setFantasyLeagues(List<CFantasyLeagueEntity> pFantasyLeagues){
        mFantasyLeagues = pFantasyLeagues;
    }
}
