package com.example.tourguideapp;

import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EducationFragment extends Fragment {
    Context mContext;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<Word> array_list = new ArrayList<Word>();

        array_list.add(new Word("Anand College of Engineering and Management",getResources().getString(R.string.ananddescription),R.drawable.anand,"geo:31.331406908080268, 75.34375546614258"));
        array_list.add(new Word("College of Engineering & Management, Kapurthala",getResources().getString(R.string.cemdescription),R.drawable.cem,"geo:31.390496786476934, 75.33708741282628"));
        array_list.add(new Word("PTU University",getResources().getString(R.string.ptudescription),R.drawable.ptu,"geo:31.353447992166195, 75.45862710942086"));
        Log.i("", "hey" + array_list);
        View view = inflater.inflate(R.layout.fragment_education, container, false);
        ListView list_view = (ListView) view.findViewById(R.id.list_view);
        WordAdapter word_adapter = new WordAdapter(this, array_list);
        list_view.setAdapter(word_adapter);
        return view;
    }

}