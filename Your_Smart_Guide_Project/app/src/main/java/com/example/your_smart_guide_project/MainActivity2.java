package com.example.your_smart_guide_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    public static String Prefs_Name="MyPrefsFile";
    EditText username;
    EditText password;
    Button loginButton;

    TextView signup,forget;
    Toolbar toolbar;
    Animation anim;

    CardView card;
    DB_SQLite db= new DB_SQLite(this);
    ImageView home,person,contact;
    Spinner spinner;
    public static final String[] languages = {"", "English", "Arabic"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        signup=findViewById(R.id.signupText);
        anim= AnimationUtils.loadAnimation(this,R.anim.tran);
        toolbar=findViewById(R.id.toolbar);
        card=findViewById(R.id.card);
        forget=findViewById(R.id.forget);



        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity24();
            }
        });


//        card.setAnimation(anim);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayShowTitleEnabled(false);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                search();


            }
        });
    }

    private void openActivity24() {
        Intent intent=new Intent(this,MainActivity24.class);
        startActivity(intent);

    }

    private void openActivity4() {
        Intent intent =new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
    private void search() {
        String Nationalid=username.getText().toString();
        String Pass=password.getText().toString();
        boolean s=db.searchOnStudentsPasswords(Nationalid,Pass);

        if(s==true) {
            username.setText("");
            password.setText("");
            Intent intent =new Intent(this,MainActivity3.class);
            startActivity(intent);

        }

        else {
            Toast.makeText(this, "enter valid data", Toast.LENGTH_SHORT).show();
            username.setText("");
            password.setText("");
        }


    }
}