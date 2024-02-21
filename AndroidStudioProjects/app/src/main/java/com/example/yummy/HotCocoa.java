package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

public class HotCocoa extends AppCompatActivity {

    TextView textRoqia1;
    TextView textRoqia1para;
    TextView textRoqia1para2;

    GridView gridView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_cocoa);

        gridView1= (GridView) findViewById(R.id.HotCocoaGridView);
        gridView1.setAdapter(new imageAdapter( this));

        textRoqia1 = (TextView) findViewById(R.id.HotCocoaTextView);
        textRoqia1para = (TextView) findViewById(R.id.HotCocoaParaTextView1);
        textRoqia1para2 = (TextView) findViewById(R.id.HotCocoaParaTextView2);

    }
}