package net.ozero.drugreminders.DataStructures;

public class Drug {
    private String name;
    private Dosage dosage;
    private Schedule shedule;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dosage getDosage() {
        return dosage;
    }

    public void setDosage(Dosage dosage) {
        this.dosage = dosage;
    }

    public Schedule getShedule() {
        return shedule;
    }

    public void setShedule(Schedule shedule) {
        this.shedule = shedule;
    }


}
