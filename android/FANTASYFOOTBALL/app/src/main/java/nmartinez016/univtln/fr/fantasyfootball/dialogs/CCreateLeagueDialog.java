package nmartinez016.univtln.fr.fantasyfootball.dialogs;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyLeagueEntity;
import nmartinez016.univtln.fr.fantasyfootball.R;

/**
 * Created by marti on 09/11/2016.
 */
public class CCreateLeagueDialog extends DialogFragment {
    private TextView mCreateLeagueNameTextView;
    private EditText mCreateLeagueEditText;
    private Button mCreateLeagueCheckAvailableNameButton;
    private ImageView mCreateLeagueNameAvailability;
    private TextView mCreateLeagueMaxCapacityTextView;
    private EditText mCreateLeagueMaxCapacityEditText;
    private TextView mCreateLeagueVisibilityTextView;
    private ToggleButton mPublicPrivateToggleButton;
    private Button mCreateLeagueButton;

    public CCreateLeagueDialog(){
        // empty constructor required
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        super.onCreateDialog(savedInstanceState);
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View lView = inflater.inflate(R.layout.dialog_create_league_view, null);
        final Activity host = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(lView);
        mCreateLeagueNameTextView = (TextView) lView.findViewById(R.id.create_league_dialog_name_textview);
        mCreateLeagueEditText = (EditText) lView.findViewById(R.id.create_league_dialog_name_edittext);
        mCreateLeagueCheckAvailableNameButton = (Button) lView.findViewById(R.id.create_league_dialog_check_available_button);
        mCreateLeagueMaxCapacityTextView = (TextView) lView.findViewById(R.id.create_league_dialog_maximum_capacity_textview);
        mCreateLeagueMaxCapacityEditText = (EditText) lView.findViewById(R.id.create_league_dialog_maximum_capacity_edittext);
        mCreateLeagueVisibilityTextView = (TextView) lView.findViewById(R.id.create_league_dialog_visibility_textview);
        mPublicPrivateToggleButton = (ToggleButton) lView.findViewById(R.id.create_league_dialog_visibility_togglebutton);
        mCreateLeagueButton = (Button) lView.findViewById(R.id.create_league_dialog_create_button);

        mCreateLeagueCheckAvailableNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // send request to check if name taken
                String lNameToCheck = "%" + mCreateLeagueEditText.getText().toString() + "%";
            }
        });

        mCreateLeagueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // send request to create league
                CFantasyLeagueEntity lLeague = new CFantasyLeagueEntity.CFantasyLeagueBuilder().name(mCreateLeagueNameTextView.getText().toString()).build();
            }
        });

        return builder.create();
    }

    public void checkAvailability(boolean pAvailable){
        if (pAvailable){
            // set image view to ok

        }
        else{
            // set image view to not ok

        }
        mCreateLeagueButton.setClickable(pAvailable);
    }
}
