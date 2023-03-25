package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.Data.MyDbHandler;
import com.example.myapplication.Model.Contact;

public class Insert extends AppCompatActivity {
    EditText name, contact;
    Button ins_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        name = (EditText) findViewById(R.id.editTextTextPersonName);
        contact = (EditText) findViewById(R.id.editTextTextPersonContact);
        ins_btn =(Button) findViewById(R.id.insert_btn);

        // Attaching OnClick listener to the insert button
        ins_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String  P_name = name.getText().toString();
                String P_contact = contact.getText().toString();

                MyDbHandler db = new MyDbHandler(Insert.this);
                // Creating a contact object for the db
                Contact person = new Contact(P_contact, P_name);
                // Adding a contact to the db
                db.addContact(person);
                Toast.makeText(getApplicationContext(),"Contact Inserted", Toast.LENGTH_SHORT).show();
                //int affectedRows = db.updateContact(person);
                //Log.d("dbharry", "No of affected rows are: " + affectedRows);
            }
        });

    }
}