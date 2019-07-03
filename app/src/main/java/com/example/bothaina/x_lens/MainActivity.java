package com.example.bothaina.x_lens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    private Button button4;
    private Button button1;
    private Button button3;
    private Button button5;
    private Button button2;
    private Button button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity3();
            }
        });

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity1();
            }
        });
    }

    public void openactivity2() {
        Intent intent = new Intent(this, shedular.class);
        startActivity(intent);
    }

    public void openactivity3() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);


    }


    public void openactivity1() {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
}