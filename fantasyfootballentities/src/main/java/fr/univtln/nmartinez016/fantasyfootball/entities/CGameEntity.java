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

/*
 * class Game that contains all the infos about a game played :
 * week, home team, away team, score, scorers, assisters, yellow cards, red cards, penalties, ..
 * also contains a list of the points that every player playing in the game got during this game.
 * those informations are what matter to figure out how many points your players bring
 * to you after each week.
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CGameEntity.class)

public class CGameEntity implements Serializable {
    @TableGenerator(
            name = "gameTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gameTableGenerator")
    private int mId;
    private int mWeek;
    @ManyToOne
    private CTeamEntity mHomeTeam;
    @ManyToOne
    private CTeamEntity mAwayTeam;
    private int mHomeScore;
    private int mAwayScore;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(schema = "fantasyfootball")
    private List<CGoalsByGame> mScorers;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(schema = "fantasyfootball")
    private List<CPlayerByGame> mPlayers;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(schema = "fantasyfootball")
    private List<CAssistByGame> mAssisters;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(schema = "fantasyfootball")
    private List<CYellowCardByGame> mYellowCards;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(schema = "fantasyfootball")
    private List<CRedCardByGame> mRedCards;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(schema = "fantasyfootball")
    private List<CPenaltyConcededByGame> mPenaltiesConceded;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(schema = "fantasyfootball")
    private List<CPenaltyMissedByGame> mPenaltiesMissed;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(schema = "fantasyfootball")
    private List<CPenaltyScoredByGame> mPenaltiesScored;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(schema = "fantasyfootball")
    private List<CPenaltyProvokedByGame> mPenaltiesProvoked;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(schema = "fantasyfootball")
    private List<CPenaltySavedByGame> mPenaltiesSaved;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(schema = "fantasyfootball")
    private List<CPointsByWeek> mPointsByWeek;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(schema = "fantasyfootball")
    private List<CSaveByGame> mSaves;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(schema = "fantasyfootball")
    private List<COwnGoalByGame> mOwnGoals;

    public CGameEntity(){}

    public CGameEntity(CGameBuilder pBuilder){
        mWeek = pBuilder.mWeek;
        mHomeTeam = pBuilder.mHomeTeam;
        mAwayTeam = pBuilder.mAwayTeam;
        mHomeScore = pBuilder.mHomeScore;
        mAwayScore = pBuilder.mAwayScore;
        mScorers = pBuilder.mScorers;
        mAssisters = pBuilder.mAssisters;
        mYellowCards = pBuilder.mYellowCards;
        mRedCards = pBuilder.mRedCards;
        mPlayers = pBuilder.mPlayers;
        mSaves = pBuilder.mSaves;
        mPenaltiesConceded = pBuilder.mPenaltiesConceded;
        mPenaltiesSaved = pBuilder.mPenaltiesSaved;
        mPenaltiesProvoked = pBuilder.mPenaltiesProvoked;
        mPenaltiesMissed = pBuilder.mPenaltiesMissed;
        mOwnGoals = pBuilder.mOwnGoals;

        for (CPlayerByGame lPlayer : mPlayers){
            lPlayer.getPlayer().addGame(this);
        }

        mHomeTeam.playGame();
        mAwayTeam.playGame();

        if (mHomeScore > mAwayScore){
            mHomeTeam.winGame();
            mAwayTeam.loseGame();
        }

        else if (mHomeScore == mAwayScore){
            mHomeTeam.drawGame();
            mAwayTeam.drawGame();
        }

        else if (mHomeScore < mAwayScore){
            mAwayTeam.winGame();
            mHomeTeam.loseGame();
        }

        for (int i = 0; i < mHomeScore; i++){
            mHomeTeam.scoreGoal();
            mAwayTeam.conceideGoal();
        }

        for (int i = 0; i < mAwayScore; i++){
            mHomeTeam.conceideGoal();
            mAwayTeam.scoreGoal();
        }
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

    public CTeamEntity getHomeTeam(){
        return mHomeTeam;
    }

    public void setHomeTeam(CTeamEntity pHomeTeam){
        mHomeTeam = pHomeTeam;
    }

    public CTeamEntity getAwayTeam(){
        return mAwayTeam;
    }

    public void setAwayTeam(CTeamEntity pAwayTeam){
        mAwayTeam = pAwayTeam;
    }

    public int getHomeScore(){
        return mHomeScore;
    }

    public void setHomeScore(int pHomeScore){
        mHomeScore = pHomeScore;
    }

    public int getAwayScore(){
        return mAwayScore;
    }

    public void setAwayScore(int pAwayScore){
        mAwayScore = pAwayScore;
    }

    public List<CGoalsByGame> getScorers(){
        return mScorers;
    }

    public void setScorers(List<CGoalsByGame> pScorers){
        mScorers = pScorers;
    }

    public List<CPlayerByGame> getPlayers(){
        return mPlayers;
    }

    public void setPlayers(List<CPlayerByGame> pPlayers){
        mPlayers = pPlayers;
    }

    public List<CYellowCardByGame> getYellowCards(){
        return mYellowCards;
    }

    public void setYellowCards(List<CYellowCardByGame> pYellowCards){
        mYellowCards = pYellowCards;
    }

    public List<CAssistByGame> getAssisters(){
        return mAssisters;
    }

    public void setAssisters(List<CAssistByGame> pAssisters){
        mAssisters = pAssisters;
    }

    public List<CRedCardByGame> getRedCards(){
        return mRedCards;
    }

    public void setRedCards(List<CRedCardByGame> pRedCards){
        mRedCards = pRedCards;
    }

    public List<COwnGoalByGame> getOwnGoals(){
        return mOwnGoals;
    }

    public void setOwnGoals(List<COwnGoalByGame> pOwnGoals){
        mOwnGoals = pOwnGoals;
    }

    public List<CPointsByWeek> getPointsByWeek(){
        return mPointsByWeek;
    }

    public void setPointsByWeek(List<CPointsByWeek> pPointsByWeek){
        mPointsByWeek = pPointsByWeek;
    }

    public List<CSaveByGame> getSaves(){
        return mSaves;
    }

    public void setSaves(List<CSaveByGame> pSaves){
        mSaves = pSaves;
    }

    public List<CPenaltySavedByGame> getPenaltiesSaved(){
        return mPenaltiesSaved;
    }

    public void setPenaltiesSaved(List<CPenaltySavedByGame> pPenaltiesSaved){
        mPenaltiesSaved = pPenaltiesSaved;
    }

    public List<CPenaltyConcededByGame> getPenaltiesConceded(){
        return mPenaltiesConceded;
    }

    public void setPenaltiesConceded(List<CPenaltyConcededByGame> pPenaltiesConceded){
        mPenaltiesConceded = pPenaltiesConceded;
    }

    public List<CPenaltyMissedByGame> getPenaltiesMissed(){
        return mPenaltiesMissed;
    }

    public void setPenaltiesMissed(List<CPenaltyMissedByGame> pPenaltiesMissed){
        mPenaltiesMissed = pPenaltiesMissed;
    }

    public List<CPenaltyProvokedByGame> getPenaltiesProvoked(){
        return mPenaltiesProvoked;
    }

    public void setPenaltiesProvoked(List<CPenaltyProvokedByGame> pPenaltiesProvoked){
        mPenaltiesProvoked = pPenaltiesProvoked;
    }

    public List<CPenaltyScoredByGame> getPenaltiesScored(){
        return mPenaltiesScored;
    }

    public void setPenaltiesScored(List<CPenaltyScoredByGame> pPenaltiesScored){
        mPenaltiesScored = pPenaltiesScored;
    }

    public void addPointsByWeek(CPointsByWeek pPointsByWeek){
        if (mPointsByWeek == null){
            mPointsByWeek = new ArrayList<CPointsByWeek>();
        }
        mPointsByWeek.add(pPointsByWeek);
    }

    @JsonIgnore
    public CTeamEntity getWinningTeam(){
        if (mHomeScore > mAwayScore){
            return mHomeTeam;
        }
        else if (mAwayScore > mHomeScore){
            return mAwayTeam;
        }
        else{
            return null;
        }
    }



    public void attributePoints(){
        final int ASSIST_POINTS = 2;
        final int PLAY_GAME_POINTS = 1;
        final int PLAY_MORE_THAN_60_MIN_POINTS = 2;
        final int GOAL_SCORED_BY_GK_OR_DEF_POINTS = 6;
        final int GOAL_SCORED_BY_MIDFIELDER_POINTS = 5;
        final int GOAL_SCORED_BY_FORWARD_POINTS = 4;
        final int CLEANSHEET_GK_POINTS = 4;
        final int CLEANSHEET_DEFENDER_POINTS = 4;
        final int CLEANSHEET_MIDFIELDER_POINTS = 1;
        final int PROVOKE_PENALTY_POINTS = 2;
        final int CONCEDE_PENALTY_POINTS = -1;
        final int MISS_PENALTY_POINTS = -2;
        final int SAVE_PENALTY_POINTS = 5;
        final int EVERY_TWO_GOALS_CONCEDED_BY_GK_OR_DEF_POINTS = -1;
        final int YELLOW_CARD_POINTS = -1;
        final int RED_CARD_POINTS = -3;
        final int EVERY_THREE_SAVES_BY_GK_POINTS = 1;
        final int OWN_GOAL_POINTS = -2;

        List<CPlayerEntity> lPlayers = new ArrayList<CPlayerEntity>();
        for (CPlayerByGame lPlayer : mPlayers){
            lPlayers.add(lPlayer.getPlayer());
        }


        for (CPlayerEntity lPlayer : lPlayers){
            int lPoints = 0;
            /*
             * add points of goal scorers in that game
             * each goal scored by a gk or defender gives 6 points
             * each goal scored by a midfielder gives 5 points
             * each goal scored by a forward gives 4 points
             */
            if (mScorers != null){
                for (int i = 0; i < mScorers.size(); i++){
                    if (mScorers.get(i).getPlayer().equals(lPlayer)){
                        if (mScorers.get(i).getPlayer().isDefender() || mScorers.get(i).getPlayer().isGk()){
                            lPoints = lPoints + mScorers.get(i).getQuantity() * GOAL_SCORED_BY_GK_OR_DEF_POINTS;
                        }
                        else if (mScorers.get(i).getPlayer().isMidfielder()){
                            lPoints = lPoints + mScorers.get(i).getQuantity() * GOAL_SCORED_BY_MIDFIELDER_POINTS;
                        }
                        else if (mScorers.get(i).getPlayer().isForward()){
                            lPoints = lPoints + mScorers.get(i).getQuantity() * GOAL_SCORED_BY_FORWARD_POINTS;
                        }
                    }
                }
            }

            /*
             * add points of goal assisters in that game
             * each goal assited gives 2 points to the player
             */

            if (mAssisters != null){
                for (int i = 0; i < mAssisters.size(); i++){
                    if (mAssisters.get(i).getPlayer().equals(lPlayer)){
                        lPoints = lPoints + mAssisters.get(i).getQuantity() * ASSIST_POINTS;
                    }
                }
            }

            /*
             * add points of players according to the minutes they played in that game
             * every player playing at least 1 minute get 1 point, and players
             * who stay in the pitch for for than 59min get 2 extra points
             */

            if (mPlayers != null){
                for (int i = 0; i < mPlayers.size(); i++){
                    if (mPlayers.get(i).getPlayer().equals(lPlayer)){
                        lPoints += PLAY_GAME_POINTS;
                        if (mPlayers.get(i).getMinutesPlayed() > 59){
                            lPoints += PLAY_MORE_THAN_60_MIN_POINTS;
                        }
                    }
                }
            }

            /*
             * decreases points of the players that conceded penalties in that game
             * each penalty conceded takes 1 points back from the player
             */

            if (mPenaltiesConceded != null){
                for (int i = 0; i < mPenaltiesConceded.size(); i++){
                    if (mPenaltiesConceded.get(i).getFouler().equals(lPlayer)){
                        lPoints += mPenaltiesConceded.get(i).getQuantity() * CONCEDE_PENALTY_POINTS;
                    }
                }
            }

            /*
             * decreases points of the players that missed penalties in that game
             * each penalty missed takes 2 points back from the player
             */

            if (mPenaltiesMissed != null){
                for (int i = 0; i < mPenaltiesMissed.size(); i++){
                    if (mPenaltiesMissed.get(i).getShooter().equals(lPlayer)){
                        lPoints += mPenaltiesMissed.get(i).getQuantity() * MISS_PENALTY_POINTS;
                    }
                }
            }

            /*
             * adds points to the players that provoked penalties in that game
             * each penalty provoked gives 2 points to the player
             */

            if (mPenaltiesProvoked != null){
                for (int i = 0; i < mPenaltiesProvoked.size(); i++){
                    if (mPenaltiesProvoked.get(i).getProvoker().equals(lPlayer)){
                        lPoints += mPenaltiesProvoked.get(i).getQuantity() * PROVOKE_PENALTY_POINTS;
                    }
                }
            }

            /*
             * adds points to the players that saved penalties in that game
             * each penalty saved gives 5 points to the player
             */

            if (mPenaltiesSaved != null){
                for (int i = 0; i < mPenaltiesSaved.size(); i++){
                    if (mPenaltiesSaved.get(i).getPlayer().equals(lPlayer)){
                        lPoints += mPenaltiesSaved.get(i).getQuantity() * SAVE_PENALTY_POINTS;
                    }
                }
            }

            /*
             * adds points to the player if his team managed to get a clean sheet
             * a goalkeeper or defender gets 4 points for a cleansheet, but
             * a midfielder gets 1 point for a cleansheet and a forwards doesnt
             * get any.
             */

            if (lPlayer.getTeam() == mHomeTeam){
                if (mAwayScore == 0){
                    if (lPlayer.isGk()){
                        lPoints += CLEANSHEET_GK_POINTS;
                    }
                    else if (lPlayer.isDefender()){
                        lPoints += CLEANSHEET_DEFENDER_POINTS;
                    }
                    else if (lPlayer.isMidfielder()){
                        lPoints += CLEANSHEET_MIDFIELDER_POINTS;
                    }
                }
            }
            else if (lPlayer.getTeam() == mAwayTeam){
                if (mHomeScore == 0){
                    if (lPlayer.isGk()){
                        lPoints += CLEANSHEET_GK_POINTS;
                    }
                    else if (lPlayer.isDefender()){
                        lPoints += CLEANSHEET_DEFENDER_POINTS;
                    }
                    else if (lPlayer.isMidfielder()){
                        lPoints += CLEANSHEET_MIDFIELDER_POINTS;
                    }
                }
            }

            /*
             * decreases points of the players who get yellow carded during the game
             * each yellow card takes 1 point back from the player
             */

            if (mYellowCards != null){
                for (CYellowCardByGame lYellowCardByGame : mYellowCards){
                    if (lYellowCardByGame.getPlayer().equals(lPlayer)){
                        lPoints += lYellowCardByGame.getQuantity() * YELLOW_CARD_POINTS;
                    }
                }
            }

            /*
             * decreases points of the players who got red carded during the game
             * a red card takes 4 points back from the player
             */

            if (mRedCards != null){
                for (CRedCardByGame lRedCardByGame : mRedCards){
                    if (lRedCardByGame.getPlayer().equals(lPlayer)){
                        lPoints += lRedCardByGame.getQuantity() * RED_CARD_POINTS;
                    }
                }
            }

            /*
             * add points to the players who made at least 3 saves during the game
             * every 3 saves give 1 point to the player
             */

            if (mSaves != null){
                for (CSaveByGame lSaveByGame : mSaves){
                    if (lSaveByGame.getPlayer().equals(lPlayer)){
                        lPoints += lSaveByGame.getQuantity() / 3 * EVERY_THREE_SAVES_BY_GK_POINTS;
                    }
                }
            }

            /*
             * decreases points of the player when conceded 2 or + goals during the game
             * every 2 goals conceded take 1 point away from the goalkeeper and defenders
             * that played
             */

            if (lPlayer.isDefender() || lPlayer.isGk()){
                if (lPlayer.getTeam().getId() == mHomeTeam.getId()){
                    if (mAwayScore >= 2){
                        lPoints += mAwayScore / 2 * EVERY_TWO_GOALS_CONCEDED_BY_GK_OR_DEF_POINTS;
                    }
                }

                else if (lPlayer.getTeam().getId() == mAwayTeam.getId()){
                    if (mHomeScore >= 2){
                        lPoints += mHomeScore / 2 * EVERY_TWO_GOALS_CONCEDED_BY_GK_OR_DEF_POINTS;
                    }
                }
            }

            /*
             * decreases points of the players who scored own goals
             * each own goals scored take 2 points away from the player
             */

            if (mOwnGoals != null){
                for (COwnGoalByGame lOwnGoalByGame : mOwnGoals){
                    if (lOwnGoalByGame.getPlayer().equals(lPlayer)){
                        lPoints += lOwnGoalByGame.getQuantity() * OWN_GOAL_POINTS;
                    }
                }
            }

            CPointsByWeek lPointsByWeek = new CPointsByWeek.CPointsByWeekBuilder().week(getWeek()).points(lPoints).player(lPlayer).build();
            addPointsByWeek(lPointsByWeek);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CGameEntity that = (CGameEntity) o;

        return mId == that.mId;

    }

    @Override
    public int hashCode() {
        return mId;
    }

    @Override
    public String toString() {
        return "CGameEntity{" +
                "mId=" + mId +
                " " + mHomeTeam.getName() + " " + mHomeScore + " - " + mAwayScore + " " + mAwayTeam.getName() +
                '}';
    }

    public static class CGameBuilder{
        private int mWeek;
        private CTeamEntity mHomeTeam;
        private CTeamEntity mAwayTeam;
        private int mHomeScore;
        private int mAwayScore;
        private List<CGoalsByGame> mScorers;
        private List<CPlayerByGame> mPlayers;
        private List<CAssistByGame> mAssisters;
        private List<CYellowCardByGame> mYellowCards;
        private List<CRedCardByGame> mRedCards;
        private List<CSaveByGame> mSaves;
        private List<CPenaltyConcededByGame> mPenaltiesConceded;
        private List<CPenaltyMissedByGame> mPenaltiesMissed;
        private List<CPenaltyScoredByGame> mPenaltiesScored;
        private List<CPenaltyProvokedByGame> mPenaltiesProvoked;
        private List<CPenaltySavedByGame> mPenaltiesSaved;
        private List<COwnGoalByGame> mOwnGoals;


        public CGameBuilder(){}

        public CGameBuilder week(int pWeek){
            mWeek = pWeek;
            return this;
        }

        public CGameBuilder homeTeam(CTeamEntity pHomeTeam){
            mHomeTeam = pHomeTeam;
            return this;
        }

        public CGameBuilder awayTeam(CTeamEntity pAwayTeam){
            mAwayTeam = pAwayTeam;
            return this;
        }

        public CGameBuilder homeScore(int pHomeScore){
            mHomeScore = pHomeScore;
            return this;
        }

        public CGameBuilder awayScore(int pAwayScore){
            mAwayScore = pAwayScore;
            return this;
        }

        public CGameBuilder players(List<CPlayerByGame> pPlayers){
            mPlayers = pPlayers;
            return this;
        }

        public CGameBuilder scorers(List<CGoalsByGame> pScorers){
            mScorers = pScorers;
            return this;
        }

        public CGameBuilder assisters(List<CAssistByGame> pAssisters){
            mAssisters = pAssisters;
            return this;
        }

        public CGameBuilder yellowCards(List<CYellowCardByGame> pYellowCards){
            mYellowCards = pYellowCards;
            return this;
        }

        public CGameBuilder redCards(List<CRedCardByGame> pRedCards){
            mRedCards = pRedCards;
            return this;
        }

        public CGameBuilder saves(List<CSaveByGame> pSaves){
            mSaves = pSaves;
            return this;
        }

        public CGameBuilder penaltiesProvoked(List<CPenaltyProvokedByGame> pPenaltiesProvoked){
            mPenaltiesProvoked = pPenaltiesProvoked;
            return this;
        }

        public CGameBuilder penaltiesConceded(List<CPenaltyConcededByGame> pPenaltiesConceded){
            mPenaltiesConceded = pPenaltiesConceded;
            return this;
        }

        public CGameBuilder penaltiesMissed(List<CPenaltyMissedByGame> pPenaltiesMissed){
            mPenaltiesMissed = pPenaltiesMissed;
            return this;
        }

        public CGameBuilder penaltiesScored(List<CPenaltyScoredByGame> pPenaltiesScored){
            mPenaltiesScored = pPenaltiesScored;
            return this;
        }

        public CGameBuilder penaltiesSaved(List<CPenaltySavedByGame> pPenaltiesSaved){
            mPenaltiesSaved = pPenaltiesSaved;
            return this;
        }

        public CGameBuilder ownGoals(List<COwnGoalByGame> pOwnGoals){
            mOwnGoals = pOwnGoals;
            return this;
        }

        public CGameEntity build(){
            return new CGameEntity(this);
        }

    }
}
