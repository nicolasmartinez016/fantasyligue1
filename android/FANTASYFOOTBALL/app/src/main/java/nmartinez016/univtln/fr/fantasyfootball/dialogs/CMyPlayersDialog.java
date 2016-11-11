package nmartinez016.univtln.fr.fantasyfootball.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import fr.univtln.nmartinez016.fantasyfootball.actions.load.CPutPlayerOnField;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPositionEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CYourPlayerEntry;
import nmartinez016.univtln.fr.fantasyfootball.CStaticVariables;
import nmartinez016.univtln.fr.fantasyfootball.R;
import nmartinez016.univtln.fr.fantasyfootball.activities.CTabsActivity;
import nmartinez016.univtln.fr.fantasyfootball.websocket.CTyrusClient;

/**
 * Created by marti on 27/08/2016.
 * Dialog that appears after a select put a player
 * in the clickdialogaction. It shows the players the user
 * bought and has a radiobutton for each player to select him.
 */
public class CMyPlayersDialog extends DialogFragment {

    private ImageView mImagePlayer1;
    private ImageView mImagePlayer2;
    private ImageView mImagePlayer3;
    private ImageView mImagePlayer4;
    private ImageView mImagePlayer5;
    private ImageView mImagePlayer6;
    private ImageView mImagePlayer7;
    private ImageView mImagePlayer8;
    private ImageView mImagePlayer9;

    private TextView mNamePlayer1;
    private TextView mNamePlayer2;
    private TextView mNamePlayer3;
    private TextView mNamePlayer4;
    private TextView mNamePlayer5;
    private TextView mNamePlayer6;
    private TextView mNamePlayer7;
    private TextView mNamePlayer8;
    private TextView mNamePlayer9;

    private RadioButton mRadioPlayer1;
    private RadioButton mRadioPlayer2;
    private RadioButton mRadioPlayer3;
    private RadioButton mRadioPlayer4;
    private RadioButton mRadioPlayer5;
    private RadioButton mRadioPlayer6;
    private RadioButton mRadioPlayer7;
    private RadioButton mRadioPlayer8;
    private RadioButton mRadioPlayer9;

    private RelativeLayout mRelativeLayout1;
    private RelativeLayout mRelativeLayout2;
    private RelativeLayout mRelativeLayout3;
    private RelativeLayout mRelativeLayout4;
    private RelativeLayout mRelativeLayout5;
    private RelativeLayout mRelativeLayout6;
    private RelativeLayout mRelativeLayout7;
    private RelativeLayout mRelativeLayout8;

    private CPositionEntity mPosition;

    public CMyPlayersDialog(){}


    public static CMyPlayersDialog newInstance(CPositionEntity lPosition) {
        CMyPlayersDialog lFragment = new CMyPlayersDialog();

        // Supply num input as an argument.
        Bundle lArgs = new Bundle();
        lArgs.putSerializable("position", lPosition);
        lFragment.setArguments(lArgs);

        return lFragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        super.onCreateDialog(savedInstanceState);
        mPosition = (CPositionEntity) getArguments().getSerializable("position");
        System.out.println("dialog cree ?");
        LayoutInflater inflater = getActivity().getLayoutInflater();

        View lView = inflater.inflate(R.layout.myplayers_dialog_view, null);


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        final List<CYourPlayerEntry> lYourPlayerEntries = CStaticVariables.getUser().getCurrentFantasyTeam().getYourPlayerEntries();

        // Get the layout inflater

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(lView)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // sign in the user ...
                        CPlayerEntity lPlayer = null;
                        if (mRadioPlayer1.isChecked()){
                            lPlayer = lYourPlayerEntries.get(0).getPlayer();
                        }
                        else if (mRadioPlayer2.isChecked()){
                            lPlayer = lYourPlayerEntries.get(1).getPlayer();
                        }
                        else if (mRadioPlayer3.isChecked()){
                            lPlayer = lYourPlayerEntries.get(2).getPlayer();
                        }
                        else if (mRadioPlayer4.isChecked()){
                            lPlayer = lYourPlayerEntries.get(3).getPlayer();
                        }
                        else if (mRadioPlayer5.isChecked()){
                            lPlayer = lYourPlayerEntries.get(4).getPlayer();
                        }
                        else if (mRadioPlayer6.isChecked()){
                            lPlayer = lYourPlayerEntries.get(5).getPlayer();
                        }
                        else if (mRadioPlayer7.isChecked()){
                            lPlayer = lYourPlayerEntries.get(6).getPlayer();
                        }
                        else if (mRadioPlayer8.isChecked()){
                            lPlayer = lYourPlayerEntries.get(7).getPlayer();
                        }
                        if (lPlayer != null){
                            CTyrusClient.sendMessage(new CPutPlayerOnField.CPutPlayerOnFieldBuilder().user(CStaticVariables.getUser()).player(lPlayer).position(mPosition).build());
                        }
                        if (getActivity() instanceof CTabsActivity){
                            ((CTabsActivity) getActivity()).redraw();
                        }
                    }
                })
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        CMyPlayersDialog.this.getDialog().cancel();
                    }
                });
        Context lContext = getActivity();

        mImagePlayer1 = (ImageView) lView.findViewById(R.id.myplayers_image1);
        mImagePlayer2 = (ImageView) lView.findViewById(R.id.myplayers_image2);
        mImagePlayer3 = (ImageView) lView.findViewById(R.id.myplayers_image3);
        mImagePlayer4 = (ImageView) lView.findViewById(R.id.myplayers_image4);
        mImagePlayer5 = (ImageView) lView.findViewById(R.id.myplayers_image5);
        mImagePlayer6 = (ImageView) lView.findViewById(R.id.myplayers_image6);
        mImagePlayer7 = (ImageView) lView.findViewById(R.id.myplayers_image7);
        mImagePlayer8 = (ImageView) lView.findViewById(R.id.myplayers_image8);
        mImagePlayer9 = (ImageView) lView.findViewById(R.id.myplayers_image9);

        mNamePlayer1 = (TextView) lView.findViewById(R.id.myplayers_name1);
        mNamePlayer2 = (TextView) lView.findViewById(R.id.myplayers_name2);
        mNamePlayer3 = (TextView) lView.findViewById(R.id.myplayers_name3);
        mNamePlayer4 = (TextView) lView.findViewById(R.id.myplayers_name4);
        mNamePlayer5 = (TextView) lView.findViewById(R.id.myplayers_name5);
        mNamePlayer6 = (TextView) lView.findViewById(R.id.myplayers_name6);
        mNamePlayer7 = (TextView) lView.findViewById(R.id.myplayers_name7);
        mNamePlayer8 = (TextView) lView.findViewById(R.id.myplayers_name8);
        mNamePlayer9 = (TextView) lView.findViewById(R.id.myplayers_name9);

        mRadioPlayer1 = (RadioButton) lView.findViewById(R.id.myplayers_radiobutton1);
        mRadioPlayer2 = (RadioButton) lView.findViewById(R.id.myplayers_radiobutton2);
        mRadioPlayer3 = (RadioButton) lView.findViewById(R.id.myplayers_radiobutton3);
        mRadioPlayer4 = (RadioButton) lView.findViewById(R.id.myplayers_radiobutton4);
        mRadioPlayer5 = (RadioButton) lView.findViewById(R.id.myplayers_radiobutton5);
        mRadioPlayer6 = (RadioButton) lView.findViewById(R.id.myplayers_radiobutton6);
        mRadioPlayer7 = (RadioButton) lView.findViewById(R.id.myplayers_radiobutton7);
        mRadioPlayer8 = (RadioButton) lView.findViewById(R.id.myplayers_radiobutton8);
        mRadioPlayer9 = (RadioButton) lView.findViewById(R.id.myplayers_radiobutton9);

        mRadioPlayer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mRadioPlayer2.isChecked()){
                    mRadioPlayer2.setChecked(false);
                }
                if (mRadioPlayer3.isChecked()){
                    mRadioPlayer3.setChecked(false);
                }
                if (mRadioPlayer4.isChecked()){
                    mRadioPlayer4.setChecked(false);
                }
                if (mRadioPlayer5.isChecked()){
                    mRadioPlayer5.setChecked(false);
                }
                if (mRadioPlayer6.isChecked()){
                    mRadioPlayer6.setChecked(false);
                }
                if (mRadioPlayer7.isChecked()){
                    mRadioPlayer7.setChecked(false);
                }
                if (mRadioPlayer8.isChecked()){
                    mRadioPlayer8.setChecked(false);
                }
                if (mRadioPlayer9.isChecked()){
                    mRadioPlayer9.setChecked(false);
                }

            }
        });

        mRelativeLayout1 = (RelativeLayout) lView.findViewById(R.id.myplayers_player1_layout);
        mRelativeLayout2 = (RelativeLayout) lView.findViewById(R.id.myplayers_player2_layout);
        mRelativeLayout3 = (RelativeLayout) lView.findViewById(R.id.myplayers_player3_layout);
        mRelativeLayout4 = (RelativeLayout) lView.findViewById(R.id.myplayers_player4_layout);
        mRelativeLayout5 = (RelativeLayout) lView.findViewById(R.id.myplayers_player5_layout);
        mRelativeLayout6 = (RelativeLayout) lView.findViewById(R.id.myplayers_player6_layout);

        for (int i = 0; i < lYourPlayerEntries.size(); i++){
            int lResId = lContext.getResources().getIdentifier(lYourPlayerEntries.get(i).getPlayer().getPicturePath(), "drawable", lContext.getPackageName());
            if (i == 0){
                // Glide.with(this).load(lYourPlayerEntries.get(i).getPlayer().getPicturePath()).into(mImagePlayer1);
                mImagePlayer1.setImageResource(lResId);
                mNamePlayer1.setText(lYourPlayerEntries.get(i).getPlayer().getLastName());
                System.out.println("premier joueur fait!");
                if (lYourPlayerEntries.get(i).getPosition() != null){
                    mRelativeLayout1.setBackgroundColor(Color.GRAY);
                }
            }
            else if (i == 1){
                // Glide.with(this).load(lYourPlayerEntries.get(i).getPlayer().getPicturePath()).into(mImagePlayer2);
                mImagePlayer2.setImageResource(lResId);
                mNamePlayer2.setText(lYourPlayerEntries.get(i).getPlayer().getLastName());
                if (lYourPlayerEntries.get(i).getPosition() != null){
                    mRelativeLayout2.setBackgroundColor(Color.GRAY);
                }
            }
            else if (i == 2){
                // Glide.with(this).load(lYourPlayerEntries.get(i).getPlayer().getPicturePath()).into(mImagePlayer3);
                mImagePlayer3.setImageResource(lResId);
                mNamePlayer3.setText(lYourPlayerEntries.get(i).getPlayer().getLastName());
                if (lYourPlayerEntries.get(i).getPosition() != null){
                    mRelativeLayout3.setBackgroundColor(Color.GRAY);
                }
            }
            else if (i == 3){
                // Glide.with(this).load(lYourPlayerEntries.get(i).getPlayer().getPicturePath()).into(mImagePlayer4);
                mImagePlayer4.setImageResource(lResId);
                mNamePlayer4.setText(lYourPlayerEntries.get(i).getPlayer().getLastName());
                if (lYourPlayerEntries.get(i).getPosition() != null){
                    mRelativeLayout4.setBackgroundColor(Color.GRAY);
                }
            }
            else if (i == 4){
                // Glide.with(this).load(lYourPlayerEntries.get(i).getPlayer().getPicturePath()).into(mImagePlayer5);
                mImagePlayer5.setImageResource(lResId);
                mNamePlayer5.setText(lYourPlayerEntries.get(i).getPlayer().getLastName());
                if (lYourPlayerEntries.get(i).getPosition() != null){
                    mRelativeLayout5.setBackgroundColor(Color.GRAY);
                }
            }
            else if (i == 5){
                // Glide.with(this).load(lYourPlayerEntries.get(i).getPlayer().getPicturePath()).into(mImagePlayer6);
                mImagePlayer6.setImageResource(lResId);
                mNamePlayer6.setText(lYourPlayerEntries.get(i).getPlayer().getLastName());
                if (lYourPlayerEntries.get(i).getPosition() != null){
                    mRelativeLayout6.setBackgroundColor(Color.GRAY);
                }
            }
            else if (i == 6){
                // Glide.with(this).load(lYourPlayerEntries.get(i).getPlayer().getPicturePath()).into(mImagePlayer7);
                mImagePlayer7.setImageResource(lResId);
                mNamePlayer7.setText(lYourPlayerEntries.get(i).getPlayer().getLastName());
                if (lYourPlayerEntries.get(i).getPosition() != null){
                    mRelativeLayout7.setBackgroundColor(Color.GRAY);
                }
            }
            else if (i == 7){
                // Glide.with(this).load(lYourPlayerEntries.get(i).getPlayer().getPicturePath()).into(mImagePlayer8);
                mImagePlayer8.setImageResource(lResId);
                mNamePlayer8.setText(lYourPlayerEntries.get(i).getPlayer().getLastName());
                if (lYourPlayerEntries.get(i).getPosition() != null){
                    mRelativeLayout8.setBackgroundColor(Color.GRAY);
                }
            }
            else if (i == 8){
                // Glide.with(this).load(lYourPlayerEntries.get(i).getPlayer().getPicturePath()).into(mImagePlayer99);
                mImagePlayer9.setImageResource(lResId);
                mNamePlayer9.setText(lYourPlayerEntries.get(i).getPlayer().getLastName());
            }
        }

        for (int i = lYourPlayerEntries.size(); i < 9; i++){
            if (i == 0){
                // Glide.with(this).load("picture_unknown").into(mImagePlayer1);
                mImagePlayer1.setImageDrawable(getResources().getDrawable(R.drawable.picture_unknown));
                mNamePlayer1.setText("personne");
            }
            else if (i == 1){
                // Glide.with(this).load("picture_unknown").into(mImagePlayer2);
                mImagePlayer2.setImageDrawable(getResources().getDrawable(R.drawable.picture_unknown));
                mNamePlayer2.setText("personne");
            }
            else if (i == 2){
                // Glide.with(this).load("picture_unknown").into(mImagePlayer3);
                mImagePlayer3.setImageDrawable(getResources().getDrawable(R.drawable.picture_unknown));
                mNamePlayer3.setText("personne");
            }
            else if (i == 3){
                // Glide.with(this).load("picture_unknown").into(mImagePlayer4);
                mImagePlayer4.setImageDrawable(getResources().getDrawable(R.drawable.picture_unknown));
                mNamePlayer4.setText("personne");
            }
            else if (i == 4){
                // Glide.with(this).load("picture_unknown").into(mImagePlayer5);
                mImagePlayer5.setImageDrawable(getResources().getDrawable(R.drawable.picture_unknown));
                mNamePlayer5.setText("personne");
            }
            else if (i == 5){
                // Glide.with(this).load("picture_unknown").into(mImagePlayer6);
                mImagePlayer6.setImageDrawable(getResources().getDrawable(R.drawable.picture_unknown));
                mNamePlayer6.setText("personne");
            }
            else if (i == 6){
                // Glide.with(this).load("picture_unknown").into(mImagePlayer7);
                mImagePlayer7.setImageDrawable(getResources().getDrawable(R.drawable.picture_unknown));
                mNamePlayer7.setText("personne");
            }
            else if (i == 7){
                // Glide.with(this).load("picture_unknown").into(mImagePlayer8);
                mImagePlayer8.setImageDrawable(getResources().getDrawable(R.drawable.picture_unknown));
                mNamePlayer8.setText("personne");
            }
            else if (i == 8){
                // Glide.with(this).load("picture_unknown").into(mImagePlayer9);
                mImagePlayer9.setImageDrawable(getResources().getDrawable(R.drawable.picture_unknown));
                mNamePlayer9.setText("personne");
            }
        }
        return builder.create();
    }
}
