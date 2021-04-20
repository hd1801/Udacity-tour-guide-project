package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //TODO: add all methods like openactiviy and change the bundle key
    public void openHotelActivity(View view)
    {
        ArrayList<TouristSpot> List = new ArrayList<>();
        List.add(new TouristSpot(getString(R.string.ITC_hotel), getString(R.string.ITC_short_desc), R.drawable.sample,getString(R.string.ITC_desc),getString(R.string.ITC_address),getString(R.string.ITC_contact)));
        List.add(new TouristSpot("Sample Place", "This i s sample description", R.drawable.sample));
        List.add(new TouristSpot("Sample Place", "This i s sample description", R.drawable.sample));
        List.add(new TouristSpot("Sample Place", "This i s sample description", R.drawable.sample));
        Intent i= new Intent(MainActivity.this,ListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data",List);
        i.putExtras(bundle);
        startActivity(i);
    }
}