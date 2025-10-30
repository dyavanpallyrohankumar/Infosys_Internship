package Java_Beyond_Basics.Streams;

import java.util.stream.Stream;

class StreamAreLazyDemo {

    public static void main(String[] args) {

        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Add forEach(num -> System.out.println(num)) after the map() and
        // observe the change!
        intStream.filter(num -> num % 2 != 0).map(num -> num * 3).forEach(num -> System.out.println(num));

    }
}