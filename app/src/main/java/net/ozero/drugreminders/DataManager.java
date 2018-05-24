package net.ozero.drugreminders;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import net.ozero.drugreminders.DataStructures.Person;

import java.util.ArrayList;

public class DataManager {

    private Context context;
    private SQLiteDatabase database;
    private DBHelper dbHelper;

    public DataManager(Context context) {
        this.context = context;
        dbHelper = new DBHelper(context);
        database = dbHelper.getWritableDatabase();
    }

    public ArrayList<String> getPersonsNamesList() {
        ArrayList<String> personsNames = new ArrayList<>();

        Cursor cursor = database.query(
                DBHelper.TABLE_PERSONS,
                null, null,
                null, null,
                null, null
        );
        if (cursor.moveToFirst()) {
            int nameColumnIndex = cursor.getColumnIndex(DBHelper.KEY_NAME);

            do {
                personsNames.add(cursor.getString(nameColumnIndex));
            } while (cursor.moveToNext());
        }
        return personsNames;
    }

    public ArrayList<Person> getPersons() {
        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<String> personsNames = getPersonsNamesList();
        for (int i = 0; i < personsNames.size(); i++) {
            persons.add(new Person(personsNames.get(i)));
        }
        return persons;
    }

    public void addPersonName(String name) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DBHelper.KEY_NAME, name);
        database.insert(DBHelper.TABLE_PERSONS, null, contentValues);
    }

}
