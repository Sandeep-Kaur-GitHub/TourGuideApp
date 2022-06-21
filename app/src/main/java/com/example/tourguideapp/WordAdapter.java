package com.example.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Fragment context, ArrayList<Word> word) {
        super(context.getContext(), 0, word);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_view, parent, false);
        }
        Word word = getItem(position);
        TextView album_textView = (TextView) listItemView.findViewById(R.id.textview_title);
        album_textView.setText(word.getTitle());

        TextView artist_textView = (TextView) listItemView.findViewById(R.id.textview_description);
        artist_textView.setText(word.getDescription());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_view);
        iconView.setImageResource(word.getImage());
        Button location_btn = (Button) listItemView.findViewById(R.id.location_button);
        location_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Hello Javatpoint", Toast.LENGTH_SHORT).show();
                String a = word.getLocation().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(a));
                if (intent.resolveActivity(getContext().getPackageManager()) != null) {
                    getContext().startActivity(intent);
                }
            }
        });
        return listItemView;
    }
}


