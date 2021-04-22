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
    public void openHotelActivity(View view)
    {
        ArrayList<TouristSpot> List = new ArrayList<>();
        List.add(new TouristSpot(getString(R.string.ITC_hotel), getString(R.string.ITC_short_desc), R.drawable.sample,getString(R.string.ITC_desc),getString(R.string.ITC_address),getString(R.string.ITC_contact)));
        List.add(new TouristSpot(getString(R.string.FourPoints_hotel), getString(R.string.FourPoints_short_desc), R.drawable.sample,getString(R.string.FourPoints_desc),getString(R.string.FourPoints_address),getString(R.string.FourPoints_contact)));
        List.add(new TouristSpot(getString(R.string.Marriott_hotel), getString(R.string.Marriott_short_desc), R.drawable.sample,getString(R.string.Marriott_desc),getString(R.string.Marriott_address),getString(R.string.Marriott_contact)));
        List.add(new TouristSpot(getString(R.string.Le_Méridien_hotel), getString(R.string.Le_Méridien_short_desc), R.drawable.sample,getString(R.string.ITC_desc),getString(R.string.Le_Méridien_address),getString(R.string.Le_Méridien_contact)));
        Intent i= new Intent(MainActivity.this,ListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data",List);
        i.putExtras(bundle);
        startActivity(i);
    }
    public void openRestaurantActivity(View view)
    {
        ArrayList<TouristSpot> List = new ArrayList<>();
        List.add(new TouristSpot(getString(R.string.ITC_hotel), getString(R.string.ITC_short_desc), R.drawable.sample,getString(R.string.ITC_desc),getString(R.string.ITC_address),getString(R.string.ITC_contact)));
        Intent i= new Intent(MainActivity.this,ListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data",List);
        i.putExtras(bundle);
        startActivity(i);
    }
    public void openSpotActivity(View view)
    {
        ArrayList<TouristSpot> List = new ArrayList<>();
        List.add(new TouristSpot(getString(R.string.Amber_Fort_spot), getString(R.string.Amber_Fort_short_desc), R.drawable.sample,getString(R.string.Amber_Fort_desc),getString(R.string.Amber_Fort_address),getString(R.string.Amber_Fort_contact)));
        List.add(new TouristSpot(getString(R.string.Birla_Mandir_spot), getString(R.string.Birla_Mandir_short_desc), R.drawable.sample,getString(R.string.Birla_Mandir_desc),getString(R.string.Birla_Mandir_address),getString(R.string.Birla_Mandir_contact)));
        List.add(new TouristSpot(getString(R.string.Hawa_Mahal_spot), getString(R.string.Hawa_Mahal_short_desc), R.drawable.sample,getString(R.string.Hawa_Mahal_desc),getString(R.string.Hawa_Mahal_address),getString(R.string.Hawa_Mahal_contact)));
        List.add(new TouristSpot(getString(R.string.Jantar_Mantar_spot), getString(R.string.Jantar_Mantar_short_desc), R.drawable.sample,getString(R.string.Jantar_Mantar_desc),getString(R.string.Jantar_Mantar_address),getString(R.string.Jantar_Mantar_contact)));
        List.add(new TouristSpot(getString(R.string.Jal_Mahal_spot), getString(R.string.Jal_Mahal_short_desc), R.drawable.sample,getString(R.string.Jal_Mahal_desc),getString(R.string.Jal_Mahal_address),getString(R.string.Jal_Mahal_contact)));
        List.add(new TouristSpot(getString(R.string.Galta_Ji_spot), getString(R.string.Galta_Ji_short_desc), R.drawable.sample,getString(R.string.Galta_Ji_desc),getString(R.string.Galta_Ji_address),getString(R.string.Galta_Ji_contact)));
        Intent i= new Intent(MainActivity.this,ListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data",List);
        i.putExtras(bundle);
        startActivity(i);
    }
    public void openTransportActivity(View view)
    {
        ArrayList<TouristSpot> List = new ArrayList<>();
        List.add(new TouristSpot(getString(R.string.ITC_hotel), getString(R.string.ITC_short_desc), R.drawable.sample,getString(R.string.ITC_desc),getString(R.string.ITC_address),getString(R.string.ITC_contact)));
        Intent i= new Intent(MainActivity.this,ListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data",List);
        i.putExtras(bundle);
        startActivity(i);
    }
    public void openShoppingActivity(View view)
    {
        ArrayList<TouristSpot> List = new ArrayList<>();
        List.add(new TouristSpot(getString(R.string.ITC_hotel), getString(R.string.ITC_short_desc), R.drawable.sample,getString(R.string.ITC_desc),getString(R.string.ITC_address),getString(R.string.ITC_contact)));
        Intent i= new Intent(MainActivity.this,ListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data",List);
        i.putExtras(bundle);
        startActivity(i);
    }
}