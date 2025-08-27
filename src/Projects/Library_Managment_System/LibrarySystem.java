package Projects.Library_Managment_System;

import java.util.Scanner;

public class LibrarySystem {
    public static void showMenu() {
        System.out.println(
                "++++++++++++Library Managment System++++++++++++\n1.Add Book\n2.View all Books\n3.Search Book by ID\n4.Remove Book\n5.View Unique Authors\n6.View Books Grouped by Author\n7.Exit\nEnter the choice");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryOperations library = new LibraryManager();
        while (true) {
            showMenu();
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    // 1.Add Book

                    System.out.println("Enter the Book ID");
                    int bId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Book Name");
                    String bName = sc.nextLine();
                    System.out.println("Enter the Book Authors");
                    String bAuthor = sc.nextLine();
                    library.addBook(new Book(bId, bName, bAuthor));
                    break;
                case 2:
                    // View all Books
                    System.out.println("the total books are");
                    library.viewBooks();
                    break;
                case 3:
                    // Search Book by ID
                    System.out.println("enter the Id of the book");
                    int searchid = sc.nextInt();
                    sc.nextLine();
                    library.searchBookById(searchid);
                    break;
                case 4:
                    // 4.Remove Book
                    System.out.println("enter the Id of the book");
                    int deleteid = sc.nextInt();
                    sc.nextLine();
                    library.removeBook(deleteid);
                    break;
                case 5:
                    // 5.View Unique Authors
                    library.listUniqueAuthors();
                    break;
                case 6:
                    // 6.View Books Grouped by Author
                    library.mapBooksByAuthors();

                    break;
                case 7:
                    // 7.Exit
                    System.out.println("Thank QQQQQQQQQQQQQQQQQQQQQQQ Visit Again");
                    sc.close();
                    return;

                default:
                    System.out.println("Enter Proper Input");
                    break;
            }
        }
    }
}