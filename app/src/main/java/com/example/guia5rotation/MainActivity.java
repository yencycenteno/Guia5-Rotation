package com.example.guia5rotation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void OnClickConversation(View v){
        Intent in = new Intent(this, Conversations.class);
        startActivity(in);
    }

    public void OnClickLogin(View v){
        Intent in = new Intent(this, Login.class);
        startActivity(in);
    }

    public void OnClickCalculator(View v){
        Intent in = new Intent(this, Calculator.class);
        startActivity(in);
    }

    public void OnClickDatos(View v){
        Intent in = new Intent(this, Datos.class);
        startActivity(in);
    }
}
