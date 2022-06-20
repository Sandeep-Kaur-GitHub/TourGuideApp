package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tab_layout= findViewById(R.id.tab_layout);
        ViewPager view_pager=findViewById(R.id.view_pager);

        TabAdapter tab_adapter= new TabAdapter(this, getSupportFragmentManager());
        view_pager.setAdapter(tab_adapter);
        tab_layout.setupWithViewPager(view_pager);
    }
}