import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class FibonacciShould {

    @Test
    public void generate_zero_for_first_number() {
        assertThat(Fibonacci.generate(1)[0], is(0));
    }
}
