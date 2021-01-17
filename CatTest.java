import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    Cat cat;

    @Before
    public void setUp(){
        cat = new Cat("Red-headed", "Maine coon", true, true);
    }

    @Test
    public void testToString() {
        String expected = "Cat{" +
                "color='Red-headed'" +
                ", type='Maine coon'" +
                ", meow=true" +
                ", drinksMilk=true" +
                '}';
        String actual = cat.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testEquals() {
        Cat expected = new Cat("Red-headed", "Maine coon", true, true);
        Cat actual = new Cat("Red-headed", "Maine coon", true, true);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        Cat expected = new Cat("Red-headed", "Maine coon", true, true);
        Cat actual = new Cat("Red-headed", "Maine coon", true, true);
        assertEquals(expected, actual);
    }
}