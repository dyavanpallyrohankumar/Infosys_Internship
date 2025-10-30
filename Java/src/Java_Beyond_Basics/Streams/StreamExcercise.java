package Java_Beyond_Basics.Streams;

import java.util.ArrayList;
import java.util.List;

class StreamExcercise {
    public static void main(String[] args) {
        // Input
        // Problem Statement
        // In a lottery contest the company decided to give prize to those participants
        // whose name started with “J” and has exactly 4 letters in it. Write a chained
        // stream operations based code to find the name of winners.

        // Input : [“Jack”, “John”, “Garry”, “Jill”, “Jim”, “Frank”]
        // Output: [Jack, John, Jill]

        List<String> names = new ArrayList<String>();
        names.add("Jack");
        names.add("John");
        names.add("Jill");
        names.add("Jim");
        names.add("Garry");
        names.add("Frank");

        names.stream()
                .filter(name -> name.startsWith("J"))
                .filter(name -> name.length() == 4)
                .forEach(System.out::println);

    }

}