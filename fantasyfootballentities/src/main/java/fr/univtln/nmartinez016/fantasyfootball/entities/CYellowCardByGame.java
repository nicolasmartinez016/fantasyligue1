package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 22/08/2016.
 */

/*
 * class representing the yellow cards in a precise game.
 * we have the player who got the yellow card, and the quantity of yellow cards he received.
 * this is useful to get the amount of points a player gives each week after a game
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CYellowCardByGame.class)

public class CYellowCardByGame implements Serializable {


    @TableGenerator(
            name = "yellowCardByGameTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "yellowCardByGameTableGenerator")
    private int mId;
    @ManyToOne(cascade = CascadeType.MERGE)
    private CPlayerEntity mPlayer;
    private int mQuantity;

    public CYellowCardByGame(){}

    public CYellowCardByGame(CYellowCardByGameBuilder pBuilder){
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

    public static class CYellowCardByGameBuilder{
        private CPlayerEntity mPlayer;
        private int mQuantity;

        public CYellowCardByGameBuilder(){}

        public CYellowCardByGameBuilder player(CPlayerEntity pPlayer){
            mPlayer = pPlayer;
            return this;
        }

        public CYellowCardByGameBuilder quantity(int pQuantity){
            mQuantity = pQuantity;
            return this;
        }

        public CYellowCardByGame build(){
            return new CYellowCardByGame(this);
        }
    }

}
