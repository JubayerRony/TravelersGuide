package com.example.saqib.travellersguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import android.view.View;
import android.view.ViewGroup;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        /*RelativeLayout layout;
        CheckBox checkbox = null;

        layout = (RelativeLayout) findViewById(R.id.activity_test);

        ArrayList<String> list = new ArrayList<String>();

        list.add("Torch");
        list.add("Charger");
        list.add("Powerbank");
        list.add("Ace");

        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);

        checkbox.setId(0);
        checkbox.setText(list.get(0));

        layout.setLayoutParams(lp);

        layout.addView(checkbox);





        for(int i=1;i<list.size();i++)
        {
            checkbox = new CheckBox(this);

            checkbox.setId(i);
            checkbox.setText(list.get(i));

            layout.addView(checkbox);
        }

        */
    }
}
