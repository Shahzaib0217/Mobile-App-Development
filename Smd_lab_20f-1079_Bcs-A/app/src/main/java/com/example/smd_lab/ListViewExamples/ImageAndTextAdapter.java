package com.example.smd_lab.ListViewExamples;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.smd_lab.R;

public class ImageAndTextAdapter extends ArrayAdapter<String> {
    Activity activity;
    String[]  Name;
    String[] Text;
    int[] Image;

    public ImageAndTextAdapter(@NonNull Activity activity, String[] name, String[] text, int[] image) {
        super(activity, R.layout.imageandtext, text);
        this.activity = activity;
        Name = name;
        Text = text;
        this.Image = image;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View ViewHolder = inflater.inflate(R.layout.imageandtext,null);
        TextView textName = ViewHolder.findViewById(R.id.txtoneimageandtext);
        TextView textText = ViewHolder.findViewById(R.id.txttwoimageandtext);
        ImageView imageView = ViewHolder.findViewById(R.id.imgimageandtext);
        textName.setText(Name[position]);
        textText.setText(Text[position]);
        imageView.setImageResource(Image[position]);
        return ViewHolder;
    }
}
