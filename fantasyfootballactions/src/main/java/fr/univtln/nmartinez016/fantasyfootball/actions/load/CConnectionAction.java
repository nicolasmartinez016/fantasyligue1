package fr.univtln.nmartinez016.fantasyfootball.actions.load;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;

import java.io.Serializable;

/**
 * Created by marti on 23/10/2016.
 */
public class CConnectionAction extends CAction implements Serializable {
    private String mUserId;

    public CConnectionAction(){}

    public CConnectionAction(String pUserId){
        mUserId = pUserId;
    }

    public String getUserId(){
        return mUserId;
    }

    public void setUserId(String pUserId){
        mUserId = pUserId;
    }
}
