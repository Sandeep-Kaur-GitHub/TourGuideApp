package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HistoricalBuildingsFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<Word> array_list = new ArrayList<Word>();
        array_list.add(new Word("Jagatjit Palace",getResources().getString(R.string.jagjitpalace),R.drawable.jagatjitpalace,"geo:31.360618167816483, 75.43969819313494"));
        array_list.add(new Word("Moorish Mosque",getResources().getString(R.string.mosquedetail),R.drawable.moorishmosque,"geo:31.375423641512636, 75.38073981097666"));
        array_list.add(new Word("Shalimar Gardens",getResources().getString(R.string.shalimardetail),R.drawable.shalimargardens,"geo:31.36351269899142, 75.43115171097642"));
        View view = inflater.inflate(R.layout.fragment_historical_buildings, container, false);
        ListView list_view = (ListView) view.findViewById(R.id.list_view);
        WordAdapter word_adapter = new WordAdapter(this, array_list);
        list_view.setAdapter(word_adapter);
        return view;

    }
}