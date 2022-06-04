package com.example.learncolors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PracticeMainScreen extends AppCompatActivity {

   // int index = 0;

    int index = 5;
   // String colorsarray[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_main_screen);

        TextView questionheadingview = findViewById(R.id.questionheading);
        questionheadingview.setText("Select button in "+colorsarray[index] + " color:");
    }

    String[] colorsarray = {"Red", "Green", "Yellow", "Black", "Blue", "Brown", "Gray", "Orange", "Pink", "Purple", "White" };

    /*
    public void randcolorgenerator(String colorsarry[])
    {
        int i = 0;
        int j = 11;

     int index = random(i, j);
    }


    private int randcolorgenerator(int i, int j)
    {
        int index = random(i,j);
    }
   */

    String hell = "bye";



    //   int testarray[]={};
//   testarray[].
   // public void random

}