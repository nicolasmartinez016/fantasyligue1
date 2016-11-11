package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 02/09/2016.
 */

/*
 * class resentating the 11 players that made the team of the week each week
 * I take them from internet news football related site.
 */

@Entity
@Table(schema = "fantasyfootball")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@week", scope = CTotwEntity.class)

public class CTotwEntity implements Serializable {

    @Id
    private int mWeek;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(schema = "fantasyfootball")
    private List<CTotwPlayerEntity> mTotwPlayers;

    public CTotwEntity(){}

    public CTotwEntity(CTotwBuilder pBuilder){
        mWeek = pBuilder.mWeek;
        mTotwPlayers = pBuilder.mTotwPlayers;
    }

    public int getWeek(){
        return mWeek;
    }

    public void setWeek(int pWeek){
        mWeek = pWeek;
    }

    public List<CTotwPlayerEntity> getTotwPlayers(){
        return mTotwPlayers;
    }

    public void setTotwPlayers(List<CTotwPlayerEntity> pTotwPlayers){
        mTotwPlayers = pTotwPlayers;
    }

    public void addTotwPlayer(CTotwPlayerEntity pTotwPlayer){
        if (mTotwPlayers != null){
            mTotwPlayers.add(pTotwPlayer);
        }
        else{
            mTotwPlayers = new ArrayList<CTotwPlayerEntity>();
            mTotwPlayers.add(pTotwPlayer);
        }
    }

    public static class CTotwBuilder{
        private int mWeek;
        private List<CTotwPlayerEntity> mTotwPlayers;

        public CTotwBuilder(){}

        public CTotwBuilder week(int pWeek){
            mWeek = pWeek;
            return this;
        }

        public CTotwBuilder totwPlayers(List<CTotwPlayerEntity> pTotwPlayers){
            mTotwPlayers = pTotwPlayers;
            return this;
        }

        public CTotwEntity build(){
            return new CTotwEntity(this);
        }
    }
}
