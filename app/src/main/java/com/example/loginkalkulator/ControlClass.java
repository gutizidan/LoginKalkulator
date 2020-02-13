package com.example.loginkalkulator;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ControlClass extends AppCompatActivity {

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
}