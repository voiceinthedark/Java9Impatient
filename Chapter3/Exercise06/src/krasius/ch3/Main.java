/**
 * The SquareSequence class doesn’t actually deliver an infinite sequence of
 * squares due to integer overflow. Specifically, how does it behave? Fix the
 * problem by defining a Sequence<T> interface and a SquareSequence class that
 * implements Sequence<BigInteger>.
 */
package krasius.ch3;

public class Main {
    public static void main(String[] args) {

        SquareSequence seq = new SquareSequence();

        for(int i = 0; i < 100000; i++){
            System.out.print(seq.next() + " ");
            if((i + 1) % 10 == 0)
                System.out.println();
        }
    }
}
