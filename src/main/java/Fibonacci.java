public class Fibonacci {
    public static int[] generate(int length) {
        int[] sequence = new int[length];
        for (int i = 0; i < sequence.length; i++) {
            if(i < 2){
                sequence[i] = i;
            } else {
                sequence[i] = sequence[i-1] + sequence[i -2];
            }
        }
        return sequence;
    }
}
