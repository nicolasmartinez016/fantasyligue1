package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 15/08/2016.
 */

/*
 * class that represents the players that played during a game,
 * with the amount of minutes they played.
 * it is useful to get the points a player makes during a week,
 * because playing in a game gives +1 point and playing more than
 * 60 minutes gives +2 points.
 */


@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CPlayerByGame.class)

public class CPlayerByGame implements Serializable {
    @TableGenerator(
            name = "playerByGameTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "playerByGameTableGenerator")
    private int mId;
    @ManyToOne(cascade = CascadeType.MERGE)
    private CPlayerEntity mPlayer;
    private CGameEntity mGame;
    private int mStartMinute;
    private int mEndMinute;

    public CPlayerByGame(){}

    public CPlayerByGame(CPlayerByGameBuilder pBuilder){
        mPlayer = pBuilder.mPlayer;
        mGame = pBuilder.mGame;
        mStartMinute = pBuilder.mStartMinute;
        mEndMinute = pBuilder.mEndMinute;

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

    @JsonIgnore
    public int getMinutesPlayed(){
        return mEndMinute - mStartMinute;
    }

    public int getStartMinute(){
        return mStartMinute;
    }

    public void setStartMinute(int pStartMinute){
        mStartMinute = pStartMinute;
    }

    public int getEndMinute(){
        return mEndMinute;
    }

    public void setEndMinute(int pEndMinute){
        mEndMinute = pEndMinute;
    }

    public static class CPlayerByGameBuilder{
        private CPlayerEntity mPlayer;
        private CGameEntity mGame;
        private int mStartMinute;
        private int mEndMinute;

        public CPlayerByGameBuilder(){}

        public CPlayerByGameBuilder player(CPlayerEntity pPlayer){
            mPlayer = pPlayer;
            return this;
        }

        public CPlayerByGameBuilder game(CGameEntity pGame){
            mGame = pGame;
            return this;
        }


        public CPlayerByGameBuilder startMinute(int pStartMinute){
            mStartMinute = pStartMinute;
            return this;
        }

        public CPlayerByGameBuilder endMinute(int pEndMinute){
            mEndMinute = pEndMinute;
            return this;
        }

        public CPlayerByGame build(){
            return new CPlayerByGame(this);
        }

    }

}
