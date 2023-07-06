package com.example.your_smart_guide_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class intro extends AppCompatActivity {
    private static int time=3000;
    Button button;
    ImageView im;
    Animation anim;
    DB_SQLite2 db;
    DB_SQLite db1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        im=findViewById(R.id.imintro);
        db=new DB_SQLite2(intro.this);
        db1=new DB_SQLite(intro.this);
        db.deleteAllRecords();
        db1.deleteAllRecords();




        anim= AnimationUtils.loadAnimation(this,R.anim.animintro);
        im.setAnimation(anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences=getSharedPreferences(MainActivity2.Prefs_Name,0);
                SharedPreferences sharedPreferences1=getSharedPreferences(MainActivity51.Prefs_Name1,0);
                boolean hasLoggedin=sharedPreferences.getBoolean("hasLoggedin",false);
                boolean hasSigned=sharedPreferences1.getBoolean("hasSigned",false);
                if(hasLoggedin||hasSigned) {

                    Intent intent = new Intent(intro.this, MainActivity3.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Intent intent = new Intent(intro.this, MainActivity2.class);
                    startActivity(intent);
                    finish();
                }
            }
        },time);
    }


}