/*3b. String Exercise progams*/
/*2.Write a Java Program for Counting how many times a 
 * substring appears in a main string using user defined function countOccurrences()*/
package threeB;
import java.util.*;

public class CountSubstring {

    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter substring: ");
        String subStr = sc.nextLine();

        int result = countOccurrences(mainStr, subStr);
        System.out.println("Occurrences: " + result);
    }
}