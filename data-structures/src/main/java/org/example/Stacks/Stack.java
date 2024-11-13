package org.example.Stacks;

/*
* A stack is a data structure that works like a stack of plates:
* you can only add (push) or remove (pop) items from the top.
* It's based on the "Last In, First Out" (LIFO) principle, meaning the last item you put on the stack is the first one
* you take off.

Here's a breakdown:

Push: This is how you add an item to the top of the stack.
Pop: This is how you remove the item from the top of the stack.
Peek: Sometimes, you might just want to see what's on top of the stack without removing it; this is called "peek."
Example: If you push the numbers 1, 2, and 3 onto a stack, they would be stacked like this:
*
* Top
| 3 |
| 2 |
| 1 |
If you then pop, you'd remove 3, the last item you added.

Key Points:

Stacks are useful when you need to keep track of things in reverse order.
They’re commonly used in programming for tasks like undo functions,
* expression evaluation, and managing function calls in recursive programming.
*
* */


import org.example.LinkedList.LinkedList;

public class Stack {
    public LinkedList stack;
    public int size;
    public int maxSize;

    public LinkedList getStack() {
        return stack;
    }

    public void setStack(LinkedList stack) {
        this.stack = stack;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public Stack(int maxSize) {
        setSize(0);
        stack = new LinkedList();
        setMaxSize(maxSize);
    }

    // add to head
    public void push(int value){
        // avoid overflow
        if(hasSpace()){
            this.stack.addToHead(value);
            this.size++;
            System.out.println("Added " + value + "! Stack size is now " + this.size);
        }else {
            throw new Error("Stack is full!");
        }
    }

    // remove the head
    public int pop(){
        // Avoid underflow:
        if(!isEmpty()){
            int data = stack.removeHead();
            this.size--;
            System.out.println("Removed " + data + "! Stack size is now " + this.size);
            return data;
        }else {
            throw new Error("Stack is empty!");
        }

    }

    // return head
    public int peek(){
        if(isEmpty()){
            throw new Error("Stack is empty!");
        }else {
            System.out.println("<head>: " + this.stack.getHead().getData());
            return this.stack.getHead().getData();
        }
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public boolean hasSpace(){
        return this.size<this.maxSize;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(8);
        stack.push(19);
        stack.push(23);
        stack.push(14);
        stack.push(31);
        stack.peek();
        stack.pop();
        stack.peek();
    }
}
