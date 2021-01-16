import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayServiceTest {

    ArrayService arrayService;

    @Before
    public void setUp(){
        arrayService = new ArrayService();
    }

    @Test
    public void sort() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] actual = arrayService.sort(array);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void swap() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expected = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] actual = arrayService.swap(array);
        assertArrayEquals(expected, actual);
    }
}