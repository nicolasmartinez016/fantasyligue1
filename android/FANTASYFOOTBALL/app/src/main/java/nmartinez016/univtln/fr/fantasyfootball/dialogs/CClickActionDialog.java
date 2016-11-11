package nmartinez016.univtln.fr.fantasyfootball.dialogs;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;

import fr.univtln.nmartinez016.fantasyfootball.entities.CPositionEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CYourPlayerEntry;
import nmartinez016.univtln.fr.fantasyfootball.CStaticVariables;
import nmartinez016.univtln.fr.fantasyfootball.R;
import nmartinez016.univtln.fr.fantasyfootball.activities.CTabsActivity;

/**
 * Created by marti on 27/09/2016.
 * Dialog to select after a click on the field
 * if you want to put a player in the position you just clicked,
 * move the player in the position you just clicked or
 * display the profile page of the player in the position
 * you just clicked.
 */
public class CClickActionDialog extends DialogFragment {

    private RadioButton mRadioButton1;
    private RadioButton mRadioButton2;
    private RadioButton mRadioButton3;
    private CPositionEntity mPosition;


    public CClickActionDialog(){}

    public static CClickActionDialog newInstance(CPositionEntity pPosition){
        CClickActionDialog lDialog = new CClickActionDialog();
        Bundle lArgs = new Bundle();
        lArgs.putSerializable("position", pPosition);
        lDialog.setArguments(lArgs);
        return lDialog;
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        super.onCreateDialog(savedInstanceState);
        mPosition = (CPositionEntity) getArguments().getSerializable("position");
        Log.i("move", "position initi : " + mPosition.getName());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View lView = inflater.inflate(R.layout.click_on_field_action, null);
        final Activity host = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setView(lView)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // sign in the user ...
                        if (mRadioButton1.isChecked()) {
                            // placer joueur
                            if (host instanceof CTabsActivity) {
                                ((CTabsActivity) host).openDialog(mPosition);
                            }
                        }
                        else if (mRadioButton2.isChecked()) {
                            // voir profil
                            Activity host = getActivity();
                            System.out.println("clic!");
                            DialogFragment lDialog = CCustomDialog.newInstance(CStaticVariables.getPlayerByPosition(mPosition));

                            lDialog.show(host.getFragmentManager(), "tag");
                        }
                        else if (mRadioButton3.isChecked()) {
                            if (host instanceof CTabsActivity) {
                                // deplacer joueur
                                Log.i("move", "player : " + CStaticVariables.getUser().getCurrentFantasyTeam().getPlayerByPosition(mPosition));
                                Log.i("move", "nb joueurs : " + CStaticVariables.getUser().getCurrentFantasyTeam().getYourPlayerEntries().size());
                                for (CYourPlayerEntry lYourPlayerEntry : CStaticVariables.getUser().getCurrentFantasyTeam().getYourPlayerEntries()){
                                    Log.i("move", "player : " + lYourPlayerEntry.getPlayer().getLastName() + "   - - - -   position : " + lYourPlayerEntry.getPosition().getName() + "\n");
                                }
                                ((CTabsActivity) host).beginMove(CStaticVariables.getUser().getCurrentFantasyTeam().getPlayerByPosition(mPosition));
                            }
                        }
                    }}).setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                CClickActionDialog.this.getDialog().cancel();
            }
        });

        mRadioButton1 = (RadioButton) lView.findViewById(R.id.click_on_field_action_radiobutton1);
        mRadioButton2 = (RadioButton) lView.findViewById(R.id.click_on_field_action_radiobutton2);
        mRadioButton3 = (RadioButton) lView.findViewById(R.id.click_on_field_action_radiobutton3);

        if (CStaticVariables.getUser().getCurrentFantasyTeam().getPlayerByPosition(mPosition) == null){
            mRadioButton2.setClickable(false);
            mRadioButton3.setClickable(false);
        }

        if (CStaticVariables.getUser().getCurrentFantasyTeam().getPlayerByPosition(mPosition) != null){
            mRadioButton1.setClickable(false);
        }

        mRadioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRadioButton2.setChecked(false);
                mRadioButton3.setChecked(false);
            }
        });

        mRadioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRadioButton1.setChecked(false);
                mRadioButton3.setChecked(false);
            }
        });

        mRadioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRadioButton1.setChecked(false);
                mRadioButton2.setChecked(false);
            }
        });

        return builder.create();
    }


}
