/**
 * Define an enumeration type for the eight combinations of primary colors
 * BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE with methods getRed, getGreen,
 * and getBlue.
 */
package krasius.ch4;

public class Main {
    public static void main(String[] args) {

        MainColors color = MainColors.CYAN;
        System.out.println(color.name());

    }

    public enum MainColors{
        BLACK, RED, GREEN, BLUE, YELLOW, CYAN, MAGENTA, WHITE;

        public MainColors getRed(){
            return RED;
        }

        public MainColors getGreen(){
            return GREEN;
        }

        public  MainColors getBlue(){
            return BLUE;
        }
    }
}
