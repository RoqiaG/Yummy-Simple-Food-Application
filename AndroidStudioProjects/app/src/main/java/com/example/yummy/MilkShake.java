package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

public class MilkShake extends AppCompatActivity {
    TextView textDina2;
    TextView textDina2para;
    TextView textDina2para2;

    GridView gridView22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milk_shake);

        textDina2 = (TextView) findViewById(R.id.MilkShakeTextView);
        textDina2para = (TextView) findViewById(R.id.MilkShakeParaTextView1);
        textDina2para2 = (TextView) findViewById(R.id.MilkShakeParaTextView2);

        gridView22= (GridView) findViewById(R.id.MilkShakeGridView);
        gridView22.setAdapter(new imageAdapter22( this));
    }
}