package com.example.saqib.travellersguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class createtrip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createtrip);



    }

    public void onClickcreate(View view){

        Intent intent = new Intent(createtrip.this,UpdatedTripList.class);

        EditText edittext = (EditText)findViewById(R.id.editText);
        String text = edittext.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("key1",text);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}