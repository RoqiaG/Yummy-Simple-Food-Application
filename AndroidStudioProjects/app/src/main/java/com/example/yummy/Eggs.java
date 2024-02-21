package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Eggs extends AppCompatActivity {
    TextView textDemiana3;
    TextView textDemiana3para;
    TextView textDemiana3para2;


    Button btn333;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eggs);

        textDemiana3 = (TextView) findViewById(R.id.EggsTextView);
        textDemiana3para = (TextView) findViewById(R.id.EggsParaTextView1);
        textDemiana3para2 = (TextView) findViewById(R.id.EggsParaTextView2);

        btn333=(Button) findViewById(R.id.Eggsbtn);

        btn333.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View view){
                goLink("https://youtu.be/xHlBWc-7Kwo");
            }
        });
    }

    private void goLink(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}