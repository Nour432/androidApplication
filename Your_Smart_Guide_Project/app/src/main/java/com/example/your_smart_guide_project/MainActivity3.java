package com.example.your_smart_guide_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.Locale;

public class MainActivity3 extends AppCompatActivity {
  CardView Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8;
  ImageView home,person,contact;
    GridLayout mainGrid;



    Spinner spinner;
    public static final String[] languages = {"", "English", "Arabic"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button1 = findViewById(R.id.card1);
        Button2 = findViewById(R.id.card2);
        Button3 = findViewById(R.id.card3);
        Button4 = findViewById(R.id.card4);
        Button5 = findViewById(R.id.card5);
        Button6 = findViewById(R.id.card6);
        Button7 = findViewById(R.id.card7);
        Button8 = findViewById(R.id.card8);
        home=findViewById(R.id.home);
        person=findViewById(R.id.person);
        contact=findViewById(R.id.contact);




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









        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();

            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity8();
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity14();
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }
        });


        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity13();
            }
        });

        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity6();
            }
        });

        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity15();
            }
        });

        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity11();
            }
        });






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
                    setlocal(MainActivity3.this, "en");
                    finish();
                    startActivity(getIntent());


                } else if (selectedlang.equals("Arabic")) {
                    setlocal(MainActivity3.this, "ar");
                    finish();
                    startActivity(getIntent());
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });










    }









    private void openActivity5() {
        Intent intent =new Intent(this,MainActivity5.class);
        startActivity(intent);

    }

    private void openActivity15() {
        Intent intent =new Intent(this,MainActivity15.class);
        startActivity(intent);
    }

    private void openActivity14() {
        Intent intent =new Intent(this,MainActivity14.class);
        startActivity(intent);
    }

    private void openActivity13() {
        Intent intent =new Intent(this,MainActivity13.class);
        startActivity(intent);
    }

    private void openActivity12() {
        Intent intent =new Intent(this,MainActivity12.class);
        startActivity(intent);
    }

    private void openActivity11() {
        Intent intent =new Intent(this,MainActivity11.class);
        startActivity(intent);
    }


//
//    private void openActivity9() {
//        Intent intent =new Intent(this,MainActivity9.class);
//        startActivity(intent);
//    }

    private void openActivity8() {
        Intent intent =new Intent(this,MainActivity8.class);
        startActivity(intent);
    }

    private void openActivity7() {
        Intent intent =new Intent(this,MainActivity7.class);
        startActivity(intent);
    }

    private void openActivity6() {
        Intent intent =new Intent(this,MainActivity6.class);
        startActivity(intent);
    }

//    private void openMainActivity() {
//        Intent intent =new Intent(this,MainActivity.class);
//        startActivity(intent);
//    }


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