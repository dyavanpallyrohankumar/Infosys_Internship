package collection_framework.LinkedList;

import java.util.Deque;
import java.util.LinkedList;

class Queue {

    // Implement your logic here
    int maxSize;
    Deque<String> queue = new LinkedList<>();

    public Queue(int maxSize) {
        this.maxSize = maxSize;
    }

    public void enqueue(String string) {
        queue.add(string);
    }

    public void dequeue() {
        queue.pop();
    }

    public boolean isFull() {
        if (queue.size() == maxSize - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        // System.out.println(queue.size());
        if (queue.size() == 0) {
            return true;
        }
        return false;
    }

    public Deque<String> getQueue() {
        return queue;
    }

}

public class LinkedList_Assignment_4 {
    // class Tester {

    public static void main(String arga[]) {
        Queue queue = new Queue(5);
        // System.out.println(queue.isEmpty());
        queue.enqueue("Emily");
        queue.enqueue("Lily");
        queue.enqueue("Rachel");
        queue.enqueue("Rose");

        queue.dequeue();
        queue.dequeue();

        System.out.println(queue.getQueue());
    }
}