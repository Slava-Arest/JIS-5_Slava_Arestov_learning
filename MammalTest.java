import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MammalTest {

    Mammal mammal;

    @Before
    public void setUp(){
        mammal = new Mammal("White", "Horse", true);
    }


    @Test
    public void testToString() {
        String expected = "Mammal{" +
                "color='White'" +
                ", type='Horse'" +
                ", drinksMilk=true" +
                '}';
        String actual = mammal.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testEquals() {
        Mammal expected = new Mammal("White", "Horse", true);
        Mammal actual = new Mammal("White", "Horse", true);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        Mammal expected = new Mammal("White", "Horse", true);
        Mammal actual = new Mammal("White", "Horse", true);
        assertEquals(expected, actual);
    }
}