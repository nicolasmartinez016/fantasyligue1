package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 10/09/2016.
 */

/*
 * class to keep track of every penalty provoked by a player during a game.
 * it is useful to get the points a player makes during a week, because provoking
 * a penalty gives x points
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CPenaltyProvokedByGame.class)

public class CPenaltyProvokedByGame implements Serializable {
    @TableGenerator(
            name = "penaltyProvokedByGameTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "penaltyProvokedByGameTableGenerator")

    private int mId;
    private CPlayerEntity mProvoker;
    private int mQuantity;

    public CPenaltyProvokedByGame(){}

    public CPenaltyProvokedByGame(CPenaltyProvokedByGameBuilder pBuilder){
        mProvoker = pBuilder.mProvoker;
        mQuantity = pBuilder.mQuantity;
    }

    public int getId(){
        return mId;
    }

    public void setId(int pId){
        mId = pId;
    }

    public CPlayerEntity getProvoker(){
        return mProvoker;
    }

    public void setProvoker(CPlayerEntity pProvoker){
        mProvoker = pProvoker;
    }

    public int getQuantity(){
        return mQuantity;
    }

    public void setQuantity(int pQuantity){
        mQuantity = pQuantity;
    }

    public static class CPenaltyProvokedByGameBuilder{
        private CPlayerEntity mProvoker;
        private int mQuantity;

        public CPenaltyProvokedByGameBuilder(){}

        public CPenaltyProvokedByGameBuilder provoker(CPlayerEntity pProvoker){
            mProvoker = pProvoker;
            return this;
        }

        public CPenaltyProvokedByGameBuilder quantity(int pQuantity){
            mQuantity = pQuantity;
            return this;
        }

        public CPenaltyProvokedByGame build(){
            return new CPenaltyProvokedByGame(this);
        }
    }
}
