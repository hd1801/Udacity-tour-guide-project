package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<TouristSpot> List = new ArrayList<>() ;
        List.add(new TouristSpot(getString(R.string.SampleName),"This i s sample description",R.drawable.sample));
        List.add(new TouristSpot("Sample Place","This i s sample description",R.drawable.sample));
        List.add(new TouristSpot("Sample Place","This i s sample description",R.drawable.sample));
        List.add(new TouristSpot("Sample Place","This i s sample description",R.drawable.sample));
        ListAdapter adapter = new ListAdapter(this,List);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }
}