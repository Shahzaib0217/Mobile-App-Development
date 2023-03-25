package com.example.smd_lab.ListViewExamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.smd_lab.R;

import java.util.ArrayList;
import java.util.HashMap;

public class MultiColumnListViewExample extends AppCompatActivity {

    public ArrayList<HashMap<String,String>> list;
//    final is const
    public static final String First_Column = "first";
    public static final String Second_Column = "second";
    public static final String Third_Column = "third";

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_column_list_view_example);
        listView=findViewById(R.id.lstmulticolumnexample);
        // dynamic memory is allocated with new keyword
        list = new ArrayList<HashMap<String, String>>();
        LoadData();
        MultiColumnListViewAdapter adapter = new MultiColumnListViewAdapter(list,this);
        listView.setAdapter(adapter);
    }
    public void LoadData(){
        HashMap<String,String> hashMap1 = new HashMap<String, String>();
        hashMap1.put(First_Column, "Ali");
        hashMap1.put(Second_Column, "Ahmad");
        hashMap1.put(Third_Column, "Shahzaib");
        list.add(hashMap1);

        HashMap<String,String> hashMap2 = new HashMap<String, String>();
        hashMap2.put(First_Column, "Mashood");
        hashMap2.put(Second_Column, "Anas");
        hashMap2.put(Third_Column, "Anfaal");
        list.add(hashMap2);

        HashMap<String,String> hashMap3 = new HashMap<String, String>();
        hashMap3.put(First_Column, "Nofil");
        hashMap3.put(Second_Column, "Khan");
        hashMap3.put(Third_Column, "Zulfiqar");
        list.add(hashMap3);
    }
}
