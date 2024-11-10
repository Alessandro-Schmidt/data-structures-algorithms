package org.example.LinkedList;

import org.example.Node.Node;

public class LinkedList {
    // only attribute is the head
    Node head;

    public LinkedList() {
        head = null;
    }

    public void addToHead(int data) {
        Node newHead = new Node(data);
        // Create a new node with the provided data. This new node will become the new head of the list.

        Node currentHead = this.head;
        // Store the current head of the list in a variable to link it as the next node of the new head, if it exists.

        this.head = newHead;
        // Update the head of the list to be the newly created node, making it the new first element.

        if (currentHead != null) {
            // Check if there was already a head in the list. If not, the list was empty, so no linking is needed.
            this.head.setNext(currentHead);
            // Link the new head's 'next' pointer to the previous head, so the rest of the list is retained.
        }
    }

}
