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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity5 extends AppCompatActivity {
    EditText NID,complaint,name,email;
    Button submit;
   DB_SQLite1 db;
    TextView t;
    DB_SQLite db1;



    ImageView home,person,contact;
    Spinner spinner;
    public static final String[] languages = {"", "English", "Arabic"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        NID=findViewById(R.id.NID);
        complaint=findViewById(R.id.complaint);
        submit=findViewById(R.id.submit);
        db=new DB_SQLite1(this);
        db1=new DB_SQLite(this);
        email=findViewById(R.id.email);
        name=findViewById(R.id.name);





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
                    setlocal(MainActivity5.this, "en");
                    finish();
                    startActivity(getIntent());


                } else if (selectedlang.equals("Arabic")) {
                    setlocal(MainActivity5.this, "ar");
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


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String NationalID=NID.getText().toString();
              boolean flage =db1.search(NationalID);
              if(flage) {
                  NID.setText("");
                  Toast.makeText(MainActivity5.this, "Your complaint submitted successfully", Toast.LENGTH_SHORT).show();

              }
              else {
                  NID.setText("");
                  Toast.makeText(MainActivity5.this, "enter valid NationalID ", Toast.LENGTH_SHORT).show();
              }


            }
        });

    }
//    public void insertData() {
//        String NationalID = NID.getText().toString();
//        String Complaint = complaint.getText().toString();
//        String Name=name.getText().toString();
//        String Email=email.getText().toString();
//
//        boolean result = db.insert_Data_In_Complaints(Name,Email,NationalID, Complaint);
//
//        if (result==true) {
//            NID.setText("");
//            Toast.makeText(this, "Your complaint submitted successfully", Toast.LENGTH_SHORT).show();
//        } else {
//            NID.setText("");
//            Toast.makeText(this, "Your complaint submitted successfully", Toast.LENGTH_LONG).show();
//        }
//    }











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