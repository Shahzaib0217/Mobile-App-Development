package com.example.smd_lab.ListViewExamples;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.smd_lab.R;

import java.util.ArrayList;
import java.util.HashMap;

public class MultiColumnListViewAdapter extends BaseAdapter {
    public ArrayList<HashMap<String,String>> list;

    // activity var is for context of the activity jis sy is class mai ana
    Activity activity;
    public static final String First_Column = "first";
    public static final String Second_Column = "second";
    public static final String Third_Column = "third";

    //alt+insert
    public MultiColumnListViewAdapter(ArrayList<HashMap<String, String>> list, Activity activity) {
        this.list = list;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        ViewHolder viewHolder = new ViewHolder();
        // jab pehli dfa chly , view attach krna hai
        if (view == null){
            view=inflater.inflate(R.layout.multicolumn_listview, null);
            // view obj k sath attached hai
            viewHolder.textView1= view.findViewById(R.id.txtone_multicolumn_example);
            viewHolder.textView2=view.findViewById(R.id.txttwo_multicolumn_example);
            viewHolder.textView3=view.findViewById(R.id.txtthree_multicolumn_example);
            view.setTag(viewHolder);
        }
        // jab view already attached ho
        else
            viewHolder = (ViewHolder) view.getTag();
        HashMap<String,String> hashMap=new HashMap<String,String>();
        hashMap = list.get(position);
        viewHolder.textView1.setText(hashMap.get(First_Column));
        viewHolder.textView2.setText(hashMap.get(Second_Column));
        viewHolder.textView3.setText(hashMap.get(Third_Column));
        return view;
    }

    public class ViewHolder{
        TextView textView1, textView2, textView3;
    }
}
