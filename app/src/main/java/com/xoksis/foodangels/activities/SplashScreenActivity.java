package com.xoksis.foodangels.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.xoksis.foodangels.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        Intent intent = new Intent(SplashScreenActivity.this,MainActivity.class);

        new Handler().postDelayed(() -> {

            startActivity(intent);
            finish();

        },1400);


    }
}