/*3c. String Exercise progams*/
/*7.Write a Java Program for Shortening a string to a specified length and adds an ellipsis
 *  using user defined function truncate()*/
package threeC;
import java.util.*;

public class TruncateString {

    public static String truncate(String str, int maxLength) {
        if (str.length() <= maxLength) {
            return str;
        }
        return str.substring(0, maxLength) + "...";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter max length: ");
        int length = sc.nextInt();

        System.out.println("Truncated: " + truncate(input, length));
    }
}