package fr.univtln.nmartinez016.fantasyfootball.actions.loaded;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;

import java.io.Serializable;

/**
 * Created by marti on 02/11/2016.
 */

public class CPlayerBoughtAction extends CAction implements Serializable {
    private CUserEntity mUser;

    public CPlayerBoughtAction(){}

    public CPlayerBoughtAction(CUserEntity pUser){
        mUser = pUser;
    }

    public CUserEntity getUser(){
        return mUser;
    }

    public void setUser(CUserEntity pUser){
        mUser = pUser;
    }
}
