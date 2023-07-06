package com.example.your_smart_guide_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    EditText name,phoneNumber,nationalID,email,pass;
    Button signupButton;
    TextView login;
    Toolbar toolbar;
    Animation anim;
    DB_SQLite db= new DB_SQLite(this);

    CardView card;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        name = findViewById(R.id.name);
        phoneNumber=findViewById(R.id.phone);
        email=findViewById(R.id.email);
        nationalID = findViewById(R.id.username);
        pass = findViewById(R.id.password);




        signupButton = findViewById(R.id.signupButton);
        login=findViewById(R.id.loginText);
        toolbar=findViewById(R.id.toolbar);
        card=findViewById(R.id.card);
        anim= AnimationUtils.loadAnimation(this,R.anim.tran);

        card.setAnimation(anim);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

       signupButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               insertData();
           }
       });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();

            }
        });
    }

    private void openActivity2() {
        Intent intent =new Intent(this,MainActivity2.class);
        startActivity(intent);
    }


    public void insertData() {
        String Name=name.getText().toString();
        String PhoneNumber=phoneNumber.getText().toString();
        String NationalID=nationalID.getText().toString();
        String Email=email.getText().toString();
        String Pass=pass.getText().toString();
        boolean result=db.insert_Data_In_Student_Information(Name,PhoneNumber,NationalID,Email);
        boolean result1=db.insert_Data_In_Student_Password(NationalID,Pass);


        boolean result2=db.insert_Data_In_Student_Profile(Name,PhoneNumber,NationalID,Email,Pass);


        if(result==true&&result1==true&&result2==true){
            Intent intent =new Intent(this,MainActivity2.class);
            startActivity(intent);
            name.setText("");
            phoneNumber.setText("");
            nationalID.setText("");
            email.setText("");
            pass.setText("");


        }

        else {
            Toast.makeText(this, "enter valid data", Toast.LENGTH_LONG).show();
            name.setText("");
            phoneNumber.setText("");
            nationalID.setText("");
            email.setText("");
            pass.setText("");
        }

    }




}