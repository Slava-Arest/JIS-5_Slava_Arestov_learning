import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionOperationTest {

    @Test
    public void compute() {
        SubtractionOperation subtractionOperation = new SubtractionOperation();
        double expected = 8.0;
        assertEquals(expected, subtractionOperation.compute(10.0, 2.0), 0.0);
    }
}