import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {
    Bird bird;

    @Before
    public void setUp() {
        bird = new Bird("Black", "Raven", true);
    }

    @Test
    public void testToString() {
        String expected = "Bird{" +
                "color='Black'" +
                ", type='Raven'" +
                ", isFly=true" +
                '}';
        String actual = bird.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testEquals() {
        Bird expected = new Bird("Black", "Raven", true);
        Bird actual = new Bird("Black", "Raven", true);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        Bird expected = new Bird("Black", "Raven", true);
        Bird actual = new Bird("Black", "Raven", true);
        assertEquals(expected, actual);
    }
}