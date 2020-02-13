package com.example.loginkalkulator;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SEPLASH extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seplash);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE);
                if (sharedPreferences.getString("userid","").isEmpty()){
                    Intent in=new Intent(getApplicationContext(),Loginslur.class);
                    startActivity(in);
                    finish();
                }else {
                    Intent in=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(in);
                    finish();
                }
            }
        },3000);
        // start thread
    }
}
