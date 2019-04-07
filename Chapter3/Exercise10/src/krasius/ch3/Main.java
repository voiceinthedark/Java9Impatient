/**
 * Implement methods
 * public static void runTogether(Runnable... tasks)
 * public static void runInOrder(Runnable... tasks)
 * The first method should run each task in a separate thread and then return. The second method should run all methods in the current thread
 * and return when the last one has completed.
 */
package krasius.ch3;

public class Main {
    public static void main(String[] args) {
        Greeter g1 = new Greeter("G1", 150);
        Greeter g2 = new Greeter("G2", 200);

        runTogether(g1, g2);
        runInOrder(g1,g2);

    }

    public static void runTogether(Runnable... tasks){
        for(Runnable task : tasks){
            Thread t = new Thread(task);
            t.start();
        }
    }

    public static void runInOrder(Runnable... tasks){
        for(Runnable task : tasks){
            task.run();
        }

    }
}
