package org.example.Stacks;
import java.util.Stack;

/*
* This is another way of using stacks, based on the video: https://www.youtube.com/watch?v=KInG04mAjO0
* */

public class easyPath {
    // Stack = LIFO, Last-in, First-out
    // Stack objects on a vertical manner
    // push() -> Add to the top
    // pop() -> remove from the top

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("The alchimist");
        stack.push("Fountainhead");
        stack.push("The guide");
        stack.push("Book of mordor");
        stack.push("Lord of the rings");
        stack.push("Stallings");

        stack.push("Harry Potter");
        stack.pop();
        stack.peek();
        System.out.println(stack.isEmpty());
        System.out.println(stack.search("The guide"));
        System.out.println(stack);
    }
}
