package nmartinez016.univtln.fr.fantasyfootball.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import nmartinez016.univtln.fr.fantasyfootball.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CLeagueManagementFragment extends Fragment {
    private ListView mLeaguesListView;
    private Button mCreateLeagueButton;
    private Button mShowPublicLeaguesButton;

    public CLeagueManagementFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View lRootView = inflater.inflate(R.layout.fragment_cleague_management, container, false);

        mLeaguesListView = (ListView) lRootView.findViewById(R.id.league_management_listview);
        mCreateLeagueButton = (Button) lRootView.findViewById(R.id.league_management_create_league);
        mShowPublicLeaguesButton = (Button) lRootView.findViewById(R.id.league_management_public_leagues);
        return inflater.inflate(R.layout.fragment_cleague_management, container, false);
    }

}
