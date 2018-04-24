package net.ozero.drugreminders.DataStructures;

public class Person {

    private String name;
    private Drug[] drugs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drug[] getDrugs() {
        return drugs;
    }

    public void setDrugs(Drug[] drugs) {
        this.drugs = drugs;
    }

    public int getDrugsCount() {

        return drugs.length;
    }
}
