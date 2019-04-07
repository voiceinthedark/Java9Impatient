/**
 * Reimplement the Stack<E> class, using an array to hold the elements. If
 * necessary, grow the array in the push method. Provide two solutions, one
 * with an E[] array and one with an Object[] array. Both solutions should
 * compile without warnings. Which do you prefer, and why?
 */
package krasius.ch6;

import java.util.Arrays;

public class Stack<E> {
    E[] aStack;
    int index;
    int size;
    Class<E> cl;

    public Stack(Class<E> cl) {
        this.cl = cl;
        size = 10;
        //Implementing an E[] array
        aStack = (E[]) java.lang.reflect.Array.newInstance(
                cl, size);
        index = -1;
    }

    public void push(E element) {
        index++;
        if (index >= aStack.length) {

            //TODO: create new array and copy the value of the old Array into the new one
//            E[] newarray = (E[]) java.lang.reflect.Array.newInstance(
//                    cl, 2 * size + 1);
            E[] newarray = Arrays.copyOf(aStack, 2 * size + 1);
            aStack = newarray;

        }

        aStack[index] = element;
    }

    public E pop() {

        E element = aStack[index];
        aStack[index] = null;
        --index;
        return element;

    }

    public boolean isEmpty() {
        return index < 0;
    }
}
