import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionOperationTest {

    @Test
    public void compute() {
        AdditionOperation additionOperation = new AdditionOperation();
        double expected = 12.0;
        assertEquals(expected, additionOperation.compute(10.0, 2.0), 0.0);
    }
}