import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    Dog dog;

    @Before
    public void setUp() {
        dog = new Dog("Black", "German shepherd", true, true);
    }

    @Test
    public void testToString() {
       String expected = "Dog{" +
                "color='Black'" +
                ", type='German shepherd'" +
                ", voice=true" +
                ", drinksMilk=true" +
                '}';
       String actual = dog.toString();
       assertEquals(expected, actual);
    }

    @Test
    public void testEquals() {
        Dog expected = new Dog("Black", "German shepherd", true, true);
        Dog actual = new Dog("Black", "German shepherd", true, true);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        Dog expected = new Dog("Black", "German shepherd", true, true);
        Dog actual = new Dog("Black", "German shepherd", true, true);
        assertEquals(expected, actual);
    }
}