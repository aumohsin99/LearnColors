package com.example.learncolors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.learnbtn);
        Button button2 = (Button) findViewById(R.id.practicebtn);
        button1.setOnClickListener((View.OnClickListener) this);
        button2.setOnClickListener((View.OnClickListener) this);
    }

    // Todo pta nai yahan kya aana he
    // @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.learnbtn:
                Intent intent1 = new Intent(this, LearnMainScreen.class);
                startActivity(intent1);
                break;
            case R.id.practicebtn:
                Intent intent2 = new Intent(this, AnotherActivity.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
}