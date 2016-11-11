package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 15/08/2016.
 */

/*
 * class that represents the goals scored by a given player during a game.
 * it is useful to get the points a player makes during a week, because
 * each goal gives 4/5/6 points to the player whether he is a forward/midfielder/defender_gk.
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CGoalsByGame.class)

public class CGoalsByGame implements Serializable {

    @TableGenerator(
            name = "goalsByGameTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "goalsByGameTableGenerator")
    private int mId;
    @ManyToOne(cascade = CascadeType.MERGE)
    private CPlayerEntity mPlayer;
    private CGameEntity mGame;
    private int mQuantity;
    private int mMinute;

    public CGoalsByGame(){}

    public CGoalsByGame(CGoalsByGameBuilder pBuilder){
        mPlayer = pBuilder.mPlayer;
        mGame = pBuilder.mGame;
        mQuantity = pBuilder.mQuantity;
        mMinute = pBuilder.mMinute;
    }

    public int getId(){
        return mId;
    }

    public void setId(int pId){
        mId = pId;
    }

    public CPlayerEntity getPlayer(){
        return mPlayer;
    }

    public void setPlayer(CPlayerEntity pPlayer){
        mPlayer = pPlayer;
    }

    public CGameEntity getGame(){
        return mGame;
    }

    public void setGame(CGameEntity pGame){
        mGame = pGame;
    }

    public int getQuantity(){
        return mQuantity;
    }

    public void setQuantity(int pQuantity){
        mQuantity = pQuantity;
    }

    public int getMinute(){
        return mMinute;
    }

    public void setMinute(int pMinute){
        mMinute = pMinute;
    }

    public static class CGoalsByGameBuilder{
        private CPlayerEntity mPlayer;
        private CGameEntity mGame;
        private int mQuantity;
        private int mMinute;

        public CGoalsByGameBuilder(){}

        public CGoalsByGameBuilder player(CPlayerEntity pPlayer){
            mPlayer = pPlayer;
            return this;
        }

        public CGoalsByGameBuilder game(CGameEntity pGame){
            mGame = pGame;
            return this;
        }

        public CGoalsByGameBuilder quantity(int pQuantity){
            mQuantity = pQuantity;
            return this;
        }

        public CGoalsByGameBuilder minute(int pMinute){
            mMinute = pMinute;
            return this;
        }

        public CGoalsByGame build(){
            return new CGoalsByGame(this);
        }
    }
}
