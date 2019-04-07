/**
 * Given an array of File objects, sort it so that directories come before files,
 * and within each group, elements are sorted by path name. Use a lambda
 * expression to specify the Comparator
 */
package krasius.ch3;

import java.io.File;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        String orig = "C:/";
        File[] lst = getFiles(orig);
        sortFiles(lst);

        for(File f : lst){
            System.out.println(f.getName());
        }

    }

    private static File[] getFiles(String dir){
        File root = new File(dir);
        File[] files = root.listFiles();

        return files;
    }

    private static void sortFiles(File[] list){

        Arrays.sort(list, ((o1, o2) -> {
            if(o1.isDirectory() && !o2.isDirectory())
                return -1;
            else if(!o1.isDirectory() && o2.isDirectory())
                return 1;
            else return o1.getName().compareTo(o2.getName());
        }));
    }
}
