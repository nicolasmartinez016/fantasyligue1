package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by marti on 15/11/2016.
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CFantasyTeamByWeek.class)

public class CFantasyTeamByWeek implements Serializable {

    @TableGenerator(
            name = "fantasyTeamByWeekTableGenerator",
            allocationSize = 1,
            initialValue = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fantasyTeamByWeekTableGenerator")

    private int mId;
    private int mWeek;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(schema = "fantasyfootball")
    private List<CYourPlayerEntry> mYourPlayerEntries;
    @ManyToOne
    private CFantasyTeamEntity mFantasyTeam;


    public CFantasyTeamByWeek(){}

    public CFantasyTeamByWeek(CFantasyTeamByWeekBuilder pBuilder){
        mWeek = pBuilder.mWeek;
        mYourPlayerEntries = pBuilder.mYourPlayerEntries;
        mFantasyTeam = pBuilder.mFantasyTeam;
    }

    public int getId(){
        return mId;
    }

    public void setId(int pId){
        mId = pId;
    }

    public int getWeek(){
        return mWeek;
    }

    public void setWeek(int pWeek){
        mWeek = pWeek;
    }

    public List<CYourPlayerEntry> getYourPlayerEntries(){
        return mYourPlayerEntries;
    }

    public void setYourPlayerEntries(List<CYourPlayerEntry> pYourPlayerEntries){
        mYourPlayerEntries = pYourPlayerEntries;
    }

    public CFantasyTeamEntity getFantasyTeam(){
        return mFantasyTeam;
    }

    public void setFantasyTeam(CFantasyTeamEntity pFantasyTeam){
        mFantasyTeam = pFantasyTeam;
    }

    @JsonIgnore
    public int getPoints(){
        int lPoints = 0;
        for (CYourPlayerEntry lYourPlayerEntry : mYourPlayerEntries){
            lPoints += lYourPlayerEntry.getPlayer().getPointsByWeekAt(mWeek);
        }
        return lPoints;
    }

    public static class CFantasyTeamByWeekBuilder{
        private int mWeek;
        private List<CYourPlayerEntry> mYourPlayerEntries;
        private CFantasyTeamEntity mFantasyTeam;

        public CFantasyTeamByWeekBuilder(){}

        public CFantasyTeamByWeekBuilder week(int pWeek){
            mWeek = pWeek;
            return this;
        }

        public CFantasyTeamByWeekBuilder yourPlayerEntries(List<CYourPlayerEntry> pYourPlayerEntries){
            mYourPlayerEntries = pYourPlayerEntries;
            return this;
        }

        public CFantasyTeamByWeekBuilder fantasyTeam(CFantasyTeamEntity pFantasyTeam){
            mFantasyTeam = pFantasyTeam;
            return this;
        }

        public CFantasyTeamByWeek build(){
            return new CFantasyTeamByWeek(this);
        }
    }
}
