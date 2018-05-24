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
        loadPersonsFromDB(persons, personsNames);

    }


    private void loadPersonsFromDB(List<Person> persons, ArrayList<String> personsNames) {
        for (int i = 0; i < personsNames.size(); i++) {
            persons.add(new Person(personsNames.get(i)));
        }
    }

    public List<Person> getPersons() {
        return persons;
    }
}
