package krasius.ch6;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> intStack = new Stack<>();
        intStack.push(3);
        intStack.push(7);
        intStack.push(1);

        //should pop: 1 - 7 - 3 in order
        while(!intStack.isEmpty()){
            System.out.println(intStack.pop());
        }
    }
}
