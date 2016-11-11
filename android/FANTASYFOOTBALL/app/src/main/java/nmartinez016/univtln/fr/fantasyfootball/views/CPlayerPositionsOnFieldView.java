package nmartinez016.univtln.fr.fantasyfootball.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import nmartinez016.univtln.fr.fantasyfootball.dialogs.CCustomDialog;
import nmartinez016.univtln.fr.fantasyfootball.R;

/**
 * Created by marti on 01/08/2016.
 * View to display the positions where a player can play in their profile.
 */
public class CPlayerPositionsOnFieldView extends View {

    private Paint mPaintEmpty = new Paint();
    private Paint mPaintFull = new Paint();
    private Paint mPaint100 = new Paint();
    private Paint mPaint90 = new Paint();
    private Paint mPaint80 = new Paint();
    private Paint mPaint70 = new Paint();
    private Paint mPaint60 = new Paint();
    private Paint mPaint0 = new Paint();
    private Map<Integer, Paint> mMapPaint = new HashMap<>();

    public CPlayerPositionsOnFieldView(Context context) {
        super(context);
    }

    public CPlayerPositionsOnFieldView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CPlayerPositionsOnFieldView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CPlayerPositionsOnFieldView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        mPaintEmpty.setStyle(Paint.Style.STROKE);
        mPaintEmpty.setColor(Color.BLACK);

        mPaintFull.setStyle(Paint.Style.FILL);
        mPaintFull.setColor(Color.WHITE);

        mPaint100.setStyle(Paint.Style.FILL);
        mPaint100.setColor(Color.GREEN);

        mPaint90.setStyle(Paint.Style.FILL);
        mPaint90.setColor(Color.BLUE);

        mPaint80.setStyle(Paint.Style.FILL);
        mPaint80.setColor(Color.YELLOW);

        mPaint70.setStyle(Paint.Style.FILL);
        mPaint70.setColor(Color.argb(255, 255, 165, 0));


        mPaint60.setStyle(Paint.Style.FILL);
        mPaint60.setColor(Color.RED);

        mPaint0.setStyle(Paint.Style.FILL);
        mPaint0.setColor(Color.BLACK);

        mMapPaint.put(100, mPaint100);
        mMapPaint.put(90, mPaint90);
        mMapPaint.put(80, mPaint80);
        mMapPaint.put(70, mPaint70);
        mMapPaint.put(60, mPaint60);
        mMapPaint.put(50, mPaint60);
        mMapPaint.put(0, mPaint0);

        CPlayerEntity lPlayer = CCustomDialog.mPlayer;


        Drawable lField = getResources().getDrawable(R.drawable.footballfield);
        lField.setBounds(0, 0, getWidth(), getHeight());
        lField.draw(canvas);

        // gk
        canvas.drawCircle(getWidth() / 2, (getHeight() * 9) / 10, 5, mMapPaint.get(lPlayer.getGk()));
        canvas.drawCircle(getWidth() / 2, (getHeight() * 9) / 10, 5, mPaintEmpty);

        //cb
        canvas.drawCircle(getWidth() / 2, (getHeight() * 3) / 4, 5, mMapPaint.get(lPlayer.getCb()));
        canvas.drawCircle(getWidth() / 2, (getHeight() * 3) / 4, 5, mPaintEmpty);

        //lcb
        canvas.drawCircle(getWidth() / 3, (getHeight() * 3) / 4, 5, mMapPaint.get(lPlayer.getLcb()));
        canvas.drawCircle(getWidth() / 3, (getHeight() * 3) / 4, 5, mPaintEmpty);

        //rcb
        canvas.drawCircle((getWidth() / 2) + ((float)0.17 * getWidth()), (getHeight() * 3) / 4, 5, mMapPaint.get(lPlayer.getRcb()));
        canvas.drawCircle((getWidth() / 2) + ((float)0.17 * getWidth()), (getHeight() * 3) / 4, 5, mPaintEmpty);

        //lb
        canvas.drawCircle(getWidth() / 8, (getHeight() * 3) / 4, 5, mMapPaint.get(lPlayer.getLb()));
        canvas.drawCircle(getWidth() / 8, (getHeight() * 3) / 4, 5, mPaintEmpty);

        //rb
        canvas.drawCircle(getWidth() * 7 / 8, (getHeight() * 3) / 4, 5, mMapPaint.get(lPlayer.getRb()));
        canvas.drawCircle(getWidth() * 7 / 8, (getHeight() * 3) / 4, 5, mPaintEmpty);

        //lwb
        //canvas.drawCircle(getWidth() / 8, (getHeight() * 3) / 5, 5, mMapPaint.get(lPlayer.getLwb()));
        canvas.drawCircle(getWidth() / 8, (getHeight() * 3) / 5, 5, mPaintEmpty);

        //rwb
        canvas.drawCircle(getWidth() * 7 / 8, (getHeight() * 3) / 5, 5, mMapPaint.get(lPlayer.getRwb()));
        canvas.drawCircle(getWidth() * 7 / 8, (getHeight() * 3) / 5, 5, mPaintEmpty);

        //cdm
        canvas.drawCircle(getWidth() / 2, (getHeight() * 3) / 5, 5, mMapPaint.get(lPlayer.getCdm()));
        canvas.drawCircle(getWidth() / 2, (getHeight() * 3) / 5, 5, mPaintEmpty);

        //ldm
        canvas.drawCircle(getWidth() / 3, (getHeight() * 3) / 5, 5, mMapPaint.get(lPlayer.getLdm()));
        canvas.drawCircle(getWidth() / 3, (getHeight() * 3) / 5, 5, mPaintEmpty);

        //rdm
        canvas.drawCircle((getWidth() / 2) + ((float)0.17 * getWidth()), (getHeight() * 3) / 5, 5, mMapPaint.get(lPlayer.getRdm()));
        canvas.drawCircle((getWidth() / 2) + ((float)0.17 * getWidth()), (getHeight() * 3) / 5, 5, mPaintEmpty);

        //cm
        canvas.drawCircle(getWidth() / 2, (getHeight() * (float)9.5) / 20, 5, mMapPaint.get(lPlayer.getCm()));
        canvas.drawCircle(getWidth() / 2, (getHeight() * (float)9.5) / 20, 5, mPaintEmpty);

        //lcm
        canvas.drawCircle(getWidth() / 3, (getHeight() * (float)9.5) / 20, 5, mMapPaint.get(lPlayer.getLcm()));
        canvas.drawCircle(getWidth() / 3, (getHeight() * (float)9.5) / 20, 5, mPaintEmpty);

        //rcm
        canvas.drawCircle((getWidth() / 2) + ((float)0.17 * getWidth()), (getHeight() * (float)9.5) / 20, 5, mMapPaint.get(lPlayer.getRcm()));
        canvas.drawCircle((getWidth() / 2) + ((float)0.17 * getWidth()), (getHeight() * (float)9.5) / 20, 5, mPaintEmpty);

        //lm
        canvas.drawCircle(getWidth() / 8, (getHeight() * (float)9.5) / 20, 5, mMapPaint.get(lPlayer.getLm()));
        canvas.drawCircle(getWidth() / 8, (getHeight() * (float)9.5) / 20, 5, mPaintEmpty);

        //rm
        canvas.drawCircle(getWidth() * 7 / 8, (getHeight() * (float)9.5) / 20, 5, mMapPaint.get(lPlayer.getRm()));
        canvas.drawCircle(getWidth() * 7 / 8, (getHeight() * (float)9.5) / 20, 5, mPaintEmpty);

        //cam
        canvas.drawCircle(getWidth() / 2, (getHeight() * 7) / 20, 5, mMapPaint.get(lPlayer.getCam()));
        canvas.drawCircle(getWidth() / 2, (getHeight() * 7) / 20, 5, mPaintEmpty);

        //lam
        canvas.drawCircle((getWidth() / 3) - getWidth() * 4 / 42, (getHeight() * 7) / 20, 5, mMapPaint.get(lPlayer.getLam()));
        canvas.drawCircle((getWidth() / 3) - getWidth() * 4 / 42, (getHeight() * 7) / 20, 5, mPaintEmpty);

        //ram
        canvas.drawCircle((getWidth() / 2) + ((float)0.17 * getWidth()) + getWidth() * 4 / 42, (getHeight() * 7) / 20, 5, mMapPaint.get(lPlayer.getRam()));
        canvas.drawCircle((getWidth() / 2) + ((float)0.17 * getWidth()) + getWidth() * 4 / 42, (getHeight() * 7) / 20, 5, mPaintEmpty);

        //lw
        canvas.drawCircle(getWidth() / 8, getHeight() / 5, 5, mMapPaint.get(lPlayer.getLw()));
        canvas.drawCircle(getWidth() / 8, getHeight() / 5, 5, mPaintEmpty);

        //rw
        canvas.drawCircle(getWidth() * 7 / 8, getHeight() / 5, 5, mMapPaint.get(lPlayer.getRw()));
        canvas.drawCircle(getWidth() * 7 / 8, getHeight() / 5, 5, mPaintEmpty);

        //st
        canvas.drawCircle(getWidth() / 2, getHeight() / 5, 5, mMapPaint.get(lPlayer.getSt()));
        canvas.drawCircle(getWidth() / 2, getHeight() / 5, 5, mPaintEmpty);

        //lst
        canvas.drawCircle(getWidth() / 3, getHeight() / 5, 5, mMapPaint.get(lPlayer.getLst()));
        canvas.drawCircle(getWidth() / 3, getHeight() / 5, 5, mPaintEmpty);

        //rst
        canvas.drawCircle((getWidth() / 2) + ((float)0.17 * getWidth()), getHeight() / 5, 5, mMapPaint.get(lPlayer.getRst()));
        canvas.drawCircle((getWidth() / 2) + ((float)0.17 * getWidth()), getHeight() / 5, 5, mPaintEmpty);


        super.onDraw(canvas);
    }
}
