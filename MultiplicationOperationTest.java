import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationOperationTest {

    @Test
    public void compute() {
        MultiplicationOperation multiplicationOperation = new MultiplicationOperation();
        double expected = 20.0;
        assertEquals(expected, multiplicationOperation.compute(10, 2.0), 0.0);
    }
}