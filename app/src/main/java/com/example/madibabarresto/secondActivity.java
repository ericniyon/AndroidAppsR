package com.example.madibabarresto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textView=(TextView)findViewById(R.id.listed);

        String madiba = getIntent().getStringExtra("listviewclickvalue");
        textView.setText(madiba);
    }
}
