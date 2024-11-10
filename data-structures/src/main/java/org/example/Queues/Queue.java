package org.example.Queues;

/*
* A queue is a data structure that works like a line at a store: the first person in line is the first one served.
* This is known as the "First In, First Out" (FIFO) principle, meaning the first item you add is the first one removed.

Here’s how it works:

Enqueue: This is the action of adding an item to the back (end) of the queue.
Dequeue: This is the action of removing the item from the front of the queue.
Example: If you enqueue the numbers 1, 2, and 3, the queue would look like this:


Front -> [1] -> [2] -> [3] <- Back
When you dequeue, you remove 1 (the first item added). Now 2 becomes the new front of the queue.

Key Points:

Queues are useful for tasks where order matters, like processing requests in the order they arrive.
They’re often used in programming for scenarios like managing tasks (e.g., printer jobs)
*  or handling customer service requests.
*
* Before diving into adding to our queue, we need to talk about queue sizes.
* Some queues can only contain a certain number of nodes, and others have no limit.
* Those with a limit are called bounded queues.
* For example, the number of cars that can be transported via ferry is limited; this queue of cars is bounded.
* Knowing how to implement this kind of queue is bound to pay off, so let’s do it!
* */

import org.example.LinkedList.LinkedList;
import org.example.Node.Node;

public class Queue {
    public LinkedList queue;
    int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }

    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public void enqueue(int value) {
        if (this.hasSpace()) {
            this.queue.addToTail(value);
            this.size++;
            System.out.println("Added " + value + "! Queue size is now " + this.size);
        } else {
            System.out.println("Queue is full");
        }
    }

    public int dequeue() {
        if (!this.isEmpty()) {
            int data = this.queue.removeHead();
            this.size--;
            System.out.println("Removed " + data + "! Queue size is now " + this.size);
            return data;
        }else{
            System.out.println("Queue is empty");
            return -999;
        }
    }

    public int peek(){
        return this.queue.getHead().getData();
    }

    // Define hasSpace() below
    public boolean hasSpace() {
        return this.size < this.maxSize;
    }

    // Define isEmpty() below
    public boolean isEmpty() {
        return this.size == 0;
    }

    public String printQueue(){
        String output="<First in queue> ";
        Node currentHead = this.queue.getHead();
        while (currentHead != null) {
            output += currentHead.getData() + " ";
            currentHead = currentHead.getNext();
        }
        output+="<Last in queue>";
        return output;
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue(10);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(555);
        myQueue.enqueue(66);
        myQueue.enqueue(77);
        myQueue.enqueue(88);
        myQueue.enqueue(9);
        myQueue.enqueue(100);
        myQueue.enqueue(111);
        myQueue.dequeue();
        System.out.println(myQueue.printQueue());

    }
}
