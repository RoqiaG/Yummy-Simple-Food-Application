package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Waffle extends AppCompatActivity {

    TextView textDoaa1;
    TextView textDoaa1para;
    TextView textDoaa1para2;

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waffle);

        textDoaa1 = (TextView) findViewById(R.id.WafflesTextView);
        textDoaa1para = (TextView) findViewById(R.id.WafflesParaTextView1);
        textDoaa1para2 = (TextView) findViewById(R.id.WafflesParaTextView2);

        btn1=(Button) findViewById(R.id.Wafflebtn);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View view){
                goLink("https://youtu.be/aM3kVxSxF5s");
            }
        });

    }

    private void goLink(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
