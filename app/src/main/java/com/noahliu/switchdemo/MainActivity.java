package com.noahliu.switchdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch swAbove = findViewById(R.id.switch_Above);
        Switch swBelow = findViewById(R.id.switch_Below);
        ToggleButton toggleButton = findViewById(R.id.toggleButton);

        swAbove.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "Sw1: "+isChecked, Toast.LENGTH_SHORT).show();
            }
        });

        swBelow.setOnCheckedChangeListener((buttonView,isChecked)->{
            Toast.makeText(MainActivity.this, "Sw2: "+isChecked, Toast.LENGTH_SHORT).show();
        });
        toggleButton.setOnCheckedChangeListener((buttonView,isChecked)->{
            Toast.makeText(MainActivity.this, "Tg1: "+isChecked, Toast.LENGTH_SHORT).show();
        });
    }
}