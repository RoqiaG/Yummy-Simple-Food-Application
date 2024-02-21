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

public class Lunch extends AppCompatActivity {

    TextView text6;

    ListView list6;
    String LunchMeals[] = { "pizza", "Burger", "Spaghetti", "Coleslaw" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);


        text6 = (TextView) findViewById(R.id.LunchTextView);
        list6 = (ListView) findViewById(R.id.LunchListView);

        final ArrayAdapter<String> arr5;

        arr5   = new ArrayAdapter<String>(
                this,
                android.R.layout.browser_link_context_header,
                LunchMeals);

        list6.setAdapter(arr5);

        registerForContextMenu(list6);

        list6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(Lunch.this,pizza.class));
                }
                else if (position==1){
                    startActivity(new Intent(Lunch.this,Burger.class));
                }
                else if (position==2){
                    startActivity(new Intent(Lunch.this,Spaghetti.class));
                }
                else {
                    startActivity(new Intent(Lunch.this,Coleslaw.class));
                }
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.lunchcontextmenu,menu);

    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getItemId()==R.id.lunchcontmenu){
            Toast.makeText(this, "Link is copied to clipboard.", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}