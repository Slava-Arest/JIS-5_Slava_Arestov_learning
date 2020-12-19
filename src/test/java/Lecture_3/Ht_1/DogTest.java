package Lecture_3.Ht_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;

class DogTest {

    Dog dog = new Dog();

    @Test
    void testToString() {

        dog.setAge(3);
        dog.setColor("White");
        dog.setName("Pluto");

        String expected = "Dog{age=3, color='White', name='Pluto'}";
        String actual = dog.toString();
        assertEquals(expected, actual);

    }

    @Test
    void testEquals() {
        Dog expected = new Dog(3, "White", "Color");
        Dog actual = new Dog(3, "White", "Pluto");
        Assert.assertTrue(expected.equals(actual) || actual.equals(expected));
    }

    @Test
    void testHashCode() {
        Dog expected = new Dog(3, "White", "Color");
        Dog actual = new Dog(3, "White", "Pluto");
        assertEquals(expected.hashCode(), actual.hashCode());
    }
}