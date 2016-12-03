package com.example.saqib.travellersguide;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Explore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "GOTHIC.TTF");
        TextView textView;

        textView = (TextView) findViewById(R.id.feed1);
        textView.setTypeface(typeFace);
        textView.setText("\n\nJubayerRony posted a question:\n");

        textView = (TextView) findViewById(R.id.feed2);
        textView.setTypeface(typeFace);
        textView.setText("Which bus service would be the best for Dhaka to Cox's Bazar route?\n");
        textView = (TextView) findViewById(R.id.feed3);
        textView.setTypeface(typeFace);
        textView.setText("Answers: \n\n"+
                "SalimSaqib:\nI would prefer Green Line. It will cost you 1800 tk but you will have the best experience.Happy travelling.\n\n"+
                "JubayerRony:\nActually my budget is limited. Can you suggest something at a lower cost? TIA.\n\n"+
                "Akif:\nThen go for Shyamoli Paribahan.\n\n"+
                "******************************");



        textView = (TextView) findViewById(R.id.feed4);
        textView.setTypeface(typeFace);
        textView.setText("\n\nNafisTanveer posted a review:\n");
        Typeface typeFace2 = Typeface.createFromAsset(getAssets(), "COMIC.ttf");
        textView = (TextView) findViewById(R.id.feed5);
        textView.setTypeface(typeFace2);
        textView.setText("Sajek Valley: A piece of heaven in Bangladesh");
        textView = (TextView) findViewById(R.id.feed6);
        textView.setTypeface(typeFace);
        textView.setText("Sajek is one of most beautiful place in Bangladesh, it's a must for a nature lover. Try to stay minimum 1 night because the sunrise and sunset times are the most beautiful times . It's above 1800 feet from sea level. Sajek is beautiful in all seasons, locals are mostly from Tripura and lusai tribes . Few chakma also lives nearby. Foreign citizens are currently not allowed to visit sajek. They need special permission from Bd government which is not easy to get. Even the Bangladeshi people are not allowed to travel without the army escort which is given twice a day at 10-11 am and 3-4 pm. \n");

    }
    public void myprofile(View view){

        Intent intent = new Intent(Explore.this,Profile.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void emergency(View view){

        Intent intent = new Intent(Explore.this,Emergency.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
