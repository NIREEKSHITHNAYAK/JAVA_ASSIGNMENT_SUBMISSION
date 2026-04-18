/*2 a. Develop a java program for performing various string operations with different string handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, Substring Operations , 
String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate 
Email with contains( ) and startsWith() and endsWith()
*/
package twoA;
public class StringOperationsDemo {

    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("\nLength of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "Hello";
        System.out.println("\nstr1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        String text = "Java Programming";
        System.out.println("\nIndex of 'Prog': " + text.indexOf("Prog"));
        System.out.println("Last index of 'a': " + text.lastIndexOf('a'));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("\nSubstring (0 to 4): " + text.substring(0, 4));
        System.out.println("Substring from index 5: " + text.substring(5));

        // 6. String Modification
        String modified = text.replace("Java", "Python");
        System.out.println("\nAfter replace: " + modified);
        System.out.println("To Upper Case: " + text.toUpperCase());
        System.out.println("To Lower Case: " + text.toLowerCase());

        // 7. Whitespace Handling
        String spaced = "   Hello Java   ";
        System.out.println("\nBefore trim: '" + spaced + "'");
        System.out.println("After trim: '" + spaced.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("\nConcatenated string: " + concat);
        System.out.println("Using concat(): " + str1.concat(" ").concat(str2));

        // 9. String Splitting
        String fruits = "Apple,Banana,Orange";
        String[] fruitArray = fruits.split(",");
        System.out.println("\nSplit result:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(5, "is ");
        sb.replace(0, 4, "Python");
        System.out.println("\nStringBuilder result: " + sb);

        // 11. String Formatting
        String name = "Alice";
        int age = 25;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("\nFormatted String: " + formatted);

        // 12. Validate Email using contains(), startsWith(), endsWith()
        String email = "example@gmail.com";

        if (email.contains("@") &&
            email.endsWith(".com") &&
            !email.startsWith("@")) {
            System.out.println("\nValid Email: " + email);
        } else {
            System.out.println("\nInvalid Email: " + email);
        }
    }
}