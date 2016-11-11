package nmartinez016.univtln.fr.fantasyfootball.adapters;

import android.content.Context;
import android.content.Intent;
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
 * Created by marti on 06/09/2016.
 * Adapter for the listview containing the teams.
 * Used in order to display the current ranking.
 */
public class CTeamsRankingAdapter extends ArrayAdapter<CTeamEntity> {

    private List<CTeamEntity> mTeams;
    private Context mContext;

    public CTeamsRankingAdapter(Context pContext, List<CTeamEntity> pTeams) {
        super(pContext, 0, pTeams);
        mTeams = pTeams;
        mContext = pContext;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.teams_ranking_row, parent, false);
        }

        CTeamViewHolder viewHolder = (CTeamViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new CTeamViewHolder();
            viewHolder.mTeamName = (TextView) convertView.findViewById(R.id.teams_ranking_name);
            viewHolder.mTeamLogo = (ImageView) convertView.findViewById(R.id.teams_ranking_logo);
            viewHolder.mTeamPoints = (TextView) convertView.findViewById(R.id.teams_ranking_points);
            viewHolder.mTeamPlayed = (TextView) convertView.findViewById(R.id.teams_ranking_weeks);
            viewHolder.mTeamWins = (TextView) convertView.findViewById(R.id.teams_ranking_wins);
            viewHolder.mTeamDraws = (TextView) convertView.findViewById(R.id.teams_ranking_draws);
            viewHolder.mTeamLosses = (TextView) convertView.findViewById(R.id.teams_ranking_losses);
            viewHolder.mTeamScored = (TextView) convertView.findViewById(R.id.teams_ranking_scored);
            viewHolder.mTeamConceded = (TextView) convertView.findViewById(R.id.teams_ranking_conceded);
            viewHolder.mTeamGoalAverage = (TextView) convertView.findViewById(R.id.teams_ranking_goalaverage);
            convertView.setTag(viewHolder);
        }

        CTeamEntity lTeam = getItem(position);

        viewHolder.mTeamName.setText(lTeam.getName());
        System.out.println("-> " + lTeam.getLogoPath() + "<- ");
        Log.i("tag", "-> " + lTeam.getLogoPath() + "<- ");
        int lResId = getContext().getResources().getIdentifier(lTeam.getLogoPath(), "drawable", getContext().getPackageName());
        viewHolder.mTeamLogo.setImageResource(lResId);
        viewHolder.mTeamPoints.setText(Integer.toString(lTeam.getPoints()));
        viewHolder.mTeamPlayed.setText(Integer.toString(lTeam.getPlayedGames()));
        viewHolder.mTeamWins.setText(Integer.toString(lTeam.getWins()));
        viewHolder.mTeamDraws.setText(Integer.toString(lTeam.getDraws()));
        viewHolder.mTeamLosses.setText(Integer.toString(lTeam.getLosses()));
        viewHolder.mTeamScored.setText(Integer.toString(lTeam.getScoredGoals()));
        viewHolder.mTeamConceded.setText(Integer.toString(lTeam.getConceidedGoals()));
        viewHolder.mTeamGoalAverage.setText(Integer.toString(lTeam.getGoalAverage()));

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
        public TextView mTeamPlayed;
        public TextView mTeamWins;
        public TextView mTeamDraws;
        public TextView mTeamLosses;
        public TextView mTeamScored;
        public TextView mTeamConceded;
        public TextView mTeamGoalAverage;
        public TextView mTeamPoints;
    }

}
