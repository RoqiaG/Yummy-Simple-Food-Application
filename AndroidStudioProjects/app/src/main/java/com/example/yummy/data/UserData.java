package com.example.yummy.data;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.Editable;

import java.util.ArrayList;

public class UserData extends SQLiteOpenHelper {
    public static final String databaseName1="SignUp.db";
    public UserData(Context context){
        super(context,databaseName1,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table user (id INTEGER primary key AUTOINCREMENT,name TEXT,password TEXT,email TEXT,phoneNumber INTEGER )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i0, int i2) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS user");
        onCreate(sqLiteDatabase);
    }



    public String insertData1( String name, String password, String email, String phone){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues values1=new ContentValues();
        values1.put("name",name);
        values1.put("password",password);
        values1.put("email",email);
        values1.put("phoneNumber", phone);


        long result1=sqLiteDatabase.insert("user",null,values1);
        if(result1==-1){
            return "error";
        }else{
            return "Signed Up";
        }
    }


    public ArrayList<User> getDataUser() {
        ArrayList<User> arr = new ArrayList<User>();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("select * from user", null);
        cursor.moveToFirst();

        while (cursor.isAfterLast() == false) {
            arr.add(new User(
                    cursor.getInt(0),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getInt(4)
            ));
            cursor.moveToNext();
        }
        return arr;
    }

    public void updateData(String id,String name,String email,String password,int phone){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("name",name);
        values.put("email",email);
        values.put("password",password);
        values.put("phoneNumber", phone);


        sqLiteDatabase.update("user",values,"id=?",new String[]{id});

    }
    public void deleteData(String id){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        sqLiteDatabase.delete("user","id=?",new String[]{id});
    }
}