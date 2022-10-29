package assignment3;

import org.junit.jupiter.api.Test;

import assignment3.Person;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void PersonNullTest() {
        Exception exception = assertThrows(RuntimeException.class,
                ()->{
                    Person.builder().id(null).
                            firstName("Mosses").
                            lastName("LastName").
                            age(28).
                            gender("Male").build();
                });

        String expectedMessage = "id is marked non-null but is null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void PersonNameTest() {
        Exception exception = assertThrows(RuntimeException.class,
                ()->{
                    Person.builder().id("ID123").
                            firstName("").
                            lastName("Tony").
                            age(28).
                            gender("Male").build();
                });

        String expectedMessage = "Firstname should not be empty";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void PersonAgeTest() {
        Exception exception = assertThrows(RuntimeException.class,
                ()->{
                    Person.builder().id("ID123").
                            firstName("Tony").
                            lastName("Stark").
                            age(-1).
                            gender("Male").build();
                });

        String expectedMessage = "Age should be greater than zero";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void PersonValidTest() {
        Person person = Person.builder().id("ID123").
                firstName("Tony").
                lastName("Stark").
                age(28).
                gender("Male").build();

        assertEquals(person.getId(),"ID123");
        assertEquals(person.getFirstName(),"Tony");
        assertEquals(person.getLastName(),"Stark");
        assertEquals(person.getGender(),"Male");
    }
}