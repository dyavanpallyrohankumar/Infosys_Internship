package Multithreading_and_Thread_Safety;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadSafeLibrary {
    public static void main(String[] args) {
        // Synchronized collection
        List<String> books = Collections.synchronizedList(new ArrayList<>());
        books.add("Book1");
        books.add("Book2");

        Runnable addBooks = () -> {
            for (int i = 3; i <= 5; i++) {
                books.add("Book" + i);
                System.out.println(Thread.currentThread().getName() + " added Book" + i);
            }
        };

        Thread librarian1 = new Thread(addBooks, "Librarian1");
        Thread librarian2 = new Thread(addBooks, "Librarian2");

        librarian1.start();
        librarian2.start();
    }

}
