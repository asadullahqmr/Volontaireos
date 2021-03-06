package com.example.asad.volontaireos;

import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;



// LGS stands for Let's Get Started Page
// Need to add Image Button
// Need to add Image

public class L_G_S extends AppCompatActivity {
    private Handler mHandler = new Handler();

    private static int TIME_OUT = 3000; //Time to launch the another activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lgs);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(L_G_S.this, A5_VM.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);
    }
}



