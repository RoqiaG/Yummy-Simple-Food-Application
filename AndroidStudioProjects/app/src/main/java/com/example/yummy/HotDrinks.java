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

public class HotDrinks extends AppCompatActivity {


    TextView text2;

    ListView list2;
    String hotDrinks[] = { "Hot Cocoa", "Chai Latte", "White Chocolate Latte", "Tea Mix" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_drinks);

        text2 = (TextView) findViewById(R.id.HotDrinksTextView);
        list2 = (ListView) findViewById(R.id.HotDrinksListView);

        final ArrayAdapter<String> arr2;

        arr2   = new ArrayAdapter<String>(
                this,
                android.R.layout.browser_link_context_header,
                hotDrinks);

        list2.setAdapter(arr2);

        registerForContextMenu(list2);

        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(HotDrinks.this,HotCocoa.class));
                }
                else if (position==1){
                    startActivity(new Intent(HotDrinks.this,ChaiLatte.class));
                }
                else if (position==2){
                    startActivity(new Intent(HotDrinks.this,ChocoLatte.class));
                }
                else {
                    startActivity(new Intent(HotDrinks.this,TeaMix.class));
                }
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.hotdrinkscontextmenu,menu);

    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getItemId()==R.id.hotdrinkscontmenu){
            Toast.makeText(this, "Link is copied to clipboard.", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}