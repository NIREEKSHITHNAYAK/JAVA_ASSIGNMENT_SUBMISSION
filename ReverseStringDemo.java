/*3b. String Exercise progams*
/*3.Write a Java Program for Reversing the characters in a
 *  string using user defined function reverseString().*/
package threeB;
import java.util.*;

public class ReverseStringDemo {

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Reversed String: " + reverseString(input));
    }
}