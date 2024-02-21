package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HotBuns extends AppCompatActivity {
    TextView textDemiana2;
    TextView textDemiana2para;
    TextView textDemiana2para2;


    Button btn222;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_buns);

        textDemiana2 = (TextView) findViewById(R.id.HotBunsTextView);
        textDemiana2para = (TextView) findViewById(R.id.HotBunsParaTextView1);
        textDemiana2para2 = (TextView) findViewById(R.id.HotBunsParaTextView2);


        btn222=(Button) findViewById(R.id.HotBunsbtn);

        btn222.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View view){
                goLink("https://youtu.be/9ZVemIRak2Y");
            }
        });

    }

    private void goLink(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}