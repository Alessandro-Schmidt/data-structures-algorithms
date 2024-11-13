package org.example.Queues;
import java.util.Queue;
import java.util.LinkedList;

/*
* This is an easier way to implement queues, based on the following video:
*  https://www.youtube.com/watch?v=nqXaPZi99JI
*
* */

public class easyPath {
    public static void main(String[] args) {
        /*
        * Queues are data structures based on the following principle:
        * FIFO = first-in / first-out (line of people)
        * A collection designed for holding elements prior to processing linear structure
        *
        * add = enqueue, offer()
        * remove = dequeue, poll()
        * */

        // PAY ATTENTION!
        Queue<String> queue = new LinkedList<>();
        // Queue, the class itself, is actually an interface, that uses linkedlists in extension.
        // doubts? Look at the complete implementation
        queue.offer("Ayn Rand");
        queue.offer("Elon Musk");
        queue.offer("John Galt");
        queue.offer("Dagny Taggart");
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        System.out.println("Is empty? "+queue.isEmpty());
        System.out.println("Size: "+ queue.size());
        System.out.println("Contains Elon Musk? "+ queue.contains("Elon Musk"));


    }
}
