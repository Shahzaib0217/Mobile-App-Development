package com.example.smd_lab.SharedPreferenceExample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.smd_lab.R;

import java.util.ArrayList;

public class SharedPreferenceExample1 extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    ListView listView;
//    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference_example1);
        sharedPreferences=getSharedPreferences("MyFile",0);
//        textView=findViewById(R.id.txt_shared_example1);
        listView=findViewById(R.id.myListViewSharedPref);
    }

    public void Save_My_Preference(View view) {
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putInt("A",100);
        editor.putString("B","Ali");
        editor.putString("C","Ahmad");
        editor.putString("D","Umair");
        editor.putString("E","Muhammad");
        editor.commit();
        // commit means add data to file
        // Toast for popup msg
        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
    }

    public void Show_My_Preference(View view) {
        // Passing 0 as a default value to avoid exceptions
        int a=sharedPreferences.getInt("A",0);
        String b=sharedPreferences.getString("B",null);
        // string.valueof will convert param into string
//        textView.setText(String.valueOf(a)+" "+b);
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Finding a certain key.
        if(sharedPreferences.contains("A") && sharedPreferences.contains("B")){

        }
        int a = sharedPreferences.getInt("A",0);
        String b =sharedPreferences.getString("B",null);
        String c=sharedPreferences.getString("C",null);
        String d=sharedPreferences.getString("D",null);
        ArrayList<String> myNameList=new ArrayList<>();
        myNameList.add(String.valueOf(a));
        myNameList.add(b);
        myNameList.add(c);
        myNameList.add(d);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,myNameList);
    }
}