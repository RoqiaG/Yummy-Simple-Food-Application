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

public class Breakfast extends AppCompatActivity {
    TextView text4;

    ListView list4;
    String breakfastMeals[] = { "Home Fries", "Hot Buns", "Eggs", "Falafel" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        text4 = (TextView) findViewById(R.id.BreakfastTextView);
        list4 = (ListView) findViewById(R.id.BreakfastListView);

        final ArrayAdapter<String> arr4;

        arr4   = new ArrayAdapter<String>(
                this,
                android.R.layout.browser_link_context_header,
                breakfastMeals);

        list4.setAdapter(arr4);

        registerForContextMenu(list4);

        list4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(Breakfast.this,HomeFries.class));
                }
                else if (position==1){
                    startActivity(new Intent(Breakfast.this,HotBuns.class));
                }
                else if (position==2){
                    startActivity(new Intent(Breakfast.this,Eggs.class));
                }
                else {
                    startActivity(new Intent(Breakfast.this,EgyFalafel.class));
                }
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.breakfastcontextmenu,menu);

    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getItemId()==R.id.breakfastcontmenu){
            Toast.makeText(this, "Link is copied to clipboard.", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}