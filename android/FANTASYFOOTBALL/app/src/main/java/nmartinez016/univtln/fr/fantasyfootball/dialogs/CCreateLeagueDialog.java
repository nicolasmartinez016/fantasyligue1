package nmartinez016.univtln.fr.fantasyfootball.dialogs;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.load.CCheckLeagueNameAvailability;
import fr.univtln.nmartinez016.fantasyfootball.actions.load.CCreateLeagueAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CFantasyLeagueJoinedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPublicFantasyLeaguesLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CReturnLeagueNameAvailable;
import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyLeagueEntity;
import nmartinez016.univtln.fr.fantasyfootball.CStaticVariables;
import nmartinez016.univtln.fr.fantasyfootball.R;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CMyLeaguesAdapter;
import nmartinez016.univtln.fr.fantasyfootball.websocket.CMessageHandler;
import nmartinez016.univtln.fr.fantasyfootball.websocket.CTyrusClient;

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
    private BroadcastReceiver mBroadCastReceiverWS;


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
                String lNameToCheck = mCreateLeagueEditText.getText().toString();
                CTyrusClient.sendMessage(new CCheckLeagueNameAvailability(lNameToCheck
                ));
            }
        });

        mCreateLeagueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // send request to create league
                int lVisibility = 0;
                if (mPublicPrivateToggleButton.isChecked()){
                    lVisibility = CFantasyLeagueEntity.VISIBILITY_PUBLIC;
                }
                else{
                    lVisibility = CFantasyLeagueEntity.VISIBILITY_PRIVATE;
                }
                CFantasyLeagueEntity lLeague = new CFantasyLeagueEntity.CFantasyLeagueBuilder().name(mCreateLeagueEditText.getText().toString()).visibility(lVisibility).capacity(Integer.parseInt(mCreateLeagueMaxCapacityEditText.getText().toString())).build();
                CAction lCreateLeague = new CCreateLeagueAction.CCreateLeagueBuilder().fantasyLeague(lLeague).creator(CStaticVariables.getUser()).build();
                CTyrusClient.sendMessage(lCreateLeague);
                getDialog().cancel();

            }
        });

        mCreateLeagueButton.setEnabled(false);

        return builder.create();
    }

    public void checkAvailability(boolean pAvailable){
        if (pAvailable){
            // set image view to ok
            mCreateLeagueButton.setEnabled(true);
        }
        else{
            // set image view to not ok

        }
        mCreateLeagueButton.setClickable(pAvailable);
    }

    @Override
    public void onResume() {
        super.onResume();
        mBroadCastReceiverWS = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent pIntent) {
                // show public leagues
                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CReturnLeagueNameAvailable.class.getName())){
                    CReturnLeagueNameAvailable lReturnLeagueNameAvailable = (CReturnLeagueNameAvailable) pIntent.getSerializableExtra(CMessageHandler.RETURN_LEAGUE_NAME_AVAILABLE);
                    checkAvailability(lReturnLeagueNameAvailable.isAvailable());
                }

            }
        };
        getActivity().registerReceiver(mBroadCastReceiverWS, new IntentFilter(CMessageHandler.INTENT_TYPE));
    }

    @Override
    public void onPause() {
        super.onPause();
        getActivity().unregisterReceiver(mBroadCastReceiverWS);
    }
}
