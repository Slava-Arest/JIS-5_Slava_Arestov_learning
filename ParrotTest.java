import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParrotTest {

    Parrot parrot;

    @Before
    public void setUp() {
        parrot = new Parrot("Different","Ara", true, true);
    }

    @Test
    public void testToString() {
        String expected = "Parrot{" +
                "color='Different'" +
                ", type='Ara'" +
                ", isFly=true" +
                ", isTalking=true" +
                '}';
        String actual = parrot.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testEquals() {
        Parrot expected = new Parrot("Different","Ara", true, true);
        Parrot actual = new Parrot("Different","Ara", true, true);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
    }
}