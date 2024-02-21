package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TomatoSoup extends AppCompatActivity {

    TextView textHaroun4;
    TextView textHaroun4para;
    TextView textHaroun4para2;
    Button btn4444;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomato_soup);

        textHaroun4 = (TextView) findViewById(R.id.TomatoSoupTextView);
        textHaroun4para = (TextView) findViewById(R.id.TomatoSoupParaTextView1);
        textHaroun4para2 = (TextView) findViewById(R.id.TomatoSoupParaTextView2);

        btn4444=(Button) findViewById(R.id.TomatoSoupbtn);

        btn4444.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View view){
                goLink("https://youtu.be/3seLiMbKiPE");
            }
        });
    }

    private void goLink(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}