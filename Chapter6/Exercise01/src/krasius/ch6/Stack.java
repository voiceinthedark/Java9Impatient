/**
 * Implement a class Stack<E> that manages an array list of elements of type
 * E. Provide methods push, pop, and isEmpty.
 */
package krasius.ch6;

import java.util.ArrayList;

public class Stack<E> {

    private ArrayList<E> alStack;

    public Stack(){
        alStack = new ArrayList<>();
    }

    public void push(E element){
        //Add element at position 0
        alStack.add(0,element);
    }

    public E pop(){
        //remove element from pos 0
        E element = alStack.remove(0);
        return element;
    }

    public boolean isEmpty(){
        return alStack.isEmpty();
    }
}
