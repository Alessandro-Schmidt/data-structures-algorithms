package org.example.LinkedList;
import java.util.LinkedList;

/*
 *
 * This is a tutorial about LinkedLists based on the following video: https://www.youtube.com/watch?v=N6dOwBde7-M&t=1s
 *
 * */
public class easyPath {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        // Adding to the linkedList
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        // adding with an index
        linkedList.add(2,"e");
        // Adding to head
        linkedList.addFirst("first?");
        linkedList.addLast("last?");

        // removing a node on a LinkedList
        linkedList.remove("b");

        // peek - first or last
        System.out.println("First element: "+linkedList.peekFirst());
        System.out.println("Last element: "+linkedList.peekLast());

        System.out.println("Linked List: "+linkedList);
    }
}
