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

public class Dinner extends AppCompatActivity {
    TextView text5;

    ListView list5;
    String DinnerMeals[] = { "Grilled Salmon", "Grilled Chicken", "Turkey", "Tomato Soup" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);

        text5 = (TextView) findViewById(R.id.DinnerTextView);
        list5 = (ListView) findViewById(R.id.DinnerListView);

        final ArrayAdapter<String> arr5;

        arr5   = new ArrayAdapter<String>(
                this,
                android.R.layout.browser_link_context_header,
                DinnerMeals);

        list5.setAdapter(arr5);

        registerForContextMenu(list5);

        list5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(Dinner.this,GrilledSalmon.class));
                }
                else if (position==1){
                    startActivity(new Intent(Dinner.this,GrilledChicken.class));
                }
                else if (position==2){
                    startActivity(new Intent(Dinner.this,Turkey.class));
                }
                else {
                    startActivity(new Intent(Dinner.this,TomatoSoup.class));
                }
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.dinnercontextmenu,menu);

    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        if(item.getItemId()==R.id.dinnercontmenu){
            Toast.makeText(this, "Link is copied to clipboard.", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}