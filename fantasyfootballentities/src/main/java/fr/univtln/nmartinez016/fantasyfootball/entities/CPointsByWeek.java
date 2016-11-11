package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 12/09/2016.
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = CPointsByWeek.class)
//@JsonIdentityInfo(generator=ObjectIdGenerators.UUIDGenerator.class, property="@id")

public class CPointsByWeek implements Serializable {
    @TableGenerator(
            name = "pointsByGameTableGenerator",
            allocationSize = 1,
            initialValue = 1)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pointsByGameTableGenerator")
    private int mId;
    private int mWeek;
    private int mPoints;
    @ManyToOne(cascade = CascadeType.MERGE)
    private CPlayerEntity mPlayer;

    public CPointsByWeek(){}

    public CPointsByWeek(CPointsByWeekBuilder pBuilder){
        mWeek = pBuilder.mWeek;
        mPoints = pBuilder.mPoints;
        mPlayer = pBuilder.mPlayer;
        if (mPlayer != null){
            mPlayer.addPointsByWeek(this);
        }
    }

    public int getId(){
        return mId;
    }

    public void setId(int pId){
        mId = pId;
    }

    public int getWeek(){
        return mWeek;
    }

    public void setWeek(int pWeek){
        mWeek = pWeek;
    }

    public int getPoints(){
        return mPoints;
    }

    public void setPoints(int pPoints){
        mPoints = pPoints;
    }

    public CPlayerEntity getPlayer(){
        return mPlayer;
    }

    public void setPlayer(CPlayerEntity pPlayer){
        mPlayer = pPlayer;
    }

    public void addPoints(int pPoints){
        mPoints = mPoints + pPoints;
    }

    @Override
    public String toString() {
        return "CPointsByWeek{" +
                "mPoints=" + mPoints +
                ", mWeek=" + mWeek +
                ", mId=" + mId +
                ", player : " + mPlayer.getLastName() + " " + mPlayer.getTeam().getName() +
                '}';
    }

    public static class CPointsByWeekBuilder{
        private int mWeek;
        private int mPoints;
        private CPlayerEntity mPlayer;

        public CPointsByWeekBuilder(){}

        public CPointsByWeekBuilder week(int pWeek){
            mWeek = pWeek;
            return this;
        }

        public CPointsByWeekBuilder points(int pPoints){
            mPoints = pPoints;
            return this;
        }

        public CPointsByWeekBuilder player(CPlayerEntity pPlayer){
            mPlayer = pPlayer;
            return this;
        }

        public CPointsByWeek build(){
            return new CPointsByWeek(this);
        }
    }
}
