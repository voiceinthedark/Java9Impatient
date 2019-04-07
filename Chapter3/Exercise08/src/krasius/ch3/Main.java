/**
 * Implement the method void luckySort(ArrayList<String> strings, Comparator<String>
 * comp) that keeps calling Collections.shuffle on the array list until the elements
 * are in increasing order, as determined by the comparator.
 */
package krasius.ch3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>(List.of("Sami", "soron", "blade",
                "jimmy"/*, "jim","kim","tron","troy", "tal","Bren", "bran"*/, "mike","like",
                "doe","hal","veron", "blade", "sign"));

        luckySort(strings, Comparator.naturalOrder());

    }

    /**
     * Method to sort an arraylist by chance, using @link Collections.shuffle
     *
     * @param strings
     * @param comp
     */
    public static void luckySort(ArrayList<String> strings,
                                 Comparator<String> comp) {

        ArrayList<String> sortedArray = new ArrayList<>(strings);
        sortedArray.sort(comp);

        int count = 0;

        //System.out.println(strings.toString());

        while (!sortedArray.equals(strings)) {
            count++;
            Collections.shuffle(strings);
        }

        System.out.println("Sorted the array after " + count + " shuffle attempts");

    }
}
