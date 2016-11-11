package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 02/09/2016.
 */

/*
 * class representing a player from a team of the week, with the said player
 * and his position to place him on the pitch on the android game
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id", scope = CTotwPlayerEntity.class)

public class CTotwPlayerEntity implements Serializable {

    @TableGenerator(
            name = "totwPlayerTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "totwPlayerTableGenerator")

    private int mId;
    @ManyToOne
    private CPlayerEntity mPlayer;
    @ManyToOne
    private CPositionEntity mPosition;

    public CTotwPlayerEntity(){}

    public CTotwPlayerEntity(CTotwPlayerBuilder pBuilder){
        mPlayer = pBuilder.mPlayer;
        mPosition = pBuilder.mPosition;
        mPlayer.addTotwAppearance();
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

    public CPositionEntity getPosition(){
        return mPosition;
    }

    public void setPosition(CPositionEntity pPosition){
        mPosition = pPosition;
    }

    public static class CTotwPlayerBuilder{
        private CPlayerEntity mPlayer;
        private CPositionEntity mPosition;

        public CTotwPlayerBuilder(){}

        public CTotwPlayerBuilder player(CPlayerEntity pPlayer){
            mPlayer = pPlayer;
            return this;
        }

        public CTotwPlayerBuilder position(CPositionEntity pPosition){
            mPosition = pPosition;
            return this;
        }

        public CTotwPlayerEntity build(){
            return new CTotwPlayerEntity(this);
        }
    }
}
