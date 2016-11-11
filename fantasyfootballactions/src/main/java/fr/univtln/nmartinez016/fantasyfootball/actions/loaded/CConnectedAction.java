package fr.univtln.nmartinez016.fantasyfootball.actions.loaded;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;

import java.io.Serializable;

/**
 * Created by marti on 23/10/2016.
 */
public class CConnectedAction extends CAction implements Serializable {
    private CUserEntity mUser;

    public CConnectedAction(){}

    public CConnectedAction(CUserEntity pUser){
        mUser = pUser;
    }

    public CUserEntity getUser(){
        return mUser;
    }

    public void setUser(CUserEntity pUser){
        mUser = pUser;
    }
}
