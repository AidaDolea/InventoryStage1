package com.example.android.inventorystage1.data;

import android.provider.BaseColumns;

/**
 * Created by Dolea on 31.05.2018.
 */

public class InventoryContract {

    private InventoryContract(){

    }

    public static final class InventoryEntry implements BaseColumns {

        // Name of the database table for products
        public static final String TABLE_NAME = "inventory";

        /**
         * Unique ID number for the products (only for use in the database table).
         * Type: INTEGER
         */
        public final static String _ID = "_id";

        /**
         * Name of the product.
         * Type: TEXT
         */
        public static final String COLUMN_NAME = "name";

        /**
         * Price of the product.
         * Type: REAL
         */
        public static final String COLUMN_PRICE = "price";

        /**
         * Quantity of the product.
         * Type: INTEGER
         */
        public static final String COLUMN_QUANTITY = "quantity";

        /**
         * Name of the product supplier.
         * Type: TEXT
         */
        public static final String COLUMN_SUPPLIER_NAME = "supplier_name";

        /**
         * Phone of the product supplier.
         * Type: TEXT
         */
        public static final String COLUMN_SUPPLIER_PHONE = "supplier_phone";

    }
}
