package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.Data.MyDbHandler;
import com.example.myapplication.Model.Contact;

public class Update extends AppCompatActivity {
    long id;
    String name_str, num_str;
    EditText name, number;
    Button upd_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        MyDbHandler db = new MyDbHandler(Update.this);

        id = getIntent().getExtras().getInt("id");
        name_str = getIntent().getExtras().getString("name");
        num_str=getIntent().getExtras().getString("phoneNum");

        name = (EditText) findViewById(R.id.editTextTextPersonName);
        number = (EditText) findViewById(R.id.editTextTextPersonContact);
        upd_btn =(Button) findViewById(R.id.insert_btn);

        // Text for edit text
        name.setText(name_str);
        number.setText(num_str);

        // Attaching OnClick listener to the insert button
        upd_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // getting input
                name_str = name.getText().toString();
                num_str = number.getText().toString();
                // Creating a contact object for the db
                Contact contact =new Contact(Math.toIntExact(id),name_str,num_str);
                db.updateContact(contact);
                Toast.makeText(getApplicationContext(),"Contact Updated", Toast.LENGTH_SHORT).show();
            }
        });
    }
}