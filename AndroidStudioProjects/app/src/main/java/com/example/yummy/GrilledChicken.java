package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GrilledChicken extends AppCompatActivity {
    TextView textHaroun2;
    TextView textHaroun2para;
    TextView textHaroun2para2;

    Button btn2222;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grilled_chicken);
        textHaroun2 = (TextView) findViewById(R.id.GrilledChickenTextView);
        textHaroun2para = (TextView) findViewById(R.id.GrilledChickenParaTextView1);
        textHaroun2para2 = (TextView) findViewById(R.id.GrilledChickenParaTextView2);


        btn2222=(Button) findViewById(R.id.GrilledChickenbtn);

        btn2222.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View view){
                goLink("https://youtu.be/PmBpBi_-CO8");
            }
        });
    }

    private void goLink(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}