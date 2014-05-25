package com.houyalab.android.backzen.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CacheHelper extends SQLiteOpenHelper {

    private static final int VERSION = 8;

    private static final String NAME = "cache.db";

    public CacheHelper(final Context context) {
        super(context, NAME, null, VERSION);
    }

    @Override
    public void onCreate(final SQLiteDatabase db) {
        db.execSQL("CREATE TABLE users (id INTEGER PRIMARY KEY,name TEXT);");
        db.execSQL("CREATE TABLE meditation_logs (id INTEGER PRIMARY KEY, name TEXT);");
    }

    @Override
    public void onUpgrade(final SQLiteDatabase db, final int oldVersion,
            final int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS users");
        db.execSQL("DROP TABLE IF EXISTS meditation_logs");
        onCreate(db);
    }
}
