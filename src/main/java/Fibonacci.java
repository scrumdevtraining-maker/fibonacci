public class Fibonacci {

    public static int[] generate(int length) {
        final int[] sequence = new int[length];
        for (int i = 0; i < sequence.length; i++) {
            if (i < 2) {
                sequence[i] = i;
            } else {
                sequence[i] = i - 1;
            }
        }
        return sequence;
    }
}
