package Projects.Library_Managment_System;

public class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
    }

}


// Description About Project
// This is Program about the Library management system where we can perform operations like
// 1.Add Book
// 	used to add new books

// 2.View all Books
// 	it will print all the books present in the library

// 3.Search Book by ID
// 	this function used to search the book based on the id which is given to book

// 4.Remove Book
// 	this operation is used to delete the books by the id specified

// 5.View Unique Authors
// 	this is the list of authors displayed on console
 
// 6.View Books Grouped by Author
// 	this is based on mapping the author name with the books specified with that author 
