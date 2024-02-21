package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

public class Smoothie extends AppCompatActivity {

    TextView textDina3;
    TextView textDina3para;
    TextView textDina3para2;

    GridView gridView33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smoothie);

        textDina3 = (TextView) findViewById(R.id.SmoothieTextView);
        textDina3para = (TextView) findViewById(R.id.SmoothieParaTextView1);
        textDina3para2 = (TextView) findViewById(R.id.SmoothieParaTextView2);

        gridView33= (GridView) findViewById(R.id.SmoothieGridView);
        gridView33.setAdapter(new imageAdapter33( this));
    }
}