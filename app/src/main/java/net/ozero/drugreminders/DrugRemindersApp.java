package net.ozero.drugreminders;

import android.app.Application;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;

import net.ozero.drugreminders.DataStructures.Person;

import java.util.ArrayList;
import java.util.List;

public class DrugRemindersApp extends Application {
    List<Person> persons;
    DBHelper dbHelper;


    @Override
    public void onCreate() {
        super.onCreate();

        //database
        dbHelper = new DBHelper(this);
        ContentValues contentValues = new ContentValues();
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        contentValues.put("NAME", "test name 1");
        contentValues.put("NAME", "test name 2");

        long rowId = db.insert(DBHelper.PERSONS_TABLE_NAME, null, contentValues);




        persons = new ArrayList<>();

        //fake data
        loadFakePersons();

    }

    private void loadFakePersons() {
        Person person1 = new Person("Ahtung");
        Person person2 = new Person("Kudahtung");
        Person person3 = new Person("Postahtung");
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
    }

    public List<Person> getPersons() {
        return persons;
    }
}
