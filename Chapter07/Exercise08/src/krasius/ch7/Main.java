/**
 * Write a program that reads all words in a file and prints out on which
 * line(s) each of them occurred. Use a map from strings to sets
 */
package krasius.ch7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("TimeMachine.txt"));

        TreeMap<String, HashSet<Integer>> words = new TreeMap<>();

        for (int i = 0; i < lines.size(); i++) {
            String[] wordsLines = lines.get(i).split("\\PL+");
            //HashSet<Integer> set = new HashSet<>();
            for (String word : wordsLines) {
                int line = i;
                HashSet<Integer> set = new HashSet<>();
                set.add(line);
                words.merge(word, set, (oldset, newset) -> {
                    HashSet<Integer> newSet = new HashSet<>(oldset);
                    newSet.addAll(newset);
                    return newSet;
                });
            }
        }

        for (Map.Entry<String, HashSet<Integer>> entry : words.entrySet()) {
            System.out.print(entry.getKey() + " : ");
            Set<Integer> set = entry.getValue();
            for (Integer i : set) {
                System.out.print(i + " - ");
            }
            System.out.println();
        }

    }
}
