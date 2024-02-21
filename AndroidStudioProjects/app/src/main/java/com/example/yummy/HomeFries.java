package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeFries extends AppCompatActivity {
    TextView textDemiana1;
    TextView textDemiana1para;
    TextView textDemiana1para2;

    Button btn111;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_fries);
        textDemiana1 = (TextView) findViewById(R.id.HomeFriesTextView);
        textDemiana1para = (TextView) findViewById(R.id.HomeFriesParaTextView1);
        textDemiana1para2 = (TextView) findViewById(R.id.HomeFriesParaTextView2);

        btn111=(Button) findViewById(R.id.HomeFriesbtn);

        btn111.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View view){
                goLink("https://youtu.be/bjvVuToXNvU");
            }
        });

    }

    private void goLink(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}