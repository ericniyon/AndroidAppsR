package com.example.madibabarresto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Toast;

public class AddRecept extends AppCompatActivity {

    GridView grid;
    GridAdpter adapter;
    String[] version;
    int[] image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recept);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        version = new String[]{"Cupcake", "Donut", "Eclair", "Gingerbread", "Honeycomb", "Ice Cream Sandwith", "checken wings", "Lillipop", "Marshllom"};
        image = new int[]{R.mipmap.ic_launcher, R.mipmap.ic_launcher,
                R.mipmap.ic_launcher, R.mipmap.ic_launcher,
                R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
                R.mipmap.ic_launcher, R.mipmap.ic_launcher,};


        grid = (GridView)findViewById(R.id.griedone);

        adapter = new GridAdpter(getApplicationContext(),version,image);

        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "you select:"+version[position], Toast.LENGTH_SHORT).show();
            }
        });

    }

        }








