package fr.univtln.nmartinez016.fantasyfootball.actions.loaded;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPositionEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marti on 02/09/2016.
 * Action that the server sends to a client after receiving
 * an action CLoadPositions.
 * Contains all the positions where you can put a player.
 */
public class CPositionsLoadedAction extends CAction implements Serializable {

    private List<CPositionEntity> mPositions;

    public CPositionsLoadedAction(){}

    public CPositionsLoadedAction(CPositionsLoadedBuilder pBuilder){
        mPositions = pBuilder.mPositions;
    }

    public List<CPositionEntity> getPositions(){
        return mPositions;
    }

    public void setPositions(List<CPositionEntity> pPositions){
        mPositions = pPositions;
    }

    public static class CPositionsLoadedBuilder{
        private List<CPositionEntity> mPositions;

        public CPositionsLoadedBuilder(){}

        public CPositionsLoadedBuilder positions(List<CPositionEntity> pPositions){
            mPositions = pPositions;
            return this;
        }

        public CPositionsLoadedAction build(){
            return new CPositionsLoadedAction(this);
        }
    }
}
