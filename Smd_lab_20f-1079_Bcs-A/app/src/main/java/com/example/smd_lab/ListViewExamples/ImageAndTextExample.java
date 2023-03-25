package com.example.smd_lab.ListViewExamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.smd_lab.R;

public class ImageAndTextExample extends AppCompatActivity {

    String Name[] = {"Ali", "Ahmad", "Laiba", "Maryyam", "Nawaz"};
    String Text[]= {"Hello Ali", "Ok Ahmad", "Noted", "Vote ko izzat do", "Mujhy q nikala"};
    int Image[]={R.drawable.icon,R.drawable.icon,R.drawable.icon,R.drawable.icon,R.drawable.icon};

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_and_text_example);
        listView = findViewById(R.id.lstimageandtext);
        ImageAndTextAdapter adapter = new ImageAndTextAdapter(this, Name, Text, Image);
        listView.setAdapter(adapter);
    }
}