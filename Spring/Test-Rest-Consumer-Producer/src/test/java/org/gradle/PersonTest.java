package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

import org.example.restProducer.Person;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
}
