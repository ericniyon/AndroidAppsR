package com.example.madibabarresto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdpter extends BaseAdapter {


    Context context;String[] version;int[] image;

    LayoutInflater inflater;
    public GridAdpter(Context context, String[] version,int[] image){
        this.context = context;
        this.version = version;
        this.image = image;
    }
    public int getCount(){
        return version.length;
    }
    public  Object getItem(int position){
        return  null;
    }
    public long getItemId(int position){
        return  0;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        TextView gridtext;
        ImageView gridimage;
        inflater = (LayoutInflater)context
                .getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.grid_item,parent,false);
        gridtext = (TextView)itemView.findViewById(R.id.ter);
        gridimage = (ImageView) itemView.findViewById(R.id.images);
        gridtext.setText(version[position]);
        gridimage.setImageResource(image[position]);
        return itemView;
    }
}
