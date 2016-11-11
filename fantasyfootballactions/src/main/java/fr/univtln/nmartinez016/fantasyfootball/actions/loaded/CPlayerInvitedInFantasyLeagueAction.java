package fr.univtln.nmartinez016.fantasyfootball.actions.loaded;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CInvitationEntity;

import java.io.Serializable;

/**
 * Created by marti on 10/11/2016.
 */
public class CPlayerInvitedInFantasyLeagueAction extends CAction implements Serializable {

    private CInvitationEntity mInvitation;

    public CPlayerInvitedInFantasyLeagueAction(){}


    public CInvitationEntity getInvitation(){
        return mInvitation;
    }

    public void setInvitation(CInvitationEntity pInvitation){
        mInvitation = pInvitation;
    }
}
