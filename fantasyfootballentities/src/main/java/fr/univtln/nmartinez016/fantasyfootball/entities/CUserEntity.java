package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 23/06/2016.
 */

@Entity
@Table(schema = "fantasyfootball")

@JsonIdentityInfo(generator = ObjectIdGenerators.StringIdGenerator.class, property = "@id", scope = CUserEntity.class)

public class CUserEntity implements Serializable {

    public static final int BUYING_SUCCESS = 0;
    public static final int BUYING_ERROR_OVER_13_PLAYERS = -1;
    public static final int BUYING_ERROR_PLAYER_TOO_EXPENSIVE = -2;
    public static final int BUYING_ERROR_OVER_13_PLAYERS_AND_PLAYER_TOO_EXPENSIVE = -3;


    @Id
    private String mId;
    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(schema = "fantasyfootball")
    private List<CFantasyLeagueEntity> mFantasyLeagues;

    private int mCoins;

    public CUserEntity(){}

    public CUserEntity(CUserBuilder pBuilder){
        mId = pBuilder.mId;
        mFantasyLeagues = pBuilder.mFantasyLeagues;
        mCoins = pBuilder.mCoins;
        if (mFantasyLeagues != null && mFantasyLeagues.size() > 0){
            System.out.println("la ok");
            mFantasyLeagues.get(0).addUser(this);
        }
        else{
            mFantasyLeagues = new ArrayList<CFantasyLeagueEntity>();
        }
    }

    public String getId(){
        return mId;
    }

    public void setId(String pId){
        mId = pId;
    }

    public List<CFantasyLeagueEntity> getFantasyLeagues(){
        return mFantasyLeagues;
    }

    public void setFantasyLeagues(List<CFantasyLeagueEntity> pFantasyLeagues){
        mFantasyLeagues = pFantasyLeagues;
    }

    public int getCoins(){
        return mCoins;
    }

    public void setCoins(int pCoins){
        mCoins = pCoins;
    }



    public int movePlayer(CPositionEntity pInitialPosition, CPositionEntity pFinalPosition){
        return getCurrentFantasyTeam().movePlayer(pInitialPosition, pFinalPosition);
    }

    public int putPlayerOnField(CPlayerEntity pPlayer, CPositionEntity pPosition){
        return getCurrentFantasyTeam().putPlayerOnField(pPlayer, pPosition);
    }

    public int buyPlayer(CPlayerEntity pPlayer){
        if (getCurrentFantasyTeam().getYourPlayerEntries().size() < 14){
            if (mCoins >= pPlayer.getValue()){
                getCurrentFantasyTeam().addYourPlayerEntry(new CYourPlayerEntry.CYourPlayerEntryBuilder().player(pPlayer).build());
                return BUYING_SUCCESS;
            }
            else{
                return BUYING_ERROR_PLAYER_TOO_EXPENSIVE;
            }
        }
        else{
            if (mCoins < pPlayer.getValue()){
                return BUYING_ERROR_OVER_13_PLAYERS_AND_PLAYER_TOO_EXPENSIVE;
            }
            else{
                return BUYING_ERROR_OVER_13_PLAYERS;
            }
        }
    }

    @JsonIgnore
    public CFantasyLeagueEntity getSelectedLeague(){
        System.out.println("nb leagues : " + mFantasyLeagues.size());
        for (CFantasyLeagueEntity lFantasyLeague : mFantasyLeagues){
            for (CFantasyTeamEntity lFantasyTeam : lFantasyLeague.getFantasyTeams()){
                if (lFantasyTeam.getUser() != null){
                    if (lFantasyTeam.getUser().equals(this) && lFantasyTeam.isSelected()){
                        return lFantasyLeague;
                    }
                }
            }
        }
        return null;
    }

    @JsonIgnore
    public CFantasyTeamEntity getCurrentFantasyTeam(){
        if (getSelectedLeague() != null){
            for (CFantasyTeamEntity lFantasyTeam : getSelectedLeague().getFantasyTeams()){
                if (lFantasyTeam.getUser() != null){
                    if (lFantasyTeam.getUser().equals(this)){
                        return lFantasyTeam;
                    }
                }
            }
        }

        return null;
    }


    public static class CUserBuilder{
        private String mId;
        private List<CFantasyLeagueEntity> mFantasyLeagues;
        private int mCoins;

        public CUserBuilder(){}

        public CUserBuilder id(String pId){
            mId = pId;
            return this;
        }

        public CUserBuilder fantasyLeagues(List<CFantasyLeagueEntity> pFantasyLeagues){
            mFantasyLeagues = pFantasyLeagues;
            return this;
        }

        public CUserBuilder coins(int pCoins){
            mCoins = pCoins;
            return this;
        }

        public CUserEntity build(){
            return new CUserEntity(this);
        }
    }
}
