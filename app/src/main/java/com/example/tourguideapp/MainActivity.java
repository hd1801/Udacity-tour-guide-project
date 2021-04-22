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
        List.add(new TouristSpot(getString(R.string.ITC_hotel), getString(R.string.ITC_short_desc), R.drawable.itc,getString(R.string.ITC_desc),getString(R.string.ITC_address),getString(R.string.ITC_contact)));
        List.add(new TouristSpot(getString(R.string.FourPoints_hotel), getString(R.string.FourPoints_short_desc), R.drawable.fourpoint,getString(R.string.FourPoints_desc),getString(R.string.FourPoints_address),getString(R.string.FourPoints_contact)));
        List.add(new TouristSpot(getString(R.string.Marriott_hotel), getString(R.string.Marriott_short_desc), R.drawable.marriott,getString(R.string.Marriott_desc),getString(R.string.Marriott_address),getString(R.string.Marriott_contact)));
        List.add(new TouristSpot(getString(R.string.Le_Méridien_hotel), getString(R.string.Le_Méridien_short_desc), R.drawable.lemeridien,getString(R.string.ITC_desc),getString(R.string.Le_Méridien_address),getString(R.string.Le_Méridien_contact)));
        Intent i= new Intent(MainActivity.this,ListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data",List);
        i.putExtras(bundle);
        startActivity(i);
    }
    public void openRestaurantActivity(View view)
    {
        ArrayList<TouristSpot> List = new ArrayList<>();
        List.add(new TouristSpot(getString(R.string.RJ14_rest), getString(R.string.RJ14_short_desc), R.drawable.rj14,getString(R.string.RJ14_desc),getString(R.string.RJ14_address),getString(R.string.RJ14_contact)));
        List.add(new TouristSpot(getString(R.string.The_Rajput_Room_rest), getString(R.string.The_Rajput_Room_short_desc), R.drawable.rajputroom,getString(R.string.The_Rajput_Room_desc),getString(R.string.The_Rajput_Room_address),getString(R.string.The_Rajput_Room_contact)));
        List.add(new TouristSpot(getString(R.string.Jaipur_Adda_rest), getString(R.string.Jaipur_Adda_short_desc), R.drawable.jaipuradda,getString(R.string.Jaipur_Adda_desc),getString(R.string.Jaipur_Adda_address),getString(R.string.Jaipur_Adda_contact)));
        List.add(new TouristSpot(getString(R.string.Zolocrust_rest), getString(R.string.Zolocrust_short_desc), R.drawable.zolocrust,getString(R.string.Zolocrust_desc),getString(R.string.Zolocrust_address),getString(R.string.Zolocrust_contact)));
        List.add(new TouristSpot(getString(R.string.TapriCentral_rest), getString(R.string.TapriCentral_short_desc), R.drawable.tapri,getString(R.string.TapriCentral_desc),getString(R.string.TapriCentral_address),getString(R.string.TapriCentral_contact)));
        List.add(new TouristSpot(getString(R.string.Chao_Chinese_rest), getString(R.string.Chao_Chinese_short_desc), R.drawable.chao,getString(R.string.Chao_Chinese_desc),getString(R.string.Chao_Chinese_address),getString(R.string.Chao_Chinese_contact)));
        Intent i= new Intent(MainActivity.this,ListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data",List);
        i.putExtras(bundle);
        startActivity(i);
    }
    public void openSpotActivity(View view)
    {
        ArrayList<TouristSpot> List = new ArrayList<>();
        List.add(new TouristSpot(getString(R.string.Birla_Mandir_spot), getString(R.string.Birla_Mandir_short_desc), R.drawable.birlamandir,getString(R.string.Birla_Mandir_desc),getString(R.string.Birla_Mandir_address),getString(R.string.Birla_Mandir_contact)));
        List.add(new TouristSpot(getString(R.string.Hawa_Mahal_spot), getString(R.string.Hawa_Mahal_short_desc), R.drawable.hawamahal,getString(R.string.Hawa_Mahal_desc),getString(R.string.Hawa_Mahal_address),getString(R.string.Hawa_Mahal_contact)));
        List.add(new TouristSpot(getString(R.string.Jantar_Mantar_spot), getString(R.string.Jantar_Mantar_short_desc), R.drawable.jantarmantar,getString(R.string.Jantar_Mantar_desc),getString(R.string.Jantar_Mantar_address),getString(R.string.Jantar_Mantar_contact)));
        List.add(new TouristSpot(getString(R.string.Jal_Mahal_spot), getString(R.string.Jal_Mahal_short_desc), R.drawable.sample,getString(R.string.Jal_Mahal_desc),getString(R.string.Jal_Mahal_address),getString(R.string.Jal_Mahal_contact)));
        List.add(new TouristSpot(getString(R.string.Galta_Ji_spot), getString(R.string.Galta_Ji_short_desc), R.drawable.galtaji,getString(R.string.Galta_Ji_desc),getString(R.string.Galta_Ji_address),getString(R.string.Galta_Ji_contact)));
        Intent i= new Intent(MainActivity.this,ListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data",List);
        i.putExtras(bundle);
        startActivity(i);
    }
    public void openTransportActivity(View view)
    {
        ArrayList<TouristSpot> List = new ArrayList<>();
        List.add(new TouristSpot(getString(R.string.metro), getString(R.string.metro_short_desc), R.drawable.download,getString(R.string.metro_desc),getString(R.string.metro_address),getString(R.string.metro_contact)));
        List.add(new TouristSpot(getString(R.string.LowFloor_bus), getString(R.string.LowFloor_short_desc), R.drawable.lowfloor,getString(R.string.metro_desc),getString(R.string.metro_address),getString(R.string.metro_contact)));
        List.add(new TouristSpot(getString(R.string.Palace_On_Wheels), getString(R.string.Palace_On_Wheels_short_desc), R.drawable.palaceonwheels,getString(R.string.Palace_On_Wheels_desc),getString(R.string.Palace_On_Wheels_address),getString(R.string.Palace_On_Wheels_contact)));
        Intent i= new Intent(MainActivity.this,ListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data",List);
        i.putExtras(bundle);
        startActivity(i);
    }
    public void openShoppingActivity(View view)
    {
        ArrayList<TouristSpot> List = new ArrayList<>();
        List.add(new TouristSpot(getString(R.string.Chandpole_Bazaar_shop), getString(R.string.Chandpole_Bazaar_short_desc), R.drawable.chandpol,getString(R.string.Chandpole_Bazaar_desc),getString(R.string.Chandpole_Bazaar_address),getString(R.string.Chandpole_Bazaar_contact)));
        List.add(new TouristSpot(getString(R.string.Tripolia_Bazaar_shop), getString(R.string.Tripolia_Bazaar_short_desc), R.drawable.tripolia,getString(R.string.Tripolia_Bazaar_desc),getString(R.string.Tripolia_Bazaar_address),getString(R.string.Tripolia_Bazaar_contact)));
        List.add(new TouristSpot(getString(R.string.Johari_Bazaar_shop), getString(R.string.Johari_Bazaar_short_desc), R.drawable.johari,getString(R.string.Johari_Bazaar_desc),getString(R.string.Johari_Bazaar_address),getString(R.string.Johari_Bazaar_contact)));
        Intent i= new Intent(MainActivity.this,ListActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data",List);
        i.putExtras(bundle);
        startActivity(i);
    }
}