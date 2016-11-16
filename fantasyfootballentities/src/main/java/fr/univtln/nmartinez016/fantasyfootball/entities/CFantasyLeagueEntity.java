package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 04/11/2016.
 */

@Entity
@Table(schema = "fantasyfootball")
@NamedQueries({@NamedQuery(name = CFantasyLeagueEntity.GET_BY_VISIBILITY, query = "select f from CFantasyLeagueEntity f where f.mVisibility = :" + CFantasyLeagueEntity.PARAMETER_PUBLIC)})
@JsonIdentityInfo(generator = ObjectIdGenerators.StringIdGenerator.class, property = "@name", scope = CFantasyLeagueEntity.class)
public class CFantasyLeagueEntity implements Serializable {

    public static final String GET_BY_VISIBILITY = "CFantasyLeagueEntity.getByPublic";
    public static final String PARAMETER_PUBLIC = "public";

    public static final String BASE_LEAGUE = "base league";
    public static final int VISIBILITY_PUBLIC = 0;
    public static final int VISIBILITY_PRIVATE = 1;

    @Id
    private String mName;
    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "mFantasyLeague", fetch = FetchType.EAGER)
    @JoinTable(schema = "fantasyfootball")
    private List<CFantasyTeamEntity> mFantasyTeams;
    private int mCapacity;
    private int mVisibility;

    public CFantasyLeagueEntity(){

    }

    public CFantasyLeagueEntity(CFantasyLeagueBuilder pBuilder){
        mName = pBuilder.mName;
        mFantasyTeams = pBuilder.mFantasyTeams;
        mCapacity = pBuilder.mCapacity;
        mVisibility = pBuilder.mVisibility;
        if (mFantasyTeams == null){
            mFantasyTeams = new ArrayList<CFantasyTeamEntity>();
        }
    }

    public String getName(){
        return mName;
    }

    public void setName(String pName){
        mName = pName;
    }

    public List<CFantasyTeamEntity> getFantasyTeams(){
        return mFantasyTeams;
    }

    public void setFantasyTeams(List<CFantasyTeamEntity> pFantasyTeams){
        mFantasyTeams = pFantasyTeams;
    }

    public int getCapacity(){
        return mCapacity;
    }

    public void setCapacity(int pCapacity){
        mCapacity = pCapacity;
    }

    public int getVisibility(){
        return mVisibility;
    }

    public void setVisibility(int pVisibility){
        mVisibility = pVisibility;
    }

    public void addUser(CUserEntity pUser){
        if (mFantasyTeams == null){
            mFantasyTeams = new ArrayList<CFantasyTeamEntity>();
        }
        System.out.println("user null ? " + pUser == null);
        System.out.println("current fantasy null ? " + pUser.getId() == null);
        if (pUser.getCurrentFantasyTeam() != null){
            pUser.getCurrentFantasyTeam().setSelected(false);
        }
        mFantasyTeams.add(new CFantasyTeamEntity.CFantasyTeamBuilder().user(pUser).select().fantasyLeague(this).build());
        //pUser.addFantasyLeague(this);
    }

    @JsonIgnore
    public CFantasyTeamEntity getFantasyTeamByUser(CUserEntity pUser){
        for (CFantasyTeamEntity lFantasyTeam : mFantasyTeams){
            if (lFantasyTeam.getUser().getId().equals(pUser.getId())){
                return lFantasyTeam;
            }
        }
        return null;
    }

    @PostUpdate
    public void postUpdate(){
        System.out.println("league modifiée : " + getName());
    }

    public static class CFantasyLeagueBuilder{
        private String mName;
        private List<CFantasyTeamEntity> mFantasyTeams;
        private int mCapacity;
        private int mVisibility;

        public CFantasyLeagueBuilder(){}

        public CFantasyLeagueBuilder name(String pName){
            mName = pName;
            return this;
        }

        public CFantasyLeagueBuilder fantasyTeams(List<CFantasyTeamEntity> pFantasyTeams){
            mFantasyTeams = pFantasyTeams;
            return this;
        }

        public CFantasyLeagueBuilder capacity(int pCapacity){
            mCapacity = pCapacity;
            return this;
        }

        public CFantasyLeagueBuilder visibility(int pVisibility){
            mVisibility = pVisibility;
            return this;
        }

        public CFantasyLeagueEntity build(){
            return new CFantasyLeagueEntity(this);
        }
    }
}
