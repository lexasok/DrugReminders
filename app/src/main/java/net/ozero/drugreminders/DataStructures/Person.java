package net.ozero.drugreminders.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private List<Drug> drugs;

    public Person(String name) {
        this.name = name;
        drugs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }

    public int getDrugsCount() {
        return drugs.size();

    }
}
