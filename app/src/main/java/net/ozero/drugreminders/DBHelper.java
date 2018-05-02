package net.ozero.drugreminders;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {


    public static final String PERSONS_TABLE_NAME = "PERSONS";
    public static final String NAME = "COLUMN_NAME";

    private static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) {
        super(context, "myDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE PERSONS (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "COLUMN_NAME TEXT" + ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
