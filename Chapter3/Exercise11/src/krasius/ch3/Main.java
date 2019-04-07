/**
 * Using the listFiles(FileFilter) and isDirectory methods of the java.io.File
 * class, write a method that returns all subdirectories of a given directory.
 * Use a lambda expression instead of a FileFilter object. Repeat with a
 * method expression and an anonymous inner class.
 */
package krasius.ch3;

import java.io.File;
import java.io.FileFilter;

public class Main {
    public static void main(String[] args) {

        File[] directories = getFiles("C:/");
        for(File f : directories){
            System.out.println(f.getName());
        }

    }

    /**
     * Return a list of directory from provided root directory
     * @param directory
     * @return
     */
    public static File[] getFiles(String directory) {
        File root = new File(directory);
        File[] files;

        /*Lambda*/
        files = root.listFiles(a -> a.isDirectory());

        /*Method expression*/
        files = root.listFiles(File::isDirectory);

        /*anon class*/
        files = root.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });

        return files;
    }
}
