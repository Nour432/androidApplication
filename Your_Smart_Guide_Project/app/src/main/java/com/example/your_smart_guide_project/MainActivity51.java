package com.example.your_smart_guide_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity51 extends AppCompatActivity {
    public static String Prefs_Name1="MyPrefsFile1";
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main51);
        b1=findViewById(R.id.signupButton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity52();
            }
        });


    }

    private void openActivity52() {
        Intent intent=new Intent(this,MainActivity52.class);
        startActivity(intent);
    }
}