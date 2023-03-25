package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.Data.MyDbHandler;
import com.example.myapplication.Model.Contact;

import java.util.List;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void Display(View view) {
        Intent intent=new Intent(Dashboard.this,MainActivity.class);
        startActivity(intent);
    }
    MyDbHandler db = new MyDbHandler(Dashboard.this);

    public void delete(View view) {
        List<Contact> allContacts = db.getAllContacts();
        for(Contact contact: allContacts) {
            db.deleteContact(contact);
        }
        Toast.makeText(getApplicationContext(),"All Contacts deleted", Toast.LENGTH_SHORT).show();
    }

    public void NextInsert(View view) {
        Intent intent=new Intent(Dashboard.this,Insert.class);
        startActivity(intent);
    }
}