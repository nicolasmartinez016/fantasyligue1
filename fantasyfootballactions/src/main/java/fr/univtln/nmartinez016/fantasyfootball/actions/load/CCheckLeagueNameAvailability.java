package fr.univtln.nmartinez016.fantasyfootball.actions.load;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;

import java.io.Serializable;

/**
 * Created by marti on 09/11/2016.
 */
public class CCheckLeagueNameAvailability extends CAction implements Serializable {
    private String mLeagueName;

    public CCheckLeagueNameAvailability(){}

    public CCheckLeagueNameAvailability(String pLeagueName){
        mLeagueName = pLeagueName;
    }

    public String getLeagueName(){
        return mLeagueName;
    }

    public void setLeagueName(String pLeagueName){
        mLeagueName = pLeagueName;
    }
}
