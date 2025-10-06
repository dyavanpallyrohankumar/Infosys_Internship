package collection_framework.Queue;

import java.util.ArrayDeque;

public class Add_in_Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.offer(12);
        queue.addLast(15);
        queue.offerLast(20);
        System.out.println("Queue: " + queue);

        queue.addFirst(5);
        queue.offerFirst(3);
        queue.push(1);

        System.out.println("Queue after adding elements at both ends: " + queue);

    }
}
