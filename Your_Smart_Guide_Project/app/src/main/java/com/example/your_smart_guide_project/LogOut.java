package com.example.your_smart_guide_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogOut extends AppCompatActivity {
  Button logout;
  EditText e1,e2;
  DB_SQLite db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_out);
        logout=findViewById(R.id.Logout);
        e1=findViewById(R.id.username);
        e2=findViewById(R.id.password);
        db=new DB_SQLite(this);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }


}