/**
 * In an array list of strings, make each string uppercase. Do this with (a)
 * an iterator, (b) a loop over the index values, and (c) the replaceAll method
 */
package krasius.ch7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>(List.of("blood", "fire", "water"));
        System.out.println(array);

        ArrayList<String> iterArray = new ArrayList<>(array);
        //iterator method
        ListIterator<String> iter = iterArray.listIterator();
        while (iter.hasNext()){
            String s = iter.next();
            iter.set(s.toUpperCase());
        }
        System.out.println(iterArray);

        //Loop method
        ArrayList<String> loopArray = new ArrayList<>(array);
        for(int i = 0; i < loopArray.size(); i++){
            loopArray.set(i, loopArray.get(i).toUpperCase());
        }
        System.out.println(loopArray);

        //replaceAll method
        ArrayList<String> replaceArray = new ArrayList<>(array);
        replaceArray.replaceAll(e -> e.toUpperCase());
        System.out.println(replaceArray);

    }

}
