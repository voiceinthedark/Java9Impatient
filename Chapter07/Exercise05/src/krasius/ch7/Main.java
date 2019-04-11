/**
 * Implement a method public static void swap(List<?> list, int i, int j) that
 * swaps elements in the usual way when the type of list implements the
 * RandomAccess interface, and that minimizes the cost of visiting the positions
 * at index i and j if it is not
 */
package krasius.ch7;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 5, 3, 7));
        System.out.println(arrayList);
        swap(arrayList, 0, 2);
        System.out.println(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>(List.of(4, 1, 7, 9));
        System.out.println(linkedList);
        swap(linkedList, 0, 1);
        System.out.println(linkedList);

    }

    /**
     * Making use of a helper method to be able to capture ? wildcard
     *
     * @param list the list
     * @param i    index of first item
     * @param j    index of second item
     */
    public static void swap(List<?> list, int i, int j) {
        swapHelper(list, i, j);
    }

    private static <T> void swapHelper(List<T> list, int i, int j) {
        if (list instanceof RandomAccess) {
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        } else {
            //Use listiterator to minimize the cose of visiting the indices, in the case of
            //a linked list
            ListIterator<T> listIteratorOfi = list.listIterator(i);
            ListIterator<T> listIteratorOfj = list.listIterator(j);

            T vali = listIteratorOfi.next();
            T valj = listIteratorOfj.next();
            list.set(i, valj);
            list.set(j, vali);
        }

    }
}
