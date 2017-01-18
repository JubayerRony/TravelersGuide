package com.example.saqib.travellersguide;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view){


        String line = "";
        InputStream istream = getResources().openRawResource(R.raw.newsfeed);
        BufferedReader breader = new BufferedReader(new InputStreamReader(istream));
        boolean login = false;
        EditText text1 = (EditText) findViewById(R.id.user1);
        String val1 = text1.getText().toString();
        text1 = (EditText) findViewById(R.id.pass1);
        String val2 = text1.getText().toString();
        System.out.println(val1 + " "+ val2);

        try
        {
            while((line = breader.readLine() )!= null)
            {
                String temp[] = line.split(":");
                System.out.println(temp[0] + " " + temp[1]);
                System.out.println(val1 + " "+ val2);
                if(temp[1].equals(val1) && temp[0].equals(val2))
                {
                    login = true;
                    break;
                }

            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        if(login) {
            Intent intent = new Intent(Login.this, Explore.class);

            Bundle bundle = new Bundle();
            bundle.putString("name",val2);
            intent.putExtras(bundle);
            //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
        else {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("Invalid username or password");
            builder1.setCancelable(true);

            AlertDialog alert11 = builder1.create();
            alert11.show();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent i = new Intent(getApplicationContext(),Login.class);
                    startActivity(i);
                }
            }, 2000);
        }
    }
    public void signup(View view){

        Intent intent = new Intent(Login.this,Signup.class);

        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
