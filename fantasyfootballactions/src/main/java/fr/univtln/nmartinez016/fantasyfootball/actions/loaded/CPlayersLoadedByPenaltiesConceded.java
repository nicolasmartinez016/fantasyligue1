package fr.univtln.nmartinez016.fantasyfootball.actions.loaded;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;

import java.io.Serializable;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by marti on 25/09/2016.
 * Action that the server sends to a client after receiving
 * an action CLoadPlayersByPenaltiesConceded.
 * Contains all the players ordered by the amount of pks they conceded.
 */
public class CPlayersLoadedByPenaltiesConceded extends CAction implements Serializable {

    private List<CPlayerEntity> mPlayers;

    public CPlayersLoadedByPenaltiesConceded(){}

    public List<CPlayerEntity> getPlayers(){
        return mPlayers;
    }

    public void setPlayers(List<CPlayerEntity> pPlayers){
        mPlayers = pPlayers;
    }
}
