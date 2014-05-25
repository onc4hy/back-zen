package com.houyalab.android.backzen.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.houyalab.android.backzen.ui.DepositoryFragment;
import com.houyalab.android.backzen.ui.MeditationFragment;
import com.houyalab.android.backzen.ui.StatsFragment;

import java.util.ArrayList;
import java.util.Locale;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    public ArrayList<Fragment> fragmentList;

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
        fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new MeditationFragment());
        fragmentList.add(new DepositoryFragment());
        fragmentList.add(new StatsFragment());
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position < fragmentList.size()) {
            fragment = fragmentList.get(position);
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //return getItem(position).getTitle();
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "title_section_meditation".toUpperCase(l);
            case 1:
                return "title_section_depository".toUpperCase(l);
            case 2:
                return "title_section_stats".toUpperCase(l);
        }
        return null;
    }
}
