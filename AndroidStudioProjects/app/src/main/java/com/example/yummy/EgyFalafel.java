package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EgyFalafel extends AppCompatActivity {
    TextView textDemiana4;
    TextView textDemiana4para;
    TextView textDemiana4para2;

    Button btn444;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egy_falafel);
        textDemiana4 = (TextView) findViewById(R.id.FalafelTextView);
        textDemiana4para = (TextView) findViewById(R.id.FalafelParaTextView1);
        textDemiana4para2 = (TextView) findViewById(R.id.FalafelParaTextView2);

        btn444=(Button) findViewById(R.id.Falafelbtn);

        btn444.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View view){
                goLink("https://youtu.be/mSDQKi_h-HI");
            }
        });
    }
    private void goLink(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}