package Projects.Movie_Management_System;

import java.util.Scanner;

public class MMS_execution {
    public static void displayMenu() {
        System.out.println(
                "Welcome to Movie Managemnet System\n=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_\n1.Add a movie\n2.View all Movies\n3.Search by Category\n4.Sort By Name\n5.Sort By Rating\n6.exit\nenter input");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieOperations methods = new MoviesImp();

        while (true) {
            displayMenu();
            int input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1:
                    System.out.println("Enter the name");
                    String name = sc.nextLine();

                    System.out.println("Enter the Category");
                    String catogory = sc.nextLine();
                    System.out.println("Enter the Rating");
                    double rate = sc.nextDouble();
                    methods.addMovie(new Movie(name, catogory, rate));
                    break;

                case 2:
                    methods.displayAll();

                    break;
                case 3:
                    System.out.println("Enter the Category");
                    String Searchcatogory = sc.nextLine();
                    methods.searchByCatogoty(Searchcatogory);
                    break;

                case 4:
                    methods.sortByName();
                    break;

                case 5:
                    methods.sortByRating();
                    break;

                case 6:
                    System.out.println("bye");
                    sc.close();
                    return;

                default:
                    break;
            }
        }
    }

}
