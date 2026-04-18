/*1b. Array List programs
 * 4.	Write a java program for getting different colors
 *  through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by SubList()using */
package oneB;
import java.util.*;

public class SubListExample {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        List<String> sub = colors.subList(0, 2);

        System.out.println("SubList (1st and 2nd elements): " + sub);
    }
}