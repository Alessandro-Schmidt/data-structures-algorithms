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

    public void addToTail(int data) {
        /*
        * To do this, we are going to start with a temporary tail variable that will be set equal to the list’s head.
        * If there is no head, that means that the list is empty, and we will add the node to the head of the list.
        * Otherwise, we will iterate through the list until we find the last node.
        * Once we’ve found the current tail, we will add a pointer from that node to our new tail.
        * */
        Node tail = this.head;
        if(tail==null){
            this.head= new Node(data);
        }else{
            while(tail.getNext()!=null){
                tail = tail.getNext();
            }
            tail.setNext(new Node(data));
        }
    }

    public int removeHead(){
        /*
        * To do this, we are first going to check to see if the list has a head.
        * If it doesn’t, there is nothing to return.
        * If there is a head, we will remove it by setting the list’s head equal to the original head’s next node,
        *  and then return that original head.
        * */
        Node removedHead = this.head;
        if(this.head==null){
            return -999;
        }
        this.head = removedHead.getNext();
        return removedHead.getData();
    }

    public String printList(){
        String output="<Head> ";
        Node currentHead = this.head;
        while (currentHead != null) {
            output += currentHead.getData() + " ";
            currentHead = currentHead.getNext();
        }
        output+="<Tail>";
        return output;
    }

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.addToHead(1);
        myList.addToHead(2);
        myList.addToHead(3);
        myList.addToHead(5);
        myList.addToHead(7);
        myList.removeHead();
        myList.removeHead();
        myList.addToHead(4);
        myList.addToHead(5);
        myList.addToTail(0);
        System.out.println(myList.printList());
    }

}
