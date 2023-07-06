package com.example.your_smart_guide_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity32 extends AppCompatActivity {

    GridLayout mainGrid;
    ImageView next;
    DB_SQLite2 db;
    String course;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main32);
        next=findViewById(R.id.next);


        db=new DB_SQLite2(this);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity32.this, MainActivity26.class);
                startActivity(intent);

            }
        });


        mainGrid = findViewById(R.id.mainGrid);
        clickCardView(mainGrid);
    }



    private void clickCardView(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); ++i) {
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            String CourseName = ((TextView) cardView.getChildAt(0)).getText().toString();
            // Set the default background color of the CardView to white
            cardView.setCardBackgroundColor(Color.WHITE);
            cardView.setOnClickListener(new View.OnClickListener() {
                boolean isCardViewClicked = false;
                boolean isCardViewSelected = false;


                @Override
                public void onClick(View view) {
                    // Toggle the flag and set the background color of the CardView accordingly
                    isCardViewClicked = !isCardViewClicked;
                    if (isCardViewClicked) {
                        cardView.setCardBackgroundColor(Color.parseColor("#00ff00"));
                        isCardViewSelected = true;
                        db.insert_Courses_In_Temp(CourseName);

                    } else {
                        cardView.setCardBackgroundColor(Color.WHITE);
                        isCardViewSelected = false;
                        db.delete(CourseName);

                    }


                }
            });
        }
    }








}
