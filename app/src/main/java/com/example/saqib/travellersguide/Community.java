package com.example.saqib.travellersguide;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Community extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);
    }
    public void myprofile(View view){

        Intent intent = new Intent(Community.this,Explore.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void badgemap(View view){

        Intent intent = new Intent(Community.this,Map.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void badge0(View view) {

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("COMMUNITY BUILDER:\nAnswer a question for the first time.\nIt will be a great journey together!");
        builder1.setCancelable(true);

        AlertDialog alert11 = builder1.create();
        alert11.show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(getApplicationContext(), Community.class);
                startActivity(i);
            }
        }, 4000);
    }
    public void badge1(View view) {

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("PILLAR OF THE COMMUNITY:\nPost your first question.\nYou are an important member to this community!");
        builder1.setCancelable(true);

        AlertDialog alert11 = builder1.create();
        alert11.show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(getApplicationContext(), Community.class);
                startActivity(i);
            }
        }, 4000);
    }
}
