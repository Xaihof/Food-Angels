package com.xoksis.foodangels.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.xoksis.foodangels.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.cardViewCustomers.setOnClickListener(view -> {

            startActivity(new Intent(MainActivity.this, CustomersItemsActivity.class));

        });

        activityMainBinding.cardViewResturants.setOnClickListener(view -> {



        });


    }
}