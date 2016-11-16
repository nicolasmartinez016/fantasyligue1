package fr.univtln.nmartinez016.fantasyfootball.actions.load;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;

import java.io.Serializable;

/**
 * Created by marti on 23/10/2016.
 */
public class CConnectionAction extends CAction implements Serializable {
    private String mUserId;
    private String mUserName;

    public CConnectionAction(){}

    public CConnectionAction(CConnectionBuilder pBuilder){
        mUserId = pBuilder.mUserId;
        mUserName = pBuilder.mUserName;
    }

    public String getUserId(){
        return mUserId;
    }

    public void setUserId(String pUserId){
        mUserId = pUserId;
    }

    public String getUserName(){
        return mUserName;
    }

    public void setUserName(String pUserName){
        mUserName = pUserName;
    }

    public static class CConnectionBuilder{
        private String mUserId;
        private String mUserName;

        public CConnectionBuilder(){}

        public CConnectionBuilder userId(String pUserId){
            mUserId = pUserId;
            return this;
        }

        public CConnectionBuilder userName(String pUserName){
            mUserName = pUserName;
            return this;
        }

        public CConnectionAction build(){
            return new CConnectionAction(this);
        }
    }
}
