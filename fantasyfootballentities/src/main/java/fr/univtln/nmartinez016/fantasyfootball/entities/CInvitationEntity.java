package fr.univtln.nmartinez016.fantasyfootball.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 10/11/2016.
 */

@Entity
@Table(schema = "fantasyfootball")
public class CInvitationEntity implements Serializable {

    public static final int NOT_VALIDATED = 1;
    public static final int ACCEPTED = 0;
    public static final int REFUSED = -1;
    @TableGenerator(
            name = "invitationTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "invitationTableGenerator")
    private int mId;
    @ManyToOne
    private CUserEntity mInviter;
    @ManyToOne
    private CFantasyLeagueEntity mLeagueToJoin;
    @ManyToOne
    private CUserEntity mInvited;
    private int mAccepted;

    public CInvitationEntity(){}

    public CInvitationEntity(CInvitationBuilder pBuilder){
        mInvited = pBuilder.mInvited;
        mInviter = pBuilder.mInviter;
        mLeagueToJoin = pBuilder.mLeagueToJoin;
        mAccepted = pBuilder.mAccepted;
    }

    public int getId(){
        return mId;
    }

    public void setId(int pId){
        mId = pId;
    }

    public CUserEntity getInviter(){
        return mInviter;
    }

    public void setInviter(CUserEntity pInviter){
        mInviter = pInviter;
    }

    public CFantasyLeagueEntity getLeagueToJoin(){
        return mLeagueToJoin;
    }

    public void setLeagueToJoin(CFantasyLeagueEntity pLeagueToJoin){
        mLeagueToJoin = pLeagueToJoin;
    }

    public CUserEntity getInvited(){
        return mInvited;
    }

    public void setInvited(CUserEntity pInvited){
        mInvited = pInvited;
    }

    public int getAccepted(){
        return mAccepted;
    }

    public void setAccepted(int pAccepted){
        mAccepted = pAccepted;
    }

    public static class CInvitationBuilder{
        private CUserEntity mInviter;
        private CFantasyLeagueEntity mLeagueToJoin;
        private CUserEntity mInvited;
        private int mAccepted;

        public CInvitationBuilder(){}

        public CInvitationBuilder inviter(CUserEntity pInviter){
            mInviter = pInviter;
            return this;
        }

        public CInvitationBuilder leagueToJoin(CFantasyLeagueEntity pLeagueToJoin){
            mLeagueToJoin = pLeagueToJoin;
            return this;
        }

        public CInvitationBuilder invited(CUserEntity pInvited){
            mInvited = pInvited;
            return this;
        }

        public CInvitationBuilder accepted(int pAccepted){
            mAccepted = pAccepted;
            return this;
        }

        public CInvitationEntity build(){
            return new CInvitationEntity(this);
        }
    }
}
