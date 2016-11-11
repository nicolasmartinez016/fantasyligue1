package fr.univtln.nmartinez016.fantasyfootball.actions.load;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;

import java.io.Serializable;

/**
 * Created by marti on 01/08/2016.
 * Action that a client sends to the server to
 * get the players matching the parameters
 * (team, age gt, lt or equals and name)
 */
public class CLoadPlayersAction extends CAction implements Serializable {
    private String mSearchName;
    private int mTeamId;
    private int mAge;
    private int mSearchNameOk;
    private int mTeamIdOk;
    private int mAgeOk;

    public CLoadPlayersAction(){
        super();
    }

    public CLoadPlayersAction(CLoadPlayersBuilder pBuilder){
        super();
        mSearchName = pBuilder.mSearchName;
        mTeamId = pBuilder.mTeamId;
        mAge = pBuilder.mAge;
        mSearchNameOk = pBuilder.mSearchNameOk;
        mTeamIdOk = pBuilder.mTeamIdOk;
        mAgeOk = pBuilder.mAgeOk;
    }

    public String getSearchName(){
        return mSearchName;
    }

    public void setSearchName(String pSearchName){
        mSearchName = pSearchName;
    }

    public int getTeamId(){
        return mTeamId;
    }

    public void setTeamId(int pTeamId){
        mTeamId = pTeamId;
    }

    public int getAge(){
        return mAge;
    }

    public void setAge(int pAge){
        mAge = pAge;
    }

    public int getSearchNameOk(){
        return mSearchNameOk;
    }

    public void setSearchNameOk(int pSearchNameOk){
        mSearchNameOk = pSearchNameOk;
    }

    public int getTeamIdOk(){
        return mTeamIdOk;
    }

    public void setTeamIdOk(int pTeamIdOk){
        mTeamIdOk = pTeamIdOk;
    }

    public int getAgeOk(){
        return mAgeOk;
    }

    public void setAgeOk(int pAgeOk){
        mAgeOk = pAgeOk;
    }

    public static class CLoadPlayersBuilder {
        private String mSearchName;
        private int mTeamId;
        private int mAge;
        private int mSearchNameOk;
        private int mTeamIdOk;
        private int mAgeOk;


        public CLoadPlayersBuilder() {
        }

        public CLoadPlayersBuilder searchName(String pSearchName){
            mSearchName = pSearchName;
            return this;
        }

        public CLoadPlayersBuilder teamId(int pTeamId){
            mTeamId = pTeamId;
            return this;
        }

        public CLoadPlayersBuilder age(int pAge){
            mAge = pAge;
            return this;
        }

        public CLoadPlayersBuilder teamIdOk(int pTeamIdOk){
            mTeamIdOk = pTeamIdOk;
            return this;
        }

        public CLoadPlayersBuilder searchNameOk(int pSearchNameOk){
            mSearchNameOk = pSearchNameOk;
            return this;
        }

        public CLoadPlayersBuilder ageOk(int pAgeOk){
            mAgeOk = pAgeOk;
            return this;
        }

        public CLoadPlayersAction build(){
            return new CLoadPlayersAction(this);
        }

    }

}
