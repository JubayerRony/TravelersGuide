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
        builder1.setMessage("PILLAR OF THE COMMUNITY:\nGet total 3 badges\nYou are an important member to this community!");
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
    public void badge2(View view) {

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("COMMUNITY AMBASSADOR:\nGet total 6 badges\nYou are the face of the community!");
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
    public void badge3(View view) {

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("COMMUNITY LEADER:\nGet All the badges\nYou are the hero we need!");
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
    public void badge44(View view) {

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("COMMUNITY MANAGER:\nGet 10 up-votes for any of your posts");
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
    public void badge55(View view) {

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("THE TRAVELLER!:\nCreate your first trip. Oye! Don't forget to share your memory.");
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
    public void badge6(View view) {

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("1 YEAR OF EXCELLENCY:\nUse this app for 1 year!");
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
    public void badge7(View view) {

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("STAR MEMBER:\nUse this app for 3 years. You are the real friend!");
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
    public void badge8(View view) {

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("SENIOR MEMBER:\nUse this app for 2 years.");
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
    public void badge9(View view) {

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("COMMUNITY VOLUNTEER:\nUp-vote/Down-vote for the first time!");
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
