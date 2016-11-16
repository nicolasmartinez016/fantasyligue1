package nmartinez016.univtln.fr.fantasyfootball.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import fr.univtln.nmartinez016.fantasyfootball.actions.load.CJoinFantasyLeagueAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyLeagueEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyTeamEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPositionEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;
import nmartinez016.univtln.fr.fantasyfootball.CStaticVariables;
import nmartinez016.univtln.fr.fantasyfootball.R;
import nmartinez016.univtln.fr.fantasyfootball.adapters.CUserLeagueRankingAdapter;
import nmartinez016.univtln.fr.fantasyfootball.websocket.CTyrusClient;

/**
 * Created by marti on 12/11/2016.
 */
public class CLeagueDetailDialog extends DialogFragment {

    CFantasyLeagueEntity mFantasyLeague;
    private ListView mListView;
    private Button mButton;

    public CLeagueDetailDialog(){}

    public static CLeagueDetailDialog newInstance(CFantasyLeagueEntity pLeague){
        CLeagueDetailDialog lDialog = new CLeagueDetailDialog();
        Bundle lArgs = new Bundle();
        lArgs.putSerializable("league", pLeague);
        lDialog.setArguments(lArgs);
        return lDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        super.onCreateDialog(savedInstanceState);
        List<CUserEntity> lUsers = new ArrayList<>();
        mFantasyLeague = (CFantasyLeagueEntity) getArguments().getSerializable("league");
        System.out.println("dialog cree ?");
        LayoutInflater inflater = getActivity().getLayoutInflater();

        View lView = inflater.inflate(R.layout.league_detail_dialog_view, null);
        mListView = (ListView) lView.findViewById(R.id.league_detail_dialog_list_view);
        for (CFantasyTeamEntity lTeams : mFantasyLeague.getFantasyTeams()){
            lUsers.add(lTeams.getUser());
        }
        mListView.setAdapter(new CUserLeagueRankingAdapter(getActivity(), lUsers));
        mButton = (Button) lView.findViewById(R.id.league_detail_dialog_join_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CTyrusClient.sendMessage(new CJoinFantasyLeagueAction.CJoinFantasyLeagueBuilder().fantasyLeagueId(mFantasyLeague).user(CStaticVariables.getUser()).build());
            }
        });




        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(lView);
        return builder.create();
    }
}
