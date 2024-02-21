package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Coleslaw extends AppCompatActivity {
    TextView textNagy4;
    TextView textNagy4para;
    TextView textNagy4para2;

    Button btn44;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coleslaw);

        textNagy4 = (TextView) findViewById(R.id.ColeslawTextView);
        textNagy4para = (TextView) findViewById(R.id.ColeslawParaTextView1);
        textNagy4para2 = (TextView) findViewById(R.id.ColeslawParaTextView2);

        btn44=(Button) findViewById(R.id.Coleslawbtn);

        btn44.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View view){
                goLink("https://youtu.be/JBEAypDDSWI");
            }
        });
    }

    private void goLink(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}