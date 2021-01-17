import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalsTest {

    Animals animals;

    @Before
    public void setUp() {
        animals = new Animals("White", "Horse");
    }

    @Test
    public void testToString() {
        String expected = "Animals{" +
                "color='White'" +
                ", type='Horse'" +
                '}';
        String actual = animals.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testEquals() {
        Animals expected = new Animals("White", "Horse");
        Animals actual = new Animals("White", "Horse");
        assertEquals(expected, actual);

    }

    @Test
    public void testHashCode() {
        Animals expected = new Animals("White", "Horse");
        Animals actual = new Animals("White", "Horse");
        assertEquals(expected, actual);
    }
}