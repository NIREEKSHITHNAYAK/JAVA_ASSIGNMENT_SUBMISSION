/*3c. String Exercise progams*/
/*10.Write a Java Program for Counting the number of words in a string
 *  using user defined function countWords()*/
package threeC;
import java.util.*;

public class WordCount {

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        System.out.println("Number of words: " + countWords(input));
    }
}