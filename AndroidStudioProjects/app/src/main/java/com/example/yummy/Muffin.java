package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Muffin extends AppCompatActivity {

    TextView textDoaa2;
    TextView textDoaa2para;
    TextView textDoaa2para2;

    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muffin);


        textDoaa2 = (TextView) findViewById(R.id.MuffinsTextView);
        textDoaa2para = (TextView) findViewById(R.id.MuffinsParaTextView1);
        textDoaa2para2 = (TextView) findViewById(R.id.MuffinsParaTextView2);

        btn2=(Button) findViewById(R.id.Muffinsbtn);

        btn2.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View view){
                goLink("https://youtu.be/mSt6wndUzj4");
            }
        });
    }

    private void goLink(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}