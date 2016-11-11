package fr.univtln.nmartinez016.fantasyfootball.actions.load;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;

import java.io.Serializable;

/**
 * Created by marti on 24/10/2016.
 */
public class CBuyPlayerAction extends CAction implements Serializable {
    private CUserEntity mUser;
    private CPlayerEntity mPlayer;

    public CBuyPlayerAction(){
    }

    public CBuyPlayerAction(CBuyPlayerBuilder pBuilder){
        mUser = pBuilder.mUser;
        mPlayer = pBuilder.mPlayer;
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

    public static class CBuyPlayerBuilder{
        private CUserEntity mUser;
        private CPlayerEntity mPlayer;

        public CBuyPlayerBuilder(){}

        public CBuyPlayerBuilder user(CUserEntity pUser){
            mUser = pUser;
            return this;
        }

        public CBuyPlayerBuilder player(CPlayerEntity pPlayer){
            mPlayer = pPlayer;
            return this;
        }

        public CBuyPlayerAction build(){
            return new CBuyPlayerAction(this);
        }
    }

}
