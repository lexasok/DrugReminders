package net.ozero.drugreminders;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import net.ozero.drugreminders.DataStructures.Person;

import java.util.ArrayList;

public class DBManager {

    private Context context;
    private SQLiteDatabase database;
    private DBHelper dbHelper;

    public DBManager(Context context) {
        this.context = context;
        dbHelper = new DBHelper(context);
        database = dbHelper.getWritableDatabase();
    }

    public ArrayList<Person> getPersonsList() {
        return null;
    }

}
