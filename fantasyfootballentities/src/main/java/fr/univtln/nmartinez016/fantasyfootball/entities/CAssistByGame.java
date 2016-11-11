package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 22/08/2016.
 */

/*
 * class that represents the assists made by a given player during a game.
 * it is useful to get the points a player makes during a week, because
 * each assist gives 3 points to the player.
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CAssistByGame.class)
public class CAssistByGame implements Serializable {

    @TableGenerator(
            name = "assistsByGameTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "assistsByGameTableGenerator")
    private int mId;
    @ManyToOne(cascade = CascadeType.MERGE)
    private CPlayerEntity mPlayer;
    private int mQuantity;

    public CAssistByGame(){}

    public CAssistByGame(CAssistByGameBuilder pBuilder){
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

    public static class CAssistByGameBuilder{
        private CPlayerEntity mPlayer;
        private int mQuantity;

        public CAssistByGameBuilder(){}

        public CAssistByGameBuilder player(CPlayerEntity pPlayer){
            mPlayer = pPlayer;
            return this;
        }

        public CAssistByGameBuilder quantity(int pQuantity){
            mQuantity = pQuantity;
            return this;
        }

        public CAssistByGame build(){
            return new CAssistByGame(this);
        }
    }

}
