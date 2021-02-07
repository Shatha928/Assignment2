package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: example :)
        TextView txtHello = findViewById(R.id.txtM1);//R is for resorce
        txtHello.setText("Hello!");


    }

    public void onBtnClick (View view ){
        TextView txtHelloWorld = findViewById(R.id.txtM1);
        EditText editText = findViewById(R.id.editTextTextPersonName);
        String Username =editText.getText().toString();
        txtHelloWorld.setText("Hello "+Username);
    }

}