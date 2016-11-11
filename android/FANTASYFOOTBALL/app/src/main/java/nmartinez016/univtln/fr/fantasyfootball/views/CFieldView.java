package nmartinez016.univtln.fr.fantasyfootball.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.load.CMovePlayerAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPositionEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CYourPlayerEntry;
import nmartinez016.univtln.fr.fantasyfootball.CStaticVariables;
import nmartinez016.univtln.fr.fantasyfootball.activities.CTabsActivity;
import nmartinez016.univtln.fr.fantasyfootball.R;
import nmartinez016.univtln.fr.fantasyfootball.websocket.CTyrusClient;

/**
 * Created by marti on 23/07/2016.
 * View to display a football field with the players you have in the
 * position you put them in.
 * You can interact with this View to place your players.
 */
public class CFieldView extends View {

    private Paint mFillRoundPlayerPaint = new Paint();
    private Paint mEmptyRoundPlayerPaint = new Paint();
    private Paint mPlayerNamePaint = new Paint();
    private Paint mSquarePaintPosition100 = new Paint();
    private Paint mSquarePaintPosition90 = new Paint();
    private Paint mSquarePaintPosition80 = new Paint();
    private Paint mSquarePaintPosition70 = new Paint();
    private Paint mSquarePaintPosition60 = new Paint();
    private Paint mSquarePaintPosition0 = new Paint();
    private int mMoveState = 0;
    private int mState = 0;
    private CPlayerEntity mCurrentPlayer;
    private CPositionEntity mCurrentPosition;


    public CFieldView(Context context) {
        super(context);
    }

    public CFieldView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CFieldView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CFieldView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        mFillRoundPlayerPaint.setStyle(Paint.Style.FILL);
        mFillRoundPlayerPaint.setColor(Color.WHITE);

        mSquarePaintPosition100.setStyle(Paint.Style.FILL);
        mSquarePaintPosition100.setColor(Color.GREEN);
        mSquarePaintPosition100.setAlpha(50);

        mSquarePaintPosition90.setStyle(Paint.Style.FILL);
        mSquarePaintPosition90.setColor(Color.BLUE);
        mSquarePaintPosition90.setAlpha(50);

        mSquarePaintPosition80.setStyle(Paint.Style.FILL);
        mSquarePaintPosition80.setColor(Color.YELLOW);
        mSquarePaintPosition80.setAlpha(50);

        mSquarePaintPosition70.setStyle(Paint.Style.FILL);
        mSquarePaintPosition70.setColor(Color.RED);
        mSquarePaintPosition70.setAlpha(50);

        mSquarePaintPosition60.setStyle(Paint.Style.FILL);
        mSquarePaintPosition60.setColor(Color.RED);
        mSquarePaintPosition60.setAlpha(50);

        mSquarePaintPosition0.setStyle(Paint.Style.FILL);
        mSquarePaintPosition0.setColor(Color.BLACK);
        mSquarePaintPosition0.setAlpha(50);

        mPlayerNamePaint.setTextSize(mPlayerNamePaint.getTextSize());

        mEmptyRoundPlayerPaint.setStyle(Paint.Style.STROKE);
        mEmptyRoundPlayerPaint.setColor(Color.BLACK);

        Drawable lField = getResources().getDrawable(R.drawable.footballfield);
        lField.setBounds(0, 0, getWidth(), 900);
        lField.draw(canvas);


        for (CYourPlayerEntry lYourPlayerEntry : CStaticVariables.getUser().getCurrentFantasyTeam().getYourPlayerEntries()){
            if (lYourPlayerEntry.getPosition() != null){
                int lResId16 = getContext().getResources().getIdentifier(lYourPlayerEntry.getPlayer().getTeam().getJerseyPath(), "drawable", getContext().getPackageName());
                Drawable lJersey16 = getResources().getDrawable(lResId16);
                ImageView lJerseyImageView = null;
                //Glide.with(getContext()).load(lYourPlayerEntry.getPlayer().getTeam().getJerseyPath()).into(lJerseyImageView);
                //lJerseyImageView.draw(canvas);
                lJersey16.setBounds((int)((getWidth() * lYourPlayerEntry.getPosition().getWidthCoef()) - fr.univtln.nmartinez016.fantasyfootball.CConstants.JERSEY_OFFSET), (int)((getHeight() * lYourPlayerEntry.getPosition().getHeightCoef()) - fr.univtln.nmartinez016.fantasyfootball.CConstants.JERSEY_OFFSET), (int) ((getWidth() * lYourPlayerEntry.getPosition().getWidthCoef()) + fr.univtln.nmartinez016.fantasyfootball.CConstants.JERSEY_OFFSET), (int) ((getHeight() * lYourPlayerEntry.getPosition().getHeightCoef()) + fr.univtln.nmartinez016.fantasyfootball.CConstants.JERSEY_OFFSET));
                lJersey16.draw(canvas);
                canvas.drawText(lYourPlayerEntry.getPlayer().getLastName(), (getWidth() * lYourPlayerEntry.getPosition().getWidthCoef()) - (mPlayerNamePaint.measureText(lYourPlayerEntry.getPlayer().getLastName()) / 2), (getHeight() * lYourPlayerEntry.getPosition().getHeightCoef()) + fr.univtln.nmartinez016.fantasyfootball.CConstants.NAME_OFFSET, mPlayerNamePaint);
            }
        }



        if (mState == 1){
            Paint lGkPaint = null;
            Paint lRbPaint = null;
            Paint lRwbPaint = null;
            Paint lRcbPaint = null;
            Paint lCbPaint = null;
            Paint lLcbPaint = null;
            Paint lLbPaint = null;
            Paint lLwbPaint = null;
            Paint lRdmPaint = null;
            Paint lCdmPaint = null;
            Paint lLdmPaint = null;
            Paint lRcmPaint = null;
            Paint lCmPaint = null;
            Paint lLcmPaint = null;
            Paint lRmPaint = null;
            Paint lLmPaint = null;
            Paint lRamPaint = null;
            Paint lCamPaint = null;
            Paint lLamPaint = null;
            Paint lRwPaint = null;
            Paint lRstPaint = null;
            Paint lStPaint = null;
            Paint lLstPaint = null;
            Paint lLwPaint = null;

            switch (mCurrentPlayer.getGk()){
                case 100:
                    lGkPaint = mSquarePaintPosition100;
                    break;
                case 0:
                    lGkPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getRwb()){
                case 100:
                    lRwbPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lRwbPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lRwbPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lRwbPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lRwbPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lRwbPaint = mSquarePaintPosition0;
                    break;
            }


            switch (mCurrentPlayer.getRb()){
                case 100:
                    lRbPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lRbPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lRbPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lRbPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lRbPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lRbPaint = mSquarePaintPosition0;
                    break;
            }


            switch (mCurrentPlayer.getRcb()){
                case 100:
                    lRcbPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lRcbPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lRcbPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lRcbPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lRcbPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lRcbPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getCb()){
                case 100:
                    lCbPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lCbPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lCbPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lCbPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lCbPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lCbPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getLcb()){
                case 100:
                    lLcbPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lLcbPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lLcbPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lLcbPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lLcbPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lLcbPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getLb()){
                case 100:
                    lLbPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lLbPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lLbPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lLbPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lLbPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lLbPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getLwb()){
                case 100:
                    lLwbPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lLwbPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lLwbPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lLwbPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lLwbPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lLwbPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getRdm()){
                case 100:
                    lRdmPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lRdmPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lRdmPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lRdmPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lRdmPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lRdmPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getCdm()){
                case 100:
                    lCdmPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lCdmPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lCdmPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lCdmPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lCdmPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lCdmPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getLdm()){
                case 100:
                    lLdmPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lLdmPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lLdmPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lLdmPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lLdmPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lLdmPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getRcm()){
                case 100:
                    lRcmPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lRcmPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lRcmPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lRcmPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lRcmPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lRcmPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getCm()){
                case 100:
                    lCmPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lCmPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lCmPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lCmPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lCmPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lCmPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getLcm()){
                case 100:
                    lLcmPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lLcmPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lLcmPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lLcmPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lLcmPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lLcmPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getRm()){
                case 100:
                    lRmPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lRmPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lRmPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lRmPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lRmPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lRmPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getLm()){
                case 100:
                    lLmPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lLmPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lLmPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lLmPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lLmPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lLmPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getRam()){
                case 100:
                    lRamPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lRamPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lRamPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lRamPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lRamPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lRamPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getCam()){
                case 100:
                    lCamPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lCamPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lCamPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lCamPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lCamPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lCamPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getLam()){
                case 100:
                    lLamPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lLamPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lLamPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lLamPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lLamPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lLamPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getRw()){
                case 100:
                    lRwPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lRwPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lRwPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lRwPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lRwPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lRwPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getRst()){
                case 100:
                    lRstPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lRstPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lRstPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lRstPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lRstPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lRstPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getSt()){
                case 100:
                    lStPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lStPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lStPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lStPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lStPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lStPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getLst()){
                case 100:
                    lLstPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lLstPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lLstPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lLstPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lLstPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lLstPaint = mSquarePaintPosition0;
                    break;
            }

            switch (mCurrentPlayer.getLw()){
                case 100:
                    lLwPaint = mSquarePaintPosition100;
                    break;
                case 90:
                    lLwPaint = mSquarePaintPosition90;
                    break;
                case 80:
                    lLwPaint = mSquarePaintPosition80;
                    break;
                case 70:
                    lLwPaint = mSquarePaintPosition70;
                    break;
                case 60:
                    lLwPaint = mSquarePaintPosition60;
                    break;
                case 0:
                    lLwPaint = mSquarePaintPosition0;
                    break;
            }

            for (CPositionEntity lPosition : CStaticVariables.getPositions()){
                switch(lPosition.getName()){
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.GK):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lGkPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lGkPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.RWB):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRwbPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRwbPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.RB):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRbPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRbPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.RCB):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRcbPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRcbPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.CB):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lCbPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lCbPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.LCB):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLcbPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLcbPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.LB):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLbPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLbPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.LWB):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLwbPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLwbPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.RDM):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRdmPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRdmPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.CDM):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lCdmPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lCdmPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.LDM):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLdmPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLdmPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.RM):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRmPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRmPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.RCM):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRcmPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRcmPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.CM):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lCmPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lCmPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.LCM):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLcmPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLcmPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.LM):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLmPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLmPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.RAM):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRamPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRamPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.CAM):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lCamPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lCamPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.LAM):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLamPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLamPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.RW):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRwPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRwPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.RST):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRstPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lRstPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.ST):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lStPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lStPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.LST):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLstPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLstPaint);
                        break;
                    case (fr.univtln.nmartinez016.fantasyfootball.CConstants.LW):
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLwPaint);
                        canvas.drawRect(lPosition.getLeftSquareWidth(getWidth()), lPosition.getTopSquareHeigth(getHeight()), lPosition.getRightSquareWidth(getWidth()), lPosition.getBottomSquareHeigth(getHeight()), lLwPaint);
                        break;
                }
            }


        }

        super.onDraw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                System.out.println("action down");
                return true;
            case MotionEvent.ACTION_UP:
                System.out.println("action up");
                if (mState == 0){
                    Activity host = (Activity) getContext();
                    if (host instanceof CTabsActivity){
                        CPositionEntity lPosition = CStaticVariables.findPosition(event.getX(), event.getY(), getWidth(), getHeight());
                        mCurrentPosition = lPosition;
                        if (mCurrentPosition != null){
                            ((CTabsActivity) host).openChoseOnClick(lPosition);
                        }
                    }
                }
                else if (mState == 1){
                    CPositionEntity lPosition = CStaticVariables.findPosition(event.getX(), event.getY(), getWidth(), getHeight());
                    CAction lMovePlayer = new CMovePlayerAction.CMovePlayerBuilder().user(CStaticVariables.getUser()).initialPosition(mCurrentPosition).finalPosition(lPosition).build();
                    CTyrusClient.sendMessage(lMovePlayer);
                }
                return true;
        }

        return super.onTouchEvent(event);
    }

    public void setState(int pState){
        mState = pState;
    }

    public void setCurrentPlayer(CPlayerEntity pPlayer){
        mCurrentPlayer = pPlayer;
    }

    public void setCurrentPosition(CPositionEntity pPosition){
        mCurrentPosition = pPosition;
    }

}
