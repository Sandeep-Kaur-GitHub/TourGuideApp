package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class EventsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<Word> array_list = new ArrayList<Word>();
        array_list.add(new Word("Baba Sodal Mandir Mela","Date, 17 September 2022",0,""));
        array_list.add(new Word("International Webinar on Multidisciplinary","Wed, 22 – Thu, 23 Jun",0,""));
        array_list.add(new Word("International Research Conference on Science","Mon, 28 – Tue, 29 Nov",0,""));
        View view = inflater.inflate(R.layout.fragment_events, container, false);
        ListView list_view = (ListView) view.findViewById(R.id.list_view);
        WordAdapter word_adapter = new WordAdapter(this, array_list);
        list_view.setAdapter(word_adapter);
        return view;

    }
}