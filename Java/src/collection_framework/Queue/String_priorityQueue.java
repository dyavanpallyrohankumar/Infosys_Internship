package collection_framework.Queue;

import java.util.PriorityQueue;

public class String_priorityQueue {

    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Apple");
        pq.add("Orange");
        pq.add("Banana");
        pq.add("Grapes");

        System.out.println(pq);
        while (!pq.isEmpty()) {
            System.out.println("Polled element: " + pq.poll());
            
        }
    }
}
