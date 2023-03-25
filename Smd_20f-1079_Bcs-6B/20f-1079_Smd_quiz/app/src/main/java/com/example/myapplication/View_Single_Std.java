package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class View_Single_Std extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_single_std);
        sharedPreferences=getSharedPreferences("SmdQuizFile",0);
    }

    @Override
    protected void onStart() {
        super.onStart();
        String a = sharedPreferences.getString("A",null);
        String b =sharedPreferences.getString("B",null);
        String c=sharedPreferences.getString("C",null);
        String d=sharedPreferences.getString("D",null);
        ArrayList<String> myStdList=new ArrayList<>();
        myStdList.add(String.valueOf(a));
        myStdList.add(b);
        myStdList.add(c);
        myStdList.add(d);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,myStdList);

        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putString("A","Shahzaib");
        editor.putString("B","Ali");
        editor.putString("C","MAshood");
        editor.putString("D","Umair");
        editor.putString("E","Nofil");
        editor.commit();

        Toast.makeText(this, "Preferences Saved :)", Toast.LENGTH_SHORT).show();

    }
}