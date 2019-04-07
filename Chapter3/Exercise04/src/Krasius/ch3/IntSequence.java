/**
 * Implement a static of method of the IntSequence class that yields a sequence
 * with the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a
 * sequence with six values. Extra credit if you return an instance of an
 * anonymous inner class
 */
package Krasius.ch3;

public interface IntSequence {
    default boolean hasNext() { return true; };
    int next();
    static IntSequence of(int... values){
        return new IntSequence()    {
            int i = 0;
            @Override
            public boolean hasNext() {
                return i < values.length;
            }
            @Override
            public int next() {
                return values[i++];
            }
        };
    }
}
