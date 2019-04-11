/**
 * Implement the “Sieve of Erathostenes” algorithm to determine all prime
 * numbers ≤ n. Add all numbers from 2 to n to a set. Then repeatedly find
 * the smallest element s in the set, and remove s2, s · (s + 1), s · (s + 2),
 * and so on. You are done when s2 > n. Do this with both a HashSet<Integer>
 * and a BitSet
 */
package krasius.ch7;

import java.util.BitSet;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        /*HashSet<Integer> hashSet = Sieve.getSieve(2500);
        for(Integer i : hashSet){
            System.out.print(i + " - ");
        }*/

        BitSet bitSet = Sieve.getSieveBits(2500);
        for(int i = 0; i < bitSet.length(); i++){
            if(bitSet.get(i) == true){
                System.out.print(i + " - ");
            }
        }

    }
}
