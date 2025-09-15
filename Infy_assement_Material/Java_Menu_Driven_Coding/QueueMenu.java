import java.util.Scanner;

public class QueueMenu {
    static int[] queue = new int[5];
    static int front = -1, rear = -1;

    public static void enqueue(int val) {
        if (rear == queue.length - 1) System.out.println("Queue full!");
        else {
            if (front == -1) front = 0;
            queue[++rear] = val;
            System.out.println(val + " inserted.");
        }
    }

    public static void dequeue() {
        if (front == -1 || front > rear) System.out.println("Queue empty!");
        else System.out.println("Deleted: " + queue[front++]);
    }

    public static void display() {
        if (front == -1 || front > rear) System.out.println("Queue empty!");
        else {
            for (int i = front; i <= rear; i++) System.out.print(queue[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.print("Enter value: "); enqueue(sc.nextInt()); break;
                case 2: dequeue(); break;
                case 3: display(); break;
            }
        } while (choice != 4);
    }
}
