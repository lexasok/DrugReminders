package net.ozero.drugreminders;

import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import net.ozero.drugreminders.DataStructures.Person;

import java.util.ArrayList;
import java.util.List;

public class DrugRemindersApp extends Application {
    List<Person> persons;
    DBHelper dbHelper;
    ArrayList<String> personsNames;


    @Override
    public void onCreate() {
        super.onCreate();

        //database
        dbHelper = new DBHelper(this);
        ContentValues contentValues = new ContentValues();
        SQLiteDatabase database = dbHelper.getWritableDatabase();

        contentValues.put(DBHelper.KEY_NAME, "test name 1");
        contentValues.put(DBHelper.KEY_NAME, "test name 2");
        contentValues.put(DBHelper.KEY_NAME, "test name 3");

        database.insert(DBHelper.TABLE_PERSONS, null, contentValues);

        Cursor cursor = database.query(
                DBHelper.TABLE_PERSONS,
                null, null,
                null, null,
                null, null
        );

        personsNames = new ArrayList<>();

        boolean moveToFirst = cursor.moveToFirst();

        if (moveToFirst) {
            int nameColumnIndex = cursor.getColumnIndex(DBHelper.KEY_NAME);

            do {
                personsNames.add(cursor.getString(nameColumnIndex));
            } while (cursor.moveToNext());
        }


        persons = new ArrayList<>();
        //DATA from DB
        this.laodPersonsFromDB(persons, personsNames);

    }


    private void laodPersonsFromDB(List<Person> persons, ArrayList<String> personsNames) {
        for (int i = 0; i < personsNames.size(); i++) {
            persons.add(new Person(personsNames.get(i)));
        }
    }

    public List<Person> getPersons() {
        return persons;
    }
}
