package Krasius.ch3;

public class Main {
    public static void main(String[] args) {
        IntSequence mySequence = IntSequence.of(3,1,4,1,5,9);
        while(mySequence.hasNext()){
            System.out.print(mySequence.next() + " ");
        }
    }
}
