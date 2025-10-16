package logics;

import java.util.*;

public class Paranthasis {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if (stack.peek() == '(' && s.charAt(i) == ')') {
                stack.pop();
            } else if (stack.peek() == '{' && s.charAt(i) == '}') {
                stack.pop();
            } else if (stack.peek() == '[' && s.charAt(i) == ']') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        // System.out.println(isValid("([)]"));
        System.out.println(isValid("()[]{}"));

    }
}
