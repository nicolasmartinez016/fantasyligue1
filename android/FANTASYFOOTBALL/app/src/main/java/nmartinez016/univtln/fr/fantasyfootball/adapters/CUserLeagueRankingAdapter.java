package nmartinez016.univtln.fr.fantasyfootball.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;
import nmartinez016.univtln.fr.fantasyfootball.CStaticVariables;
import nmartinez016.univtln.fr.fantasyfootball.R;

/**
 * Created by marti on 12/11/2016.
 */
public class CUserLeagueRankingAdapter extends ArrayAdapter<CUserEntity> {
    private List<CUserEntity> mUsers;
    private Context mContext;

    public CUserLeagueRankingAdapter(Context context, List<CUserEntity> pUsers) {
        super(context, 0, pUsers);
        mContext = context;
        mUsers = pUsers;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.user_ranking_row, parent, false);
        }

        CUserLeagueRankingHolder viewHolder = (CUserLeagueRankingHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new CUserLeagueRankingHolder();
            viewHolder.mUserId = (TextView) convertView.findViewById(R.id.user_ranking_row_id);
            viewHolder.mUserPoints = (TextView) convertView.findViewById(R.id.user_ranking_row_points);
            convertView.setTag(viewHolder);
        }
        CUserEntity lUser = getItem(position);
        viewHolder.mUserId.setText(lUser.getName());
        viewHolder.mUserPoints.setText(Integer.toString(lUser.getPointsByFantasyLeague(CStaticVariables.getFantasyLeagueToShowDetails())));
        return convertView;
    }

    private class CUserLeagueRankingHolder{
        private TextView mUserId;
        private TextView mUserPoints;
    }
}
