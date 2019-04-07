/**
 * Write a method that takes an array of Runnable instances and returns a
 * Runnable whose run method executes them in order. Return a lambda
 * expression
 */
package krasius.ch3;

public class Main {
    public static void main(String[] args) {
        Greeter g1 = new Greeter("G1", 22);
        Greeter g2 = new Greeter("G2", 25);
        Greeter g3 = new Greeter("G3", 26);

        Runnable runner = orderedRunnables(g1,g2,g3);

        new Thread(runner).start();
    }

    private static Runnable orderedRunnables(Runnable... tasks){
        return () ->{
            for(Runnable task : tasks)
                task.run();
        };
    }
}
