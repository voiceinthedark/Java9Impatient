package krasius.ch2;

public class Queue {

    private Node first;
    private Node last;

    public Queue() {
        //first = last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void add(String val) {
        Node oldLast = last;
        last = new Node(val);
        last.next = null;
        if (isEmpty()) first = last;
        else oldLast.next = last;
    }

    public String remove() {
        String val = first.value;
        first = first.next;
        if (isEmpty()) last = null;
        return val;
    }

    public Iterator iterator() {
        return new Iterator();
    }


    public class Node { //nested class Node
        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
        }
    } //End of nested class

    public class Iterator {
        private Node node;

        public Iterator() {
            node = first;
        }

        public boolean hasNext() {
            if (!isEmpty() && node != null)
                return true;
            return false;
        }

        public String next() {
            String item = node.value;
            node = node.next;
            return item;
        }
    }

}
