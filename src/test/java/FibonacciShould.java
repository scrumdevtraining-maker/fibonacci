import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class FibonacciShould {

    @Test
    public void generate_zero_for_first_number() {
        assertThat(Fibonacci.generate(1)[0], is(0));
    }
    @Test
    public void generate_one_for_second_number() {
        assertThat(Fibonacci.generate(2)[1], is(1));
    }
}
