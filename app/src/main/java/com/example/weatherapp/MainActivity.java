package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    TextView view_city;
    TextView view_temp;
    TextView view_desc;

    ImageView view_wether;
    EditText search;
    FloatingActionButton search_floting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view_city = findViewById(R.id.town);
        view_temp = findViewById(R.id.temp);
        view_desc = findViewById(R.id.desc);
        view_city.setText("");
        view_temp.setText("");
        view_desc.setText("");

        view_wether = findViewById(R.id.weatherImage);
        search = findViewById(R.id.editText);
        search_floting = findViewById(R.id.floatingActionButton);

        search_floting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getRootView().getWindowToken(), 0);
                api_key(String.valueOf(search.getText()));
            }
        });
    }    