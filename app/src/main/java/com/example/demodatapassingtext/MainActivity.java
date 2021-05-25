package com.example.demodatapassingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonInt;
    Button buttonChar;
    Button buttonDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonInt = findViewById(R.id.buttonInt);
        buttonChar = findViewById(R.id.buttonChar);
        buttonDouble = findViewById(R.id.buttonDouble);

        buttonInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,secondActivity.class);
                intent.putExtra("value",1);
                startActivity(intent);

            }
        });

        buttonChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,thirdActivity.class);
                intent.putExtra("value",'A');
                startActivity(intent);
            }
        });

        buttonDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,fourthActivity.class);
                intent.putExtra("value",99.99);
                startActivity(intent);
            }
        });

    }
}