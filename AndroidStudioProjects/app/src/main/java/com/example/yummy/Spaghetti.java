package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Spaghetti extends AppCompatActivity {
    TextView textNagy3;
    TextView textNagy3para;
    TextView textNagy3para2;
    Button btn33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spaghetti);

        textNagy3 = (TextView) findViewById(R.id.SpaghettiTextView);
        textNagy3para = (TextView) findViewById(R.id.SpaghettiParaTextView1);
        textNagy3para2 = (TextView) findViewById(R.id.SpaghettiParaTextView2);

        btn33=(Button) findViewById(R.id.Spaghettibtn);

        btn33.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View view){
                goLink("https://youtu.be/7J3iBbGOVqs");
            }
        });
    }

    private void goLink(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}