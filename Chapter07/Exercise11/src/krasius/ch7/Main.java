/**
 * Write a program that reads a sentence into an array list. Then, using
 * Collections.shuffle, shuffle all but the first and last word, without copying
 * the words into another collection.
 */
package krasius.ch7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<>(
                List.of("This is a long sentence that will be shuffled".split(" ")));
        Collections.shuffle(aList.subList(1, aList.size()-2));
        System.out.println(aList);
    }
}
