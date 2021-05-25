package com.example.demodatapassingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class fourthActivity extends AppCompatActivity {
    TextView tvDouble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        tvDouble = findViewById(R.id.tvDouble);
        Intent intentReceived =  getIntent();
        tvDouble.setText("Double value received is: " + intentReceived.getDoubleExtra("value",0.00));
    }
}