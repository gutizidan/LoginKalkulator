package com.example.loginkalkulator;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Loginslur extends AppCompatActivity {

    EditText txtusername;
    EditText txtpassword;
    Button btnlogin;

    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginslur);
        pref = getSharedPreferences("login", MODE_PRIVATE);
        txtusername=findViewById(R.id.txtusername);
        txtpassword=findViewById(R.id.txtpassword);
        btnlogin=findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtusername.getText().toString().equalsIgnoreCase("RICATOLO") ||
                        txtpassword.getText().toString().equalsIgnoreCase("RICATOLO")){
                    Toast.makeText(Loginslur.this, "Login sukses", Toast.LENGTH_SHORT).show();
                    editor = pref.edit();
                    editor.putString("userid", txtusername.getText().toString());
                    editor.apply();
                    Intent in=new Intent(Loginslur.this, MainActivity.class);
                    in.putExtra("username", txtusername.getText().toString());
                    startActivity(in);
                    finish();
                }
            }
        });

    }

}
