package com.example.saqib.travellersguide;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class UpdatedTripList extends AppCompatActivity {

    RelativeLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updated_trip_list);

        Button myButton = new Button(this);
        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString("key1");
        myButton.setText(text);
        myButton.setBackgroundResource(R.drawable.button_style);

        ll = (RelativeLayout)findViewById(R.id.activity_profile);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        lp.topMargin = 1000;
        lp.leftMargin = 130;
        myButton.setTextColor(Color.parseColor("#ffffff"));


        //lp.alignWithParent = true;
        lp.height = 230;
        lp.width = 330;

        //lp.addRule(RelativeLayout.ALIGN_BOTTOM,R.id.button6);
        ll.addView(myButton, lp);
        //myButton.setOnClickListener((View.OnClickListener) this);
        myButton.setOnClickListener(getOnClickDoSomething(myButton));
    }
    public void checkbox(View view){

        Intent intent = new Intent(UpdatedTripList.this,tripactivity.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void createtrip(View view){

        Intent intent = new Intent(UpdatedTripList.this,createtrip.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void myprofile(View view){

        Intent intent = new Intent(UpdatedTripList.this,Explore.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    View.OnClickListener getOnClickDoSomething(final Button button)  {
        return new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(UpdatedTripList.this,tripactivity.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);            }
        };
    }
}
