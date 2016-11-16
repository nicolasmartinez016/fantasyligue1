package nmartinez016.univtln.fr.fantasyfootball.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.load.CBuyPlayerAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyTeamEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CYourPlayerEntry;
import nmartinez016.univtln.fr.fantasyfootball.CStaticVariables;
import nmartinez016.univtln.fr.fantasyfootball.R;
import nmartinez016.univtln.fr.fantasyfootball.views.CPlayerPositionsOnFieldView;
import nmartinez016.univtln.fr.fantasyfootball.websocket.CTyrusClient;

/**
 * Created by marti on 30/07/2016.
 * Dialog to display the profile of the player selected.
 * The profile contains the positions where he can play, his last games,
 * his name, his age, his picture, etc.
 */
public class CCustomDialog extends DialogFragment {

    public static CPlayerEntity mPlayer;

    private TextView mLastNameTextView;
    private TextView mFirstNameTextView;
    private ImageView mPlayerImageView;
    private ImageView mGoalsImageView;
    private ImageView mAssistsImageView;
    private ImageView mCardsImageView;
    private TextView mAgeTextView;
    private TextView mGoalsTextView;
    private TextView mAssistsTextView;
    private TextView mCardsTextView;
    private TextView mMinutesPlayedTextView;
    private TextView mAvgGradeTextView;
    private ImageView m1MatchAgoTextView;
    private ImageView m2MatchesAgoTextView;
    private ImageView m3MatchesAgoTextView;
    private ImageView m4MatchesAgoTextView;
    private ImageView m5MatchesAgoTextView;
    private ImageView mPriceImageView;
    private TextView mPriceTextView;
    private ImageView mClubLogoImageView;
    private TextView mPlayerOwnerTextView;
    private Button mBuyPlayerButton;
    private CPlayerPositionsOnFieldView mPlayerPositionsOnFieldView;

    public CCustomDialog(){
        mPlayer = null;
    }
/*
    public CCustomDialog(CPlayerEntity pPlayer){
        mPlayer = pPlayer;
    }*/

    /*
     * instanciate the dialog while passing the player as an argument
     */

    public static CCustomDialog newInstance(CPlayerEntity pPlayer){
        CCustomDialog lDialog = new CCustomDialog();
        Bundle lArgs = new Bundle();
        lArgs.putSerializable("player", pPlayer);
        lDialog.setArguments(lArgs);
        return lDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        super.onCreateDialog(savedInstanceState);
        mPlayer = (CPlayerEntity) getArguments().getSerializable("player");


        LayoutInflater inflater = getActivity().getLayoutInflater();

        View lView = inflater.inflate(R.layout.dialog_view, null);


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(lView)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // sign in the user ...
                    }
                })
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        CCustomDialog.this.getDialog().cancel();
                    }
                });
        mFirstNameTextView = (TextView)lView.findViewById(R.id.dialog_firstname);
        mFirstNameTextView.setText(mPlayer.getFirstName());

        mLastNameTextView = (TextView) lView.findViewById(R.id.dialog_lastname);
        mLastNameTextView.setText(mPlayer.getLastName());

        mPlayerImageView = (ImageView) lView.findViewById(R.id.dialog_player_image);
        // Glide.with(this).load(mPlayer.getPicturePath()).into(mAssistsImageView);

        mPlayerPositionsOnFieldView = (CPlayerPositionsOnFieldView)lView.findViewById(R.id.dialog_field);
        final Context lContext = getActivity();
        int lResId = lContext.getResources().getIdentifier(mPlayer.getPicturePath(), "drawable", lContext.getPackageName());
        mPlayerImageView.setImageResource(lResId);
        // Glide.with(this).load(mPlayer.getPicturePath()).into(mAssistsImageView);


        mAssistsImageView = (ImageView) lView.findViewById(R.id.dialog_assists_icon);
        // Glide.with(this).load("assist_icon").into(mAssistsImageView);
        mAssistsImageView.setImageDrawable(getResources().getDrawable(R.drawable.assist_icon));

        mGoalsImageView = (ImageView) lView.findViewById(R.id.dialog_goals_icon);
        // Glide.with(this).load("goal_icon").into(mAssistsImageView);
        mGoalsImageView.setImageDrawable(getResources().getDrawable(R.drawable.goal_icon));

        mCardsImageView = (ImageView) lView.findViewById(R.id.dialog_cards_icon);
        // Glide.with(this).load("goal_icon").into(mAssistsImageView);
        mCardsImageView.setImageDrawable(getResources().getDrawable(R.drawable.cards_icon));

        mAgeTextView = (TextView) lView.findViewById(R.id.dialog_age);
        mAgeTextView.setText(mPlayer.getAge() + " ans");

        mGoalsTextView = (TextView) lView.findViewById(R.id.dialog_goals_textview);
        mGoalsTextView.setText(" " + Integer.toString(mPlayer.getGoals()));

        mAssistsTextView = (TextView) lView.findViewById(R.id.dialog_assists_textview);
        mAssistsTextView.setText(" " + mPlayer.getAssists());

        mCardsTextView  = (TextView) lView.findViewById(R.id.dialog_cards_textview);
        mCardsTextView.setText(" " + mPlayer.getYellowCards() + " / " + mPlayer.getRedCards());

        mMinutesPlayedTextView = (TextView) lView.findViewById(R.id.dialog_minutes_played_textview);
        mMinutesPlayedTextView.setText("minutes : " + mPlayer.getMinutesPlayed());

        mAvgGradeTextView = (TextView) lView.findViewById(R.id.dialog_avg_grade);
        mAvgGradeTextView.setText("points : " + mPlayer.getPointsByWeekAt(1));

        m1MatchAgoTextView = (ImageView) lView.findViewById(R.id.dialog_1match_ago);
        m1MatchAgoTextView.setImageDrawable(getResources().getDrawable(R.drawable.win_icon));

        m2MatchesAgoTextView = (ImageView) lView.findViewById(R.id.dialog_2matches_ago);
        m2MatchesAgoTextView.setImageDrawable(getResources().getDrawable(R.drawable.unplayed_icon));

        m3MatchesAgoTextView = (ImageView) lView.findViewById(R.id.dialog_3matches_ago);
        m3MatchesAgoTextView.setImageDrawable(getResources().getDrawable(R.drawable.unplayed_icon));

        m4MatchesAgoTextView = (ImageView) lView.findViewById(R.id.dialog_4matches_ago);
        m4MatchesAgoTextView.setImageDrawable(getResources().getDrawable(R.drawable.unplayed_icon));

        m5MatchesAgoTextView = (ImageView) lView.findViewById(R.id.dialog_5matches_ago);
        m5MatchesAgoTextView.setImageDrawable(getResources().getDrawable(R.drawable.unplayed_icon));

        mPriceImageView = (ImageView) lView.findViewById(R.id.dialog_price_icon);
        mPriceImageView.setImageDrawable(getResources().getDrawable(R.drawable.price_icon));

        mPriceTextView = (TextView) lView.findViewById(R.id.dialog_price_textview);
        mPriceTextView.setText(" 50 ");

        mClubLogoImageView = (ImageView) lView.findViewById(R.id.dialog_club_logo);
        int lResIdClub = lContext.getResources().getIdentifier(mPlayer.getTeam().getLogoPath(), "drawable", lContext.getPackageName());
        mClubLogoImageView.setImageResource(lResIdClub);

        mPlayerOwnerTextView = (TextView) lView.findViewById(R.id.dialog_player_owner_textview);
        mPlayerOwnerTextView.setText("appartient a : nico");

        mBuyPlayerButton = (Button) lView.findViewById(R.id.dialog_buy_button);
        mBuyPlayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CAction lBuyPlayer = new CBuyPlayerAction.CBuyPlayerBuilder().user(CStaticVariables.getUser()).player(mPlayer).build();
                CTyrusClient.sendMessage(lBuyPlayer);
            }
        });

        return builder.create();
    }

    public CPlayerEntity getPlayer(){
        return mPlayer;
    }


}
