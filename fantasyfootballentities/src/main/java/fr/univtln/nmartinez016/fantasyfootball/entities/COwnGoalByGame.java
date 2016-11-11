package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 18/09/2016.
 */

/*
 * class to keep track of every own goals a player scored.
 * it is useful to get the the points a player gets after a week,
 * an own goal gives a malus of x points
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = COwnGoalByGame.class)

public class COwnGoalByGame implements Serializable {

    @TableGenerator(
            name = "ownGoalsByGameTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ownGoalsByGameTableGenerator")
    private int mId;
    @ManyToOne(cascade = CascadeType.MERGE)
    private CPlayerEntity mPlayer;
    private int mMinute;
    private int mQuantity;

    public COwnGoalByGame(){}

    public COwnGoalByGame(COwnGoalByGameBuilder pBuilder){
        mPlayer = pBuilder.mPlayer;
        mMinute = pBuilder.mMinute;
        mQuantity = pBuilder.mQuantity;
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

    public int getMinute(){
        return mMinute;
    }

    public void setMinute(int pMinute){
        mMinute = pMinute;
    }

    public int getQuantity(){
        return mQuantity;
    }

    public void setQuantity(int pQuantity){
        mQuantity = pQuantity;
    }

    public static class COwnGoalByGameBuilder{
        private int mQuantity;
        private int mMinute;
        private CPlayerEntity mPlayer;

        public COwnGoalByGameBuilder(){}

        public COwnGoalByGameBuilder player(CPlayerEntity pPlayer){
            mPlayer = pPlayer;
            return this;
        }

        public COwnGoalByGameBuilder minute(int pMinute){
            mMinute = pMinute;
            return this;
        }

        public COwnGoalByGameBuilder quantity(int pQuantity){
            mQuantity = pQuantity;
            return this;
        }

        public COwnGoalByGame build(){
            return new COwnGoalByGame(this);
        }
    }
}
