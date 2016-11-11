package fr.univtln.nmartinez016.fantasyfootball.actions.loaded;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marti on 01/08/2016.
 * Action that the server sends to a client after receiving
 * an action CLoadPlayers.
 * Contains all the players with the conditions specified (name, age, team).
 */
public class CPlayersLoadedAction extends CAction implements Serializable {

    private List<CPlayerEntity> mPlayers;

    public CPlayersLoadedAction(){super();}

    public CPlayersLoadedAction(CPlayersLoadedBuilder pBuilder){
        super();
        mPlayers = pBuilder.mPlayers;
    }

    public List<CPlayerEntity> getPlayers(){
        return mPlayers;
    }

    public void setPlayers(List<CPlayerEntity> pPlayers){
        mPlayers = pPlayers;
    }

    public static class CPlayersLoadedBuilder{
        private List<CPlayerEntity> mPlayers;

        public CPlayersLoadedBuilder(){}

        public CPlayersLoadedBuilder players(List<CPlayerEntity> pPlayers){
            mPlayers = pPlayers;
            return this;
        }

        public CPlayersLoadedAction build(){
            return new CPlayersLoadedAction(this);
        }
    }
}
