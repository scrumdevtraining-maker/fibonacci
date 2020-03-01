public class Fibonacci {

    public static int[] generate(int length) {
        final int[] sequence = new int[length];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = i;
        }
        return sequence;
    }
}
