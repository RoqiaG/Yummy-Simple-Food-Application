package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

public class Lemonade extends AppCompatActivity {
    TextView textDina1;
    TextView textDina1para;
    TextView textDina1para2;

    GridView gridView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lemonade);

        textDina1 = (TextView) findViewById(R.id.LemonadeTextView);
        textDina1para = (TextView) findViewById(R.id.LemonadeParaTextView1);
        textDina1para2 = (TextView) findViewById(R.id.LemonadeParaTextView2);

        gridView11= (GridView) findViewById(R.id.LemonadeGridView);
        gridView11.setAdapter(new imageAdapter11( this));

    }
}