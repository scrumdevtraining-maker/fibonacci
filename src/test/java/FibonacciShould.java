import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FibonacciShould {
    @Test
    public void generateFirstEightNumbers() {
        assertArrayEquals(new int[]{0,1,1,2,3,5,8,13}, Fibonacci.generate(8));
    }
}
