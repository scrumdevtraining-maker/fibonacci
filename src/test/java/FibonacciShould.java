import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class FibonacciShould {

    @Test
    public void generate_zero_for_first_number() {
        assertThat(generateAtIndex(0), is(0));
    }


    @Test
    public void generate_one_for_second_number() {
        assertThat(generateAtIndex(1), is(1));
    }

    private int generateAtIndex(int index) {
        return Fibonacci.generate(index + 1)[index];
    }
}
