package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

public class Yogurt extends AppCompatActivity {

    TextView textDina4;
    TextView textDina4para;
    TextView textDina4para2;

    GridView gridView44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yogurt);

        textDina4 = (TextView) findViewById(R.id.YogurtTextView);
        textDina4para = (TextView) findViewById(R.id.YogurtParaTextView1);
        textDina4para2 = (TextView) findViewById(R.id.YogurtParaTextView2);

        gridView44= (GridView) findViewById(R.id.YogurtGridView);
        gridView44.setAdapter(new imageAdapter44( this));
    }
}