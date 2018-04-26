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
