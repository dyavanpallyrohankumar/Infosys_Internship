import java.util.Scanner;

class Book {
    int id;
    String title;
}

public class LibraryMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[5];
        int count = 0, choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count < books.length) {
                        books[count] = new Book();
                        System.out.print("Enter Book ID: "); books[count].id = sc.nextInt();
                        System.out.print("Enter Title: "); books[count].title = sc.next();
                        count++;
                    } else {
                        System.out.println("Library is full!");
                    }
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.println(books[i].id + " - " + books[i].title);
                    }
                    break;
            }
        } while (choice != 3);
    }
}
