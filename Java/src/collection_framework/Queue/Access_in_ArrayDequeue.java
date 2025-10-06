package collection_framework.Queue;

import java.util.ArrayDeque;

public class Access_in_ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);
        System.out.println("Element at front: " + queue.getFirst());
        System.out.println("Element at end: " + queue.getLast());
        System.out.println("Element at front using peek: " + queue.peek());
        System.out.println("Element at front using element: " + queue.element());
    }
}
