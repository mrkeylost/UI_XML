package com.example.gslcsesi4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner role;

    String[] rolename = {"Undergraduate", "Lecturer", "Laboratory Assistant"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        role = findViewById(R.id.spinnerRole);
        ArrayAdapter<String> adapterRole = new ArrayAdapter<>(this, android.R.layout.select_dialog_item, rolename);
        role.setAdapter(adapterRole);
    }
}