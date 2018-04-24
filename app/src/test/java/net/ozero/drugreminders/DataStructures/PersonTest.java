package net.ozero.drugreminders.DataStructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getDrugsCountDrugsNullAssertZero() {
        Person person = new Person();
        assertEquals(0, person.getDrugsCount());
    }
}