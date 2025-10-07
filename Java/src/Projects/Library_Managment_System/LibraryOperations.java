package Projects.Library_Managment_System;

public interface LibraryOperations {
    public void addBook(Book book);

    public void viewBooks();

    public void searchBookById(int id);

    public void removeBook(int id);

    public void listUniqueAuthors();

    public void mapBooksByAuthors();

}