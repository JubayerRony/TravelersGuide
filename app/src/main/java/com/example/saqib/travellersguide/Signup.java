package com.example.saqib.travellersguide;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void signupsubmit(View view){

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Sign up successfull");
        builder1.setCancelable(true);



        AlertDialog alert11 = builder1.create();
        alert11.show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(Signup.this,Profile.class);
                startActivity(i);
            }
        }, 2000);
    }
}
