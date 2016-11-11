package nmartinez016.univtln.fr.fantasyfootball.adapters;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import fr.univtln.nmartinez016.fantasyfootball.entities.CTeamEntity;
import nmartinez016.univtln.fr.fantasyfootball.R;

/**
 * Created by marti on 06/08/2016.
 * Adapter for the spinner containing all the teams
 * (including the team undefined)
 * Used to select the team to sort the players by in the research fragment.
 */

public class CTeamsAdapter extends ArrayAdapter<CTeamEntity> {

    private List<CTeamEntity> mTeams;
    private Context mContext;

    public CTeamsAdapter(Context pContext, List<CTeamEntity> pTeams) {
        super(pContext, 0, pTeams);
        mTeams = pTeams;
        mContext = pContext;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_team, parent, false);
        }

        CTeamViewHolder viewHolder = (CTeamViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new CTeamViewHolder();
            viewHolder.mTeamName = (TextView) convertView.findViewById(R.id.row_team_name);
            viewHolder.mTeamLogo = (ImageView) convertView.findViewById(R.id.row_team_image);
            convertView.setTag(viewHolder);
        }

        CTeamEntity lTeam = getItem(position);

        viewHolder.mTeamName.setText(lTeam.getName());
        int lResId = getContext().getResources().getIdentifier(lTeam.getLogoPath(), "drawable", getContext().getPackageName());
        viewHolder.mTeamLogo.setImageResource(lResId);
        return convertView;
    }


    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView lLabel = new TextView(mContext);
        lLabel.setTextColor(Color.BLACK);
        lLabel.setText(mTeams.get(position).getName());

        return lLabel;
    }

    private class CTeamViewHolder{
        public TextView mTeamName;
        public ImageView mTeamLogo;
    }
}
