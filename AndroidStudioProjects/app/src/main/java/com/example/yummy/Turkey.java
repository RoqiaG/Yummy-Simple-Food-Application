package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Turkey extends AppCompatActivity {

    TextView textHaroun3;
    TextView textHaroun3para;
    TextView textHaroun3para2;
    Button btn3333;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkey);

        textHaroun3 = (TextView) findViewById(R.id.TurkeyTextView);
        textHaroun3para = (TextView) findViewById(R.id.TurkeyParaTextView1);
        textHaroun3para2 = (TextView) findViewById(R.id.TurkeyParaTextView2);

        btn3333=(Button) findViewById(R.id.Turkeybtn);

        btn3333.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View view){
                goLink("https://youtu.be/-nJLpx0Qx1o");
            }
        });
    }

    private void goLink(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}