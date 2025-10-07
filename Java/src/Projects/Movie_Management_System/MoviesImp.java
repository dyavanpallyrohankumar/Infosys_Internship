package Projects.Movie_Management_System;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoviesImp implements MovieOperations {

    Map<String, List<Movie>> movieMap = new HashMap<>();

    @Override
    public void addMovie(Movie movies) {

        movieMap.putIfAbsent(movies.getCatogory(), new ArrayList<>());
        movieMap.get(movies.getCatogory()).add(movies);
    }

    @Override
    public void displayAll() {
        System.out.println(movieMap);
        for (String cat : movieMap.keySet()) {
            System.out.println("Catogory " + cat);

            for (Movie obj : movieMap.get(cat)) {
                System.out.println("    " + obj);
            }
        }
    }

    @Override
    public void searchByCatogoty(String Category) {
        if (movieMap.containsKey(Category)) {
            System.out.println(movieMap.get(Category));
        } else
            System.out.println("No category Found");
    }

    @Override
    public void sortByRating() {
        for (String cat : movieMap.keySet()) {

            List<Movie> movies = movieMap.get(cat);
            Collections.sort(movies, new SortbyRating());
            System.out.println("Category " + cat);
            for (Movie movie : movies) {
                System.out.println("  " + movie);
            }
        }
    }

    @Override
    public void sortByName() {
        for (String cat : movieMap.keySet()) {

            List<Movie> movies = movieMap.get(cat);
            Collections.sort(movies);
            System.out.println("Category " + cat);
            for (Movie movie : movies) {
                System.out.println("  " + movie);
            }
        }
    }
}
