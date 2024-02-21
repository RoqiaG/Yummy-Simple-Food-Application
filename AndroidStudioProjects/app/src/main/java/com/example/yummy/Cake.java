package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cake extends AppCompatActivity {

    TextView textDoaa4;
    TextView textDoaa4para;
    TextView textDoaa4para2;

    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake);

        textDoaa4 = (TextView) findViewById(R.id.CakesTextView);
        textDoaa4para = (TextView) findViewById(R.id.CakesParaTextView1);
        textDoaa4para2 = (TextView) findViewById(R.id.CakesParaTextView2);

        btn4=(Button) findViewById(R.id.Cakebtn);
        btn4.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View view){
                goLink("https://youtu.be/Jsj17-XmvTM");
            }
        });
    }

    private void goLink(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}