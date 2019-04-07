/**
 * Using the list(FilenameFilter) method of the java.io.File class, write a method
 * that returns all files in a given directory with a given extension. Use a
 * lambda expression, not a FilenameFilter. Which variable from the enclosing
 * scope does it capture?
 */
package krasius.ch3;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        String root = "C:/";
        String ext = ".log";
        String[] files = getFiles(root, ext);

        for(String file : files){
            System.out.println(file);
        }
    }

    public static String[] getFiles(String root, String ext){
        File directory = new File(root);
        String[] files = directory.list((a, b) -> b.endsWith(ext));

        return files;
    }
}
