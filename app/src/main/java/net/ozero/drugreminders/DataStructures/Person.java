package net.ozero.drugreminders.DataStructures;

public class Person {

    private String name;
    private Drug[] drugs;

    public Person(String name) {
        this.name = name;
    }

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
        if (drugs != null){
            return drugs.length;
        } else return 0;
    }
}
