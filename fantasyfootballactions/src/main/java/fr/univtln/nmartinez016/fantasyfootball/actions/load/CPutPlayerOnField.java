package fr.univtln.nmartinez016.fantasyfootball.actions.load;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPositionEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;

/**
 * Created by marti on 03/11/2016.
 */
public class CPutPlayerOnField extends CAction {
    private CUserEntity mUser;
    private CPlayerEntity mPlayer;
    private CPositionEntity mPosition;

    public CPutPlayerOnField(){}

    public CPutPlayerOnField(CPutPlayerOnFieldBuilder pBuilder){
        mUser = pBuilder.mUser;
        mPlayer = pBuilder.mPlayer;
        mPosition = pBuilder.mPosition;
    }

    public CUserEntity getUser(){
        return mUser;
    }

    public void setUser(CUserEntity pUser){
        mUser = pUser;
    }

    public CPlayerEntity getPlayer(){
        return mPlayer;
    }

    public void setPlayer(CPlayerEntity pPlayer){
        mPlayer = pPlayer;
    }

    public CPositionEntity getPosition(){
        return mPosition;
    }

    public void setPosition(CPositionEntity pPosition){
        mPosition = pPosition;
    }

    public static class CPutPlayerOnFieldBuilder{
        private CUserEntity mUser;
        private CPlayerEntity mPlayer;
        private CPositionEntity mPosition;

        public CPutPlayerOnFieldBuilder(){}

        public CPutPlayerOnFieldBuilder user(CUserEntity pUser){
            mUser = pUser;
            return this;
        }

        public CPutPlayerOnFieldBuilder player(CPlayerEntity pPlayer){
            mPlayer = pPlayer;
            return this;
        }

        public CPutPlayerOnFieldBuilder position(CPositionEntity pPosition){
            mPosition = pPosition;
            return this;
        }

        public CPutPlayerOnField build(){
            return new CPutPlayerOnField(this);
        }
    }
}
