package be.abis.hellomaven.model;

import be.abis.hellomaven.model.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    Person person = new Person("Tom", 42);

    @Test
    public void birth1980(){
        assertEquals(1980, person.calcBirth());
    }

}
