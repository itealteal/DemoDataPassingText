package com.example.demodatapassingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    TextView tvInt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvInt = findViewById(R.id.tvInt);
        Intent intentReceived = getIntent();
        tvInt.setText("Integer value received is: " + intentReceived.getIntExtra("value",0));
    }
}