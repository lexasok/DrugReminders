package net.ozero.drugreminders;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;

    public static final String DATABASE_NAME = "drugRemindersDb";
    public static final String TABLE_PERSONS = "tablePersons";
    public static final String COLUMN_NAME = "name";



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
        db.execSQL("drop table if exists " + TABLE_PERSONS);
        onCreate(db);
    }
}
