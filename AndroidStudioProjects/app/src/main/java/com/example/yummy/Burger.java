package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Burger extends AppCompatActivity {
    TextView textNagy2;
    TextView textNagy2para;
    TextView textNagy2para2;

    Button btn22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);

        textNagy2 = (TextView) findViewById(R.id.BurgerTextView);
        textNagy2para = (TextView) findViewById(R.id.BurgerParaTextView1);
        textNagy2para2 = (TextView) findViewById(R.id.BurgerParaTextView2);

        btn22=(Button) findViewById(R.id.Burgerbtn);

        btn22.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View view){
                goLink("https://youtu.be/3BvB2eX6LhQ");
            }
        });
    }

    private void goLink(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}