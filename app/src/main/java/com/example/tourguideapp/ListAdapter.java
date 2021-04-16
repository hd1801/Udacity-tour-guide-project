package com.example.tourguideapp;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter<TouristSpot> {

    public ListAdapter(@NonNull Context context, int resource, @NonNull List<TouristSpot> objects) {
        super(context, resource, objects);
    }

    @Nullable
    @Override
    public TouristSpot getItem(int position) {
        //TODO: Update the ids and finish adapter class.
        return super.getItem(position);
    }
}

