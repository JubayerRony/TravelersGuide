package com.example.saqib.travellersguide;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class tripactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tripactivity);


    }
    public  boolean trip = false;
    public void added(View view) {

        Intent i = new Intent(tripactivity.this,ItemAdded.class);

        EditText edittext = (EditText)findViewById(R.id.editText14);
        String text = edittext.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("key1",text);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.putExtras(bundle);
        startActivity(i);

    }
}


