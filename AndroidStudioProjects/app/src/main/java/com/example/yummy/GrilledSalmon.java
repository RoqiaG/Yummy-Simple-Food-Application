package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GrilledSalmon extends AppCompatActivity {
    TextView textHaroun1;
    TextView textHaroun1para;
    TextView textHaroun1para2;
    Button btn1111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grilled_salmon);
        textHaroun1 = (TextView) findViewById(R.id.GrilledSalmonTextView);
        textHaroun1para = (TextView) findViewById(R.id.GrilledSalmonParaTextView1);
        textHaroun1para2 = (TextView) findViewById(R.id.GrilledSalmonParaTextView2);

        btn1111=(Button) findViewById(R.id.GrilledSalmonbtn);
        btn1111.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View view){
                goLink("https://youtu.be/8e8sxJthS_0");
            }
        });

    }

    private void goLink(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}