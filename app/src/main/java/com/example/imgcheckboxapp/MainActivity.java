package com.example.imgcheckboxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    CheckBox chk;
    ImageView imgAriana,imgCharlie,imgShawn,imgJustin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAriana = findViewById(R.id.imgAriana);
        imgCharlie = findViewById(R.id.imgCharlie);
        imgShawn = findViewById(R.id.imgShawn);
        imgJustin = findViewById(R.id.imgJustin);

        imgAriana.setVisibility(View.GONE);
        imgCharlie.setVisibility(View.GONE);
        imgShawn.setVisibility(View.GONE);
        imgJustin.setVisibility(View.GONE);

    }

    public void btnOK(View view) {

        int [] id = { R.id.chkAriana,R.id.chkCharlie,R.id .chkShawn,R.id .chkJustin };
        for (int i:id ){
            chk = findViewById(i);
            if (chk .isChecked()){
                if (chk .getId() == R.id.chkAriana)
                    imgAriana.setVisibility(View.VISIBLE);
                if (chk .getId() == R.id.chkCharlie)
                    imgCharlie.setVisibility(View.VISIBLE);
                if (chk .getId() == R.id.chkShawn)
                    imgShawn.setVisibility(View.VISIBLE);
                if (chk .getId() == R.id.chkJustin)
                    imgJustin.setVisibility(View.VISIBLE);

            }
        }
    }
}
