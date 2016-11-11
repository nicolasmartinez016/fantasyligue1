package fr.univtln.nmartinez016.fantasyfootball.actions.loaded;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;

import java.io.Serializable;

/**
 * Created by marti on 09/11/2016.
 */
public class CReturnLeagueNameAvailable extends CAction implements Serializable {
    private boolean mAvailable;

    public CReturnLeagueNameAvailable(){}

    public CReturnLeagueNameAvailable(boolean pAvailable){
        mAvailable = pAvailable;
    }

    public boolean isAvailable(){
        return mAvailable;
    }

    public void setAvailable(boolean pAvailable){
        mAvailable = pAvailable;
    }
}
