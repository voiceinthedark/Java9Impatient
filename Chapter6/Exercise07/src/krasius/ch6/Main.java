package krasius.ch6;

public class Main {
    public static void main(String[] args) {
        Pair<String> pairs = new Pair<>("A", "a");
        System.out.println("first: " + pairs.getFirst());
        System.out.println("second: " + pairs.getSecond());

        System.out.println("Maximum: " + pairs.getMax());
        System.out.println("Minimum: " + pairs.getMin());
    }
}
