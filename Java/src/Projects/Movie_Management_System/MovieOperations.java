package Projects.Movie_Management_System;

public interface MovieOperations {
    public void addMovie(Movie movies);

    public void displayAll();

    public void searchByCatogoty(String Category);

    public void sortByRating();

    public void sortByName();
}