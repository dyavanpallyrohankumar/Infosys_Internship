package Projects.Library_Managment_System;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LibraryManager implements LibraryOperations {
    List<Book> books = new ArrayList<>();
    Set<String> authors = new HashSet<>();
    Map<String, List<Book>> booklistOfAuthors = new HashMap<>();

    @Override
    public void addBook(Book book) {
        // if (book) {

        // }
        books.add(book);
        authors.add(book.getAuthor());
        booklistOfAuthors.put(book.getAuthor(), books);
    }

    @Override
    public void viewBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Override
    public void searchBookById(int id) {
        for (Book book : books) {

            if (book.getId() == id) {
                System.out.println(book);
            } else {
                System.out.println("Book Not Found in the Library");
            }
        }
    }

    @Override
    public void removeBook(int id) {
        for (Book book : books) {

            if (book.getId() == id) {
                books.remove(book);
                break;
            }
            // else {
            // System.out.println("Book Not Found in the Library or not deleted");
            // }
        }
    }

    @Override
    public void listUniqueAuthors() {
        System.out.println(authors);
    }

    @Override
    public void mapBooksByAuthors() {
        // for (Map.Entry<String, List<Book>> entry : booklistOfAuthors.entrySet()) {
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }
        System.out.println(booklistOfAuthors);
    }

}