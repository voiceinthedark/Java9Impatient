/**
 * Implement the RandomSequence in Section 3.9.1, “Local Classes” (page 129) as
 * a nested class, outside the randomInts method
 */
package krasius.ch3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        IntSequence dieTosses = randomInts(1, 6);
        for (int i = 0; i < 10; i++) System.out.println(dieTosses.next());

    }

    private static Random generator = new Random();

    public static IntSequence randomInts(int low, int high) {

        return new RandomSequence(low, high);
    }

    public static class RandomSequence implements IntSequence {
        private int low;
        private int high;
        public RandomSequence(int low, int high){
            this.low = low;
            this.high = high;
        }
        public int next() { return low + generator.nextInt(high - low + 1); }
        public boolean hasNext() { return true; }
    }
}
