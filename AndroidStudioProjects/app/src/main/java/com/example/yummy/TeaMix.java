package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

public class TeaMix extends AppCompatActivity {

    TextView textRoqia4;
    TextView textRoqia4para;
    TextView textRoqia4para2;

    GridView gridView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tea_mix);

        textRoqia4 = (TextView) findViewById(R.id.TeaMixTextView);
        textRoqia4para = (TextView) findViewById(R.id.TeaMixParaTextView1);
        textRoqia4para2 = (TextView) findViewById(R.id.TeaMixParaTextView2);

        gridView4= (GridView) findViewById(R.id.TeaMixGridView);
        gridView4.setAdapter(new imageAdapter4( this));
    }
}