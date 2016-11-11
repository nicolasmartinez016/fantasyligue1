package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 10/09/2016.
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CPenaltyScoredByGame.class)


/*
 * class to keep track of every penalty scored by a player during a game.
 * it is useful just to have the stat to know how many goals a player scored from
 * a penalty during the season
 */

public class CPenaltyScoredByGame implements Serializable {
    @TableGenerator(
            name = "penaltyScoredByGameTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "penaltyScoredByGameTableGenerator")

    private int mId;
    private CPlayerEntity mShooter;
    private int mQuantity;

    public CPenaltyScoredByGame(){}

    public CPenaltyScoredByGame(CPenaltyScoredByGameBuilder pBuilder){
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

    public static class CPenaltyScoredByGameBuilder{
        private CPlayerEntity mShooter;
        private int mQuantity;

        public CPenaltyScoredByGameBuilder(){}

        public CPenaltyScoredByGameBuilder shooter(CPlayerEntity pShooter){
            mShooter = pShooter;
            return this;
        }

        public CPenaltyScoredByGameBuilder quantity(int pQuantity){
            mQuantity = pQuantity;
            return this;
        }

        public CPenaltyScoredByGame build(){
            return new CPenaltyScoredByGame(this);
        }
    }
}
