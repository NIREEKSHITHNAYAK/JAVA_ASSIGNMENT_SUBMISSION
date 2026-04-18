/*3c. String Exercise progams*/
/*9.Write a Java Program for Creating a random string of a specified length 
 * using user defined function generateRandomString()*/
package threeC;
import java.util.*;

public class RandomStringGenerator {

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(characters.length());
            result.append(characters.charAt(index));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter desired length: ");
        int length = sc.nextInt();

        System.out.println("Random String: " + generateRandomString(length));
    }
}