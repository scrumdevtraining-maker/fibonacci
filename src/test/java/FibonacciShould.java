import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
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

    @Test
    public void generate_one_for_third_number() {
        assertThat(generateAtIndex(2), is(1));
    }

   @Test
    public void generate_two_for_fourth_number() {
        assertThat(generateAtIndex(3), is(2));
    }

   @Test
    public void generate_three_for_fifth_number() {
        assertThat(generateAtIndex(4), is(3));
    }

   @Test
    public void generate_five_for_sixth_number() {
        assertThat(generateAtIndex(5), is(5));
    }

   @Test
    public void generate_large_number_for_fiftieth_number() {
        assertThat(generateAtIndex(49), is(7778742049L));
    }

    private long generateAtIndex(int index) {
        return Fibonacci.generate(index + 1)[index];
    }
}
