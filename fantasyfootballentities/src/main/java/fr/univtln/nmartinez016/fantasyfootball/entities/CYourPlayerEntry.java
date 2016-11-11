package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 28/07/2016.
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CYourPlayerEntry.class)

public class CYourPlayerEntry implements Serializable {
    @TableGenerator(
            name = "yourPlayerEntryTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "yourPlayerEntryTableGenerator")
    private int mId;
    @ManyToOne
    private CPlayerEntity mPlayer;
    @ManyToOne
    private CPositionEntity mPosition;

    public CYourPlayerEntry(){}

    public CYourPlayerEntry(CYourPlayerEntryBuilder pBuilder){
        mPlayer = pBuilder.mPlayer;
        mPosition = pBuilder.mPosition;
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

    public static class CYourPlayerEntryBuilder{
        private CPlayerEntity mPlayer;
        private CPositionEntity mPosition;

        public CYourPlayerEntryBuilder(){}

        public CYourPlayerEntryBuilder player(CPlayerEntity pPlayer){
            mPlayer = pPlayer;
            return this;
        }

        public CYourPlayerEntryBuilder position(CPositionEntity pPosition){
            mPosition = pPosition;
            return this;
        }

        public CYourPlayerEntry build(){
            return new CYourPlayerEntry(this);
        }

    }
}
