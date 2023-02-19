package com.example.smd_lab.Intent_examples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.smd_lab.R;

public class Second_Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView=findViewById(R.id.txt_Intent_secondActivity);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent=getIntent();
        String v1=intent.getStringExtra("A1");
        String v2=intent.getStringExtra("A2");
        textView.setText(v1+" "+v2);
    }
}