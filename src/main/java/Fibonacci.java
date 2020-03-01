public class Fibonacci {

    public static long[] generate(int length) {
        final long[] sequence = new long[length];
        for (int i = 0; i < sequence.length; i++) {
            if (i < 2) {
                sequence[i] = i;
            } else {
                sequence[i] = sequence[i - 1] + sequence[i - 2];
            }
        }
        return sequence;
    }
}
