package net.ozero.drugreminders.DataStructures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getDrugsCountDrugsNullAssertZero() {
        Person person = new Person("1");
        assertEquals(0, person.getDrugsCount());
    }

    @Test
    public void getDrugsCountDrugsNotNull() {
        Person person = new Person("2");
        Drug drug1 = new Drug();
        Drug drug2 = new Drug();
        Drug drug3 = new Drug();
        List<Drug> drugs = new ArrayList<>();
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug3);
        person.setDrugs(drugs);
        assertEquals(3, person.getDrugsCount());
    }
}