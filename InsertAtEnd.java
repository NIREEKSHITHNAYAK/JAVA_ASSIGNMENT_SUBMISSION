/*1c. Linked List Programs
 * 3.	Write a Java program to insert the specified element 
 * at the end of a linked list.( using l_listobj.offerLast("Pink"))*/
package oneC;
import java.util.*;

public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");

        list.offerLast("Pink");

        System.out.println("After inserting at end: " + list);
    }
}