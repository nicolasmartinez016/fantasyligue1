package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 10/09/2016.
 */

/*
 * class to keep track of every penalty missed by a player during a game.
 * it is useful to get the points a player gets after a week, because missing
 * a penalty gives a malus of x points
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CPenaltyMissedByGame.class)

public class CPenaltyMissedByGame implements Serializable {
    @TableGenerator(
            name = "penaltyMissedByGameTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "penaltyMissedByGameTableGenerator")

    private int mId;
    private CPlayerEntity mShooter;
    private int mQuantity;

    public CPenaltyMissedByGame(){}

    public CPenaltyMissedByGame(CPenaltyMissedByGameBuilder pBuilder){
        mShooter = pBuilder.mShooter;
        mQuantity = pBuilder.mQuantity;
    }

    public int getId(){
        return mId;
    }

    public void setId(int pId){
        mId = pId;
    }

    public CPlayerEntity getShooter(){
        return mShooter;
    }

    public void setShooter(CPlayerEntity pShooter){
        mShooter = pShooter;
    }

    public int getQuantity(){
        return mQuantity;
    }

    public void setQuantity(int pQuantity){
        mQuantity = pQuantity;
    }

    public static class CPenaltyMissedByGameBuilder{
        private CPlayerEntity mShooter;
        private int mQuantity;

        public CPenaltyMissedByGameBuilder(){}

        public CPenaltyMissedByGameBuilder shooter(CPlayerEntity pShooter){
            mShooter = pShooter;
            return this;
        }

        public CPenaltyMissedByGameBuilder quantity(int pQuantity){
            mQuantity = pQuantity;
            return this;
        }

        public CPenaltyMissedByGame build(){
            return new CPenaltyMissedByGame(this);
        }
    }
}