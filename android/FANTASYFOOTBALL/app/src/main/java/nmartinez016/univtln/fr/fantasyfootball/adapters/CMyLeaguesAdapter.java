package nmartinez016.univtln.fr.fantasyfootball.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyLeagueEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import nmartinez016.univtln.fr.fantasyfootball.R;

/**
 * Created by marti on 08/11/2016.
 */
public class CMyLeaguesAdapter extends ArrayAdapter<CFantasyLeagueEntity> {

    public CMyLeaguesAdapter(Context pContext, List<CFantasyLeagueEntity> pFantasyLeagues) {
        super(pContext, 0, pFantasyLeagues);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_my_leagues, parent, false);
        }

        CMyLeaguesViewHolder viewHolder = (CMyLeaguesViewHolder) convertView.getTag();
        if (viewHolder == null) {
            viewHolder = new CMyLeaguesViewHolder();
            viewHolder.mLeagueName = (TextView) convertView.findViewById(R.id.row_myleagues_name);
            viewHolder.mLeagueCapacity = (TextView) convertView.findViewById(R.id.row_myleagues_capacity);
            viewHolder.mCreateLeague = (Button) convertView.findViewById(R.id.row_myleagues_detail);
            convertView.setTag(viewHolder);
        }
        return convertView;

    }

    private class CMyLeaguesViewHolder{
        public TextView mLeagueName;
        public TextView mLeagueCapacity;
        public Button mCreateLeague;
    }
}