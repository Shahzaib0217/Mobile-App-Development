package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    public void onestd(View view) {
        Intent intent = new Intent(this, View_Single_Std.class);
        startActivity(intent);
    }

    public void AllStd(View view) {
        Intent intent = new Intent(this, View_All_Std.class);
        startActivity(intent);
    }
}