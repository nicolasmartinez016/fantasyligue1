package nmartinez016.univtln.fr.fantasyfootball.fragments;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayerMovedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayerPutOnFieldAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPositionEntity;
import nmartinez016.univtln.fr.fantasyfootball.CStaticVariables;
import nmartinez016.univtln.fr.fantasyfootball.R;
import nmartinez016.univtln.fr.fantasyfootball.views.CFieldView;
import nmartinez016.univtln.fr.fantasyfootball.websocket.CMessageHandler;


/**
 * A simple {@link Fragment} subclass.
 */
public class CSquadManagementFragment extends Fragment {
    private BroadcastReceiver mBroadCastReceiverWS;
    private CFieldView mFieldView;

    public CSquadManagementFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View lView =  inflater.inflate(R.layout.fragment_csquad_management, container, false);
        mFieldView = (CFieldView) lView.findViewById(R.id.footballfield);
        return lView;
    }

    @Override
    public void onResume() {
        super.onResume();
        mBroadCastReceiverWS = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent pIntent) {

                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CPlayerMovedAction.class.getName())){
                    CPlayerMovedAction lPlayerMovedAction = (CPlayerMovedAction) pIntent.getSerializableExtra(CMessageHandler.PLAYER_MOVED);
                    CStaticVariables.setUser(lPlayerMovedAction.getUser());
                    mFieldView.invalidate();
                    mFieldView.setState(0);
                }

                if (pIntent.getStringExtra(CMessageHandler.TYPE).equals(CPlayerPutOnFieldAction.class.getName())){
                    CPlayerPutOnFieldAction lPlayerPutOnFieldAction = (CPlayerPutOnFieldAction) pIntent.getSerializableExtra(CMessageHandler.PLAYER_PUT_ON_FIELD);
                    CStaticVariables.setUser(lPlayerPutOnFieldAction.getUser());
                    mFieldView.invalidate();
                }
            }
        };
        getContext().registerReceiver(mBroadCastReceiverWS, new IntentFilter(CMessageHandler.INTENT_TYPE));
    }

    public CFieldView getFieldView(){
        return mFieldView;
    }

    public void redraw(){
        mFieldView.invalidate();
    }

    public void beginMovePlayer(CPlayerEntity pPlayer){
        mFieldView.setState(1);
        mFieldView.setCurrentPlayer(pPlayer);
        mFieldView.invalidate();
    }

}
