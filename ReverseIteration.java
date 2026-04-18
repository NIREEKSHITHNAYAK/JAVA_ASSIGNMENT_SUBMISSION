/*1c. Linked List Programs
 * 2.	Write a Java program to iterate a linked list in reverse
 *  order (using objlist. ())*/
package oneC;
import java.util.*;

public class ReverseIteration {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        Iterator<String> itr = list.descendingIterator();

        System.out.println("Elements in reverse order:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}