/*3b. String Exercise progams*/
/*4.Write a Java Program for Checking if a string reads the same backward as
 *  forward (ignoring case and punctuation) using user defined function isPalindrome():*/
package threeB;
import java.util.*;

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        // Remove punctuation and spaces, convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }
    }
}