package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cinnamon extends AppCompatActivity {

    TextView textDoaa3;
    TextView textDoaa3para;
    TextView textDoaa3para2;

    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinnamon);

        textDoaa3 = (TextView) findViewById(R.id.CinnamonsTextView);
        textDoaa3para = (TextView) findViewById(R.id.CinnamonsParaTextView1);
        textDoaa3para2 = (TextView) findViewById(R.id.CinnamonsParaTextView2);

        btn3=(Button) findViewById(R.id.Cinnamonbtn);
        btn3.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View view){
                goLink("https://youtu.be/-rhOcsr4gew");
            }
        });

    }

    private void goLink(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}