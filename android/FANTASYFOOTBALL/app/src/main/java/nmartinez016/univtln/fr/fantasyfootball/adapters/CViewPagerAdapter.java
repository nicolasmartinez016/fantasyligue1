package nmartinez016.univtln.fr.fantasyfootball.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 02/09/2016.
 * Adapter for the viewpager to switch between
 * the fragments simply by swiping right or left.
 */
public class CViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> mFragments = new ArrayList<>();
    List<String> mTabTitles = new ArrayList<>();

    public void addFragment(Fragment pFragment, String pTitle){
        mFragments.add(pFragment);
        mTabTitles.add(pTitle);
    }

    public CViewPagerAdapter(FragmentManager pFragmentManager){
        super(pFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles.get(position);
    }
}
