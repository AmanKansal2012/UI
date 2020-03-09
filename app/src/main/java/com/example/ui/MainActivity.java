package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signup(View view) {
        Intent intent=new Intent(MainActivity.this,signup.class);
        startActivity(intent);
    }

    public void signin(View view) {
        Intent intent=new Intent(MainActivity.this,signin.class);
        startActivity(intent);
    }
}
