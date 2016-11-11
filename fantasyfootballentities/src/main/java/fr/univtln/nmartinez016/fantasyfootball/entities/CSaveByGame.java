package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 17/09/2016.
 */


/*
 * class to keep track of every saves made by a goalkeeper
 * during a game. it is useful to get the amount of points made
 * by the player during a week, because a goalkeeper gains 1 point
 * every 3 saves.
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CSaveByGame.class)

public class CSaveByGame implements Serializable {
    @TableGenerator(
            name = "saveByGameTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "saveByGameTableGenerator")

    private int mId;
    private CPlayerEntity mPlayer;
    private int mQuantity;

    public CSaveByGame(){}

    public CSaveByGame(CSaveByGameBuilder pBuilder){
        mPlayer = pBuilder.mPlayer;
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

    public int getQuantity(){
        return mQuantity;
    }

    public void setQuantity(int pQuantity){
        mQuantity = pQuantity;
    }

    public static class CSaveByGameBuilder{
        private CPlayerEntity mPlayer;
        private int mQuantity;

        public CSaveByGameBuilder(){}

        public CSaveByGameBuilder player(CPlayerEntity pPlayer){
            mPlayer = pPlayer;
            return this;
        }

        public CSaveByGameBuilder quantity(int pQuantity){
            mQuantity = pQuantity;
            return this;
        }

        public CSaveByGame build(){
            return new CSaveByGame(this);
        }
    }
}
