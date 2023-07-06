package com.example.your_smart_guide_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.Locale;

public class MainActivity11 extends AppCompatActivity {
    ImageView home,person,contact;
    Spinner spinner;
    public static final String[] languages = {"", "English", "Arabic"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        home=findViewById(R.id.home);
        person=findViewById(R.id.person);
        contact=findViewById(R.id.contact);

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
                    setlocal(MainActivity11.this, "en");
                    finish();
                    startActivity(getIntent());


                } else if (selectedlang.equals("Arabic")) {
                    setlocal(MainActivity11.this, "ar");
                    finish();
                    startActivity(getIntent());
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity13();
            }
        });

        person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity21();
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity19();
            }
        });
    }

    private void openActivity13() {
        Intent intent =new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

    private void openActivity19() {
        Intent intent =new Intent(this,MainActivity19.class);
        startActivity(intent);

    }

    private void openActivity21() {
        Intent intent =new Intent(this,MainActivity21.class);
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