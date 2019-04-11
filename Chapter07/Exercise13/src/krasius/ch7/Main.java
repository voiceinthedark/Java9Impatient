/**
 * The LinkedHashMap calls the method removeEldestEntry whenever a new element
 * is inserted. Implement a subclass Cache that limits the map to a given size
 * provided in the constructor.
 */
package krasius.ch7;

public class Main {
    public static void main(String[] args) {

        Cache<Integer, String> cache = new Cache<>(5);

        cache.put(1, "a");
        cache.put(2, "b");
        cache.put(3, "c");
        cache.put(4, "d");
        cache.put(5, "e");

        cache.forEach((k, v) -> System.out.println(k + " : " + v));

        cache.put(6, "f");
        cache.forEach((k, v) -> System.out.println(k + " : " + v));

    }
}
