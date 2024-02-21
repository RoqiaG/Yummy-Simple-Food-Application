package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Desserts extends AppCompatActivity {

    TextView text1;

    ListView list1;
    String desserts[] = { "Classic Waffles", "Muffins", "Cinnamon Rolls", "Chocolate Cake" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        text1 = (TextView) findViewById(R.id.DessertTextView);
        list1 = (ListView) findViewById(R.id.DessertListView);

        final ArrayAdapter<String> arr;

        arr   = new ArrayAdapter<String>(
                this,
                android.R.layout.browser_link_context_header,
                desserts);

        list1.setAdapter(arr);

        registerForContextMenu(list1);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(Desserts.this,Waffle.class));
                }
                else if (position==1){
                    startActivity(new Intent(Desserts.this,Muffin.class));
                }
                else if (position==2){
                    startActivity(new Intent(Desserts.this,Cinnamon.class));
                }
                else {
                    startActivity(new Intent(Desserts.this,Cake.class));
                }
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.dessertcontextmenu,menu);

    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getItemId()==R.id.dessertcontmenu){
            Toast.makeText(this, "Link is copied to clipboard.", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}