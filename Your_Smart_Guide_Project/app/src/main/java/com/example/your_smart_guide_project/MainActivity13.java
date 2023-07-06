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
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity13 extends AppCompatActivity  {
    ImageView home,person,contact;
    Spinner spinner1;
    public static final String[] languages = {"", "English", "Arabic"};
    Spinner spinner,spinner2,spinner3,spinner4,spinner5,spinner6
            ,spinner7,credit1,credit2,credit3,credit4,credit5,credit6,credit7;

    Button button1;
    TextView T;
    float c1,c2,c3,c4,c5,c6,c7,total;

    int h1,h2,h3,h4,h5,h6,h7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        home=findViewById(R.id.home);
        person=findViewById(R.id.person);
        contact=findViewById(R.id.contact);

        spinner1 = findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, languages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner1.setAdapter(adapter);
        spinner1.setSelection(0);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String selectedlang = parent.getItemAtPosition(position).toString();
                if (selectedlang.equals("English")) {
                    setlocal(MainActivity13.this, "en");
                    finish();
                    startActivity(getIntent());


                } else if (selectedlang.equals("Arabic")) {
                    setlocal(MainActivity13.this, "ar");
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


















        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter1 =new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,getResources().getStringArray(R.array.grade));
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter1);


        spinner2 = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.grade, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);


        spinner3 = findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.grade, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);


        spinner4 = findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.grade, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);



        spinner5 = findViewById(R.id.spinner5);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this, R.array.grade, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);



        spinner6 = findViewById(R.id.spinner6);
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this, R.array.grade, android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(adapter6);



        spinner7 = findViewById(R.id.spinner7);
        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this, R.array.grade, android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner7.setAdapter(adapter7);



        credit1 = findViewById(R.id.credit1);
        ArrayAdapter<CharSequence> adapter11 = ArrayAdapter.createFromResource(this, R.array.cridet, android.R.layout.simple_spinner_item);
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        credit1.setAdapter(adapter11);


        credit2 = findViewById(R.id.credit2);
        ArrayAdapter<CharSequence> adapter22 = ArrayAdapter.createFromResource(this, R.array.cridet, android.R.layout.simple_spinner_item);
        adapter22.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        credit2.setAdapter(adapter22);


        credit3 = findViewById(R.id.credit3);
        ArrayAdapter<CharSequence> adapter33 = ArrayAdapter.createFromResource(this, R.array.cridet, android.R.layout.simple_spinner_item);
        adapter33.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        credit3.setAdapter(adapter33);


        credit4 = findViewById(R.id.credit4);
        ArrayAdapter<CharSequence> adapter44 = ArrayAdapter.createFromResource(this, R.array.cridet, android.R.layout.simple_spinner_item);
        adapter44.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        credit4.setAdapter(adapter44);



        credit5 = findViewById(R.id.credit5);
        ArrayAdapter<CharSequence> adapter55 = ArrayAdapter.createFromResource(this, R.array.cridet, android.R.layout.simple_spinner_item);
        adapter55.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        credit5.setAdapter(adapter55);



        credit6 = findViewById(R.id.credit6);
        ArrayAdapter<CharSequence> adapter66 = ArrayAdapter.createFromResource(this, R.array.cridet, android.R.layout.simple_spinner_item);
        adapter66.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        credit6.setAdapter(adapter66);


        credit7 = findViewById(R.id.credit7);
        ArrayAdapter<CharSequence> adapter77 = ArrayAdapter.createFromResource(this, R.array.cridet, android.R.layout.simple_spinner_item);
        adapter77.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        credit7.setAdapter(adapter77);



        button1 = findViewById(R.id.button);
        T=findViewById(R.id.T);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(spinner.getSelectedItem().toString().equals("A") ){
                    if(credit1.getSelectedItem().toString().equals("0")) {c1=0;h1=0;}
                    else if(credit1.getSelectedItem().toString().equals("1")) {c1=4;h1=1;}
                    else if(credit1.getSelectedItem().toString().equals("2")) {c1=4*2;h1=2;}
                    else if(credit1.getSelectedItem().toString().equals("3")) {c1=4*3;h1=3;}
                    else  {c1=4*4;h1=4;}
                }

                else if(spinner.getSelectedItem().toString().equals("A-") ){
                    if(credit1.getSelectedItem().toString().equals("0")) {c1= (float) (0);h1=0;}
                    else if(credit1.getSelectedItem().toString().equals("1")) {c1= (float) (3.67);h1=1;}
                    else if(credit1.getSelectedItem().toString().equals("2")) {c1= (float) (3.67*2);h1=2;}
                    else if(credit1.getSelectedItem().toString().equals("4")) {c1= (float) (3.67*4);h1=4;}
                    else  {c1= (float) (3.67*3);h1=3;}
                }

                else if(spinner.getSelectedItem().toString().equals("B+") ){
                    if(credit1.getSelectedItem().toString().equals("0")) {c1= (float) (0);h1=0;}
                    else if(credit1.getSelectedItem().toString().equals("1")) {c1= (float) (3.33);h1=1;}
                    else if(credit1.getSelectedItem().toString().equals("2")) {c1= (float) (3.33*2);h1=2;}
                    else if(credit1.getSelectedItem().toString().equals("4")) {c1= (float) (3.33*4);h1=4;}
                    else  {c1= (float) (3.33*3);h1=3;}
                }

                else  if(spinner.getSelectedItem().toString().equals("B")){
                    if(credit1.getSelectedItem().toString().equals("0")) {c1= (float) (0);h1=0;}
                    else if(credit1.getSelectedItem().toString().equals("1")) {c1= (float) (3);h1=1;}
                    else if(credit1.getSelectedItem().toString().equals("2")) {c1= (float) (3*2);h1=2;}
                    else if(credit1.getSelectedItem().toString().equals("4")) {c1= (float) (3*4);h1=4;}
                    else  {c1= (float) (3*3);h1=3;}
                }

                else  if(spinner.getSelectedItem().toString().equals("C+")){
                    if(credit1.getSelectedItem().toString().equals("0")) {c1= (float) (0);h1=0;}
                    else if(credit1.getSelectedItem().toString().equals("1")) {c1= (float) (2.67);h1=1;}
                    else if(credit1.getSelectedItem().toString().equals("2")) {c1= (float) (2.67*2);h1=2;}
                    else if(credit1.getSelectedItem().toString().equals("4")) {c1= (float) (2.33*4);h1=4;}
                    else  {c1= (float) (2.67*3);h1=3;}
                }

                else if(spinner.getSelectedItem().toString().equals("C")){
                    if(credit1.getSelectedItem().toString().equals("0")) {c1= (float) (0);h1=0;}
                    else if(credit1.getSelectedItem().toString().equals("1")) {c1= (float) (2.33);h1=1;}
                    else if(credit1.getSelectedItem().toString().equals("2")) {c1= (float) (2.33*2);h1=2;}
                    else if(credit1.getSelectedItem().toString().equals("4")) {c1= (float) (2.33*4);h1=4;}
                    else  {c1= (float) (2.33*3);h1=3;}
                }

                else  if(spinner.getSelectedItem().toString().equals("D") ){
                    if(credit1.getSelectedItem().toString().equals("0")) {c1= (float) (0);h1=0;}
                    else if(credit1.getSelectedItem().toString().equals("1")) {c1= (float) (2);h1=1;}
                    else if(credit1.getSelectedItem().toString().equals("2")) {c1= (float) (2*2);h1=2;}
                    else if(credit1.getSelectedItem().toString().equals("4")) {c1= (float) (0);h1=4;}
                    else  {c1= (float) (2*3);h1=3;}
                }

                else  if(spinner.getSelectedItem().toString().equals("F") ){
                    if(credit1.getSelectedItem().toString().equals("0")) {c1= (float) (0);h1=0;}
                    else if(credit1.getSelectedItem().toString().equals("1")) {c1= (float) (0);h1=1;}
                    else if(credit1.getSelectedItem().toString().equals("2")) {c1= (float) (0);h1=2;}
                    else if(credit1.getSelectedItem().toString().equals("4")) {c1= (float) (0);h1=4;}
                    else  {c1= (float) (0);h1=3;}
                }

                else  if(spinner.getSelectedItem().toString().equals("Abs") ){
                    if(credit1.getSelectedItem().toString().equals("0")) {c1= (float) (0);h1=0;}
                    else if(credit1.getSelectedItem().toString().equals("1")) {c1= (float) (0);h1=1;}
                    else if(credit1.getSelectedItem().toString().equals("2")) {c1= (float) (0);h1=2;}
                    else if(credit1.getSelectedItem().toString().equals("4")) {c1= (float) (0);h1=4;}
                    else  {c1= (float) (0);h1=3;}
                }

                else  if(spinner.getSelectedItem().toString().equals("I")){
                    if(credit1.getSelectedItem().toString().equals("0")) {c1= (float) (0);h1=0;}
                    else if(credit1.getSelectedItem().toString().equals("1")) {c1= (float) (0);h1=1;}
                    else if(credit1.getSelectedItem().toString().equals("2")) {c1= (float) (0);h1=2;}
                    else if(credit1.getSelectedItem().toString().equals("4")) {c1= (float) (0);h1=4;}
                    else  {c1= (float) (0);h1=3;}
                }

                else  if(spinner.getSelectedItem().toString().equals("W") ){
                    if(credit1.getSelectedItem().toString().equals("0")) {c1= (float) (0);h1=0;}
                    else if(credit1.getSelectedItem().toString().equals("1")) {c1= (float) (0);h1=1;}
                    else if(credit1.getSelectedItem().toString().equals("2")) {c1= (float) (0);h1=2;}
                    else if(credit1.getSelectedItem().toString().equals("4")) {c1= (float) (0);h1=4;}
                    else  {c1= (float) (0);h1=3;}
                }

                else  if(spinner.getSelectedItem().toString().equals("Ba")){
                    if(credit1.getSelectedItem().toString().equals("0")) {c1= (float) (0);h1=0;}
                    else if(credit1.getSelectedItem().toString().equals("1")) {c1= (float) (0);h1=1;}
                    else if(credit1.getSelectedItem().toString().equals("2")) {c1= (float) (0);h1=2;}
                    else if(credit1.getSelectedItem().toString().equals("4")) {c1= (float) (0);h1=4;}
                    else  {c1= (float) (0);h1=3;}
                }
                else{c1=0;h1=0;}


////////////////////

                if(spinner2.getSelectedItem().toString().equals("A") ){
                    if(credit2.getSelectedItem().toString().equals("0")) {c2=0;h2=0;}
                    else if(credit2.getSelectedItem().toString().equals("1")) {c2=4;h2=1;}
                    else if(credit2.getSelectedItem().toString().equals("2")) {c2=4*2;h2=2;}
                    else if(credit2.getSelectedItem().toString().equals("4")) {c2=4*4;h2=4;}
                    else  {c2=4*3;h2=3;}
                }

                else  if(spinner2.getSelectedItem().toString().equals("A-") ){
                    if(credit2.getSelectedItem().toString().equals("0")) {c2= (float) (0);h2=0;}
                    else if(credit2.getSelectedItem().toString().equals("1")) {c2= (float) (3.67);h2=1;}
                    else if(credit2.getSelectedItem().toString().equals("2")) {c2= (float) (3.67*2);h2=2;}
                    else if(credit2.getSelectedItem().toString().equals("4")) {c2= (float) (3.67*4);h2=4;}
                    else  {c2= (float) (3.67*3);h2=3;}
                }

                else if(spinner2.getSelectedItem().toString().equals("B+")){
                    if(credit2.getSelectedItem().toString().equals("0")) {c2= (float) (0);h2=0;}
                    else if(credit2.getSelectedItem().toString().equals("1")) {c2= (float) (3.33);h2=1;}
                    else if(credit2.getSelectedItem().toString().equals("2")) {c2= (float) (3.33*2);h2=2;}
                    else if(credit2.getSelectedItem().toString().equals("4")) {c2= (float) (3.67*4);h2=4;}
                    else  {c2= (float) (3.33*3);h2=3;}
                }

                else if(spinner2.getSelectedItem().toString().equals("B") ){
                    if(credit2.getSelectedItem().toString().equals("0")) {c2= (float) (0);h2=0;}
                    else if(credit2.getSelectedItem().toString().equals("1")) {c2= (float) (3);h2=1;}
                    else if(credit2.getSelectedItem().toString().equals("2")) {c2= (float) (3*2);h2=2;}
                    else if(credit2.getSelectedItem().toString().equals("4")) {c2=3*4;h2=4;}
                    else  {c2= (float) (3*3);h2=3;}
                }

                else  if(spinner2.getSelectedItem().toString().equals("c+") ){
                    if(credit2.getSelectedItem().toString().equals("0")) {c2= (float) (0);h2=0;}
                    else if(credit2.getSelectedItem().toString().equals("1")) {c2= (float) (2.67);h2=1;}
                    else if(credit2.getSelectedItem().toString().equals("2")) {c2= (float) (2.67*2);h2=2;}
                    else if(credit2.getSelectedItem().toString().equals("4")) {c2= (float) (2.67*4);h2=4;}
                    else  {c2= (float) (2.67*3);h2=3;}
                }

                else  if(spinner2.getSelectedItem().toString().equals("C") ){
                    if(credit2.getSelectedItem().toString().equals("0")) {c2= (float) (0);h2=0;}
                    else if(credit2.getSelectedItem().toString().equals("1")) {c2= (float) (2.33);h2=1;}
                    else if(credit2.getSelectedItem().toString().equals("2")) {c2= (float) (2.33*2);h2=2;}
                    else if(credit2.getSelectedItem().toString().equals("4")) {c2= (float) (2.33*4);h2=4;}
                    else  {c2= (float) (2.33*3);h2=3;}
                }

                else  if(spinner2.getSelectedItem().toString().equals("D")){
                    if(credit2.getSelectedItem().toString().equals("0")) {c2= (float) (0);h2=0;}
                    else if(credit2.getSelectedItem().toString().equals("1")) {c2= (float) (2);h2=1;}
                    else if(credit2.getSelectedItem().toString().equals("2")) {c2= (float) (2*2);h2=2;}
                    else if(credit2.getSelectedItem().toString().equals("4")) {c2=2*4;h2=4;}
                    else  {c2= (float) (2*3);h2=3;}
                }

                else if(spinner2.getSelectedItem().toString().equals("F") ){
                    if(credit2.getSelectedItem().toString().equals("0")) {c2= (float) (0);h2=0;}
                    else if(credit2.getSelectedItem().toString().equals("1")) {c2= (float) (0);h2=1;}
                    else if(credit2.getSelectedItem().toString().equals("2")) {c2= (float) (0);h2=2;}
                    else if(credit2.getSelectedItem().toString().equals("4")) {c2=0;h2=4;}
                    else  {c2= (float) (0);h2=3;}
                }

                else  if(spinner2.getSelectedItem().toString().equals("Abs") ){
                    if(credit2.getSelectedItem().toString().equals("0")) {c2= (float) (0);h2=0;}
                    else if(credit2.getSelectedItem().toString().equals("1")) {c2= (float) (0);h2=1;}
                    else if(credit2.getSelectedItem().toString().equals("2")) {c2= (float) (0);h2=2;}
                    else if(credit2.getSelectedItem().toString().equals("4")) {c2=0;h2=4;}
                    else  {c2= (float) (0);h2=3;}
                }

                else if(spinner2.getSelectedItem().toString().equals("I")){
                    if(credit2.getSelectedItem().toString().equals("0")) {c2= (float) (0);h2=0;}
                    else if(credit2.getSelectedItem().toString().equals("1")) {c2= (float) (0);h2=1;}
                    else if(credit2.getSelectedItem().toString().equals("2")) {c2= (float) (0);h2=2;}
                    else if(credit2.getSelectedItem().toString().equals("4")) {c2=0;h2=4;}
                    else  {c2= (float) (0);h2=3;}
                }

                else  if(spinner2.getSelectedItem().toString().equals("W") ){
                    if(credit2.getSelectedItem().toString().equals("0")) {c2= (float) (0);h2=0;}
                    else if(credit2.getSelectedItem().toString().equals("1")) {c2= (float) (0);h2=1;}
                    else if(credit2.getSelectedItem().toString().equals("2")) {c2= (float) (0);h2=2;}
                    else if(credit2.getSelectedItem().toString().equals("4")) {c2=0;h2=4;}
                    else  {c2= (float) (0);h2=3;}
                }

                else  if(spinner2.getSelectedItem().toString().equals("Ba") ){
                    if(credit2.getSelectedItem().toString().equals("0")) {c2= (float) (0);h2=0;}
                    else if(credit2.getSelectedItem().toString().equals("1")) {c2= (float) (0);h2=1;}
                    else if(credit2.getSelectedItem().toString().equals("2")) {c2= (float) (0);h2=2;}
                    else if(credit2.getSelectedItem().toString().equals("4")) {c2=0;h2=4;}
                    else  {c2= (float) (0);h2=3;}
                }
                else{c2=0;h2=0;}

///////////////////

                if(spinner3.getSelectedItem().toString().equals("A")){
                    if(credit3.getSelectedItem().toString().equals("0")) {c3=0;h3=0;}
                    else if(credit3.getSelectedItem().toString().equals("1")) {c3=4;h3=1;}
                    else if(credit3.getSelectedItem().toString().equals("2")) {c3=4*2;h3=2;}
                    else if(credit3.getSelectedItem().toString().equals("4")) {c3=4*4;h3=4;}
                    else  {c3=4*3;h3=3;}
                }

                else if(spinner3.getSelectedItem().toString().equals("A-") ){
                    if(credit3.getSelectedItem().toString().equals("0")) {c3= (float) (0);h3=0;}
                    else if(credit3.getSelectedItem().toString().equals("1")) {c3= (float) (3.67);h3=1;}
                    else if(credit3.getSelectedItem().toString().equals("2")) {c3= (float) (3.67*2);h3=2;}
                    else if(credit3.getSelectedItem().toString().equals("4")) {c3= (float) (3.67*4);h3=4;}
                    else  {c3= (float) (3.67*3);h3=3;}
                }

                else  if(spinner3.getSelectedItem().toString().equals("B+") ){
                    if(credit3.getSelectedItem().toString().equals("0")) {c3= (float) (0);h3=0;}
                    else if(credit3.getSelectedItem().toString().equals("1")) {c3= (float) (3.33);h3=1;}
                    else if(credit3.getSelectedItem().toString().equals("2")) {c3= (float) (3.33*2);h3=2;}
                    else if(credit3.getSelectedItem().toString().equals("4")) {c3= (float) (3.33*4);h3=4;}
                    else  {c3= (float) (3.33*3);h3=3;}
                }

                else  if(spinner3.getSelectedItem().toString().equals("B") ){
                    if(credit3.getSelectedItem().toString().equals("0")) {c3= (float) (0);h3=0;}
                    else if(credit3.getSelectedItem().toString().equals("1")) {c3= (float) (3);h3=1;}
                    else if(credit3.getSelectedItem().toString().equals("2")) {c3= (float) (3*2);h3=2;}
                    else if(credit3.getSelectedItem().toString().equals("4")) {c3=3*4;h3=4;}
                    else  {c3= (float) (3*3);h3=3;}
                }

                else  if(spinner3.getSelectedItem().toString().equals("C+") ){
                    if(credit3.getSelectedItem().toString().equals("0")) {c3= (float) (0);h3=0;}
                    else if(credit3.getSelectedItem().toString().equals("1")) {c3= (float) (2.67);h3=1;}
                    else if(credit3.getSelectedItem().toString().equals("2")) {c3= (float) (2.67*2);h3=2;}
                    else if(credit3.getSelectedItem().toString().equals("4")) {c3= (float) (2.67*4);h3=4;}
                    else  {c3= (float) (2.67*3);h3=3;}
                }

                else if(spinner3.getSelectedItem().toString().equals("C") ){
                    if(credit3.getSelectedItem().toString().equals("0")) {c3= (float) (0);h3=0;}
                    else if(credit3.getSelectedItem().toString().equals("1")) {c3= (float) (2.33);h3=1;}
                    else if(credit3.getSelectedItem().toString().equals("2")) {c3= (float) (2.33*2);h3=2;}
                    else if(credit3.getSelectedItem().toString().equals("4")) {c3= (float) (2.33*4);h3=4;}
                    else  {c3= (float) (2.33*3);h3=3;}
                }

                else  if(spinner3.getSelectedItem().toString().equals("D") ){
                    if(credit3.getSelectedItem().toString().equals("0")) {c3= (float) (0);h3=0;}
                    else if(credit3.getSelectedItem().toString().equals("1")) {c3= (float) (2);h3=1;}
                    else if(credit3.getSelectedItem().toString().equals("2")) {c3= (float) (2*2);h3=2;}
                    else if(credit3.getSelectedItem().toString().equals("4")) {c3=2*4;h3=4;}
                    else  {c3= (float) (2*3);h3=3;}
                }

                else  if(spinner3.getSelectedItem().toString().equals("F") ){
                    if(credit3.getSelectedItem().toString().equals("0")) {c3= (float) (0);h3=0;}
                    else if(credit3.getSelectedItem().toString().equals("1")) {c3= (float) (0);h3=1;}
                    else if(credit3.getSelectedItem().toString().equals("2")) {c3= (float) (0);h3=2;}
                    else if(credit3.getSelectedItem().toString().equals("4")) {c3=4*4;h3=4;}
                    else  {c3= (float) (0);h3=3;}
                }

                else  if(spinner3.getSelectedItem().toString().equals("Abs") ){
                    if(credit3.getSelectedItem().toString().equals("0")) {c3= (float) (0);h3=0;}
                    else if(credit3.getSelectedItem().toString().equals("1")) {c3= (float) (0);h3=1;}
                    else if(credit3.getSelectedItem().toString().equals("2")) {c3= (float) (0);h3=2;}
                    else if(credit3.getSelectedItem().toString().equals("4")) {c3=0;h3=4;}
                    else  {c3= (float) (0);h3=3;}
                }

                else  if(spinner3.getSelectedItem().toString().equals("I") ){
                    if(credit3.getSelectedItem().toString().equals("0")) {c3= (float) (0);h3=0;}
                    else if(credit3.getSelectedItem().toString().equals("1")) {c3= (float) (0);h3=1;}
                    else if(credit3.getSelectedItem().toString().equals("2")) {c3= (float) (0);h3=2;}
                    else if(credit3.getSelectedItem().toString().equals("4")) {c3=0;h3=4;}
                    else  {c3= (float) (0);h3=3;}
                }

                else  if(spinner3.getSelectedItem().toString().equals("W") ){
                    if(credit3.getSelectedItem().toString().equals("0")) {c3= (float) (0);h3=0;}
                    else if(credit3.getSelectedItem().toString().equals("1")) {c3= (float) (0);h3=1;}
                    else if(credit3.getSelectedItem().toString().equals("2")) {c3= (float) (0);h3=2;}
                    else if(credit3.getSelectedItem().toString().equals("4")) {c3=0;h3=4;}
                    else  {c3= (float) (0);h3=3;}
                }

                else  if(spinner3.getSelectedItem().toString().equals("Ba") ){
                    if(credit3.getSelectedItem().toString().equals("0")) {c3= (float) (0);h3=0;}
                    else if(credit3.getSelectedItem().toString().equals("1")) {c3= (float) (0);h3=1;}
                    else if(credit3.getSelectedItem().toString().equals("2")) {c3= (float) (0);h3=2;}
                    else if(credit3.getSelectedItem().toString().equals("4")) {c3=0;h3=4;}
                    else  {c3= (float) (0);h3=3;}
                }
                else{c3=0;h3=0;}

//////////////////////////

                if(spinner4.getSelectedItem().toString().equals("A") ){
                    if(credit4.getSelectedItem().toString().equals("0")) {c4=0;h4=0;}
                    else if(credit4.getSelectedItem().toString().equals("1")) {c4=4;h4=1;}
                    else if(credit4.getSelectedItem().toString().equals("2")) {c4=4*2;h4=2;}
                    else if(credit4.getSelectedItem().toString().equals("4")) {c4=4*4;h4=4;}
                    else  {c4=4*3;h4=3;}
                }

                else if(spinner4.getSelectedItem().toString().equals("A-") ){
                    if(credit4.getSelectedItem().toString().equals("0")) {c4= (float) (0);h4=0;}
                    else if(credit4.getSelectedItem().toString().equals("1")) {c4= (float) (3.67);h4=1;}
                    else if(credit4.getSelectedItem().toString().equals("2")) {c4= (float) (3.67*2);h4=2;}
                    else if(credit4.getSelectedItem().toString().equals("4")) {c4= (float) (3.67*4);h4=4;}
                    else  {c4= (float) (3.67*3);h4=3;}
                }

                else if(spinner4.getSelectedItem().toString().equals("B+") ){
                    if(credit4.getSelectedItem().toString().equals("0")) {c4= (float) (0);h4=0;}
                    else if(credit4.getSelectedItem().toString().equals("1")) {c4= (float) (3.33);h4=1;}
                    else if(credit4.getSelectedItem().toString().equals("2")) {c4= (float) (3.33*2);h4=2;}
                    else if(credit4.getSelectedItem().toString().equals("4")) {c4= (float) (3.33*4);h4=4;}
                    else  {c4= (float) (3.33*3);h4=3;}
                }

                else if(spinner4.getSelectedItem().toString().equals("B")){
                    if(credit4.getSelectedItem().toString().equals("0")) {c4= (float) (0);h4=0;}
                    else if(credit4.getSelectedItem().toString().equals("1")) {c4= (float) (3);h4=1;}
                    else if(credit4.getSelectedItem().toString().equals("2")) {c4= (float) (3*2);h4=2;}
                    else if(credit4.getSelectedItem().toString().equals("4")) {c4=3*4;h4=4;}
                    else  {c4= (float) (3*3);h4=3;}
                }

                else if(spinner4.getSelectedItem().toString().equals("C+") ){
                    if(credit4.getSelectedItem().toString().equals("0")) {c4= (float) (0);h4=0;}
                    else if(credit4.getSelectedItem().toString().equals("1")) {c4= (float) (2.67);h4=1;}
                    else if(credit4.getSelectedItem().toString().equals("2")) {c4= (float) (2.67*2);h4=2;}
                    else if(credit4.getSelectedItem().toString().equals("4")) {c4= (float) (2.67*4);h4=4;}
                    else  {c4= (float) (2.67*3);h4=3;}
                }

                else if(spinner4.getSelectedItem().toString().equals("C") ){
                    if(credit4.getSelectedItem().toString().equals("0")) {c4= (float) (0);h4=0;}
                    else if(credit4.getSelectedItem().toString().equals("1")) {c4= (float) (2.33);h4=1;}
                    else if(credit4.getSelectedItem().toString().equals("2")) {c4= (float) (2.33*2);h4=2;}
                    else if(credit4.getSelectedItem().toString().equals("4")) {c4= (float) (2.33*4);h4=4;}
                    else  {c4= (float) (2.33*3);h4=3;}
                }

                else if(spinner4.getSelectedItem().toString().equals("D") ){
                    if(credit4.getSelectedItem().toString().equals("0")) {c4= (float) (0);h4=0;}
                    else if(credit4.getSelectedItem().toString().equals("1")) {c4= (float) (2);h4=1;}
                    else if(credit4.getSelectedItem().toString().equals("2")) {c4= (float) (2*2);h4=2;}
                    else if(credit4.getSelectedItem().toString().equals("4")) {c4=2*4;h4=4;}
                    else  {c4= (float) (2*3);h4=3;}
                }

                else if(spinner4.getSelectedItem().toString().equals("F")){
                    if(credit4.getSelectedItem().toString().equals("0")) {c4= (float) (0);h4=0;}
                    else if(credit4.getSelectedItem().toString().equals("1")) {c4= (float) (0);h4=1;}
                    else if(credit4.getSelectedItem().toString().equals("2")) {c4= (float) (0);h4=2;}
                    else if(credit4.getSelectedItem().toString().equals("4")) {c4=0;h4=4;}
                    else  {c4= (float) (0);h4=3;}
                }

                else if(spinner4.getSelectedItem().toString().equals("Abs") ){
                    if(credit4.getSelectedItem().toString().equals("0")) {c4= (float) (0);h4=0;}
                    else if(credit4.getSelectedItem().toString().equals("1")) {c4= (float) (0);h4=1;}
                    else if(credit4.getSelectedItem().toString().equals("2")) {c4= (float) (0);h4=2;}
                    else if(credit4.getSelectedItem().toString().equals("4")) {c4=0;h4=4;}
                    else  {c4= (float) (0);h4=3;}
                }

                else if(spinner4.getSelectedItem().toString().equals("I") ){
                    if(credit4.getSelectedItem().toString().equals("0")) {c4= (float) (0);h4=0;}
                    else if(credit4.getSelectedItem().toString().equals("1")) {c4= (float) (0);h4=1;}
                    else if(credit4.getSelectedItem().toString().equals("2")) {c4= (float) (0);h4=2;}
                    else if(credit4.getSelectedItem().toString().equals("4")) {c4=0;h4=4;}
                    else  {c4= (float) (0);h4=3;}
                }

                else  if(spinner4.getSelectedItem().toString().equals("W") ){
                    if(credit4.getSelectedItem().toString().equals("0")) {c4= (float) (0);h4=0;}
                    else if(credit4.getSelectedItem().toString().equals("1")) {c4= (float) (0);h4=1;}
                    else if(credit4.getSelectedItem().toString().equals("2")) {c4= (float) (0);h4=2;}
                    else if(credit4.getSelectedItem().toString().equals("4")) {c4=0;h4=4;}
                    else  {c4= (float) (0);h4=3;}
                }

                else if(spinner4.getSelectedItem().toString().equals("Ba") ){
                    if(credit4.getSelectedItem().toString().equals("0")) {c4= (float) (0);h4=0;}
                    else if(credit4.getSelectedItem().toString().equals("1")) {c4= (float) (0);h4=1;}
                    else if(credit4.getSelectedItem().toString().equals("2")) {c4= (float) (0);h4=2;}
                    else if(credit4.getSelectedItem().toString().equals("4")) {c4=0;h4=4;}
                    else  {c4= (float) (0);h4=3;}
                }
                else{c4=0;h4=0;}

///////////////////////
                if(spinner5.getSelectedItem().toString().equals("A") ){
                    if(credit5.getSelectedItem().toString().equals("0")) {c5=0;h5=0;}
                    else if(credit5.getSelectedItem().toString().equals("1")) {c5=4;h5=1;}
                    else if(credit5.getSelectedItem().toString().equals("2")) {c5=4*2;h5=2;}
                    else if(credit5.getSelectedItem().toString().equals("4")) {c5=4*4;h5=4;}
                    else  {c5=4*3;h5=3;}
                }

                else if(spinner5.getSelectedItem().toString().equals("A-") ){
                    if(credit5.getSelectedItem().toString().equals("0")) {c5= (float) (0);h5=0;}
                    else if(credit5.getSelectedItem().toString().equals("1")) {c5= (float) (3.67);h5=1;}
                    else if(credit5.getSelectedItem().toString().equals("2")) {c5= (float) (3.67*2);h5=2;}
                    else if(credit5.getSelectedItem().toString().equals("4")) {c5=4*4;h5=4;}
                    else  {c5= (float) (3.67*3);h5=3;}
                }

                else if(spinner5.getSelectedItem().toString().equals("B+") ){
                    if(credit5.getSelectedItem().toString().equals("0")) {c5= (float) (3.33*0);h5=0;}
                    else if(credit5.getSelectedItem().toString().equals("1")) {c5= (float) (3.33*1);h5=1;}
                    else if(credit5.getSelectedItem().toString().equals("2")) {c5= (float) (3.33*2);h5=2;}
                    else if(credit5.getSelectedItem().toString().equals("4")) {c5=4*4;h5=4;}
                    else  {c5= (float) (3.33*3);h5=3;}
                }

                else if(spinner5.getSelectedItem().toString().equals("b") ){
                    if(credit5.getSelectedItem().toString().equals("0")) {c5= (float) (0);h5=0;}
                    else if(credit5.getSelectedItem().toString().equals("1")) {c5= (float) (3);h5=1;}
                    else if(credit5.getSelectedItem().toString().equals("2")) {c5= (float) (3*2);h5=2;}
                    else if(credit5.getSelectedItem().toString().equals("4")) {c5=4*4;h5=4;}
                    else  {c5= (float) (3*3);h5=3;}
                }

                else if(spinner5.getSelectedItem()=="c+" ){
                    if(credit5.getSelectedItem()=="0") {c5= (float) (0);h5=0;}
                    else if(credit5.getSelectedItem()=="1") {c5= (float) (2.67);h5=1;}
                    else if(credit5.getSelectedItem()=="2") {c5= (float) (2.67*2);h5=2;}
                    else if(credit5.getSelectedItem()=="4") {c5=4*4;h5=4;}
                    else  {c5= (float) (2.67*3);h5=3;}
                }

                else if(spinner5.getSelectedItem().toString().equals("C") ){
                    if(credit5.getSelectedItem().toString().equals("0")) {c5= (float) (0);h5=0;}
                    else if(credit5.getSelectedItem().toString().equals("1")) {c5= (float) (2.33);h5=1;}
                    else if(credit5.getSelectedItem().toString().equals("2")) {c5= (float) (2.33*2);h5=2;}
                    else if(credit5.getSelectedItem().toString().equals("4")) {c5=4*4;h5=4;}
                    else  {c5= (float) (2.33*3);h5=3;}
                }

                else  if(spinner5.getSelectedItem().toString().equals("D")){
                    if(credit5.getSelectedItem().toString().equals("0")) {c5= (float) (0);h5=0;}
                    else if(credit5.getSelectedItem().toString().equals("1")) {c5= (float) (2);h5=1;}
                    else if(credit5.getSelectedItem().toString().equals("2")) {c5= (float) (2*2);h5=2;}
                    else if(credit5.getSelectedItem().toString().equals("4")) {c5=4*4;h5=4;}
                    else  {c5= (float) (2*3);h5=3;}
                }

                else if(spinner5.getSelectedItem().toString().equals("F") ){
                    if(credit5.getSelectedItem().toString().equals("0")) {c5= (float) (0);h5=0;}
                    else if(credit5.getSelectedItem().toString().equals("1")) {c5= (float) (0);h5=1;}
                    else if(credit5.getSelectedItem().toString().equals("2")) {c5= (float) (0);h5=2;}
                    else if(credit5.getSelectedItem().toString().equals("4")) {c5=4*4;h5=4;}
                    else  {c5= (float) (0);h5=3;}
                }

                else if(spinner5.getSelectedItem().toString().equals("Abs") ){
                    if(credit5.getSelectedItem().toString().equals("0")) {c5= (float) (0);h5=0;}
                    else if(credit5.getSelectedItem().toString().equals("1")) {c5= (float) (0);h5=1;}
                    else if(credit5.getSelectedItem().toString().equals("2")) {c5= (float) (0);h5=2;}
                    else if(credit5.getSelectedItem().toString().equals("4")) {c5=4*4;h5=4;}
                    else  {c5= (float) (0);h5=3;}
                }

                else if(spinner5.getSelectedItem().toString().equals("I") ){
                    if(credit5.getSelectedItem().toString().equals("0")) {c5= (float) (0);h5=0;}
                    else if(credit5.getSelectedItem().toString().equals("1")) {c5= (float) (0);h5=1;}
                    else if(credit5.getSelectedItem().toString().equals("2")) {c5= (float) (0);h5=2;}
                    else if(credit5.getSelectedItem().toString().equals("4")) {c5=4*4;h5=4;}
                    else  {c5= (float) (0);h5=3;}
                }

                else if(spinner5.getSelectedItem().toString().equals("W") ){
                    if(credit5.getSelectedItem().toString().equals("0")) {c5= (float) (0);h5=0;}
                    else if(credit5.getSelectedItem().toString().equals("1")) {c5= (float) (0);h5=1;}
                    else if(credit5.getSelectedItem().toString().equals("2")) {c5= (float) (0);h5=2;}
                    else if(credit5.getSelectedItem().toString().equals("4")) {c5=4*4;h5=4;}
                    else  {c5= (float) (0);h5=3;}
                }

                else if(spinner5.getSelectedItem().toString().equals("Ba") ){
                    if(credit5.getSelectedItem().toString().equals("0")) {c5= (float) (0);h5=0;}
                    else if(credit5.getSelectedItem().toString().equals("1")) {c5= (float) (0);h5=1;}
                    else if(credit5.getSelectedItem().toString().equals("2")) {c5= (float) (0);h5=2;}
                    else if(credit5.getSelectedItem().toString().equals("4")) {c5=4*4;h5=4;}
                    else  {c5= (float) (0);h5=3;}
                }
                else{c5=0;h5=0;}


//////////////////////////////////////////
                if(spinner6.getSelectedItem().toString().equals("A") ){
                    if(credit6.getSelectedItem().toString().equals("0")) {c6=0;h6=0;}
                    else if(credit6.getSelectedItem().toString().equals("1")) {c6=4;h6=1;}
                    else if(credit6.getSelectedItem().toString().equals("2")) {c6=4*2;h6=2;}
                    else if(credit6.getSelectedItem().toString().equals("4")) {c6=4*4;h6=4;}
                    else  {c6=4*3;h6=3;}
                }

                else  if(spinner6.getSelectedItem().toString().equals("A-")){
                    if(credit6.getSelectedItem().toString().equals("0")) {c6= (float) (0);h6=0;}
                    else if(credit6.getSelectedItem().toString().equals("1")) {c6= (float) (3.67);h6=1;}
                    else if(credit6.getSelectedItem().toString().equals("2")) {c6= (float) (3.67*2);h6=2;}
                    else if(credit6.getSelectedItem().toString().equals("4")) {c6=4*4;h6=4;}
                    else  {c6= (float) (3.67*3);h6=3;}
                }

                else if(spinner6.getSelectedItem().toString().equals("B+") ){
                    if(credit6.getSelectedItem().toString().equals("0")) {c6= (float) (0);h6=0;}
                    else if(credit6.getSelectedItem().toString().equals("1")) {c6= (float) (3.33);h6=1;}
                    else if(credit6.getSelectedItem().toString().equals("2")) {c6= (float) (3.33*2);h6=2;}
                    else if(credit6.getSelectedItem().toString().equals("4")) {c6=4*4;h6=4;}
                    else  {c6= (float) (3.33*3);h6=3;}
                }

                else if(spinner6.getSelectedItem().toString().equals("B") ){
                    if(credit6.getSelectedItem().toString().equals("0")) {c6= (float) (0);h6=0;}
                    else if(credit6.getSelectedItem().toString().equals("1")) {c6= (float) (3);h6=1;}
                    else if(credit6.getSelectedItem().toString().equals("2")) {c6= (float) (3*2);h6=2;}
                    else if(credit6.getSelectedItem().toString().equals("4")) {c6=4*4;h6=4;}
                    else  {c6= (float) (3*3);h6=3;}
                }

                else  if(spinner6.getSelectedItem().toString().equals("C+") ){
                    if(credit6.getSelectedItem().toString().equals("0")) {c6= (float) (0);h6=0;}
                    else if(credit6.getSelectedItem().toString().equals("1")) {c6= (float) (2.67);h6=1;}
                    else if(credit6.getSelectedItem().toString().equals("2")) {c6= (float) (2.67*2);h6=2;}
                    else if(credit6.getSelectedItem().toString().equals("4")) {c6=4*4;h6=4;}
                    else  {c6= (float) (2.67*3);h6=3;}
                }

                else  if(spinner6.getSelectedItem().toString().equals("C") ){
                    if(credit6.getSelectedItem().toString().equals("0")) {c6= (float) (0);h6=0;}
                    else if(credit6.getSelectedItem().toString().equals("1")) {c6= (float) (2.33);h6=1;}
                    else if(credit6.getSelectedItem().toString().equals("2")) {c6= (float) (2.33*2);h6=2;}
                    else if(credit6.getSelectedItem().toString().equals("4")) {c6=4*4;h6=4;}
                    else  {c6= (float) (2.33*3);h6=3;}
                }

                else if(spinner6.getSelectedItem().toString().equals("D") ){
                    if(credit6.getSelectedItem().toString().equals("0")) {c6= (float) (0);h6=0;}
                    else if(credit6.getSelectedItem().toString().equals("1")) {c6= (float) (2);h6=1;}
                    else if(credit6.getSelectedItem().toString().equals("2")) {c6= (float) (2*2);h6=2;}
                    else if(credit6.getSelectedItem().toString().equals("4")) {c6=4*4;h6=4;}
                    else  {c6= (float) (2*3);h6=3;}
                }

                else if(spinner6.getSelectedItem().toString().equals("F") ){
                    if(credit6.getSelectedItem().toString().equals("0")) {c6= (float) (0);h6=0;}
                    else if(credit6.getSelectedItem().toString().equals("1")) {c6= (float) (0);h6=1;}
                    else if(credit6.getSelectedItem().toString().equals("2")) {c6= (float) (0);h6=2;}
                    else if(credit6.getSelectedItem().toString().equals("4")) {c6=4*4;h6=4;}
                    else  {c6= (float) (0);h6=3;}
                }

                else if(spinner6.getSelectedItem().toString().equals("Abs") ){
                    if(credit6.getSelectedItem().toString().equals("0")) {c6= (float) (0);h6=0;}
                    else if(credit6.getSelectedItem().toString().equals("1")) {c6= (float) (0);h6=1;}
                    else if(credit6.getSelectedItem().toString().equals("2")) {c6= (float) (0);h6=2;}
                    else if(credit6.getSelectedItem().toString().equals("4")) {c6=4*4;h6=4;}
                    else  {c6= (float) (0);h6=3;}
                }

                else if(spinner6.getSelectedItem().toString().equals("I") ){
                    if(credit6.getSelectedItem().toString().equals("0")) {c6= (float) (0);h6=0;}
                    else if(credit6.getSelectedItem().toString().equals("1")) {c6= (float) (0);h6=1;}
                    else if(credit6.getSelectedItem().toString().equals("2")) {c6= (float) (0);h6=2;}
                    else if(credit6.getSelectedItem().toString().equals("4")) {c6=4*4;h6=4;}
                    else  {c6= (float) (0);h6=3;}
                }

                else if(spinner6.getSelectedItem().toString().equals("W") ){
                    if(credit6.getSelectedItem().toString().equals("0")) {c6= (float) (0);h6=0;}
                    else if(credit6.getSelectedItem().toString().equals("1")) {c6= (float) (0);h6=1;}
                    else if(credit6.getSelectedItem().toString().equals("2")) {c6= (float) (0);h6=2;}
                    else if(credit6.getSelectedItem().toString().equals("4")) {c6=4*4;h6=4;}
                    else  {c6= (float) (0);h6=3;}
                }

                else if(spinner6.getSelectedItem().toString().equals("Ba")){
                    if(credit6.getSelectedItem().toString().equals("0")) {c6= (float) (0);h6=0;}
                    else if(credit6.getSelectedItem().toString().equals("1")) {c6= (float) (0);h6=1;}
                    else if(credit6.getSelectedItem().toString().equals("2")) {c6= (float) (0);h6=2;}
                    else if(credit6.getSelectedItem().toString().equals("4")) {c6=4*4;h6=4;}
                    else  {c6= (float) (0);h6=3;}
                }
                else{c6=0;h6=0;}

////////////////////////////////////////

                if(spinner7.getSelectedItem().toString().equals("A") ){
                    if(credit7.getSelectedItem().toString().equals("0")) {c7=0;h7=0;}
                    else if(credit7.getSelectedItem().toString().equals("1")) {c7=4;h7=1;}
                    else if(credit7.getSelectedItem().toString().equals("2")) {c7=4*2;h7=2;}
                    else if(credit7.getSelectedItem().toString().equals("4")) {c7=4*4;h7=4;}
                    else  {c7=4*3;h7=3;}
                }

                else  if(spinner7.getSelectedItem().toString().equals("A-") ){
                    if(credit7.getSelectedItem().toString().equals("0")) {c7= (float) (0);h7=0;}
                    else if(credit7.getSelectedItem().toString().equals("1")) {c7= (float) (3.67);h7=1;}
                    else if(credit7.getSelectedItem().toString().equals("2")) {c7= (float) (3.67*2);h7=2;}
                    else if(credit7.getSelectedItem().toString().equals("4")) {c7=4*4;h7=4;}
                    else  {c7= (float) (3.67*3);h7=3;}
                }

                else if(spinner7.getSelectedItem().toString().equals("B+") ){
                    if(credit7.getSelectedItem().toString().equals("0")) {c7= (float) (0);h7=0;}
                    else if(credit7.getSelectedItem().toString().equals("1")) {c7= (float) (3.33);h7=1;}
                    else if(credit7.getSelectedItem().toString().equals("2")) {c7= (float) (3.33*2);h7=2;}
                    else if(credit7.getSelectedItem().toString().equals("4")) {c7=4*4;h7=4;}
                    else  {c7= (float) (3.33*3);h7=3;}
                }

                else  if(spinner7.getSelectedItem().toString().equals("B") ){
                    if(credit7.getSelectedItem().toString().equals("0")) {c7= (float) (0);h7=0;}
                    else if(credit7.getSelectedItem().toString().equals("1")) {c7= (float) (3);h7=1;}
                    else if(credit7.getSelectedItem().toString().equals("2")) {c7= (float) (3*2);h7=2;}
                    else if(credit7.getSelectedItem().toString().equals("4")) {c7=4*4;h7=4;}
                    else  {c7= (float) (3*3);h7=3;}
                }

                else if(spinner7.getSelectedItem().toString().equals("C+") ){
                    if(credit7.getSelectedItem().toString().equals("0")) {c7= (float) (0);h7=0;}
                    else if(credit7.getSelectedItem().toString().equals("1")) {c7= (float) (2.67);h7=1;}
                    else if(credit7.getSelectedItem().toString().equals("2")) {c7= (float) (2.67*2);h7=2;}
                    else if(credit7.getSelectedItem().toString().equals("4")) {c7=4*4;h7=4;}
                    else  {c7= (float) (2.67*3);h7=3;}
                }

                else  if(spinner7.getSelectedItem().toString().equals("C") ){
                    if(credit7.getSelectedItem().toString().equals("0")) {c7= (float) (0);h7=0;}
                    else if(credit7.getSelectedItem().toString().equals("1")) {c7= (float) (2.33);h7=1;}
                    else if(credit7.getSelectedItem().toString().equals("2")) {c7= (float) (2.33*2);h7=2;}
                    else if(credit7.getSelectedItem().toString().equals("4")) {c7=4*4;h7=4;}
                    else  {c7= (float) (2.33*3);h7=3;}
                }

                else  if(spinner7.getSelectedItem().toString().equals("D") ){
                    if(credit7.getSelectedItem().toString().equals("0")) {c7= (float) (0);h7=0;}
                    else if(credit7.getSelectedItem().toString().equals("1")) {c7= (float) (2);h7=1;}
                    else if(credit7.getSelectedItem().toString().equals("2")) {c7= (float) (2*2);h7=2;}
                    else if(credit7.getSelectedItem().toString().equals("4")) {c7=4*4;h7=4;}
                    else  {c7= (float) (2*3);h7=3;}
                }

                else  if(spinner7.getSelectedItem().toString().equals("F") ){
                    if(credit7.getSelectedItem().toString().equals("0")) {c7= (float) (0);h7=0;}
                    else if(credit7.getSelectedItem().toString().equals("1")) {c7= (float) (0);h7=1;}
                    else if(credit7.getSelectedItem().toString().equals("2")) {c7= (float) (0);h7=2;}
                    else if(credit7.getSelectedItem().toString().equals("4")) {c7=4*4;h7=4;}
                    else  {c7= (float) (0);h7=3;}
                }

                else  if(spinner7.getSelectedItem().toString().equals("Abs") ){
                    if(credit7.getSelectedItem().toString().equals("0")) {c7= (float) (0);h7=0;}
                    else if(credit7.getSelectedItem().toString().equals("1")) {c7= (float) (0);h7=1;}
                    else if(credit7.getSelectedItem().toString().equals("2")) {c7= (float) (0);h7=2;}
                    else if(credit7.getSelectedItem().toString().equals("4")) {c7=4*4;h7=4;}
                    else  {c7= (float) (0);h7=3;}
                }

                else  if(spinner7.getSelectedItem().toString().equals("I") ){
                    if(credit7.getSelectedItem().toString().equals("0")) {c7= (float) (0);h7=0;}
                    else if(credit7.getSelectedItem().toString().equals("1")) {c7= (float) (0);h7=1;}
                    else if(credit7.getSelectedItem().toString().equals("2")) {c7= (float) (0);h7=2;}
                    else if(credit7.getSelectedItem().toString().equals("4")) {c7=4*4;h7=4;}
                    else  {c7= (float) (0);h7=3;}
                }

                else  if(spinner7.getSelectedItem().toString().equals("W") ){
                    if(credit7.getSelectedItem().toString().equals("0")) {c7= (float) (0);h7=0;}
                    else if(credit7.getSelectedItem().toString().equals("1")) {c7= (float) (0);h7=1;}
                    else if(credit7.getSelectedItem().toString().equals("2")) {c7= (float) (0);h7=2;}
                    else if(credit7.getSelectedItem().toString().equals("4")) {c7=4*4;h7=4;}
                    else  {c7= (float) (0);h7=3;}

                }

                else  if(spinner7.getSelectedItem().toString().equals("Ba") ){
                    if(credit7.getSelectedItem().toString().equals("0")) {c7= (float) (0);h7=0;}
                    else if(credit7.getSelectedItem().toString().equals("1")) {c7= (float) (0);h7=1;}
                    else if(credit7.getSelectedItem().toString().equals("2")) {c7= (float) (0);h7=2;}
                    else if(credit7.getSelectedItem().toString().equals("4")) {c7=4*4;h7=4;}
                    else  {c7= (float) (0);h7=3;}
                }
                else{c7=0;h7=0;}
////////////////////////////////
                float total_H=h1+h2+h3+h4+h5+h6+h7;
                float total_C=c1+c2+c3+c4+c5+c6+c7;
                total= total_C/total_H;

                T.setText("GPA = "+   total );

            }
        });







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