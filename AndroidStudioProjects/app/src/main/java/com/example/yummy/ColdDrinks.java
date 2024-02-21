package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ColdDrinks extends AppCompatActivity {

    TextView text3;

    ListView list3;
    String coldDrinks[] = { "Lemonade", "Milk Shake", "Blueberry Smoothie", "Yogurt Smoothie" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold_drinks);


        text3 = (TextView) findViewById(R.id.ColdDrinksTextView);
        list3 = (ListView) findViewById(R.id.ColdDrinksListView);

        final ArrayAdapter<String> arr3;

        arr3   = new ArrayAdapter<String>(
                this,
                android.R.layout.browser_link_context_header,
                coldDrinks);

        list3.setAdapter(arr3);

        registerForContextMenu(list3);

        list3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(ColdDrinks.this,Lemonade.class));
                }
                else if (position==1){
                    startActivity(new Intent(ColdDrinks.this,MilkShake.class));
                }
                else if (position==2){
                    startActivity(new Intent(ColdDrinks.this,Smoothie.class));
                }
                else {
                    startActivity(new Intent(ColdDrinks.this,Yogurt.class));
                }
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.colddrinkscontextmenu,menu);

    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getItemId()==R.id.colddrinkscontmenu){
            Toast.makeText(this, "Link is copied to clipboard.", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}