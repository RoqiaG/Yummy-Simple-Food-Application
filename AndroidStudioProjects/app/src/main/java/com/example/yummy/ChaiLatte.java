package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

public class ChaiLatte extends AppCompatActivity {

    TextView textRoqia2;
    TextView textRoqia2para;
    TextView textRoqia2para2;

    GridView gridView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chai_latte);

        textRoqia2 = (TextView) findViewById(R.id.ChaiLatteTextView);
        textRoqia2para = (TextView) findViewById(R.id.ChaiLatteParaTextView1);
        textRoqia2para2 = (TextView) findViewById(R.id.ChaiLatteParaTextView2);

        gridView2= (GridView) findViewById(R.id.ChaiLatteGridView);
        gridView2.setAdapter(new imageAdapter2( this));
    }
}