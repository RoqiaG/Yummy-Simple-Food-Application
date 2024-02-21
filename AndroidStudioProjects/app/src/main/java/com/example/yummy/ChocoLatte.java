package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

public class ChocoLatte extends AppCompatActivity {
    TextView textRoqia3;
    TextView textRoqia3para;
    TextView textRoqia3para2;

    GridView gridView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choco_latte);

        textRoqia3 = (TextView) findViewById(R.id.ChocoLatteTextView);
        textRoqia3para = (TextView) findViewById(R.id.ChocoLatteParaTextView1);
        textRoqia3para2 = (TextView) findViewById(R.id.ChocoLatteParaTextView2);

        gridView3= (GridView) findViewById(R.id.ChocoLatteGridView);
        gridView3.setAdapter(new imageAdapter3( this));

    }
}