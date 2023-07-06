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

public class MainActivity18 extends AppCompatActivity {  
    CardView card1,card2,card3,card4,card5,card6,card7,card8,card9,card10;
    ImageView home,person,contact;
    Spinner spinner;
    public static final String[] languages = {"", "English", "Arabic"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);
        card3=findViewById(R.id.card3);
        card1=findViewById(R.id.card1);
        card2=findViewById(R.id.card2);
        card4=findViewById(R.id.card4);
        card5=findViewById(R.id.card5);
        card6=findViewById(R.id.card6);
        card7=findViewById(R.id.card7);
        card8=findViewById(R.id.card8);
        card9=findViewById(R.id.card9);
        card10=findViewById(R.id.card10);

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
                    setlocal(MainActivity18.this, "en");
                    finish();
                    startActivity(getIntent());


                } else if (selectedlang.equals("Arabic")) {
                    setlocal(MainActivity18.this, "ar");
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


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity29();
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity30();
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity28();
            }
        });





        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity31();
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity32();
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity33();
            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity34();
            }
        });

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity35();
            }
        });

        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity36();
            }
        });

        card10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity37();
            }
        });







    }

    private void openActivity30() {
        Intent intent =new Intent(this,MainActivity30.class);
        startActivity(intent);
    }

    private void openActivity31() {
        Intent intent =new Intent(this,MainActivity31.class);
        startActivity(intent);
    }
    private void openActivity32() {
        Intent intent =new Intent(this,MainActivity32.class);
        startActivity(intent);
    }
    private void openActivity33() {
        Intent intent =new Intent(this,MainActivity33.class);
        startActivity(intent);
    }
    private void openActivity34() {
        Intent intent =new Intent(this,MainActivity34.class);
        startActivity(intent);
    }
    private void openActivity35() {
        Intent intent =new Intent(this,MainActivity35.class);
        startActivity(intent);
    }

    private void openActivity36() {
        Intent intent =new Intent(this,MainActivity36.class);
        startActivity(intent);

    }
    private void openActivity37() {
        Intent intent =new Intent(this,MainActivity37.class);
        startActivity(intent);

    }

    private void openActivity29() {
        Intent intent =new Intent(this,MainActivity29.class);
        startActivity(intent);


    }

    private void openActivity28() {
        Intent intent =new Intent(this,MainActivity28.class);
        startActivity(intent);
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