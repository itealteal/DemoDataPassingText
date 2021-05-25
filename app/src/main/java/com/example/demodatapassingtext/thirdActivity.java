package com.example.demodatapassingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class thirdActivity extends AppCompatActivity {
    TextView tvChar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tvChar = findViewById(R.id.tvChar);
        Intent intentReceived = getIntent();
        tvChar.setText("Character value received is: " + intentReceived.getCharExtra("value",'z'));
    }
}