package com.example.your_smart_guide_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity21 extends AppCompatActivity {
  DB_SQLite db;
  ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);
        db=new DB_SQLite(this);
        listView=findViewById(R.id.list);
        showData();

    }





    public void showData(){
        ArrayList<String> listData=db.getAllRecords();
        ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity21.this, android.R.layout.simple_list_item_1,listData);
        listView.setAdapter(arrayAdapter);
    }
}