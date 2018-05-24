package net.ozero.drugreminders;

import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import net.ozero.drugreminders.DataStructures.Person;

import java.util.ArrayList;
import java.util.List;

public class DrugRemindersApp extends Application {
    DataManager dataManager;
    ArrayList<String> personsNames;


    @Override
    public void onCreate() {
        super.onCreate();
        dataManager = new DataManager(this);


    }




    public List<Person> getPersons() {
        return dataManager.getPersons();
    }
}
