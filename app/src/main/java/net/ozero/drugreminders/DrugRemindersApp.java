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


    }




    public List<Person> getPersons() {
        return persons;
    }
}
