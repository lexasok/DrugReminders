package net.ozero.drugreminders.DataStructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getDrugsCountDrugsNullAssertZero() {
        Person person = new Person();
        assertEquals(0, person.getDrugsCount());
    }

    @Test
    public void getDrugsCountDrugsNotNull() {
        Person person = new Person();
        Drug drug1 = new Drug();
        Drug drug2 = new Drug();
        Drug drug3 = new Drug();
        Drug[] drugs = {drug1, drug2, drug3};
        person.setDrugs(drugs);
        assertEquals(3, person.getDrugsCount());
    }
}