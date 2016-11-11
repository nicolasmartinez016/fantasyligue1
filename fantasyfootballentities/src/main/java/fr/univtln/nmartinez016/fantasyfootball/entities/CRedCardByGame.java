package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 22/08/2016.
 */

/*
 * class that represents the red card a player gets during a game.
 * it is useful to get the number of points the given player will get for the week of the game.
 * a red cards gives a minus of 5 points for the player on that week.
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CRedCardByGame.class)

public class CRedCardByGame implements Serializable {

    @TableGenerator(
            name = "redCardByGameTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "redCardByGameTableGenerator")
    private int mId;
    @ManyToOne(cascade = CascadeType.MERGE)
    private CPlayerEntity mPlayer;
    private int mQuantity;

    public CRedCardByGame(){}

    public CRedCardByGame(CRedCardByGameBuilder pBuilder){
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

    public static class CRedCardByGameBuilder{
        private CPlayerEntity mPlayer;
        private int mQuantity;

        public CRedCardByGameBuilder(){}

        public CRedCardByGameBuilder player(CPlayerEntity pPlayer){
            mPlayer = pPlayer;
            return this;
        }

        public CRedCardByGameBuilder quantity(int pQuantity){
            mQuantity = pQuantity;
            return this;
        }

        public CRedCardByGame build(){
            return new CRedCardByGame(this);
        }
    }
}
