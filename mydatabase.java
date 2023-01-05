package com.example.sjcet.insert;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class mydatabase (Context,Context) {


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.exSQL(create table users(name text,surname text, mark text));
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.exSQL("DROP Table if alredady exist users")

    }
}
