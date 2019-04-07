/**
 * Implement a class Pair<E> that stores a pair of elements of type E. Provide
 * accessors to get the first and second element
 */

/**
 * Modify the class of the preceding exercise by adding methods max and min,
 * getting the larger or smaller of the two elements. Supply an appropriate
 * type bound for E
 */
package krasius.ch6;

public class Pair<E extends Comparable<E>> {
    private E first;
    private E second;

    public Pair(E first, E second){
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public E getMax(){
        return first.compareTo(second) > 0 ? first : second;
    }

    public E getMin(){
        return first.compareTo(second) < 0 ? first : second;
    }
}
