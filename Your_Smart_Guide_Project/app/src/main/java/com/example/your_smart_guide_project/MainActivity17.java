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
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.Locale;

public class MainActivity17 extends AppCompatActivity {
    ImageView home,person,contact;
    Spinner spinner;
    CardView card1,card2,card3,card4,card5,card6,card7,card8,card9,card10;
    public static final String[] languages = {"", "English", "Arabic"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
        card1=findViewById(R.id.card1);
        card2=findViewById(R.id.card2);
        card3=findViewById(R.id.card3);
        card4=findViewById(R.id.card4);
        card5=findViewById(R.id.card5);
        card6=findViewById(R.id.card6);
        card7=findViewById(R.id.card7);
        card8=findViewById(R.id.card8);
        card9=findViewById(R.id.card9);
        card10=findViewById(R.id.card10);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity38();
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity39();

            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity25();

            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity40();

            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity41();

            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity42();

            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity43();

            }
        });

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity44();

            }
        });

        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity45();

            }
        });

        card10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity46();

            }
        });














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
                    setlocal(MainActivity17.this, "en");
                    finish();
                    startActivity(getIntent());


                } else if (selectedlang.equals("Arabic")) {
                    setlocal(MainActivity17.this, "ar");
                    finish();
                    startActivity(getIntent());
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }



    private void openActivity42() {
        Intent intent =new Intent(this,MainActivity42.class);
        startActivity(intent);

    }

    private void openActivity43() {
        Intent intent =new Intent(this,MainActivity43.class);
        startActivity(intent);
    }

    private void openActivity44() {
        Intent intent =new Intent(this,MainActivity44.class);
        startActivity(intent);
    }

    private void openActivity45() {
        Intent intent =new Intent(this,MainActivity45.class);
        startActivity(intent);
    }

    private void openActivity46() {
        Intent intent =new Intent(this,MainActivity46.class);
        startActivity(intent);
    }

    private void openActivity41() {
        Intent intent =new Intent(this,MainActivity41.class);
        startActivity(intent);
    }

    private void openActivity39() {
        Intent intent =new Intent(this,MainActivity39.class);
        startActivity(intent);
    }

    private void openActivity38() {
        Intent intent =new Intent(this,MainActivity38.class);
        startActivity(intent);
    }



    private void openActivity40() {
        Intent intent =new Intent(this,MainActivity40.class);
        startActivity(intent);
    }

    private void openActivity25() {
        Intent intent =new Intent(this,MainActivity25.class);
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