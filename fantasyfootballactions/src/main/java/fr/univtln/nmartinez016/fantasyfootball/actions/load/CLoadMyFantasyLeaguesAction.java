package fr.univtln.nmartinez016.fantasyfootball.actions.load;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;

import java.io.Serializable;

/**
 * Created by marti on 09/11/2016.
 */
public class CLoadMyFantasyLeaguesAction extends CAction implements Serializable {

    private String mUserId;

    public CLoadMyFantasyLeaguesAction(){}

    public CLoadMyFantasyLeaguesAction(String pUserId){
        mUserId = pUserId;
    }

    public String getUserId(){
        return mUserId;
    }

    public void setUserId(String pUserId){
        mUserId = pUserId;
    }
}
