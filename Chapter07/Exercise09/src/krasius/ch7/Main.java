/**
 * You can update the counter in a map of counters as
 * counts.merge(word, 1, Integer::sum);
 * Do the same without the merge method, (a) by using contains, (b) by using
 * get and a null check, (c) by using getOrDefault, (d) by using putIfAbsent
 */
package krasius.ch7;

import com.sun.source.tree.Tree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("TimeMachine.txt"));

        Map<String, Integer> wordsCount = new TreeMap<>();
/*
        for(String line : lines){
            System.out.println(line);
        }
*/
        countWordsa(lines, wordsCount);
        countWordsb(lines, wordsCount);
        countWordsc(lines, wordsCount);
        countWordsd(lines, wordsCount);

        wordsCount.forEach((w, i) -> System.out.println(w + " : " + i));


    }

    private static void countWordsd(List<String> lines, Map<String, Integer> wordsCount) {
        for(String line : lines){
            String[] l = line.split("\\PL+");
            for(String w : l){
                if(wordsCount.containsKey(w)){
                    wordsCount.put(w, wordsCount.get(w) + 1);
                }
                wordsCount.putIfAbsent(w, 1);
            }
        }
    }

    private static void countWordsc(List<String> lines, Map<String, Integer> wordsCount) {
        for(String line : lines){
            String[] l = line.split("\\PL+");
            for (String w : l){
                wordsCount.put(w, wordsCount.getOrDefault(w, 0) + 1);
            }
        }
    }

    private static void countWordsb(List<String> lines, Map<String, Integer> wordsCount) {
        for (String line : lines){
            String[] l = line.split("\\PL+");
            for(String w : l){
                if(wordsCount.get(w) == null){
                    wordsCount.put(w, 1);
                }
                else {
                    wordsCount.put(w, wordsCount.get(w) + 1);
                }
            }
        }
    }

    private static void countWordsa(List<String> lines, Map<String, Integer> wordsCount) {
        /**
         * (a) Count the words in a file using contains
         */
        for (String line : lines) {
            String[] l = line.split("\\PL+");
            for (String w : l) {
                if (wordsCount.containsKey(w)) {
                    wordsCount.replace(w, wordsCount.get(w) + 1);
                } else {
                    wordsCount.put(w, 1);
                }
            }
        }
    }
}
