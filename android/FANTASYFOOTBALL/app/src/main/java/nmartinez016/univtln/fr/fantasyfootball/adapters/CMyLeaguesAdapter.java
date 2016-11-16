package nmartinez016.univtln.fr.fantasyfootball.adapters;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import fr.univtln.nmartinez016.fantasyfootball.actions.load.CSelectFantasyLeagueAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyLeagueEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import nmartinez016.univtln.fr.fantasyfootball.CStaticVariables;
import nmartinez016.univtln.fr.fantasyfootball.R;
import nmartinez016.univtln.fr.fantasyfootball.dialogs.CLeagueDetailDialog;
import nmartinez016.univtln.fr.fantasyfootball.websocket.CTyrusClient;

/**
 * Created by marti on 08/11/2016.
 */
public class CMyLeaguesAdapter extends ArrayAdapter<CFantasyLeagueEntity> {

    public CMyLeaguesAdapter(Context pContext, List<CFantasyLeagueEntity> pFantasyLeagues) {
        super(pContext, 0, pFantasyLeagues);
    }

    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_my_leagues, parent, false);
        }

        CMyLeaguesViewHolder viewHolder = (CMyLeaguesViewHolder) convertView.getTag();
        if (viewHolder == null) {
            final Activity host = (Activity) getContext();
            viewHolder = new CMyLeaguesViewHolder();
            viewHolder.mLeagueName = (TextView) convertView.findViewById(R.id.row_myleagues_name);
            viewHolder.mLeagueCapacity = (TextView) convertView.findViewById(R.id.row_myleagues_capacity);
            viewHolder.mDetailLeagueButotn = (Button) convertView.findViewById(R.id.row_myleagues_detail);
            viewHolder.mSelectLeagueButton = (Button) convertView.findViewById(R.id.row_myleagues_select);
            viewHolder.mDetailLeagueButotn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CStaticVariables.setFantasyLeagueToShowDetails(getItem(position));
                    DialogFragment lDetailDialog = CLeagueDetailDialog.newInstance(getItem(position));
                    lDetailDialog.show(host.getFragmentManager(), "tag");

                }
            });
            viewHolder.mSelectLeagueButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CTyrusClient.sendMessage(new CSelectFantasyLeagueAction.CSelectFantasyLeagueBuilder().fantasyTeam(getItem(position).getFantasyTeamByUser(CStaticVariables.getUser())).user(CStaticVariables.getUser()).build());
                }
            });
            convertView.setTag(viewHolder);
        }
        final CFantasyLeagueEntity lLeague = getItem(position);
        viewHolder.mLeagueName.setText(lLeague.getName());
        viewHolder.mLeagueCapacity.setText(Integer.toString(lLeague.getCapacity()));
        return convertView;

    }

    private class CMyLeaguesViewHolder{
        public TextView mLeagueName;
        public TextView mLeagueCapacity;
        public Button mDetailLeagueButotn;
        public Button mSelectLeagueButton;
    }
}