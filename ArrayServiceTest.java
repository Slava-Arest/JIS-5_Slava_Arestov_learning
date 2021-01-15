import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayServiceTest {
    ArrayService arrayService;
    @Before
    public void setUp(){
        arrayService = new ArrayService();
    }

    int[] newArray = {10, 23, 84, 16, 36, 25, 30, 38};

    @Test
    public void create() {
        arrayService = new ArrayService();
        arrayService.create(9);
    }

    @Test
    public void fillRandomly() {
        arrayService = new ArrayService();

        int[] array = arrayService.create(9);
        arrayService.fillRandomly(newArray);
    }

    @Test
    public void printArray() {
        arrayService = new ArrayService();
        arrayService.printArray(newArray);
    }

    @Test
    public void sum() {
        int expected = 262;
        int actual = arrayService.sum(newArray);
        assertEquals(expected, actual);
    }

    @Test
    public void avg() {
       ArrayService arrayService = new ArrayService();
        assertArrayEquals(32.75, arrayService.avg(newArray));
    }

    private void assertArrayEquals(double v, double avg) {
    }
}