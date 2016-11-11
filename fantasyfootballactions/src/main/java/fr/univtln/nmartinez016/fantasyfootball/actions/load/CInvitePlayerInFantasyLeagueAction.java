package fr.univtln.nmartinez016.fantasyfootball.actions.load;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyLeagueEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CInvitationEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;

import java.io.Serializable;

/**
 * Created by marti on 10/11/2016.
 */
public class CInvitePlayerInFantasyLeagueAction extends CAction implements Serializable {
    private CInvitationEntity mInvitation;

    public CInvitePlayerInFantasyLeagueAction(){}


    public CInvitationEntity getInvitation(){
        return mInvitation;
    }

    public void setInvitation(CInvitationEntity pInvitation){
        mInvitation = pInvitation;
    }

}
