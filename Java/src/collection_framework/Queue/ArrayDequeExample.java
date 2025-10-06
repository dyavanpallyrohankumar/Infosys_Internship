package collection_framework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.addFirst(5);
        deque.addLast(40);
        System.out.println("Deque: " + deque);
        System.out.println("First Element removed: " + deque.removeFirst());
        System.out.println("Last Element removed: " + deque.removeLast());
        System.out.println("Deque after removals: " + deque);

        deque.push(213);
        System.out.println("Deque after push: " + deque);
        System.out.println("Popped Element: " + deque.pop());
        System.out.println("Deque after pop: " + deque);
    }
}
