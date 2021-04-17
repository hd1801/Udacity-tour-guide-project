package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //TODO: add a navigation drawer in main activity and add seprates activities to different fragments ie- hotel, restraunt , etc.
    public void openHotelActivity(View view)
    {
        Intent i= new Intent(MainActivity.this,ListActivity.class);
        startActivity(i);
    }
}