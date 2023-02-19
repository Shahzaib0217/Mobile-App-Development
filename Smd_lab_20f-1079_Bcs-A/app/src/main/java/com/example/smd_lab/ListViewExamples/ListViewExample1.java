package com.example.smd_lab.ListViewExamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.smd_lab.R;

public class ListViewExample1 extends AppCompatActivity {

    String[] StudentList={"Ali", "Umair", "Ahmad", "Shahzaib","Tauqeer","Mashood"};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_example1);
        listView=findViewById(R.id.myListViewExample1);
//        listView.setOnItemClickListener();
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Array adapter wil read array
        ArrayAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,StudentList);
        listView.setAdapter(adapter);
        // adding click functionality in list
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(ListViewExample1.this,position+" Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}