/*1b. Array List programs
 * 2.	Write a java program for getting different colors through ArrayList
 *  interface and remove the 2nd element and color "Blue" from the ArrayList*/
package oneB;
import java.util.*;

public class RemoveColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        // Remove 2nd element (index 1)
        colors.remove(1);

        // Remove "Blue"
        colors.remove("Blue");

        System.out.println("Updated List: " + colors);
    }
}