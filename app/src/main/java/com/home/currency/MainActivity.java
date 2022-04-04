package com.home.currency;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edntDollar;
    private TextView edUsd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fineViews();


    }

    private void fineViews (){
        edntDollar = findViewById(R.id.ntd);
        edUsd = findViewById(R.id.us);
    }

    public void transfer(View view){
        String nt = edntDollar.getText().toString();
        if(nt == null|| nt.trim().length() == 0){
            new AlertDialog.Builder(this)
                    .setTitle("Problem")
                    .setMessage("Please enter your NTD amount")
                    .setPositiveButton("ok",null)
                    .show();
        }else {
            double ntDollar = Double.parseDouble(nt);
            double usDollar = ntDollar / 30.9;
            new AlertDialog.Builder(this).setTitle("Result")
                    .setMessage("USD is " + usDollar)
                    .setPositiveButton("ok", null)
                    .show();
            edUsd.setText(" is "+ usDollar);

        }

    }




}