package krasius.ch7;

import java.util.BitSet;
import java.util.HashSet;

public class Sieve {

    public static HashSet<Integer> getSieve(int n){
        HashSet<Integer> set = new HashSet<>(n + 1);
        //Initialize set
        for(int i = 0; i < n + 1; i++){
            set.add(i);
        }

        //start sieve
        int s = 2;
        int i = 0;

        set.remove(0);
        set.remove(1);

        while (s * s < n){
            int holder = s;
            for(int i1 = 0; i1 < n / 2; i1++) {
                set.remove(holder * (holder + i1));
            }
            s++;
        }

        return set;
    }

    public static BitSet getSieveBits(int n){
        BitSet set = new BitSet(n + 1);
        set.set(0, n + 1, true);

        set.clear(0);
        set.clear(1);

        int s = 2;
        while (s * s < n){
            for(int i = 0; i < n / 2; i++){
                set.clear(s * (s + i));
            }
            s++;
        }
        return set;
    }
}
