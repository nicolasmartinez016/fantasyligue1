package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 23/09/2016.
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CPenaltySavedByGame.class)

public class CPenaltySavedByGame implements Serializable {

    @TableGenerator(
            name = "penaltySavedByGameTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "penaltySavedByGameTableGenerator")

    private int mId;
    @ManyToOne
    private CPlayerEntity mPlayer;
    private int mQuantity;

    public CPenaltySavedByGame(){}

    public CPenaltySavedByGame(CPenaltySavedByGameBuilder pBuilder){
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

    public static class CPenaltySavedByGameBuilder{
        private CPlayerEntity mPlayer;
        private int mQuantity;

        public CPenaltySavedByGameBuilder(){}

        public CPenaltySavedByGameBuilder player(CPlayerEntity pPlayer){
            mPlayer = pPlayer;
            return this;
        }

        public CPenaltySavedByGameBuilder quantity(int pQuantity){
            mQuantity = pQuantity;
            return this;
        }

        public CPenaltySavedByGame build(){
            return new CPenaltySavedByGame(this);
        }
    }
}
