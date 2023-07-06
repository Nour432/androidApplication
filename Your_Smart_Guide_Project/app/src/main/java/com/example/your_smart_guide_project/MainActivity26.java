package com.example.your_smart_guide_project;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity26 extends AppCompatActivity {

    ListView listView;
    DB_SQLite2 db;
    DB_SQLite db1;
    Button modify,insert;
    EditText e1;
    ImageView home,person,contact;
    Spinner spinner;
    public static final String[] languages = {"", "English", "Arabic"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main26);

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
                    setlocal(MainActivity26.this, "en");
                    finish();
                    startActivity(getIntent());


                } else if (selectedlang.equals("Arabic")) {
                    setlocal(MainActivity26.this, "ar");
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

        listView = findViewById(R.id.list);
        modify=findViewById(R.id.modify);
        e1=findViewById(R.id.username);
        insert=findViewById(R.id.confirm);

        db = new DB_SQLite2(MainActivity26.this);
        db1 = new DB_SQLite(MainActivity26.this);

        showData();


        modify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.deleteAllRecords();
                Intent intent=new Intent(MainActivity26.this,MainActivity25.class);
                startActivity(intent);

            }
        });

  insert.setOnClickListener(new View.OnClickListener() {
      @Override

      public void onClick(View view) {
          String nationalID = e1.getText().toString();
          boolean flage=db1.search(nationalID);
          if(flage) {
              insertdata();
              e1.setText("");
          }
          else Toast.makeText(MainActivity26.this, "enter valid nationalID ", Toast.LENGTH_SHORT).show();

      }
  });



    }

    public void showData(){
        ArrayList<String>listData=db.getAllRecords();
        ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity26.this, android.R.layout.simple_list_item_1,listData);
        listView.setAdapter(arrayAdapter);
    }

    public void insertdata(){
        String nationalID = e1.getText().toString();
        ArrayList<String> coursesList = db.getAllRecords();
        boolean success = db.insert_in_Student_Registration(nationalID, coursesList);
        if (success) {
            Toast.makeText(this, "courses registered successfully", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "failed to register", Toast.LENGTH_SHORT).show();
        }
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