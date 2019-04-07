/**
 * Implement a class Queue, an unbounded queue of strings. Provide methods
 * add, adding at the tail, and remove, removing at the head of the queue.
 * Store elements as a linked list of nodes.
 */
package krasius.ch2;

public class Main {
    public static void main(String[] args) {

        Queue q = new Queue();
        q.add("This");
        q.add("last");
        q.add("First");
        q.add("Whatever");

        Queue.Iterator iterator = q.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
