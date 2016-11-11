package nmartinez016.univtln.fr.fantasyfootball.adapters;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.List;

import at.markushi.ui.CircleButton;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import nmartinez016.univtln.fr.fantasyfootball.R;
import nmartinez016.univtln.fr.fantasyfootball.dialogs.CCustomDialog;

/**
 * Created by marti on 01/08/2016.
 * Adapter for the listview containing
 * the players you get after searching with
 * some conditions.
 * Displays their team logo and some informations
 * about the players.
 */


public class CPlayersAdapter extends ArrayAdapter<CPlayerEntity> {
    public CPlayersAdapter(Context pContext, List<CPlayerEntity> pBets){
        super(pContext, 0, pBets);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_player, parent, false);
        }

        CPlayerViewHolder viewHolder = (CPlayerViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new CPlayerViewHolder();
            viewHolder.mPlayerClubLogo = (ImageView) convertView.findViewById(R.id.row_player_club_logo);
            viewHolder.mPlayerId = (TextView) convertView.findViewById(R.id.row_player_name);
            viewHolder.mPlayerAvailable = (TextView) convertView.findViewById(R.id.row_player_available);
            viewHolder.mCircleButton = (Button) convertView.findViewById(R.id.row_player_circlebutton);
            convertView.setTag(viewHolder);
        }

        final CPlayerEntity lPlayer = getItem(position);
        viewHolder.mPlayerId.setText(lPlayer.getFirstName() + " " + lPlayer.getLastName());
        viewHolder.mPlayerAvailable.setBackgroundResource(R.color.green);
        if (lPlayer.getTeam() != null){
            int lResId = getContext().getResources().getIdentifier(lPlayer.getTeam().getLogoPath(), "drawable", getContext().getPackageName());
            viewHolder.mPlayerClubLogo.setImageResource(lResId);
        }

        viewHolder.mCircleButton.setOnClickListener(new View.OnClickListener() {
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

    private class CPlayerViewHolder{
        public TextView mPlayerId;
        public TextView mPlayerAvailable;
        public ImageView mPlayerClubLogo;
        public Button mCircleButton;
    }
}