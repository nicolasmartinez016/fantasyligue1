package fr.univtln.nmartinez016.fantasyfootball.actions.load;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPositionEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;

/**
 * Created by marti on 03/11/2016.
 */


public class CMovePlayerAction extends CAction {
    private CUserEntity mUser;
    private CPositionEntity mInitialPosition;
    private CPositionEntity mFinalPosition;

    public CMovePlayerAction(){}

    public CMovePlayerAction(CMovePlayerBuilder pBuilder){
        mUser = pBuilder.mUser;
        mInitialPosition = pBuilder.mInitialPosition;
        mFinalPosition = pBuilder.mFinalPosition;
    }

    public CUserEntity getUser(){
        return mUser;
    }

    public void setUser(CUserEntity pUser){
        mUser = pUser;
    }

    public CPositionEntity getInitialPosition(){
        return mInitialPosition;
    }

    public void setInitialPosition(CPositionEntity pInitialPosition){
        mInitialPosition = pInitialPosition;
    }

    public CPositionEntity getFinalPosition(){
        return mFinalPosition;
    }

    public void setFinalPosition(CPositionEntity pFinalPosition){
        mFinalPosition = pFinalPosition;
    }

    public static class CMovePlayerBuilder{
        private CUserEntity mUser;
        private CPositionEntity mInitialPosition;
        private CPositionEntity mFinalPosition;

        public CMovePlayerBuilder(){}

        public CMovePlayerBuilder user(CUserEntity pUser){
            mUser = pUser;
            return this;
        }

        public CMovePlayerBuilder initialPosition(CPositionEntity pInitialPosition){
            mInitialPosition = pInitialPosition;
            return this;
        }

        public CMovePlayerBuilder finalPosition(CPositionEntity pFinalPosition){
            mFinalPosition = pFinalPosition;
            return this;
        }

        public CMovePlayerAction build(){
            return new CMovePlayerAction(this);
        }
    }
}