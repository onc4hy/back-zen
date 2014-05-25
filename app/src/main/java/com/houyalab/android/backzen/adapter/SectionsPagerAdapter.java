package com.houyalab.android.backzen.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.houyalab.android.backzen.ui.DepositoryFragment;
import com.houyalab.android.backzen.ui.MeditationFragment;
import com.houyalab.android.backzen.ui.PlaceholderFragment;

import java.util.Locale;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return MeditationFragment.newInstance("","");
//                return getString(R.string.title_section1).toUpperCase(l);
            case 1:
                return DepositoryFragment.newInstance("","");
//                return getString(R.string.title_section2).toUpperCase(l);
            case 2:
                return StatsFragment.newInstance("","");
//                return getString(R.string.title_section3).toUpperCase(l);
        }
//        return PlaceholderFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
//                return getString(R.string.title_section1).toUpperCase(l);
            case 1:
//                return getString(R.string.title_section2).toUpperCase(l);
            case 2:
//                return getString(R.string.title_section3).toUpperCase(l);
        }
        return null;
    }
}
