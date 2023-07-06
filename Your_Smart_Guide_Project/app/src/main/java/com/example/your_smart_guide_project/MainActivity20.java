package com.example.your_smart_guide_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity20 extends AppCompatActivity {
  ImageView translate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
        translate=findViewById(R.id.translate);


    }
}