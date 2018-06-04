package com.example.android.inventorystage1.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.android.inventorystage1.data.InventoryContract.InventoryEntry;

/**
 * Created by Dolea on 31.05.2018.
 */

public class InventoryDbHelper extends SQLiteOpenHelper {

    // The name of the database file
    public static final String DATABASE_NAME = "products.db";

    // The version of the database. If you change the database schema, you must increment the database version
    public static final int DATABASE_VERSION = 1;
    /**
     * Constructs a new instance of {@link InventoryDbHelper}.
     *
     * @param context of the app
     */
    public InventoryDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // This is called when the database is created for the first time.
    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_INV_TABLE = "CREATE TABLE " + InventoryEntry.TABLE_NAME + " (" +
                InventoryEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                InventoryEntry.COLUMN_NAME + " TEXT NOT NULL," +
                InventoryEntry.COLUMN_PRICE + " REAL NOT NULL," +
                InventoryEntry.COLUMN_QUANTITY + " INTEGER NOT NULL DEFAULT 0," +
                InventoryEntry.COLUMN_SUPPLIER_NAME + " TEXT NOT NULL," +
                InventoryEntry.COLUMN_SUPPLIER_PHONE + " TEXT NOT NULL );";

        // Execute the SQL statement
        db.execSQL(SQL_CREATE_INV_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
