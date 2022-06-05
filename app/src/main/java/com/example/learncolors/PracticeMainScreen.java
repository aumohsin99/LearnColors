package com.example.learncolors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import java.lang.Math;

public class PracticeMainScreen extends AppCompatActivity {

    int min = 1;
    int max= 12;
    int index = (int)(Math.random()*(max-min+1)+min);

   // int index = 0;

   //  int index = 5;
   // String colorsarray[];


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_main_screen);

        TextView questionheadingview = findViewById(R.id.questionheading);
        questionheadingview.setText("Select button in "+ colorsarray[index] + " color:");
    }

    String[] colorsarray = {"Red", "Green", "Yellow", "Black", "Blue", "Brown", "Gray", "Orange", "Pink", "Purple", "White" };



    String hell = "bye";





}