package com.example.dollar2pkrapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void btnCLick(View view)
    {
        EditText dollarAmount=findViewById(R.id.dAmount);
        String dollarStr=dollarAmount.getText().toString();
        float dollarValue=Float.parseFloat(dollarStr);
        float PkrValue =(float)(277*dollarValue);
//        Toast.makeText(this,"PKR = "+PkrValue,Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,final_screen.class);
        intent.putExtra("PKR value is:",PkrValue);
        String mytext=intent.getStringExtra("myText");
        TextView textView=findViewById(R.id.tx3);
        textView.setText(mytext);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}