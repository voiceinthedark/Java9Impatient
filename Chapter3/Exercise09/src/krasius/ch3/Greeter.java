/**
 * Implement a class Greeter that implements Runnable and whose run method
 * prints n copies of "Hello, " + target, where n and target are set in the constructor. Construct two instances with different messages and execute
 * them concurrently in two threads
 */
package krasius.ch3;

public class Greeter implements Runnable {
    private String name;
    private int count;

    public Greeter(String name, int count){
        this.name = name;
        this.count = count;
    }
    @Override
    public void run() {
        for(int i = 0; i < count; i++){
            System.out.println("Hello " + name);
        }

    }
}
