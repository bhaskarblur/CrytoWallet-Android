package com.the2wizstudio.crytowallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Onboarding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        setContentView(R.layout.activity_onboarding);
    }
}