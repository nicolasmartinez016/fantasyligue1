package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;

/**
 * Created by marti on 23/06/2016.
 */

@Entity
@Table(schema = "fantasyfootball")
@NamedQueries({@NamedQuery(name = CPlayerEntity.GET_BY_NAME_WITH, query = "select p from CPlayerEntity p where p.mLastName LIKE :" + CPlayerEntity.PARAMETER_LASTNAME),
        @NamedQuery(name = CPlayerEntity.GET_ALL, query = "select p from CPlayerEntity p"),
        @NamedQuery(name = CPlayerEntity.GET_BY_AGE_LOWER_THAN_OR_EQUALS, query = "select p from CPlayerEntity p where p.mYearOfBirth > :" + CPlayerEntity.PARAMETER_YEAR + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_YEAR + " and p.mMonthOfBirth < :" + CPlayerEntity.PARAMETER_MONTH + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_YEAR + " and p.mMonthOfBirth = :" + CPlayerEntity.PARAMETER_MONTH + " and p.mDayOfBirth <= :" + CPlayerEntity.PARAMETER_DAY),
        @NamedQuery(name = CPlayerEntity.GET_BY_AGE_EQUALS, query = "select p from CPlayerEntity p where p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_YEAR + " and p.mMonthOfBirth < :" + CPlayerEntity.PARAMETER_MONTH + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_YEAR + " and p.mMonthOfBirth < :" + CPlayerEntity.PARAMETER_MONTH + " and p.mDayOfBirth <= :" + CPlayerEntity.PARAMETER_DAY + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_OTHER_YEAR + " and p.mMonthOfBirth > :" + CPlayerEntity.PARAMETER_MONTH + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_OTHER_YEAR + " and p.mMonthOfBirth = :" + CPlayerEntity.PARAMETER_MONTH + " and p.mDayOfBirth > :" + CPlayerEntity.PARAMETER_MONTH ),
        @NamedQuery(name = CPlayerEntity.GET_BY_TEAM, query = "select p from CPlayerEntity p where p.mTeam = (select t from CTeamEntity t where t.mId = :" + CPlayerEntity.PARAMETER_TEAM + ")"),
        @NamedQuery(name = CPlayerEntity.GET_BY_NAME_AND_AGE_LOWER_OR_EQUALS, query = "select p from CPlayerEntity p where p.mYearOfBirth > :" + CPlayerEntity.PARAMETER_YEAR + " and p.mLastName LIKE :" + CPlayerEntity.PARAMETER_LASTNAME + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_YEAR + " and p.mMonthOfBirth < :" + CPlayerEntity.PARAMETER_MONTH + " and p.mLastName LIKE :" + CPlayerEntity.PARAMETER_LASTNAME + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_YEAR + " and p.mMonthOfBirth = :" + CPlayerEntity.PARAMETER_MONTH + " and p.mDayOfBirth <= :" + CPlayerEntity.PARAMETER_DAY + " and  p.mLastName LIKE :" + CPlayerEntity.PARAMETER_LASTNAME),
        @NamedQuery(name = CPlayerEntity.GET_BY_NAME_AND_AGE_EQUALS, query = "select p from CPlayerEntity p where p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_YEAR + " and p.mMonthOfBirth < :" + CPlayerEntity.PARAMETER_MONTH + " and p.mLastName LIKE :" + CPlayerEntity.PARAMETER_LASTNAME + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_YEAR + " and p.mMonthOfBirth < :" + CPlayerEntity.PARAMETER_MONTH + " and p.mDayOfBirth <= :" + CPlayerEntity.PARAMETER_DAY + " and p.mLastName LIKE :" + CPlayerEntity.PARAMETER_LASTNAME + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_OTHER_YEAR + " and p.mMonthOfBirth > :" + CPlayerEntity.PARAMETER_MONTH + " and p.mLastName LIKE :" + CPlayerEntity.PARAMETER_LASTNAME + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_OTHER_YEAR + " and p.mMonthOfBirth = :" + CPlayerEntity.PARAMETER_MONTH + " and p.mDayOfBirth > :" + CPlayerEntity.PARAMETER_MONTH + " and p.mLastName LIKE :" + CPlayerEntity.PARAMETER_LASTNAME ),
        @NamedQuery(name = CPlayerEntity.GET_BY_NAME_AND_TEAM, query = "select p from CPlayerEntity p where p.mTeam = (select t from CTeamEntity t where t.mId = :" + CPlayerEntity.PARAMETER_TEAM + ") and p.mLastName LIKE :" + CPlayerEntity.PARAMETER_LASTNAME),
        @NamedQuery(name = CPlayerEntity.GET_BY_TEAM_AND_AGE_EQUALS, query = "select p from CPlayerEntity p where p.mTeam = (select t from CTeamEntity t where t.mId = :" + CPlayerEntity.PARAMETER_TEAM + ") and (p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_YEAR + " and p.mMonthOfBirth < :" + CPlayerEntity.PARAMETER_MONTH + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_YEAR + " and p.mMonthOfBirth < :" + CPlayerEntity.PARAMETER_MONTH + " and p.mDayOfBirth <= :" + CPlayerEntity.PARAMETER_DAY + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_OTHER_YEAR + " and p.mMonthOfBirth > :" + CPlayerEntity.PARAMETER_MONTH + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_OTHER_YEAR + " and p.mMonthOfBirth = :" + CPlayerEntity.PARAMETER_MONTH + " and p.mDayOfBirth > :" + CPlayerEntity.PARAMETER_MONTH + ")"),
        @NamedQuery(name = CPlayerEntity.GET_BY_TEAM_AND_AGE_LOWER_OR_EQUALS, query = "select p from CPlayerEntity p where p.mTeam = (select t from CTeamEntity t where t.mId = :" + CPlayerEntity.PARAMETER_TEAM + ") and (p.mYearOfBirth > :" + CPlayerEntity.PARAMETER_YEAR + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_YEAR + " and p.mMonthOfBirth < :" + CPlayerEntity.PARAMETER_MONTH + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_YEAR + " and p.mMonthOfBirth = :" + CPlayerEntity.PARAMETER_MONTH + " and p.mDayOfBirth <= :" + CPlayerEntity.PARAMETER_DAY + ")"),
        @NamedQuery(name = CPlayerEntity.GET_BY_NAME_AND_TEAM_AND_AGE_EQUALS, query = "select p from CPlayerEntity p where p.mTeam = (select t from CTeamEntity t where t.mId = :" + CPlayerEntity.PARAMETER_TEAM + ") and (p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_YEAR + " and p.mMonthOfBirth < :" + CPlayerEntity.PARAMETER_MONTH + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_YEAR + " and p.mMonthOfBirth < :" + CPlayerEntity.PARAMETER_MONTH + " and p.mDayOfBirth <= :" + CPlayerEntity.PARAMETER_DAY + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_OTHER_YEAR + " and p.mMonthOfBirth > :" + CPlayerEntity.PARAMETER_MONTH + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_OTHER_YEAR + " and p.mMonthOfBirth = :" + CPlayerEntity.PARAMETER_MONTH + " and p.mDayOfBirth > :" + CPlayerEntity.PARAMETER_MONTH + ") and p.mLastName LIKE :" + CPlayerEntity.PARAMETER_LASTNAME),
        @NamedQuery(name = CPlayerEntity.GET_BY_NAME_AND_TEAM_AND_AGE_LOWER_OR_EQUALS, query = "select p from CPlayerEntity p where p.mTeam = (select t from CTeamEntity t where t.mId = :" + CPlayerEntity.PARAMETER_TEAM + ") and (p.mYearOfBirth > :" + CPlayerEntity.PARAMETER_YEAR + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_YEAR + " and p.mMonthOfBirth < :" + CPlayerEntity.PARAMETER_MONTH + " or p.mYearOfBirth = :" + CPlayerEntity.PARAMETER_YEAR + " and p.mMonthOfBirth = :" + CPlayerEntity.PARAMETER_MONTH + " and p.mDayOfBirth <= :" + CPlayerEntity.PARAMETER_DAY + ") and p.mLastName LIKE :" + CPlayerEntity.PARAMETER_LASTNAME)
})
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CPlayerEntity.class)
public class CPlayerEntity implements Serializable {
    @TableGenerator(
            name = "playerTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "playerTableGenerator")


    private int mId;
    public static final String GET_ALL = "CPlayerEntity.getAll";
    public static final String GET_BY_NAME_WITH = "CPlayerEntity.getByNameWith";
    public static final String GET_BY_AGE_LOWER_THAN_OR_EQUALS = "CPlayerEntity.getByAgeLowerThanOrEquals";
    public static final String GET_BY_AGE_EQUALS = "CPlayerEntity.getByAgeEquals";
    public static final String GET_BY_TEAM = "CPlayerEntity.getByTeam";
    public static final String GET_BY_NAME_AND_AGE_EQUALS = "CPlayerEntity.getByNameWithAndAgeEquals";
    public static final String GET_BY_NAME_AND_AGE_LOWER_OR_EQUALS = "CPlayerEntity.getByNameWithAndAgeLowerOrEquals";
    public static final String GET_BY_NAME_AND_AGE_HIGHER_OR_EQUALS = "CPlayerEntity.getByNameWithAndAgeHigherOrEquals";
    public static final String GET_BY_NAME_AND_TEAM = "CPlayerEntity.getByNameWithAndTeam";
    public static final String GET_BY_TEAM_AND_AGE_LOWER_OR_EQUALS = "CPlayerEntity.getByTeamAndAgeLowerOrEquals";
    public static final String GET_BY_TEAM_AND_AGE_HIGHER_OR_EQUALS = "CPlayerEntity.getByTeamAndAgeHigherOrEquals";
    public static final String GET_BY_TEAM_AND_AGE_EQUALS = "CPlayerEntity.getByTeamAndAgeEquals";
    public static final String GET_BY_NAME_AND_TEAM_AND_AGE_EQUALS = "CPlayerEntity.getByNameAndTeamAndAgeEquals";
    public static final String GET_BY_NAME_AND_TEAM_AND_AGE_LOWER_OR_EQUALS = "CPlayerEntity.getByNameAndTeamAndAgeLowerOrEquals";
    public static final String GET_BY_NAME_AND_TEAM_AND_AGE_HIGHER_OR_EQUALS = "CPlayerEntity.getByNameAndTeamAndAgeHigherOrEquals";


    public static final String PARAMETER_YEAR = "year";
    public static final String PARAMETER_MONTH = "month";
    public static final String PARAMETER_DAY = "day";
    public static final String PARAMETER_OTHER_YEAR = "otheryear";
    public static final String PARAMETER_LASTNAME = "lastname";
    public static final String PARAMETER_FIRSTNAME = "firstname";
    public static final String PARAMETER_TEAM = "team";

    private String mLastName;
    private String mFirstName;
    private int mDayOfBirth;
    private int mMonthOfBirth;
    private int mYearOfBirth;
    private String mCountry;
    @ManyToOne
    private CTeamEntity mTeam;
    @ManyToOne
    private CUserEntity mOwner;
    private int mValue;
    private String mPicturePath;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(schema = "fantasyfootball")
    private List<CPositionEntity> mPositions;
    private int mTotwAppearances;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, mappedBy = "mPlayer")
    @JoinTable(schema = "fantasyfootball")
    private List<CPointsByWeek> mPointsByWeek;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(schema = "fantasyfootball")
    private List<CGameEntity> mGames;


    public CPlayerEntity(){}

    public CPlayerEntity(CPlayerBuilder pBuilder){
        mLastName = pBuilder.mLastName;
        mFirstName = pBuilder.mFirstName;
        mDayOfBirth = pBuilder.mDayOfBirth;
        mMonthOfBirth = pBuilder.mMonthOfBirth;
        mYearOfBirth = pBuilder.mYearOfBirth;
        mTeam = pBuilder.mTeam;
        mOwner = pBuilder.mOwner;
        mPositions = pBuilder.mPositions;
        mCountry = pBuilder.mCountry;
        mValue = pBuilder.mValue;
        mPicturePath = pBuilder.mPicturePath;
    }

    public int getId(){
        return mId;
    }

    public void setId(int pId){
        mId = pId;
    }

    public String getLastName(){
        return mLastName;
    }

    public void setLastName(String pLastName){
        mLastName = pLastName;
    }

    public String getFirstName(){
        return mFirstName;
    }

    public void setFirstName(String pFirstName){
        mFirstName = pFirstName;
    }

    public int getDayOfBirth(){
        return mDayOfBirth;
    }

    public void setDayOfBirth( int pDayOfBirth){
        mDayOfBirth = pDayOfBirth;
    }

    public int getMonthOfBirth(){
        return mMonthOfBirth;
    }

    public void setMonthOfBirth( int pMonthOfBirth){
        mMonthOfBirth = pMonthOfBirth;
    }

    public int getYearOfBirth(){
        return mYearOfBirth;
    }

    public void setYearOfBirth( int pYearOfBirth){
        mYearOfBirth = pYearOfBirth;
    }

    public CTeamEntity getTeam(){
        return mTeam;
    }

    public void setTeam(CTeamEntity pTeam){
        mTeam = pTeam;
    }

    public CUserEntity getOwner(){
        return mOwner;
    }

    public void setOwner(CUserEntity pOwner){
        mOwner = pOwner;
    }

    public String getCountry(){
        return mCountry;
    }

    public void setCountry(String pCountry){
        mCountry = pCountry;
    }

    public List<CPositionEntity> getPositions(){
        return mPositions;
    }

    public void setPositions(List<CPositionEntity> pPositions){
        mPositions = pPositions;
    }

    public int getValue(){
        return mValue;
    }

    public void setValue(int pValue){
        mValue = pValue;
    }

    public String getPicturePath(){
        return mPicturePath;
    }

    public void setPicturePath(String pPicturePath){
        mPicturePath = pPicturePath;
    }

    public int getTotwAppearances(){
        return mTotwAppearances;
    }

    public void setTotwAppearances(int pTotwAppearances){
        mTotwAppearances = pTotwAppearances;
    }

    public List<CPointsByWeek> getPointsByWeek(){
        return mPointsByWeek;
    }

    public void setPointsByWeek(List<CPointsByWeek> pPointsByWeek){
        mPointsByWeek = pPointsByWeek;
    }

    public List<CGameEntity> getGames(){
        return mGames;
    }

    public void setGames(List<CGameEntity> pGames){
        mGames = pGames;
    }

    public void addGame(CGameEntity pGame){
        if (mGames == null){
            mGames = new ArrayList<CGameEntity>();
        }
        mGames.add(pGame);
    }

    @JsonIgnore
    public int getPointsByWeekAt(int pWeek){
        for (CPointsByWeek lPointsByWeek : mPointsByWeek){
            if (lPointsByWeek.getWeek() == pWeek){
                return lPointsByWeek.getPoints();
            }
        }
        return 0;
        //return null;
    }

    @JsonIgnore
    public List<Integer> getResults(){
        List<Integer> lResults = new ArrayList<Integer>();
        for (CGameEntity lGame : mGames){
            if (lGame.getWinningTeam().equals(getTeam())){
                lResults.add(0);
            }
            else if (lGame.getWinningTeam().equals(null)){
                lResults.add(1);
            }
            else{
                lResults.add(2);
            }
        }
        return lResults;
    }

    @JsonIgnore
    public List<Integer> getLastFiveResults(){
        List<Integer> lResults = getResults();
        List<Integer> lLastFiveResults = new ArrayList<Integer>();
        for (int i = lResults.size() - 1; i > lResults.size() - 6; i--){
            if (i > 0){
                lLastFiveResults.add(lResults.get(i));
            }
            else{
                lLastFiveResults.add(3);
            }
        }

        return lLastFiveResults;
    }

    @JsonIgnore
    public int getGoals(){
        int lGoals = 0;
        for (CGameEntity lGame : mGames){
            for (CGoalsByGame lGoalByGame : lGame.getScorers()){
                if (lGoalByGame.getPlayer().equals(this)){
                    lGoals = lGoals + lGoalByGame.getQuantity();
                }
            }
        }
        return lGoals;
    }

    @JsonIgnore
    public int getAssists(){
        int lAssists = 0;
        for (CGameEntity lGame : mGames){
            for (CAssistByGame lAssistByGame : lGame.getAssisters()){
                if (lAssistByGame.getPlayer().equals(this)){
                    lAssists = lAssists + lAssistByGame.getQuantity();
                }
            }
        }
        return lAssists;
    }

    @JsonIgnore
    public int getMinutesPlayed(){
        int lMinutesPlayed = 0;
        for (CGameEntity lGame : mGames){
            for (CPlayerByGame lPlayerByGame : lGame.getPlayers()){
                if (lPlayerByGame.getPlayer().equals(this)){
                    lMinutesPlayed = lMinutesPlayed + lPlayerByGame.getMinutesPlayed();
                }
            }
        }
        return lMinutesPlayed;
    }

    @JsonIgnore
    public int getGamesPlayed(){
        int lGamesPlayed = 0;
        for (CGameEntity lGame : mGames){
            for (CPlayerByGame lPlayerByGame : lGame.getPlayers()){
                if (lPlayerByGame.getPlayer().equals(this)){
                    lGamesPlayed++;
                }
            }
        }
        return lGamesPlayed;
    }

    @JsonIgnore
    public int getSaves(){
        int lSaves = 0;
        for (CGameEntity lGame : mGames){
            for (CSaveByGame lSaveByGame : lGame.getSaves()){
                if (lSaveByGame.getPlayer().equals(this)){
                    lSaves = lSaves + lSaveByGame.getQuantity();
                }
            }
        }
        return lSaves;
    }

    @JsonIgnore
    public int getYellowCards(){
        int lYellows = 0;
        for (CGameEntity lGame : mGames){
            for (CYellowCardByGame lYellowByGame : lGame.getYellowCards()){
                if (lYellowByGame.getPlayer().equals(this)){
                    lYellows = lYellows + lYellowByGame.getQuantity();
                }
            }
        }
        return lYellows;
    }

    @JsonIgnore
    public int getRedCards(){
        int lReds = 0;
        for (CGameEntity lGame : mGames){
            for (CRedCardByGame lRedByGame : lGame.getRedCards()){
                if (lRedByGame.getPlayer().equals(this)){
                    lReds = lReds + lRedByGame.getQuantity();
                }
            }
        }
        return lReds;
    }

    @JsonIgnore
    public int getPenaltiesConceded(){
        int lPenaltiesConceded = 0;
        for (CGameEntity lGame : mGames){
            for (CPenaltyConcededByGame lPenaltyConcededByGame : lGame.getPenaltiesConceded()){
                if (lPenaltyConcededByGame.getFouler().equals(this)){
                    lPenaltiesConceded = lPenaltiesConceded + lPenaltyConcededByGame.getQuantity();
                }
            }
        }
        return lPenaltiesConceded;
    }

    @JsonIgnore
    public int getPenaltiesMissed(){
        int lPenaltiesMissed = 0;
        for (CGameEntity lGame : mGames){
            for (CPenaltyMissedByGame lPenaltyMissedByGame : lGame.getPenaltiesMissed()){
                if (lPenaltyMissedByGame.getShooter().equals(this)){
                    lPenaltiesMissed = lPenaltiesMissed + lPenaltyMissedByGame.getQuantity();
                }
            }
        }
        return lPenaltiesMissed;
    }

    @JsonIgnore
    public int getPenaltiesProvoked(){
        int lPenaltiesProvoked = 0;
        for (CGameEntity lGame : mGames){
            for (CPenaltyProvokedByGame lPenaltyProvokedByGame : lGame.getPenaltiesProvoked()){
                if (lPenaltyProvokedByGame.getProvoker().equals(this)){
                    lPenaltiesProvoked = lPenaltiesProvoked + lPenaltyProvokedByGame.getQuantity();
                }
            }
        }
        return lPenaltiesProvoked;
    }

    @JsonIgnore
    public int getPenaltiesScored(){
        int lPenaltiesScored = 0;
        for (CGameEntity lGame : mGames){
            for (CPenaltyScoredByGame lPenaltyScoredByGame : lGame.getPenaltiesScored()){
                if (lPenaltyScoredByGame.getShooter().equals(this)){
                    lPenaltiesScored = lPenaltiesScored + lPenaltyScoredByGame.getQuantity();
                }
            }
        }
        return lPenaltiesScored;
    }

    public void addPointsByWeek(CPointsByWeek pPointsByWeek){
        if (mPointsByWeek == null){
            mPointsByWeek = new ArrayList<CPointsByWeek>();
        }
        mPointsByWeek.add(pPointsByWeek);
    }

    // ca ou list pointbyweek ?

    public void addTotwAppearance(){
        mTotwAppearances++;
    }

    @JsonIgnore
    public int getAge(){
        // todo : add jsonignore, calcul de l'age
        Calendar lCalendar = Calendar.getInstance();
        int lDay = lCalendar.get(lCalendar.DAY_OF_MONTH);
        int lMonth = lCalendar.get(lCalendar.MONTH) + 1;
        int lYear = lCalendar.get(lCalendar.YEAR);
        int lAge = lYear - mYearOfBirth;
        if (lMonth < mMonthOfBirth){
            lAge = lAge - 1;
        }
        else if (lMonth == mMonthOfBirth){
            if (lDay < mDayOfBirth){
                lAge = lAge - 1;
            }
        }
        return lAge;
    }

    @JsonIgnore
    public boolean isGk(){
        if (mPositions != null){
            for (CPositionEntity lPosition : mPositions){
                if (lPosition.isGoalKeeper()){
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @JsonIgnore
    public boolean isDefender(){
        int lGkPositions = 0;
        int lDefPositions = 0;
        int lMidfieldPositions = 0;
        int lForwardPositions = 0;
        if (mPositions != null){
            for (CPositionEntity lPosition : mPositions){
                if (lPosition.isGoalKeeper()){
                    lGkPositions++;
                }
                if (lPosition.isDefender()){
                    lDefPositions++;
                }

                if (lPosition.isMidfielder()){
                    lMidfieldPositions++;
                }
                if (lPosition.isForward()){
                    lForwardPositions++;
                }
            }
        }

        if (lGkPositions == 1){
            return false;
        }
        if (lDefPositions > lMidfieldPositions && lDefPositions > lForwardPositions){
            return true;
        }
        return false;
    }

    @JsonIgnore
    public boolean isMidfielder(){
        int lGkPositions = 0;
        int lDefPositions = 0;
        int lMidfieldPositions = 0;
        int lForwardPositions = 0;
        if (mPositions != null){
            for (CPositionEntity lPosition : mPositions){
                if (lPosition.isGoalKeeper()){
                    lGkPositions++;
                }
                if (lPosition.isDefender()){
                    lDefPositions++;
                }

                if (lPosition.isMidfielder()){
                    lMidfieldPositions++;
                }
                if (lPosition.isForward()){
                    lForwardPositions++;
                }
            }
        }

        if (lGkPositions == 1){
            return false;
        }
        if (lMidfieldPositions > lDefPositions && lMidfieldPositions > lForwardPositions){
            return true;
        }
        return false;
    }

    @JsonIgnore
    public boolean isForward(){
        int lGkPositions = 0;
        int lDefPositions = 0;
        int lMidfieldPositions = 0;
        int lForwardPositions = 0;
        if (mPositions != null){
            for (CPositionEntity lPosition : mPositions){
                if (lPosition.isGoalKeeper()){
                    lGkPositions++;
                }
                if (lPosition.isDefender()){
                    lDefPositions++;
                }

                if (lPosition.isMidfielder()){
                    lMidfieldPositions++;
                }
                if (lPosition.isForward()){
                    lForwardPositions++;
                }
            }
        }

        if (lGkPositions == 1){
            return false;
        }
        if (lForwardPositions > lDefPositions && lForwardPositions > lMidfieldPositions){
            return true;
        }
        return false;
    }

    @JsonIgnore
    public int getGk(){
        int lGk = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getGk() > lGk){
                lGk = lPosition.getGk();
            }
        }
        return lGk;
    }

    @JsonIgnore
    public int getRb(){
        int lRb = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getRb() > lRb){
                lRb = lPosition.getRb();
            }
        }
        return lRb;
    }

    @JsonIgnore
    public int getRcb(){
        int lRcb = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getRcb() > lRcb){
                lRcb = lPosition.getRcb();
            }
        }
        return lRcb;
    }

    @JsonIgnore
    public int getCb(){
        int lCb = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getCb() > lCb){
                lCb = lPosition.getCb();
            }
        }
        return lCb;
    }

    @JsonIgnore
    public int getLcb(){
        int lLcb = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getLcb() > lLcb){
                lLcb = lPosition.getLcb();
            }
        }
        return lLcb;
    }

    @JsonIgnore
    public int getLb(){
        int lLb = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getLb() > lLb){
                lLb = lPosition.getLb();
            }
        }
        return lLb;
    }

    @JsonIgnore
    public int getRwb(){
        int lRwb = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getRwb() > lRwb){
                lRwb = lPosition.getRwb();
            }
        }
        return lRwb;
    }

    @JsonIgnore
    public int getLwb(){
        int lLwb = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getLwb() > lLwb){
                lLwb = lPosition.getLwb();
            }
        }
        return lLwb;
    }

    @JsonIgnore
    public int getCdm(){
        int lCdm = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getCdm() > lCdm){
                lCdm = lPosition.getCdm();
            }
        }
        return lCdm;
    }

    @JsonIgnore
    public int getRdm(){
        int lRdm = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getRdm() > lRdm){
                lRdm = lPosition.getRdm();
            }
        }
        return lRdm;
    }

    @JsonIgnore
    public int getLdm(){
        int lLdm = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getLdm() > lLdm){
                lLdm = lPosition.getLdm();
            }
        }
        return lLdm;
    }

    @JsonIgnore
    public int getCm(){
        int lCm = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getCm() > lCm){
                lCm = lPosition.getCm();
            }
        }
        return lCm;
    }

    @JsonIgnore
    public int getRcm(){
        int lRcm = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getRcm() > lRcm){
                lRcm = lPosition.getRcm();
            }
        }
        return lRcm;
    }

    @JsonIgnore
    public int getLcm(){
        int lLcm = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getLcm() > lLcm){
                lLcm = lPosition.getLcm();
            }
        }
        return lLcm;
    }

    @JsonIgnore
    public int getRm(){
        int lRm = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getRm() > lRm){
                lRm = lPosition.getRm();
            }
        }
        return lRm;
    }

    @JsonIgnore
    public int getLm(){
        int lLm = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getLm() > lLm){
                lLm = lPosition.getLm();
            }
        }
        return lLm;
    }

    @JsonIgnore
    public int getCam(){
        int lCam = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getCam() > lCam){
                lCam = lPosition.getCam();
            }
        }
        return lCam;
    }

    @JsonIgnore
    public int getRam(){
        int lRam = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getRam() > lRam){
                lRam = lPosition.getRam();
            }
        }
        return lRam;
    }

    @JsonIgnore
    public int getLam(){
        int lLam = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getLam() > lLam){
                lLam = lPosition.getLam();
            }
        }
        return lLam;
    }

    @JsonIgnore
    public int getRw(){
        int lRw = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getRw() > lRw){
                lRw = lPosition.getRw();
            }
        }
        return lRw;
    }

    @JsonIgnore
    public int getLw(){
        int lLw = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getLw() > lLw){
                lLw = lPosition.getLw();
            }
        }
        return lLw;
    }

    @JsonIgnore
    public int getRst(){
        int lRst = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getRst() > lRst){
                lRst = lPosition.getRst();
            }
        }
        return lRst;
    }

    @JsonIgnore
    public int getSt(){
        int lSt = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getSt() > lSt){
                lSt = lPosition.getSt();
            }
        }
        return lSt;
    }

    @JsonIgnore
    public int getLst(){
        int lLst = 0;
        for (CPositionEntity lPosition : mPositions){
            if (lPosition.getLst() > lLst){
                lLst = lPosition.getLst();
            }
        }
        return lLst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CPlayerEntity that = (CPlayerEntity) o;

        return mId == that.mId;

    }

    @Override
    public int hashCode() {
        return mId;
    }

    @Override
    public String toString() {
        return "CPlayerEntity{" +
                "mId=" + mId +
                ", mLastName='" + mLastName + '\'' +
                ", mFirstName='" + mFirstName + '\'' +
                ", mDayOfBirth=" + mDayOfBirth +
                ", mMonthOfBirth=" + mMonthOfBirth +
                ", mYearOfBirth=" + mYearOfBirth +
                ", mCountry='" + mCountry + '\'' +
                ", mTeam=" + mTeam.getName() +
                //", mOwner=" + mOwner.getId() +
                ", mValue=" + mValue +
                ", mPicturePath='" + mPicturePath + '\'' +
                ", mPositions=" + mPositions +
                ", mTotwAppearances=" + mTotwAppearances +
                ", mPointsByWeek=" + mPointsByWeek.size() +
                ", mGames=" + mGames.size() +
                '}';
    }

    public static class CPlayerBuilder{
        private String mLastName;
        private String mFirstName;
        private int mDayOfBirth;
        private int mMonthOfBirth;
        private int mYearOfBirth;
        private String mCountry;
        private CTeamEntity mTeam;
        private CUserEntity mOwner;
        private int mPlayedGames;
        private int mScoredGoals;
        private List<CPositionEntity> mPositions;
        private int mValue;
        private String mPicturePath;


        public CPlayerBuilder(){}

        public CPlayerBuilder lastName(String pLastName){
            mLastName = pLastName;
            return this;
        }

        public CPlayerBuilder firstName(String pFirstName){
            mFirstName = pFirstName;
            return this;
        }

        public CPlayerBuilder dayOfBirth(int pDayOfBirth){
            mDayOfBirth = pDayOfBirth;
            return this;
        }

        public CPlayerBuilder monthOfBirth(int pMonthOfBirth){
            mMonthOfBirth = pMonthOfBirth;
            return this;
        }

        public CPlayerBuilder yearOfBirth(int pYearOfBirth){
            mYearOfBirth = pYearOfBirth;
            return this;
        }

        public CPlayerBuilder team(CTeamEntity pTeam){
            mTeam = pTeam;
            return this;
        }

        public CPlayerBuilder owner(CUserEntity pOwner){
            mOwner = pOwner;
            return this;
        }

        public CPlayerBuilder scoredGoals(int pScoredGoals){
            mScoredGoals = pScoredGoals;
            return this;
        }

        public CPlayerBuilder playedGames(int pPlayedGames){
            mPlayedGames = pPlayedGames;
            return this;
        }

        public CPlayerBuilder positions(List<CPositionEntity> pPositions){
            mPositions = pPositions;
            return this;
        }

        public CPlayerBuilder country(String pCountry){
            mCountry = pCountry;
            return this;
        }

        public CPlayerBuilder value(int pValue){
            mValue = pValue;
            return this;
        }

        public CPlayerBuilder picturePath(String pPicturePath){
            mPicturePath = pPicturePath;
            return this;
        }

        public CPlayerEntity build(){
            return new CPlayerEntity(this);
        }
    }

    /*
     * method to rank players by their goals
     */

    public static Comparator<CPlayerEntity> getCompareByScoredGoals(){
        return new Comparator<CPlayerEntity>() {
            public int compare(CPlayerEntity lPlayer1, CPlayerEntity lPlayer2) {
                if (lPlayer1.getGoals() > lPlayer2.getGoals()){
                    return 1;
                }
                else if (lPlayer1.getGoals() == lPlayer2.getGoals()){
                    if (lPlayer1.getMinutesPlayed() <= lPlayer2.getMinutesPlayed()){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    return -1;
                }
            }
        };
    }

    /*
     * method to rank players by their assists
     */

    public static Comparator<CPlayerEntity> getCompareByAssists(){
        return new Comparator<CPlayerEntity>() {
            public int compare(CPlayerEntity pPlayer1, CPlayerEntity pPlayer2) {
                if (pPlayer1.getAssists() > pPlayer2.getAssists()){
                    return 1;
                }
                else if (pPlayer1.getAssists() == pPlayer2.getAssists()){
                    if (pPlayer1.getMinutesPlayed() <= pPlayer2.getMinutesPlayed()){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    return -1;
                }
            }
        };
    }

    /*
     * method to rank players by their yellow cards
     */

    public static Comparator<CPlayerEntity> getCompareByYellowCards(){
        return new Comparator<CPlayerEntity>() {
            public int compare(CPlayerEntity pPlayer1, CPlayerEntity pPlayer2) {
                if (pPlayer1.getYellowCards() > pPlayer2.getYellowCards()){
                    return 1;
                }
                else if (pPlayer1.getYellowCards() == pPlayer2.getYellowCards()){
                    if (pPlayer1.getMinutesPlayed() <= pPlayer2.getMinutesPlayed()){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    return -1;
                }
            }
        };
    }

    /*
     * method to rank players by their red cards
     */

    public static Comparator<CPlayerEntity> getCompareByRedCards(){
        return new Comparator<CPlayerEntity>() {
            public int compare(CPlayerEntity pPlayer1, CPlayerEntity pPlayer2) {
                if (pPlayer1.getRedCards() > pPlayer2.getRedCards()){
                    return 1;
                }
                else if (pPlayer1.getRedCards() == pPlayer2.getRedCards()){
                    if (pPlayer1.getMinutesPlayed() <= pPlayer2.getMinutesPlayed()){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    return -1;
                }
            }
        };
    }

    /*
     * method to rank players by their saves
     */

    public static Comparator<CPlayerEntity> getCompareBySaves(){
        return new Comparator<CPlayerEntity>() {
            public int compare(CPlayerEntity pPlayer1, CPlayerEntity pPlayer2) {
                if (pPlayer1.getSaves() > pPlayer2.getSaves()){
                    return 1;
                }
                else if (pPlayer1.getSaves() == pPlayer2.getSaves()){
                    if (pPlayer1.getMinutesPlayed() <= pPlayer2.getMinutesPlayed()){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    return -1;
                }
            }
        };
    }

    /*
     * method to rank players by their games played
     */

    public static Comparator<CPlayerEntity> getCompareByGamesPlayed(){
        return new Comparator<CPlayerEntity>() {
            public int compare(CPlayerEntity pPlayer1, CPlayerEntity pPlayer2) {
                if (pPlayer1.getGamesPlayed() > pPlayer2.getGamesPlayed()){
                    return 1;
                }
                else if (pPlayer1.getYellowCards() == pPlayer2.getYellowCards()){
                    if (pPlayer1.getGamesPlayed() <= pPlayer2.getGamesPlayed()){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    return -1;
                }
            }
        };
    }

    /*
     * method to rank players by their minutes played
     */

    public static Comparator<CPlayerEntity> getCompareByMinutesPlayed(){
        return new Comparator<CPlayerEntity>() {
            public int compare(CPlayerEntity pPlayer1, CPlayerEntity pPlayer2) {
                if (pPlayer1.getMinutesPlayed() > pPlayer2.getMinutesPlayed()){
                    return 1;
                }
                else if (pPlayer1.getMinutesPlayed() == pPlayer2.getMinutesPlayed()){
                    if (pPlayer1.getMinutesPlayed() <= pPlayer2.getMinutesPlayed()){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    return -1;
                }
            }
        };
    }

    /*
     * method to rank players by their penalties scored
     */

    public static Comparator<CPlayerEntity> getCompareByPenaltiesScored(){
        return new Comparator<CPlayerEntity>() {
            public int compare(CPlayerEntity pPlayer1, CPlayerEntity pPlayer2) {
                if (pPlayer1.getPenaltiesScored() > pPlayer2.getPenaltiesScored()){
                    return 1;
                }
                else if (pPlayer1.getPenaltiesScored() == pPlayer2.getPenaltiesScored()){
                    if (pPlayer1.getMinutesPlayed() <= pPlayer2.getMinutesPlayed()){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    return -1;
                }
            }
        };
    }

    /*
     * method to rank players by their penalties missed
     */

    public static Comparator<CPlayerEntity> getCompareByPenaltiesMissed(){
        return new Comparator<CPlayerEntity>() {
            public int compare(CPlayerEntity pPlayer1, CPlayerEntity pPlayer2) {
                if (pPlayer1.getPenaltiesMissed() > pPlayer2.getPenaltiesMissed()){
                    return 1;
                }
                else if (pPlayer1.getPenaltiesMissed() == pPlayer2.getPenaltiesMissed()){
                    if (pPlayer1.getMinutesPlayed() <= pPlayer2.getMinutesPlayed()){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    return -1;
                }
            }
        };
    }

    /*
     * method to rank players by their penalties provoked
     */

    public static Comparator<CPlayerEntity> getCompareByPenaltiesProvoked(){
        return new Comparator<CPlayerEntity>() {
            public int compare(CPlayerEntity pPlayer1, CPlayerEntity pPlayer2) {
                if (pPlayer1.getPenaltiesProvoked() > pPlayer2.getPenaltiesProvoked()){
                    return 1;
                }
                else if (pPlayer1.getPenaltiesProvoked() == pPlayer2.getPenaltiesProvoked()){
                    if (pPlayer1.getMinutesPlayed() <= pPlayer2.getMinutesPlayed()){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    return -1;
                }
            }
        };
    }

    /*
     * method to rank players by their penalties conceded
     */

    public static Comparator<CPlayerEntity> getCompareByPenaltiesConceded(){
        return new Comparator<CPlayerEntity>() {
            public int compare(CPlayerEntity pPlayer1, CPlayerEntity pPlayer2) {
                if (pPlayer1.getPenaltiesConceded() > pPlayer2.getPenaltiesConceded()){
                    return 1;
                }
                else if (pPlayer1.getPenaltiesConceded() == pPlayer2.getPenaltiesConceded()){
                    if (pPlayer1.getMinutesPlayed() <= pPlayer2.getMinutesPlayed()){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                else{
                    return -1;
                }
            }
        };
    }

}
