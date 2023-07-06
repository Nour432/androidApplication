package com.example.your_smart_guide_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Locale;

public class MainActivity50 extends AppCompatActivity {
  CardView card1,card2;
    Spinner spinner;
    public static final String[] languages = {"", "English", "Arabic"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main50);
        card1=findViewById(R.id.card1);
        card2=findViewById(R.id.card2);

        spinner = findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, languages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String selectedlang = parent.getItemAtPosition(position).toString();
                if (selectedlang.equals("English")) {
                    setlocal(MainActivity50.this, "en");
                    finish();
                    startActivity(getIntent());


                } else if (selectedlang.equals("Arabic")) {
                    setlocal(MainActivity50.this, "ar");
                    finish();
                    startActivity(getIntent());
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity51();
            }
        });


    }

    private void openActivity51() {
        Intent intent=new Intent(this,MainActivity51.class);
        startActivity(intent);
    }


    private void openActivity2() {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void setlocal(Activity activity, String langcode) {
        Locale locale = new Locale(langcode);
        locale.setDefault(locale);
        Resources resources = activity.getResources();
        Configuration config = resources.getConfiguration();
        config.setLocale(locale);
        resources.updateConfiguration(config, resources.getDisplayMetrics());


    }





}