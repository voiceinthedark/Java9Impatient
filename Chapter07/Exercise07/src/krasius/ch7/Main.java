/**
 * Write a program that reads all words in a file and prints out how often
 * each word occurred. Use a TreeMap<String, Integer>.
 */
package krasius.ch7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");
        Scanner scanner = new Scanner(file);
        StringBuffer stringBuffer = new StringBuffer();

        while (scanner.hasNext()){
            stringBuffer.append(scanner.nextLine());
            stringBuffer.append("\n");
        }
        //System.out.println(stringBuffer.toString());

        String[] words = stringBuffer.toString().split("\\PL+");

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for(String word : words){
            treeMap.merge(word, 1, (oldVal, newVal) -> oldVal + 1);
        }

        for(Map.Entry<String, Integer> entry : treeMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
