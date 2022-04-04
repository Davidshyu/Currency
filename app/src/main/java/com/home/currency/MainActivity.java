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
                    .setTitle(R.string.problem)
                    .setMessage(R.string.please_enter_ntd)
                    .setPositiveButton(R.string.ok,null)
                    .show();
        }else {
            double ntDollar = Double.parseDouble(nt);
            double usDollar = ntDollar / 30.9;
            new AlertDialog.Builder(this).setTitle(R.string.result)
                    .setMessage(getString(R.string.usd_is) + usDollar)
                    .setPositiveButton(R.string.ok, null)
                    .show();
            edUsd.setText(" is "+ usDollar);

        }

    }




}