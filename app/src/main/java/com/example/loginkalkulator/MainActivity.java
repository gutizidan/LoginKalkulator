package com.example.loginkalkulator;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtangka1;
    private Toolbar toolbar;
    EditText txtangka2;
    CardView btntambah;
    CardView btnkali;
    CardView btnkurang;
    CardView btnbagi;
    TextView tvresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        this.setTitle("Kalkulator");


        txtangka1 =findViewById(R.id.txtangka11);
        txtangka2 =findViewById(R.id.txtangka22);
        btntambah =findViewById(R.id.plus1);
        btnkurang =findViewById(R.id.minus1);
        btnkali =findViewById(R.id.kali1);
        btnbagi =findViewById(R.id.bagi1);
        tvresult =findViewById(R.id.tvresult1);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputAngka1 = txtangka1.getText().toString().trim();
                String inputAngka2 = txtangka2.getText().toString().trim();

                if (inputAngka1.equalsIgnoreCase("") && inputAngka2.equalsIgnoreCase("")) {
                    txtangka1.setError("Masukan angka");
                    txtangka2.setError("Masukan angka");

                }
                else if (inputAngka1.equalsIgnoreCase("")){
                    txtangka1.setError("Masukan angka");
                }
                else if (inputAngka2.equalsIgnoreCase("")){
                    txtangka2.setError("Masukan angka");
                }
                else {
                    Integer angka1 = Integer.parseInt(inputAngka1);
                    Integer angka2 = Integer.parseInt(inputAngka2);
                    Integer hasil = angka1 + angka2;

                    tvresult.setText(String.valueOf("Hasil : " + hasil));
                }
            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputAngka1 = txtangka1.getText().toString().trim();
                String inputAngka2 = txtangka2.getText().toString().trim();

                if (inputAngka1.equalsIgnoreCase("") && inputAngka2.equalsIgnoreCase("")) {
                    txtangka1.setError("Masukan angka");
                    txtangka2.setError("Masukan angka");

                }
                else if (inputAngka1.equalsIgnoreCase("")){
                    txtangka1.setError("Masukan angka");
                }
                else if (inputAngka2.equalsIgnoreCase("")){
                    txtangka2.setError("Masukan angka");
                } else {
                    Integer angka1 = Integer.parseInt(inputAngka1);
                    Integer angka2 = Integer.parseInt(inputAngka2);
                    Integer hasil = angka1 - angka2;

                    tvresult.setText(String.valueOf("Hasil : " + hasil));
                }
            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputAngka1 = txtangka1.getText().toString().trim();
                String inputAngka2 = txtangka2.getText().toString().trim();

                if (inputAngka1.equalsIgnoreCase("") && inputAngka2.equalsIgnoreCase("")) {
                    txtangka1.setError("Masukan angka");
                    txtangka2.setError("Masukan angka");

                }
                else if (inputAngka1.equalsIgnoreCase("")){
                    txtangka1.setError("Masukan angka");
                }
                else if (inputAngka2.equalsIgnoreCase("")){
                    txtangka2.setError("Masukan angka");
                } else {
                    Integer angka1 = Integer.parseInt(inputAngka1);
                    Integer angka2 = Integer.parseInt(inputAngka2);
                    Integer hasil = angka1 * angka2;

                    tvresult.setText(String.valueOf("Hasil : " + hasil));
                }
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputAngka1 = txtangka1.getText().toString().trim();
                String inputAngka2 = txtangka2.getText().toString().trim();

                if (inputAngka1.equalsIgnoreCase("") && inputAngka2.equalsIgnoreCase("")) {
                    txtangka1.setError("Masukan angka");
                    txtangka2.setError("Masukan angka");

                }
                else if (inputAngka1.equalsIgnoreCase("")){
                    txtangka1.setError("Masukan angka");
                }
                else if (inputAngka2.equalsIgnoreCase("")){
                    txtangka2.setError("Masukan angka");
                } else if (inputAngka1.equalsIgnoreCase("0") && inputAngka2.equalsIgnoreCase("0")) {
                    txtangka2.setError("Angka tidak boleh 0");
                    txtangka1.setError("Angka tidak boleh 0");
                } else if (inputAngka1.equalsIgnoreCase("0") ) {
                    txtangka1.setError("Angka tidak boleh 0");
                }else if (inputAngka2.equalsIgnoreCase("0") ) {
                    txtangka2.setError("Angka tidak boleh 0");
                }

                else {
                    Integer angka1 = Integer.parseInt(inputAngka1);
                    Integer angka2 = Integer.parseInt(inputAngka2);
                    Integer hasil = angka1 / angka2;

                    tvresult.setText(String.valueOf("Hasil : " + hasil));
                }
            }
        });
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog
        alertDialogBuilder.setTitle("Anda yakin?");

        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("Klik Ya untuk keluar!")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // jika tombol diklik, maka akan menutup activity ini
                        moveTaskToBack(true);
                    finish();}
                })
                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // jika tombol ini diklik, akan menutup dialog
                        // dan tidak terjadi apa2
                        dialog.cancel();
                    }
                });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
}
