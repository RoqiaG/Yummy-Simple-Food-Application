package com.example.yummy.data;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DatabaseSqlite extends SQLiteOpenHelper {
    public static final String databaseName="YummyDatabase";
    public DatabaseSqlite(Context context){
        super(context,databaseName,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table meal (id INTEGER primary key AUTOINCREMENT,name TEXT,ingredients TEXT,directions TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS meal");
        onCreate(sqLiteDatabase);
    }
    public String insertData(String name,String in,String di){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("name",name);
        values.put("ingredients",in);
        values.put("directions",di);
        long result=sqLiteDatabase.insert("meal",null,values);
        if(result==-1){
            return "error";
        }else{
            return "inserted";
        }
    }
    public ArrayList<Meal> getData() {
        ArrayList<Meal> arr = new ArrayList<Meal>();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select * from meal", null);
        cursor.moveToFirst();

        while (cursor.isAfterLast() == false) {
            arr.add(new Meal(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getString(3)));
            cursor.moveToNext();
        }
        return arr;
    }
    public void updateData(String id,String name,String in,String di){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("name",name);
        values.put("ingredients",in);
        values.put("directions",di);
        sqLiteDatabase.update("meal",values,"id=?",new String[]{id});

    }
    public void deleteData(String id){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        sqLiteDatabase.delete("meal","id=?",new String[]{id});
    }

}