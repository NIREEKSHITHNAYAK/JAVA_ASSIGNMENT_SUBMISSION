/* 3b. String Exercise progams*/
/*1.Write a Java Program for Checking if a given string
 *  is null or contains only whitespace using user defined function isNullOrEmpty().*/
package threeB;
import java.util.*;

public class CheckNullOrEmpty {

    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isNullOrEmpty(input)) {
            System.out.println("String is null or contains only whitespace.");
        } else {
            System.out.println("String is valid.");
        }
    }
}