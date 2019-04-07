package krasius.ch6;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(Integer.class);
        stack.push(4);
        stack.push(3);
        stack.push(1);
        stack.push(8);
        stack.push(13);
        stack.push(66);
        stack.push(63);
        stack.push(21);
        stack.push(56);
        stack.push(87);
        stack.push(33);
        stack.push(32);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
