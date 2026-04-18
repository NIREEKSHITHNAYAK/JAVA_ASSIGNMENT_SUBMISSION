/*3b. String Exercise progams*/
/*5.Write a Java Program for Eliminating all whitespace characters from a
 *  string using user defined function removeWhitespace()*/
package threeB;
import java.util.*;

public class RemoveWhitespace {

    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("After removing whitespace: " + removeWhitespace(input));
    }
}