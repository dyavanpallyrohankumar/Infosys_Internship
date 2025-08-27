package Projects.Movie_Management_System;

public class Movie implements Comparable<Movie> {
    private static int id = 0;
    private String movieName;
    private String catogory;
    private double rating;

    public Movie(String movieName, String catogory, double rating) {
        id = id + 1;
        this.movieName = movieName;
        this.catogory = catogory;
        this.rating = rating;
    }

    public Movie() {
    }

    public int getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCatogory() {
        return catogory;
    }

    public void setCatogory(String catogory) {
        this.catogory = catogory;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie [id=" + id + ", movieName=" + movieName + ", catogory=" + catogory + ", rating=" + rating + "]";
    }

    @Override
    public int compareTo(Movie o) {
        return this.movieName.compareToIgnoreCase(o.movieName);
    }

}