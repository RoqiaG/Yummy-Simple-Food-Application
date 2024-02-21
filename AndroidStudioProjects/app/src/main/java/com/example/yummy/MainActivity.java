package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    CardView lunch;
    CardView dinner;
    CardView breakfast;
    CardView hotDrinks;
    CardView coldDrinks;
    CardView dessert;

    EditText edit1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edit1 = (EditText)findViewById(R.id.HomeEditTextView);
        btn= (Button)findViewById(R.id.HomeBtn);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (edit1.getText().toString().equals("Waffle")||edit1.getText().toString().equals("waffle")){
                    startActivity(new Intent(MainActivity.this, Waffle.class));
                }
                else if (edit1.getText().toString().equals("Muffin")||edit1.getText().toString().equals("muffin")){
                    startActivity(new Intent(MainActivity.this, Muffin.class));
                }
                else if (edit1.getText().toString().equals("Cinnamon")||edit1.getText().toString().equals("cinnamon")){
                    startActivity(new Intent(MainActivity.this, Cinnamon.class));
                }
                else if (edit1.getText().toString().equals("Cake")|| edit1.getText().toString().equals("cake")){
                    startActivity(new Intent(MainActivity.this, Cake.class));
                }
                else if (edit1.getText().toString().equals("Desserts")||edit1.getText().toString().equals("desserts")){
                    startActivity(new Intent(MainActivity.this, Desserts.class));
                }


                else if (edit1.getText().toString().equals("Grilled Salmon")||edit1.getText().toString().equals("grilled salmon")){
                    startActivity(new Intent(MainActivity.this, GrilledSalmon.class));
                }
                else if (edit1.getText().toString().equals("Grilled Chicken")||edit1.getText().toString().equals("grilled chicken")){
                    startActivity(new Intent(MainActivity.this, GrilledChicken.class));
                }
                else if (edit1.getText().toString().equals("Turkey")||edit1.getText().toString().equals("turkey")){
                    startActivity(new Intent(MainActivity.this, Turkey.class));
                }
                else if (edit1.getText().toString().equals("Tomato Soup")|| edit1.getText().toString().equals("tomato soup")){
                    startActivity(new Intent(MainActivity.this, TomatoSoup.class));
                }
                else if (edit1.getText().toString().equals("Dinner")||edit1.getText().toString().equals("dinner")){
                    startActivity(new Intent(MainActivity.this, Dinner.class));
                }


                else if (edit1.getText().toString().equals("Hot Cocoa")||edit1.getText().toString().equals("hot cocoa")){
                    startActivity(new Intent(MainActivity.this, HotCocoa.class));
                }
                else if (edit1.getText().toString().equals("Chai Latte")||edit1.getText().toString().equals("chai latte")){
                    startActivity(new Intent(MainActivity.this, ChaiLatte.class));
                }
                else if (edit1.getText().toString().equals("Tea Mix")||edit1.getText().toString().equals("tea mix")){
                    startActivity(new Intent(MainActivity.this, ChocoLatte.class));
                }
                else if (edit1.getText().toString().equals("Choco Latte")|| edit1.getText().toString().equals("choco latte")){
                    startActivity(new Intent(MainActivity.this, TeaMix.class));
                }
                else if (edit1.getText().toString().equals("Hot Drinks")||edit1.getText().toString().equals("hot drinks")){
                    startActivity(new Intent(MainActivity.this, HotDrinks.class));
                }


                else if (edit1.getText().toString().equals("Lemonade")||edit1.getText().toString().equals("lemonade")){
                    startActivity(new Intent(MainActivity.this, Lemonade.class));
                }
                else if (edit1.getText().toString().equals("Milk Shake")||edit1.getText().toString().equals("milk shake")){
                    startActivity(new Intent(MainActivity.this, MilkShake.class));
                }
                else if (edit1.getText().toString().equals("Smoothie")||edit1.getText().toString().equals("smoothie")){
                    startActivity(new Intent(MainActivity.this, Smoothie.class));
                }
                else if (edit1.getText().toString().equals("Yogurt")|| edit1.getText().toString().equals("yogurt")){
                    startActivity(new Intent(MainActivity.this, Yogurt.class));
                }
                else if (edit1.getText().toString().equals("Cold Drinks")||edit1.getText().toString().equals("cold drinks")){
                    startActivity(new Intent(MainActivity.this, ColdDrinks.class));
                }


                else if (edit1.getText().toString().equals(" Pizza")||edit1.getText().toString().equals("pizza")){
                    startActivity(new Intent(MainActivity.this, pizza.class));
                }
                else if (edit1.getText().toString().equals("Burger")||edit1.getText().toString().equals("burger")){
                    startActivity(new Intent(MainActivity.this, Burger.class));
                }
                else if (edit1.getText().toString().equals("Spaghetti")||edit1.getText().toString().equals("spaghetti")){
                    startActivity(new Intent(MainActivity.this, Spaghetti.class));
                }
                else if (edit1.getText().toString().equals("Coleslaw")|| edit1.getText().toString().equals("coleslaw")){
                    startActivity(new Intent(MainActivity.this, Coleslaw.class));
                }
                else if (edit1.getText().toString().equals("Lunch")||edit1.getText().toString().equals("lunch")){
                    startActivity(new Intent(MainActivity.this, Lunch.class));
                }


                else if (edit1.getText().toString().equals("Home Fries")||edit1.getText().toString().equals("home fries")){
                    startActivity(new Intent(MainActivity.this, HomeFries.class));
                }
                else if (edit1.getText().toString().equals("Hot Buns")||edit1.getText().toString().equals("hot buns")){
                    startActivity(new Intent(MainActivity.this, HotBuns.class));
                }
                else if (edit1.getText().toString().equals("Eggs")||edit1.getText().toString().equals("eggs")){
                    startActivity(new Intent(MainActivity.this, Eggs.class));
                }
                else if (edit1.getText().toString().equals("Falafel")|| edit1.getText().toString().equals("falafel")){
                    startActivity(new Intent(MainActivity.this, EgyFalafel.class));
                }
                else if (edit1.getText().toString().equals("Breakfast")||edit1.getText().toString().equals("breakfast")){
                    startActivity(new Intent(MainActivity.this, Breakfast.class));
                }
                else{
                    Toast.makeText(getApplicationContext(),"Not Found!",Toast.LENGTH_LONG).show();

                }
            }
        });

        lunch=findViewById(R.id.lunchHome);
        dinner=findViewById(R.id.dinnerHome);
        breakfast=findViewById(R.id.breakfastHome);
        hotDrinks=findViewById(R.id.hotdrinksHome);
        coldDrinks=findViewById(R.id.colddrinksHome);
        dessert=findViewById(R.id.dessertsHome);

        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Desserts.class));
            }
        });

        hotDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HotDrinks.class));
            }
        });

        coldDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ColdDrinks.class));
            }
        });

        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Breakfast.class));
            }
        });

        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Dinner.class));
            }
        });

        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Lunch.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu (Menu menu){

        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.homeoptionmenu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.homesubmenu1){
            startActivity(new Intent(MainActivity.this, Signup.class));
            return(true);
        }
        else if(item.getItemId()==R.id.homeopmenu2){
            finish();
            return(true);
        }

        return(false);
    }





}



