package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import fr.univtln.nmartinez016.fantasyfootball.CConstants;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 27/07/2016.
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CFantasyTeamEntity.class)

public class CFantasyTeamEntity implements Serializable {

    public static final int PUT_PLAYER_SUCCESS_NO_SWAP = 0;
    public static final int PUT_PLAYER_SUCCESS_WITH_SWAP = 1;
    public static final int PUT_PLAYER_FAILURE_PLAYER_NOT_IN_SQUAD = -1;

    public static final int MOVE_PLAYER_SUCCESS_NO_SWAP = 0;
    public static final int MOVE_PLAYER_SUCCESS_WITH_SWAP = 1;
    public static final int MOVE_PLAYER_FAILURE_PLAYER_NOT_IN_SQUAD = -1;
    @TableGenerator(
            name = "fantasyTeamTableGenerator",
            allocationSize = 1,
            initialValue = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fantasyTeamTableGenerator")
    private int mId;
    @ManyToOne(cascade = CascadeType.MERGE)
    private CUserEntity mUser;
    @OneToMany(cascade = CascadeType.MERGE)
    @JoinTable(schema = "fantasyfootball")
    private List<CYourPlayerEntry> mYourPlayerEntries = new ArrayList<CYourPlayerEntry>();
    private boolean mSelected;
    @ManyToOne
    @JoinColumn
    private CFantasyLeagueEntity mFantasyLeague;

    public CFantasyTeamEntity(){}

    public CFantasyTeamEntity(CFantasyTeamBuilder pBuilder){
        mUser = pBuilder.mUser;
        mYourPlayerEntries = pBuilder.mYourPlayerEntries;
        mSelected = pBuilder.mSelected;
        mFantasyLeague = pBuilder.mFantasyLeague;
        if (mYourPlayerEntries == null){
            mYourPlayerEntries = new ArrayList<CYourPlayerEntry>();
        }
    }

    public int getId(){
        return mId;
    }

    public void setId(int pId){
        mId = pId;
    }

    public CUserEntity getUser(){
        return mUser;
    }

    public void setUser(CUserEntity pUser){
        mUser = pUser;
    }

    public boolean isSelected(){
        return mSelected;
    }

    public void setSelected(boolean pSelected){
        mSelected = pSelected;
    }

    public CFantasyLeagueEntity getFantasyLeague(){
        return mFantasyLeague;
    }

    public void setFantasyLeague(CFantasyLeagueEntity pFantasyLeague){
        mFantasyLeague = pFantasyLeague;
    }

    public List<CYourPlayerEntry> getYourPlayerEntries(){
        if (mYourPlayerEntries == null){
            mYourPlayerEntries = new ArrayList<CYourPlayerEntry>();
        }
        return mYourPlayerEntries;
    }

    public void setYourPlayerEntries(List<CYourPlayerEntry> pYourPlayerEntries){
        mYourPlayerEntries = pYourPlayerEntries;
    }

    public void addYourPlayerEntry(CYourPlayerEntry pYourPlayerEntry){
        if (mYourPlayerEntries == null){
            mYourPlayerEntries = new ArrayList<CYourPlayerEntry>();
        }
        mYourPlayerEntries.add(pYourPlayerEntry);
    }

    @JsonIgnore
    public CPlayerEntity getPlayerByPosition(CPositionEntity pPosition){
        for (CYourPlayerEntry lPlayerEntry : mYourPlayerEntries){
            if (lPlayerEntry.getPosition() != null){
                if (lPlayerEntry.getPosition().getName().equals(pPosition.getName())){
                    return lPlayerEntry.getPlayer();
                }
            }
        }
        return null;
    }

    /*
     * Method called to move a player from your squad in the field.
     * The player has to have a not null position at first, otherwise
     * we should call putPlayerOnField.
     * If we already have an other player in the position where
     * we want to put the passed player, we swap their positions.
     */

    public int movePlayer(CPositionEntity pInitialPosition, CPositionEntity pFinalPosition){
        int i = 0;
        int lReturnValue = MOVE_PLAYER_FAILURE_PLAYER_NOT_IN_SQUAD;
        for (CYourPlayerEntry lPlayerEntry : mYourPlayerEntries) {
            if (lPlayerEntry.getPosition().getName().equals(pInitialPosition.getName()) && lPlayerEntry.getPlayer() != null) {
                lReturnValue = MOVE_PLAYER_SUCCESS_NO_SWAP;
            }
        }

        /*
         * if we found the player we want to put in our squad
         * we go through every player of the squad
         */

        if (lReturnValue == MOVE_PLAYER_SUCCESS_NO_SWAP){
            for (CYourPlayerEntry lPlayerEntry : mYourPlayerEntries){
                if (lPlayerEntry.getPosition() != null){
                    /*
                     * if a player in the squad already has the position
                     * where we want to put our passed player, we set his
                     * position to the passed initial one (to swap him with the
                     * player we want to move)
                     */
                    if (lPlayerEntry.getPosition().getName().equals(pFinalPosition.getName())){
                        editPlayerPosition(i, pInitialPosition);
                        lReturnValue = MOVE_PLAYER_SUCCESS_WITH_SWAP;
                    }
                    /*
                     * when we finally find our passed player, we set
                     * his position to the passed final one
                     */
                    else if (lPlayerEntry.getPosition().getName().equals(pInitialPosition.getName())) {
                        editPlayerPosition(i, pFinalPosition);
                    }
                }
                i++;
            }
        }
        return lReturnValue;
    }

    /*
     * Method called to put a player of your squad in the field.
     * The player has to have a null position at first, otherwise
     * we should call movePlayer.
     * If we already have an other player in the position where
     * we want to put the passed player, we swap their positions.
     */

    public int putPlayerOnField(CPlayerEntity pPlayer, CPositionEntity pPosition){
        int i = 0;
        int lReturnValue = PUT_PLAYER_FAILURE_PLAYER_NOT_IN_SQUAD;
        for (CYourPlayerEntry lPlayerEntry : mYourPlayerEntries) {
            if (lPlayerEntry.getPlayer() != null) {
                if (lPlayerEntry.getPlayer().getId() == pPlayer.getId() && lPlayerEntry.getPosition() == null) {
                    lReturnValue = PUT_PLAYER_SUCCESS_NO_SWAP;
                }
            }
        }

        /*
         * if we found the player we want to put in our squad
         * we go through every player of the squad
         */
        if (lReturnValue == PUT_PLAYER_SUCCESS_NO_SWAP){
            for (CYourPlayerEntry lPlayerEntry : mYourPlayerEntries){
                if (lPlayerEntry.getPosition() != null) {
                    /*
                     * if a player in the squad already has the position
                     * where we want to put our passed player, we set his
                     * position to null (to swap him to the bench)
                     */
                    if (lPlayerEntry.getPosition().getName().equals(pPosition.getName())) {
                        editPlayerPosition(i, null);
                        lReturnValue = PUT_PLAYER_SUCCESS_WITH_SWAP;
                    }
                }
                /*
                 * when we finally find our passed player, we set
                 * his position to the passed one
                 */
                if (lPlayerEntry.getPlayer() != null) {
                    if (lPlayerEntry.getPlayer().getId() == pPlayer.getId()) {
                        editPlayerPosition(i, pPosition);
                    }
                }
                i++;
            }
        }
        return lReturnValue;
    }


    @JsonIgnore
    public List<Integer> getFormation(){
        List<Integer> lFormation = new ArrayList<Integer>();
        int lDefenders = 0;
        int lMidfielders = 0;
        int lForwards = 0;
        lFormation.add(lDefenders);
        lFormation.add(lMidfielders);
        lFormation.add(lForwards);

        return lFormation;
    }

    public void editPlayerPosition(int pIdx, CPositionEntity pPosition){
        CYourPlayerEntry lYourPlayerEntry = mYourPlayerEntries.get(pIdx);
        lYourPlayerEntry.setPosition(pPosition);
        mYourPlayerEntries.set(pIdx, lYourPlayerEntry);
    }

    @JsonIgnore
    public List<CPlayerEntity> getStarters(){
        List<CPlayerEntity> lPlayers = new ArrayList<CPlayerEntity>();
        for (CYourPlayerEntry lYourPlayerEntry : mYourPlayerEntries){
                lPlayers.add(lYourPlayerEntry.getPlayer());
        }
        return lPlayers;
    }

    @JsonIgnore
    public List<CPlayerEntity> getSubs(){
        List<CPlayerEntity> lPlayers = new ArrayList<CPlayerEntity>();
        for (CYourPlayerEntry lYourPlayerEntry : mYourPlayerEntries){
                lPlayers.add(lYourPlayerEntry.getPlayer());
        }
        return lPlayers;
    }



    public static class CFantasyTeamBuilder{
        private CUserEntity mUser;
        private List<CYourPlayerEntry> mYourPlayerEntries = new ArrayList<CYourPlayerEntry>();
        private boolean mSelected = false;
        private CFantasyLeagueEntity mFantasyLeague;

        public CFantasyTeamBuilder(){}

        public CFantasyTeamBuilder user(CUserEntity pUser){
            mUser = pUser;
            return this;
        }

        public CFantasyTeamBuilder yourPlayerEntries(List<CYourPlayerEntry> pYourPlayerEntries){
            mYourPlayerEntries = pYourPlayerEntries;
            return this;
        }

        public CFantasyTeamBuilder fantasyLeague(CFantasyLeagueEntity pFantasyLeague){
            mFantasyLeague = pFantasyLeague;
            return this;
        }

        public CFantasyTeamBuilder select(){
            mSelected = true;
            return this;
        }

        public CFantasyTeamEntity build(){
            return new CFantasyTeamEntity(this);
        }
    }
}
