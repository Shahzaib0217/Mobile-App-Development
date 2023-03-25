package com.example.async_task;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ProgressBar progressBar, progressIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        progressBar = findViewById(R.id.progressBar);
        progressIndicator = findViewById(R.id.progressBar2);
        new UploadTask().execute("This is the string passaed.");
    }

    class UploadTask extends AsyncTask<String, Integer, String> {

        @Override
        protected void onPreExecute() {
            Log.i(TAG, "onPreExecute: " + Thread.currentThread().getName());
            textView.setText("uploading data...");
            progressIndicator.setVisibility(View.VISIBLE);
        }

        @Override
        protected String doInBackground(String... strings) {

            Log.i(TAG, "doInBackground: string passed:" + strings[0]);
            Log.i(TAG, "doInBackground: Thread: " + Thread.currentThread().getName());
            for (int i=0; i<10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                publishProgress(i);
            }
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
            return "finally the task is complete";
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            progressBar.setProgress(values[0] + 1);
            Log.i(TAG, "onProgressUpdate: " + Thread.currentThread().getName());
        }

        @Override
        protected void onPostExecute(String string) {
            Log.i(TAG, "onPostExecute: " + Thread.currentThread().getName());
            textView.setText(string);
            progressIndicator.setVisibility(View.INVISIBLE);

        }

    }
}