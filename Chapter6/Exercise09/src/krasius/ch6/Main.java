package krasius.ch6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>(List.of("A", "B", "C", "D"));
        Pair<String> pair = Arrays.firstLast(array);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        Integer[] ints = {4,1,2,7,23,44,8};
        System.out.println(Arrays.max(ints));
        System.out.println(Arrays.min(ints));
        System.out.println(java.util.Arrays.toString(ints));

        ArrayList<Integer> arrayInts = new ArrayList<>(List.of(4,2,5,7,1));
        ArrayList<Integer> arrayResult = new ArrayList<>(List.of(44,33));

        Arrays.minMax(arrayInts, Comparator.naturalOrder(), arrayResult);
        System.out.println(arrayResult);

        ArrayList<Integer> resultOfMap = Arrays.map(arrayInts, x -> x * 2);
        System.out.println(resultOfMap);
    }
}
