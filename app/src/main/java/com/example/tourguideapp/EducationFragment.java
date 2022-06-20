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
        array_list.add(new Word("PTU University","hhh",R.drawable.ptu));
        array_list.add(new Word("PTU University","jhg",R.drawable.ptu));
        array_list.add(new Word("PTU University",getResources().getString(R.string.ptudescription),R.drawable.ptu));
        Log.i("", "hey" + array_list);
        View view = inflater.inflate(R.layout.fragment_education, container, false);
        ListView list_view = (ListView) view.findViewById(R.id.list_view);
        WordAdapter word_adapter = new WordAdapter(this, array_list);
        list_view.setAdapter(word_adapter);
        return view;
    }

}