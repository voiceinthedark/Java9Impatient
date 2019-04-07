/**
 * In a utility class Arrays, supply a method
 * public static <E> Pair<E> firstLast(ArrayList<___> a)
 * that returns a pair consisting of the first and last element of a. Supply an
 * appropriate type argument.
 */

/**
 * Provide generic methods min and max in an Arrays utility class that yield the
 * smallest and largest element in an array.
 */

/**
 * Continue the preceding exercise and provide a method minMax that yields
 * a Pair with the minimum and maximum
 */

/**
 * Implement the following method that stores the smallest and largest
 * element in elements in the result list:
 * public static <T> void minmax(List<T> elements,
 * Comparator<? super T> comp, List<? super T> result)
 * Note the wildcard in the last parameter—any supertype of T will do to
 * hold the result
 */
package krasius.ch6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

class Arrays {

    static <E extends Comparable<E>> Pair<E> firstLast(ArrayList<E> a) {
        return new Pair<>(a.get(0), a.get(a.size() - 1));
    }

    static <E> E min(E[] array){
        E[] arraycopy = array.clone();
        java.util.Arrays.sort(arraycopy);
        return arraycopy[0];
    }

    static <E> E max(E[] array){
        E[] arraycopy = array.clone();
        java.util.Arrays.sort(arraycopy);
        return arraycopy[arraycopy.length - 1];
    }

    static <E extends Comparable<E>> Pair<E> minMax(E[] array){
        E[] arrayCopy = array.clone();
        java.util.Arrays.sort(arrayCopy);
        return new Pair<>(arrayCopy[0], arrayCopy[arrayCopy.length - 1]);
    }

    static <E> void minMax(List<E> elements, Comparator<? super E> comp,
                           List<? super E> result){
        elements.sort(comp);
        result.add(elements.get(0));
        result.add(elements.get(elements.size() - 1));
    }

    /**
     * Implement a method map that receives an array list and a Function<T, R>
     * object (see Chapter 3), and that returns an array list consisting of the
     * results of applying the function to the given elements.
     */
    static <T, R> ArrayList<R> map(ArrayList<T> array, Function<T, R> func){
        ArrayList<R> result = new ArrayList<>();
        for(int i = 0; i < array.size(); i++){
            result.add(func.apply(array.get(i)));
        }
        return result;
    }
}
