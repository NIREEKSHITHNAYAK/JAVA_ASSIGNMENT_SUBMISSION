/*1c. Linked List Programs
 * 1.	Write a Java program to iterate through all elements 
 * in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
package oneC;

import java.util.*;

public class DisplayWithPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("Elements with positions:");
        for (int p = 0; p < list.size(); p++) {
            System.out.println("Position " + p + " : " + list.get(p));
        }
    }
}