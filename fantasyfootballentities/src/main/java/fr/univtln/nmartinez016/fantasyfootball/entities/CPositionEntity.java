package fr.univtln.nmartinez016.fantasyfootball.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by marti on 29/07/2016.
 */

@Entity
@Table(schema = "fantasyfootball")
@NamedQueries({@NamedQuery(name = CPositionEntity.GET_BY_NAME, query = "select p from CPositionEntity p where p.mName = :mName"),
                @NamedQuery(name = CPositionEntity.GET_ALL, query = "select p from CPositionEntity p")})

public class CPositionEntity implements Serializable {
    public static final String GET_BY_NAME = "CPosition.getByName";
    public static final String GET_ALL = "CPosition.getAll";

    @Id
    private String mName;

    private int mGk;
    private  int mLb;
    private int mRb;
    private int mCb;
    private int mRcb;
    private int mLcb;
    private int mLwb;
    private int mRwb;

    private int mCdm;
    private int mRdm;
    private int mLdm;
    private int mCm;
    private int mRcm;
    private int mLcm;
    private int mRm;
    private int mLm;
    private int mCam;
    private int mRam;
    private int mLam;

    private int mRw;
    private int mLw;
    //private int mFalseNine;
    private int mSt;
    private int mRst;
    private int mLst;

    private float mWidthCoef;
    private float mHeightCoef;

    private float mTopSquare;
    private float mLeftSquare;
    private float mBottomSquare;
    private float mRightSquare;

    private boolean mGoalKeeper;
    private boolean mDefender;
    private boolean mMidfielder;
    private boolean mForward;

    public CPositionEntity(){}

    public CPositionEntity(CPositionBuilder pBuilder){
        mName = pBuilder.mName;

        mGk = pBuilder.mGk;
        mLb = pBuilder.mLb;
        mRb = pBuilder.mRb;
        mCb = pBuilder.mCb;
        mRcb = pBuilder.mRcb;
        mLcb = pBuilder.mLcb;
        mLwb = pBuilder.mLwb;
        mRwb = pBuilder.mRwb;

        mCdm = pBuilder.mCdm;
        mRdm = pBuilder.mRdm;
        mLdm = pBuilder.mLdm;
        mCm = pBuilder.mCm;
        mRcm = pBuilder.mRcm;
        mLcm = pBuilder.mLcm;
        mRm = pBuilder.mRm;
        mLm = pBuilder.mLm;
        mCam = pBuilder.mCam;
        mRam = pBuilder.mRam;
        mLam = pBuilder.mLam;

        mRw = pBuilder.mRw;
        mLw = pBuilder.mLw;
  //      mFalseNine = pBuilder.mFalseNine;
        mSt = pBuilder.mSt;
        mRst = pBuilder.mRst;
        mLst = pBuilder.mLst;

        mWidthCoef = pBuilder.mWidthCoef;
        mHeightCoef = pBuilder.mHeightCoef;

        mLeftSquare = pBuilder.mLeftSquare;
        mRightSquare = pBuilder.mRightSquare;
        mTopSquare = pBuilder.mTopSquare;
        mBottomSquare = pBuilder.mBottomSquare;

        mGoalKeeper = pBuilder.mGoalKeeper;
        mDefender = pBuilder.mDefender;
        mMidfielder = pBuilder.mMidfielder;
        mForward = pBuilder.mForward;
    }

    public String getName(){
        return mName;
    }

    public void setName(String pName){
        mName = pName;
    }

    public int getGk(){
        return mGk;
    }

    public void setGk(int pGk){
        mGk = pGk;
    }

    public int getLb(){
        return mLb;
    }

    public void setLb(int pLb){
        mLb = pLb;
    }

    public int getRb(){
        return mRb;
    }

    public void setRb(int pRb){
        mRb = pRb;
    }

    public int getCb(){
        return mCb;
    }

    public void setCb(int pCb){
        mCb = pCb;
    }

    public int getRcb(){
        return mRcb;
    }

    public void setRcb(int pRcb){
        mRcb = pRcb;
    }

    public int getLcb(){
        return mLcb;
    }

    public void setLcb(int pLcb){
        mLcb = pLcb;
    }

    public int getRwb(){
        return mRwb;
    }

    public void setRwb(int pRwb){
        mRwb = pRwb;
    }

    public int getLwb(){
        return mLwb;
    }

    public void setLwb(int pLwb){
        mLwb = pLwb;
    }

    public int getCdm(){
        return mCdm;
    }

    public void setCdm(int pCdm){
        mCdm = pCdm;
    }

    public int getRdm(){
        return mRdm;
    }

    public void setRdm(int pRcdm){
        mRdm = pRcdm;
    }

    public int getLdm(){
        return mLdm;
    }

    public void setLdm(int pLcdm){
        mLdm = pLcdm;
    }

    public int getCm(){
        return mCm;
    }

    public void setCm(int pCm){
        mCm = pCm;
    }

    public int getRcm(){
        return mRcm;
    }

    public void setRcm(int pRcm){
        mRcm = pRcm;
    }

    public int getLcm(){
        return mLcm;
    }

    public void setLcm(int pLcm){
        mLcm = pLcm;
    }

    public int getLm(){
        return mLm;
    }

    public void setLm(int pLm){
        mLm = pLm;
    }

    public int getRm(){
        return mRm;
    }

    public void setRm(int pRm){
        mRm = pRm;
    }

    public int getCam(){
        return mCam;
    }

    public void setCam(int pCam){
        mCam = pCam;
    }

    public int getLam(){
        return mLam;
    }

    public void setLam(int pLam){
        mLam = pLam;
    }

    public int getRam(){
        return mRam;
    }

    public void setRam(int pRam){
        mRam = pRam;
    }

    public int getRw(){
        return mRw;
    }

    public void setRw(int pRw){
        mRw = pRw;
    }

    public int getLw(){
        return mLw;
    }

    public void setLw(int pLw){
        mLw = pLw;
    }
/*
    public int getFalseNine(){
        return mFalseNine;
    }

    public void setFalseNine(int pFalseNine){
        mFalseNine = pFalseNine;
    }
*/
    public int getRst(){
        return mRst;
    }

    public void setRst(int pRst){
        mRst = pRst;
    }

    public int getLst(){
        return mLst;
    }

    public void setLst(int pLst){
        mLst = pLst;
    }

    public int getSt(){
        return mSt;
    }

    public void setSt(int pSt){
        mSt = pSt;
    }

    public float getWidthCoef(){
        return mWidthCoef;
    }

    public void setWidthCoef(float pWidthCoef){
        mWidthCoef = pWidthCoef;
    }

    public float getHeightCoef(){
        return mHeightCoef;
    }

    public void setHeightCoef(float pHeightCoef){
        mHeightCoef = pHeightCoef;
    }

    public float getTopSquare(){
        return mTopSquare;
    }

    public void setTopSquare(float pTopSquare){
        mTopSquare = pTopSquare;
    }

    public float getBottomSquare(){
        return mBottomSquare;
    }

    public void setBottomSquare(float pBottomSquare){
        mBottomSquare = pBottomSquare;
    }

    public float getRightSquare(){
        return mRightSquare;
    }

    public void setRightSquare(float pRightSquare){
        mRightSquare = pRightSquare;
    }

    public float getLeftSquare(){
        return mLeftSquare;
    }

    public void setLeftSquare(float pLeftSquare){
        mLeftSquare = pLeftSquare;
    }

    public void setGoalKeeper(boolean pGoalKeeper){
        mGoalKeeper = pGoalKeeper;
    }

    public boolean isGoalKeeper(){
        return mGoalKeeper;
    }

    public void setDefender(boolean pDefender){
        mDefender = pDefender;
    }

    public boolean isDefender(){
        return mDefender;
    }

    public void setMidfielder(boolean pMidfielder){
        mMidfielder = pMidfielder;
    }

    public boolean isMidfielder(){
        return mMidfielder;
    }

    public void setForward(boolean pForward){
        mForward = pForward;
    }

    public boolean isForward(){
        return mForward;
    }

    @JsonIgnore
    public float getTopSquareHeigth(float pHeigth){
        return ((pHeigth * mTopSquare) + 40 + (pHeigth * mHeightCoef) - 40) / 2;
    }

    @JsonIgnore
    public float getRightSquareWidth(float pWidth){
        return ((pWidth * mRightSquare) - 40 + (pWidth * mWidthCoef) + 40) / 2;
    }

    @JsonIgnore
    public float getLeftSquareWidth(float pWidth){
        return ((pWidth * mLeftSquare) + 40 + (pWidth * mWidthCoef) - 40) / 2;
    }

    @JsonIgnore
    public float getBottomSquareHeigth(float pHeigth){
        return ((pHeigth * mBottomSquare) - 40 + (pHeigth * mHeightCoef) + 40) / 2;
    }


    public static class CPositionBuilder{
        private String mName;
        private int mGk;
        private  int mLb;
        private int mRb;
        private int mCb;
        private int mRcb;
        private int mLcb;
        private int mLwb;
        private int mRwb;

        private int mCdm;
        private int mRdm;
        private int mLdm;
        private int mCm;
        private int mRcm;
        private int mLcm;
        private int mRm;
        private int mLm;
        private int mCam;
        private int mRam;
        private int mLam;

        private int mRw;
        private int mLw;
        //private int mFalseNine;
        private int mSt;
        private int mRst;
        private int mLst;

        private float mWidthCoef;
        private float mHeightCoef;

        private float mTopSquare;
        private float mLeftSquare;
        private float mBottomSquare;
        private float mRightSquare;

        private boolean mGoalKeeper = false;
        private boolean mDefender = false;
        private boolean mMidfielder = false;
        private boolean mForward = false;


        public CPositionBuilder(){}

        public CPositionBuilder name(String pName){
            mName = pName;
            return this;
        }

        public CPositionBuilder gk(int pGk){
            mGk = pGk;
            return this;
        }

        public CPositionBuilder lb(int pLb){
            mLb = pLb;
            return this;
        }

        public CPositionBuilder rb(int pRb){
            mRb = pRb;
            return this;
        }

        public CPositionBuilder cb(int pCb){
            mCb = pCb;
            return this;
        }

        public CPositionBuilder rcb(int pRcb){
            mRcb = pRcb;
            return this;
        }

        public CPositionBuilder lcb(int pLcb){
            mLcb = pLcb;
            return this;
        }

        public CPositionBuilder rwb (int pRwb){
            mRwb = pRwb;
            return this;
        }

        public CPositionBuilder lwb(int pLwb){
            mLwb = pLwb;
            return this;
        }

        public CPositionBuilder cdm(int pCdm){
            mCdm = pCdm;
            return this;
        }

        public CPositionBuilder rdm(int pRdm){
            mRdm = pRdm;
            return this;
        }

        public CPositionBuilder ldm(int pLdm){
            mLdm = pLdm;
            return this;
        }

        public CPositionBuilder cm(int pCm){
            mCm = pCm;
            return this;
        }

        public CPositionBuilder rcm(int pRcm){
            mRcm = pRcm;
            return this;
        }

        public CPositionBuilder lcm(int pLcm){
            mLcm = pLcm;
            return this;
        }

        public CPositionBuilder lm(int pLm){
            mLm = pLm;
            return this;
        }

        public CPositionBuilder rm(int pRm){
            mRm = pRm;
            return this;
        }

        public CPositionBuilder cam(int pCam){
            mCam = pCam;
            return this;
        }

        public CPositionBuilder ram(int pRam){
            mRam = pRam;
            return this;
        }

        public CPositionBuilder lam(int pLam){
            mLam = pLam;
            return this;
        }

        public CPositionBuilder rw(int pRw){
            mRw = pRw;
            return this;
        }

        public CPositionBuilder lw(int pLw){
            mLw = pLw;
            return this;
        }
/*
        public CPositionBuilder f9(int pFalseNine){
            mFalseNine = pFalseNine;
            return this;
        }
*/
        public CPositionBuilder rst(int pRst){
            mRst = pRst;
            return this;
        }

        public CPositionBuilder lst(int pLst){
            mLst = pLst;
            return this;
        }

        public CPositionBuilder st(int pSt){
            mSt = pSt;
            return this;
        }

        public CPositionBuilder widthCoef(float pWidthCoef){
            mWidthCoef = pWidthCoef;
            return this;
        }

        public CPositionBuilder heightCoef(float pHeightCoef){
            mHeightCoef = pHeightCoef;
            return this;
        }

        public CPositionBuilder topSquare(float pTopSquare){
            mTopSquare = pTopSquare;
            return this;
        }

        public CPositionBuilder bottomSquare(float pBottomSquare){
            mBottomSquare = pBottomSquare;
            return this;
        }

        public CPositionBuilder rightSquare(float pRightSquare){
            mRightSquare = pRightSquare;
            return this;
        }

        public CPositionBuilder leftSquare(float pLeftSquare){
            mLeftSquare = pLeftSquare;
            return this;
        }

        public CPositionBuilder goalkeeper(){
            mGoalKeeper = true;
            return this;
        }

        public CPositionBuilder defender(){
            mDefender = true;
            return this;
        }

        public CPositionBuilder midfielder(){
            mMidfielder = true;
            return this;
        }

        public CPositionBuilder forward(){
            mForward = true;
            return this;
        }

        public CPositionEntity build(){
            return new CPositionEntity(this);
        }
    }
}
