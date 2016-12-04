package com.example.saqib.travellersguide;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;

public class ItemAdded extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_added);

        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString("key1");

        CheckBox c = new CheckBox(this);

        c.setText(text);
        //c.setBackgroundResource(R.drawable.button_style);

        RelativeLayout ll = (RelativeLayout)findViewById(R.id.activity_tripactivity);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        lp.topMargin = 1120;
        lp.leftMargin = 5;
        c.setTextColor(Color.parseColor("#000000"));

        ll.addView(c, lp);



    }

    public void added(View view) {

        Intent i = new Intent(getApplicationContext(),ItemAdded.class);
        startActivity(i);

    }
    public void Done(View view) {

        Intent i = new Intent(getApplicationContext(),Explore.class);
        startActivity(i);

    }

}


