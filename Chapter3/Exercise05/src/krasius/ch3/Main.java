/**
 * Add a static method with the name constant of the IntSequence class that
 * yields an infinite constant sequence. For example, IntSequence.constant(1)
 * yields values 1 1 1..., ad infinitum. Extra credit if you do this with a
 * lambda expression.
 */
package krasius.ch3;

public class Main {
    public static void main(String[] args) {
        IntSequence constantStream = IntSequence.constant(1);

        for(int i=0; i < 10; i++){
            System.out.print(constantStream.next() + " ");
        }
    }
}
