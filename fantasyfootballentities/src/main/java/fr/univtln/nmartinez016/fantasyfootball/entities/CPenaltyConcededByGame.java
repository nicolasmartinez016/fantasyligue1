package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 10/09/2016.
 */

/*
 * class to keep track of every penalty conceded by a player during a game.
 * it is useful to get the points a player gets after a week, because conceding
 * a penalty gives a malus of x points
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CPenaltyConcededByGame.class)

public class CPenaltyConcededByGame implements Serializable {
    @TableGenerator(
            name = "penaltyConcededByGameTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "penaltyConcededByGameTableGenerator")

    private int mId;
    private CPlayerEntity mFouler;
    private int mQuantity;

    public CPenaltyConcededByGame(){}

    public CPenaltyConcededByGame(CPenaltyConcededByGameBuilder pBuilder){
        mFouler = pBuilder.mFouler;
        mQuantity = pBuilder.mQuantity;
    }

    public int getId(){
        return mId;
    }

    public void setId(int pId){
        mId = pId;
    }

    public CPlayerEntity getFouler(){
        return mFouler;
    }

    public void setFouler(CPlayerEntity pFouler){
        mFouler = pFouler;
    }

    public int getQuantity(){
        return mQuantity;
    }

    public void setQuantity(int pQuantity){
        mQuantity = pQuantity;
    }

    public static class CPenaltyConcededByGameBuilder{
        private CPlayerEntity mFouler;
        private int mQuantity;

        public CPenaltyConcededByGameBuilder(){}

        public CPenaltyConcededByGameBuilder fouler(CPlayerEntity pFouler){
            mFouler = pFouler;
            return this;
        }

        public CPenaltyConcededByGameBuilder quantity(int pQuantity){
            mQuantity = pQuantity;
            return this;
        }

        public CPenaltyConcededByGame build(){
            return new CPenaltyConcededByGame(this);
        }
    }
}
