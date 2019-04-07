package krasius.ch3;

public class Main {
    public static void main(String[] args) {
        Greeter g1 = new Greeter("Ringo", 10);
        Greeter g2 = new Greeter("Toto", 26);

        Thread t1 = new Thread(g1, "G1");
        Thread t2 = new Thread(g2, "G2");

        t1.start();
        t2.start();
    }



}
