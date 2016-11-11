package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by marti on 23/06/2016.
 */

@Entity
@Table(schema = "fantasyfootball")
@NamedQueries({@NamedQuery(name = CTeamEntity.GET_BY_NAME, query = "select t from CTeamEntity t where t.mName = :" + CTeamEntity.PARAMETER_NAME),
                @NamedQuery(name = CTeamEntity.GET_ALL, query = "select t from CTeamEntity t")})
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CTeamEntity.class)

public class CTeamEntity implements Serializable, Comparable<CTeamEntity> {

    @TableGenerator(
            name = "teamTableGenerator",
            allocationSize = 1,
            initialValue = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teamTableGenerator")
    private int mId;
    private String mName;
    private String mLeague;
    private String mLogoPath;
    private int mWins;
    private int mLosses;
    private int mDraws;
    private int mScoredGoals;
    private int mConceidedGoals;
    private int mPlayedGames;

    public static final String GET_BY_NAME = "CTeamEntity.getByName";
    public static final String GET_ALL = "CTeamEntity.getAll";

    public static final String PARAMETER_NAME = "name";

    @OneToMany(mappedBy = "mTeam")
    @JoinTable(schema = "fantasyfootball")
    private List<CPlayerEntity> mPlayers;
    private String mJerseyPath;

    public CTeamEntity(){}

    public CTeamEntity(CTeamBuilder pBuilder){
        mName = pBuilder.mName;
        mLeague = pBuilder.mLeague;
        mPlayers = pBuilder.mPlayers;
        mLogoPath = pBuilder.mLogoPath;
        mJerseyPath = pBuilder.mJerseyPath;
    }

    public int getId(){
        return mId;
    }

    public void setId(int pId){
        mId = pId;
    }

    public String getName(){
        return mName;
    }

    public void setName(String pName){
        mName = pName;
    }

    public String getLeague(){
        return mLeague;
    }

    public void setLeague(String pLeague){
        mLeague = pLeague;
    }

    public String getLogoPath(){
        return mLogoPath;
    }

    public void setLogoPath(String pLogoPath){
        mLogoPath = pLogoPath;
    }

    public List<CPlayerEntity> getPlayers(){
        return mPlayers;
    }

    public void setPlayers(List<CPlayerEntity> pPlayers){
        mPlayers = pPlayers;
    }

    public int getWins(){
        return mWins;
    }

    public void setWins(int pWins){
        mWins = pWins;
    }

    public int getPlayedGames(){
        return mPlayedGames;
    }

    public void setPlayedGames(int pPlayedGames){
        mPlayedGames = pPlayedGames;
    }

    public int getDraws(){
        return mDraws;
    }

    public void setDraws(int pDraws){
        mDraws = pDraws;
    }

    public int getLosses(){
        return mLosses;
    }

    public void setLosses(int pLosses){
        mLosses = pLosses;
    }

    public int getScoredGoals(){
        return mScoredGoals;
    }

    public void setScoredGoals(int pScoredGoals){
        mScoredGoals = pScoredGoals;
    }

    public int getConceidedGoals(){
        return mConceidedGoals;
    }

    public void setConceidedGoals(int pConceidedGoals){
        mConceidedGoals = pConceidedGoals;
    }

    public String getJerseyPath(){
        return mJerseyPath;
    }

    public void setJerseyPath(String pJerseyPath){
        mJerseyPath = pJerseyPath;
    }

    public void playGame(){
        mPlayedGames++;
    }

    public void winGame(){
        mWins++;
    }

    public void drawGame(){
        mDraws++;
    }

    public void loseGame(){
        mLosses++;
    }

    public void scoreGoal(){
        mScoredGoals++;
    }

    public void conceideGoal(){
        mConceidedGoals++;
    }

    @JsonIgnore
    public int getPoints(){
        return 3 * mWins + mDraws;
    }

    @JsonIgnore
    public int getGoalAverage(){
        return mScoredGoals - mConceidedGoals;
    }


    /** returns 1 if better than parameter team
     ** 0 if equals
     ** -1 if worse
     **/
    public int compareTo(CTeamEntity pTeam) {
        if (getPoints() > pTeam.getPoints()){
            return 1;
        }

        else if (getPoints() < pTeam.getPoints()){
            return -1;
        }

        else{
            if (getGoalAverage() > pTeam.getGoalAverage()){
                return 1;
            }

            else if (getGoalAverage() < pTeam.getGoalAverage()){
                return -1;
            }

            else{
                if (getScoredGoals() < pTeam.getScoredGoals()){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        }
    }

    @PrePersist
    public void prePersist(){
        System.out.println("avant persistence de la team " + mName);
    }

    @PostPersist
    public void postPersist(){
        System.out.println("apres persitence de la team " + mName);
    }

    @PreUpdate
    public void preUpdate(){
        System.out.println("avant modification de la team " + mName);
    }

    @PostUpdate
    public void postUpdate(){
        System.out.println("apres modification de la team " + mName);
    }

    public static class CTeamBuilder{
        private String mName;
        private String mLeague;
        private String mLogoPath;
        private List<CPlayerEntity> mPlayers;
        private String mJerseyPath;


        public CTeamBuilder(){}

        public CTeamBuilder name(String pName){
            mName = pName;
            return this;
        }

        public CTeamBuilder league(String pLeague){
            mLeague = pLeague;
            return this;
        }

        public CTeamBuilder players(List<CPlayerEntity> pPlayers){
            mPlayers = pPlayers;
            return this;
        }

        public CTeamBuilder logoPath(String pLogoPath){
            mLogoPath = pLogoPath;
            return this;
        }

        public CTeamBuilder jerseyPath(String pJerseyPath){
            mJerseyPath = pJerseyPath;
            return this;
        }

        public CTeamEntity build(){
            return new CTeamEntity(this);
        }
    }
}
