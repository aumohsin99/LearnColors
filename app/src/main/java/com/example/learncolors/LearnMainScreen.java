package com.example.learncolors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnMainScreen extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_main_screen);

        Button redbutton = (Button) findViewById(R.id.redbutton);
        Button bluebutton = (Button) findViewById(R.id.bluebutton);
        Button orangebutton = (Button) findViewById(R.id.orangebutton);
        Button blackbutton = (Button) findViewById(R.id.blackbutton);
        Button brownbutton = (Button) findViewById(R.id.brownbutton);
        Button graybutton = (Button) findViewById(R.id.graybutton);
        Button greenbutton = (Button) findViewById(R.id.greenbutton);
        Button purplebutton = (Button) findViewById(R.id.purplebutton);
        Button pinkbutton = (Button) findViewById(R.id.pinkbutton);
        Button whitebutton = (Button) findViewById(R.id.whitebutton);
        Button yellowbutton = (Button) findViewById(R.id.yellowbutton);

        Button summarybutton = (Button) findViewById(R.id.summarybutton);

        //Button button1 = (Button) findViewById(R.id.learnbtn);
    }

    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.redbutton:
//                String nextpagetitle = "Red Page";
//                intent.putExtra("message", nextpagetitle);
//                Intent intent1 = new Intent(this, RedPage.class, nextpagetitle);
//                intenttest = new Intent(Intent.);
//                startActivity(intent1);

                  Intent intent = new Intent(this, RedPage.class);
               // startActivity(intent);
              //  String message = view.getText().toString();
               // intent.putExtra("ETM", message);
                  String staticString = "Hello intent exported";
                  intent.putExtra("SS", staticString);
              //  intent.putExtra(n“abc", “It is another text”);
                  startActivity(intent);

                  break;

//            case R.id.buttonCallingIntent:
//                Uri uri = Uri.parse("tel:+923001234567");
//                intent = new Intent(Intent.ACTION_DIAL, uri);
//                startActivity(intent);
//                break;


            case R.id.bluebutton:
                Intent intent2 = new Intent(this, BluePage.class);
                startActivity(intent2);
                break;

            case R.id.orangebutton:
                Intent intent3 = new Intent(this, OrangePage.class);
                startActivity(intent3);
                break;

            case R.id.blackbutton:
                Intent intent4 = new Intent(this, BlackPage.class);
                startActivity(intent4);
                break;

            case R.id.brownbutton:
                Intent intent5 = new Intent(this, BrownPage.class);
                startActivity(intent5);
                break;

            case R.id.graybutton:
                Intent intent6 = new Intent(this, GrayPage.class);
                startActivity(intent6);
                break;

            case R.id.greenbutton:
                Intent intent7 = new Intent(this, GreenPage.class);
                startActivity(intent7);
                break;

            case R.id.purplebutton:
                Intent intent8 = new Intent(this, PurplePage.class);
                startActivity(intent8);
                break;

            case R.id.pinkbutton:
                Intent intent9 = new Intent(this, PinkPage.class);
                startActivity(intent9);
                break;

            case R.id.whitebutton:
                Intent intent10 = new Intent(this, WhitePage.class);
                startActivity(intent10);
                break;

            case R.id.yellowbutton:
                Intent intent11 = new Intent(this, YellowPage.class);
                startActivity(intent11);
                break;

            case R.id.summarybutton:
                Intent intent12 = new Intent(this, SummaryPage.class);
                startActivity(intent12);
                break;

            default:
                break;
        }
    }
}