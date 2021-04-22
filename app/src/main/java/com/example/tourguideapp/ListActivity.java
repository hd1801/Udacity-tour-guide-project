package com.example.tourguideapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    private ArrayList<TouristSpot> List;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // drawer layout instance to toggle the menu icon to open
        // drawer and back button to close drawer
        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        // pass the Open and Close toggle for the drawer layout listener
        // to toggle the button
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        // to make the Navigation drawer icon always appear on the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView mNavigationView = (NavigationView) findViewById(R.id.nav_view);
        if (mNavigationView != null) {
            mNavigationView.setNavigationItemSelectedListener(this::onNavigationItemSelected);


        }


        Bundle bundle = getIntent().getExtras();
        List = bundle.getParcelableArrayList("data");
        ListAdapter adapter = new ListAdapter(this, List);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TouristSpot spot = (TouristSpot) parent.getItemAtPosition(position);
                Bundle bundle = new Bundle();
                bundle.putParcelable("Desc",spot);
                setContentView(R.layout.fragment_desc);
                DescFragment mFragment = null;
                mFragment = new DescFragment();
                mFragment.setArguments(bundle);
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragment_desc_container, mFragment).commit();

            }
        });

    }

    @Override
    public void onBackPressed() {
        getSupportFragmentManager().popBackStackImmediate();
        super.onBackPressed();
    }

    // override the onOptionsItemSelected()
    // function to implement
    // the item click listener callback
    // to open and close the navigation
    // drawer when the icon is clicked
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //TODO:set intents to switch cases transfer data of list, use different bundle keys for passing data (refter main activity)

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.nav_hotel:
            {
                ArrayList<TouristSpot> List = new ArrayList<>();
                List.add(new TouristSpot(getString(R.string.ITC_hotel), getString(R.string.ITC_short_desc), R.drawable.itc,getString(R.string.ITC_desc),getString(R.string.ITC_address),getString(R.string.ITC_contact)));
                List.add(new TouristSpot(getString(R.string.FourPoints_hotel), getString(R.string.FourPoints_short_desc), R.drawable.fourpoint,getString(R.string.FourPoints_desc),getString(R.string.FourPoints_address),getString(R.string.FourPoints_contact)));
                List.add(new TouristSpot(getString(R.string.Marriott_hotel), getString(R.string.Marriott_short_desc), R.drawable.marriott,getString(R.string.Marriott_desc),getString(R.string.Marriott_address),getString(R.string.Marriott_contact)));
                List.add(new TouristSpot(getString(R.string.Le_Méridien_hotel), getString(R.string.Le_Méridien_short_desc), R.drawable.lemeridien,getString(R.string.ITC_desc),getString(R.string.Le_Méridien_address),getString(R.string.Le_Méridien_contact)));
                Intent i= new Intent(this,ListActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("data",List);
                i.putExtras(bundle);
                startActivity(i);
                break;
            }
            case R.id.nav_restaurants:
            {
                ArrayList<TouristSpot> List = new ArrayList<>();
                List.add(new TouristSpot(getString(R.string.RJ14_rest), getString(R.string.RJ14_short_desc), R.drawable.rj14,getString(R.string.RJ14_desc),getString(R.string.RJ14_address),getString(R.string.RJ14_contact)));
                List.add(new TouristSpot(getString(R.string.The_Rajput_Room_rest), getString(R.string.The_Rajput_Room_short_desc), R.drawable.rajputroom,getString(R.string.The_Rajput_Room_desc),getString(R.string.The_Rajput_Room_address),getString(R.string.The_Rajput_Room_contact)));
                List.add(new TouristSpot(getString(R.string.Jaipur_Adda_rest), getString(R.string.Jaipur_Adda_short_desc), R.drawable.jaipuradda,getString(R.string.Jaipur_Adda_desc),getString(R.string.Jaipur_Adda_address),getString(R.string.Jaipur_Adda_contact)));
                List.add(new TouristSpot(getString(R.string.Zolocrust_rest), getString(R.string.Zolocrust_short_desc), R.drawable.zolocrust,getString(R.string.Zolocrust_desc),getString(R.string.Zolocrust_address),getString(R.string.Zolocrust_contact)));
                List.add(new TouristSpot(getString(R.string.TapriCentral_rest), getString(R.string.TapriCentral_short_desc), R.drawable.tapri,getString(R.string.TapriCentral_desc),getString(R.string.TapriCentral_address),getString(R.string.TapriCentral_contact)));
                List.add(new TouristSpot(getString(R.string.Chao_Chinese_rest), getString(R.string.Chao_Chinese_short_desc), R.drawable.chao,getString(R.string.Chao_Chinese_desc),getString(R.string.Chao_Chinese_address),getString(R.string.Chao_Chinese_contact)));
                Intent i= new Intent(this,ListActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("data",List);
                i.putExtras(bundle);
                startActivity(i);
                break;
            }

            case R.id.nav_shops:
            {
                ArrayList<TouristSpot> List = new ArrayList<>();
                List.add(new TouristSpot(getString(R.string.Chandpole_Bazaar_shop), getString(R.string.Chandpole_Bazaar_short_desc), R.drawable.chandpol,getString(R.string.Chandpole_Bazaar_desc),getString(R.string.Chandpole_Bazaar_address),getString(R.string.Chandpole_Bazaar_contact)));
                List.add(new TouristSpot(getString(R.string.Tripolia_Bazaar_shop), getString(R.string.Tripolia_Bazaar_short_desc), R.drawable.tripolia,getString(R.string.Tripolia_Bazaar_desc),getString(R.string.Tripolia_Bazaar_address),getString(R.string.Tripolia_Bazaar_contact)));
                List.add(new TouristSpot(getString(R.string.Johari_Bazaar_shop), getString(R.string.Johari_Bazaar_short_desc), R.drawable.johari,getString(R.string.Johari_Bazaar_desc),getString(R.string.Johari_Bazaar_address),getString(R.string.Johari_Bazaar_contact)));
                Intent i= new Intent(this,ListActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("data",List);
                i.putExtras(bundle);
                startActivity(i);
                break;

            }
            case R.id.nav_tourist_spots:{
                ArrayList<TouristSpot> List = new ArrayList<>();
                List.add(new TouristSpot(getString(R.string.Birla_Mandir_spot), getString(R.string.Birla_Mandir_short_desc), R.drawable.birlamandir,getString(R.string.Birla_Mandir_desc),getString(R.string.Birla_Mandir_address),getString(R.string.Birla_Mandir_contact)));
                List.add(new TouristSpot(getString(R.string.Hawa_Mahal_spot), getString(R.string.Hawa_Mahal_short_desc), R.drawable.hawamahal,getString(R.string.Hawa_Mahal_desc),getString(R.string.Hawa_Mahal_address),getString(R.string.Hawa_Mahal_contact)));
                List.add(new TouristSpot(getString(R.string.Jantar_Mantar_spot), getString(R.string.Jantar_Mantar_short_desc), R.drawable.jantarmantar,getString(R.string.Jantar_Mantar_desc),getString(R.string.Jantar_Mantar_address),getString(R.string.Jantar_Mantar_contact)));
                List.add(new TouristSpot(getString(R.string.Jal_Mahal_spot), getString(R.string.Jal_Mahal_short_desc), R.drawable.sample,getString(R.string.Jal_Mahal_desc),getString(R.string.Jal_Mahal_address),getString(R.string.Jal_Mahal_contact)));
                List.add(new TouristSpot(getString(R.string.Galta_Ji_spot), getString(R.string.Galta_Ji_short_desc), R.drawable.galtaji,getString(R.string.Galta_Ji_desc),getString(R.string.Galta_Ji_address),getString(R.string.Galta_Ji_contact)));
                Intent i= new Intent(this,ListActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("data",List);
                i.putExtras(bundle);
                startActivity(i);
                break;
            }

            case R.id.nav_transports:{
                ArrayList<TouristSpot> List = new ArrayList<>();
                List.add(new TouristSpot(getString(R.string.metro), getString(R.string.metro_short_desc), R.drawable.download,getString(R.string.metro_desc),getString(R.string.metro_address),getString(R.string.metro_contact)));
                List.add(new TouristSpot(getString(R.string.LowFloor_bus), getString(R.string.LowFloor_short_desc), R.drawable.lowfloor,getString(R.string.metro_desc),getString(R.string.metro_address),getString(R.string.metro_contact)));
                List.add(new TouristSpot(getString(R.string.Palace_On_Wheels), getString(R.string.Palace_On_Wheels_short_desc), R.drawable.palaceonwheels,getString(R.string.Palace_On_Wheels_desc),getString(R.string.Palace_On_Wheels_address),getString(R.string.Palace_On_Wheels_contact)));
                Intent i= new Intent(this,ListActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("data",List);
                i.putExtras(bundle);
                startActivity(i);
                break;
            }


        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.my_drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}




