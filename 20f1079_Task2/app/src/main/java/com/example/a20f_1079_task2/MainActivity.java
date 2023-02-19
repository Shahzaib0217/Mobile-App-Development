package com.example.a20f_1079_task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    EditText editText;
    String et1, et2, et3, et4, et5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences=getSharedPreferences("Task2",0);
        editText=findViewById(R.id.et1);
        et1 = String.valueOf(editText.getText());
        editText=findViewById(R.id.et2);
        et2 = String.valueOf(editText.getText());
        editText=findViewById(R.id.et3);
        et3 = String.valueOf(editText.getText());
        editText=findViewById(R.id.et4);
        et4 = String.valueOf(editText.getText());
        editText=findViewById(R.id.et5);
        et5 = String.valueOf(editText.getText());
    }

    public void Save_Shared_Preference(View view) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("A", et1);
        editor.putString("B",et2);
        editor.putString("C", et3);
        editor.putString("D",et4);
        editor.putString("E", et5);
        editor.commit();

        Toast.makeText(this, "Preferences Saved :)", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        String a = sharedPreferences.getString("A",null);
        String b =sharedPreferences.getString("B",null);
        String c=sharedPreferences.getString("C",null);
        String d=sharedPreferences.getString("D",null);
        String e=sharedPreferences.getString("E",null);
        ArrayList<String> myNameList=new ArrayList<>();
        myNameList.add(a);
        myNameList.add(b);
        myNameList.add(c);
        myNameList.add(d);
        myNameList.add(e);

//        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,myNameList);
    }
}