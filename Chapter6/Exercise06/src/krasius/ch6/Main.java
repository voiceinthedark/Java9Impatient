/**
 * Implement a generic method that appends all elements from one array
 * list to another. Use a wildcard for one of the type arguments. Provide
 * two equivalent solutions, one with a ? extends E wildcard and one with
 * ? super E.
 */
package krasius.ch6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1); array1.add(2); array1.add(3);

        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(5);

        System.out.println("Array 1: " + array1.toString());
        System.out.println("Array 2: " + array2.toString());

        appendAll(array1, array2);
        System.out.println("Array 2 after adding: " + array2.toString());

    }

    public static <T> void appendAll(ArrayList<? extends T> arrayFrom,
                                ArrayList<? super T> arrayTo){
        arrayTo.addAll(arrayFrom);
    }
}
