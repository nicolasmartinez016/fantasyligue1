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
import android.widget.Toast;

import java.util.List;

import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import nmartinez016.univtln.fr.fantasyfootball.R;
import nmartinez016.univtln.fr.fantasyfootball.dialogs.CCustomDialog;

/**
 * Created by marti on 27/09/2016.
 * Adapter for the listview containing the 15
 * best goal scorers. Displays their name, and some stats
 * about their goal scoring ratio.
 */
public class CGoalsRankingAdapter extends ArrayAdapter<CPlayerEntity> {

    public CGoalsRankingAdapter(Context pContext, List<CPlayerEntity> pPlayers){
        super(pContext, 0, pPlayers);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_player_by_goals, parent, false);
        }

        CGoalsByPlayerViewHolder viewHolder = (CGoalsByPlayerViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new CGoalsByPlayerViewHolder();
            viewHolder.mPlayerClubLogo = (ImageView) convertView.findViewById(R.id.row_playerbygoals_club_logo);
            viewHolder.mPlayerId = (TextView) convertView.findViewById(R.id.row_playerbygoals_name);
            viewHolder.mGoalsScored = (TextView) convertView.findViewById(R.id.row_playerbygoals_goals);
            viewHolder.mProfileButton = (Button) convertView.findViewById(R.id.row_playerbygoals_profilebutton);
            convertView.setTag(viewHolder);
        }

        final CPlayerEntity lPlayer = getItem(position);
        viewHolder.mPlayerId.setText(lPlayer.getFirstName() + " " + lPlayer.getLastName());
        viewHolder.mGoalsScored.setText(Integer.toString(lPlayer.getGoals()) + " (" + Integer.toString(lPlayer.getPenaltiesScored()) + " sp)" + " buts en " + Integer.toString(lPlayer.getMinutesPlayed()) + " minutes");
        if (lPlayer.getTeam() != null){
            int lResId = getContext().getResources().getIdentifier(lPlayer.getTeam().getLogoPath(), "drawable", getContext().getPackageName());
            viewHolder.mPlayerClubLogo.setImageResource(lResId);
        }

        viewHolder.mProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity host = (Activity) getContext();
                System.out.println("clic!");
                //DialogFragment lDialog = new CCustomDialog(lPlayer);
                DialogFragment lDialog = CCustomDialog.newInstance(lPlayer);
                lDialog.show(host.getFragmentManager(), "tag");
                Toast.makeText(getContext(), "clic sur button " + lPlayer.getLastName(), Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }

    private class CGoalsByPlayerViewHolder{
        public TextView mPlayerId;
        public TextView mGoalsScored;
        public ImageView mPlayerClubLogo;
        public Button mProfileButton;
    }
}
