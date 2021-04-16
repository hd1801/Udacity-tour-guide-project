package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter<TouristSpot> {

    public ListAdapter(@NonNull Context context, int resource, @NonNull List<TouristSpot> objects) {
        super(context, resource, objects);
    }

    @Nullable
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
       TouristSpot touristSpot = getItem(position);
       // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Lookup view for data population
        TextView title = (TextView) convertView.findViewById(R.id.card_title);
        TextView short_desc  = (TextView) convertView.findViewById(R.id.card_desc);
        ImageView image = (ImageView) convertView.findViewById(R.id.card_image);
        // Populate the data into the template view using the data object
        title.setText(touristSpot.getName());
        short_desc.setText(touristSpot.getShortDescription());
        image.setImageResource(touristSpot.getImageResourceId());
        return convertView;
    }
}

