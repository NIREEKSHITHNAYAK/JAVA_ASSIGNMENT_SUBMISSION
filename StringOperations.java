
/*3a. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder
 *  for appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which one is better.*/
package threeA;
import java.util.*;

public class StringOperations {

    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String s1 = "Hello";
        String s2 = new String("World");
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);

        // 2. Length and Character Access
        System.out.println("\nLength of s1: " + s1.length());
        System.out.println("Character at index 2 in s1: " + s1.charAt(2));

        // 3. String Comparison
        String s3 = "Hello";
        System.out.println("\ns1 equals s3: " + s1.equals(s3));
        System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));
        System.out.println("s1 compareTo s2: " + s1.compareTo(s2));

        // 4. String Searching
        String text = "Java Programming Language";
        System.out.println("\nIndex of 'Programming': " + text.indexOf("Programming"));
        System.out.println("Last index of 'a': " + text.lastIndexOf('a'));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("\nSubstring (0,4): " + text.substring(0, 4));
        System.out.println("Substring from index 5: " + text.substring(5));

        // 6. String Modification
        String replaced = text.replace("Java", "Python");
        System.out.println("\nAfter replace: " + replaced);
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // 7. Whitespace Handling
        String spaced = "   Welcome to Java   ";
        System.out.println("\nBefore trim: '" + spaced + "'");
        System.out.println("After trim: '" + spaced.trim() + "'");

        // 8. String Concatenation
        String concat1 = s1 + " " + s2;
        String concat2 = s1.concat(" ").concat(s2);
        System.out.println("\nUsing + operator: " + concat1);
        System.out.println("Using concat(): " + concat2);

        // 9. String Splitting
        String fruits = "Apple,Mango,Banana";
        String[] arr = fruits.split(",");
        System.out.println("\nSplit result:");
        for (String fruit : arr) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(5, "is ");
        sb.replace(0, 4, "Python");
        System.out.println("\nStringBuilder Result: " + sb);

        // 11. String Formatting
        String name = "John";
        int age = 22;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("\nFormatted String: " + formatted);

        // 12. Email Validation using contains(), startsWith(), endsWith()
        String email = "student@gmail.com";

        if (email.contains("@") &&
            email.endsWith(".com") &&
            !email.startsWith("@")) {

            System.out.println("\nValid Email: " + email);
        } else {
            System.out.println("\nInvalid Email: " + email);
        }
    }
}