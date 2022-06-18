package com.example.tourguideapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class TabAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public TabAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            return new EducationFragment();
        }/*else if(position==1){
            return new EducationFragment();
        }
        else if(position==2){
            return new EducationFragment();
        }*/
        return new EducationFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title="hello";
     if(position==0){
            return mContext.getString(R.string.education);
        } else if(position==1)
        {
            return mContext.getString(R.string.restaurants);
        }
        else if(position==2)
        {
            return mContext.getString(R.string.historialbuildings);
        }else
        {
            return mContext.getString(R.string.accommodation);
        }
    }
}
