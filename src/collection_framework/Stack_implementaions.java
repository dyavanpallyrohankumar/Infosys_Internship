package collection_framework;

import java.util.Stack;

public class Stack_implementaions {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(532);
        stack.push(48967);
        stack.push(98537);
        System.out.println("the elements before pop " + stack);
        System.out.println("the top element is " + stack.peek());
        stack.pop();
        System.out.println("the elements after pop " + stack);

    }
}
