package net.ozero.drugreminders;

import android.app.Application;
import android.content.SharedPreferences;

import net.ozero.drugreminders.DataStructures.Person;

import java.util.ArrayList;
import java.util.List;

public class DrugRemindersApp extends Application {
    List<Person> persons;

    @Override
    public void onCreate() {
        super.onCreate();
        persons = new ArrayList<>();
    }
}
