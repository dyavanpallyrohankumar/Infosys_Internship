package collection_framework.Queue;

import java.util.PriorityQueue;

public class PriorityQueueEX {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(360);
        pq.add(15);

        System.out.println(pq);

        System.out.println("Polled element: " + pq.poll());
        System.out.println(pq);
        System.out.println("Polled element: " + pq.poll());
        System.out.println(pq);
        System.out.println("Polled element: " + pq.poll());
        System.out.println(pq);

    }
}
