package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class pizza extends AppCompatActivity {
    TextView textNagy1;
    TextView textNagy1para;
    TextView textNagy1para2;

    Button btn11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        textNagy1 = (TextView) findViewById(R.id.PizzaTextView);
        textNagy1para = (TextView) findViewById(R.id.PizzaParaTextView1);
        textNagy1para2 = (TextView) findViewById(R.id.PizzaParaTextView2);

        btn11=(Button) findViewById(R.id.Pizzabtn);

        btn11.setOnClickListener(new View.OnClickListener()
        {
            public  void onClick(View view){
                goLink("https://youtu.be/VOWUkroSYIw");
            }
        });
    }

    private void goLink(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}