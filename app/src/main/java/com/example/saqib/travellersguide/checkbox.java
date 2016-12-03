package com.example.saqib.travellersguide;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class checkbox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
    }
    public void additems(View view){

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Item added");
        builder1.setCancelable(true);



        AlertDialog alert11 = builder1.create();
        alert11.show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(getApplicationContext(),checkbox.class);
                startActivity(i);
            }
        }, 2000);



    }

}
