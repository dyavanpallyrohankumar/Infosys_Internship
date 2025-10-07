package logics;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
   public static void main(String[] args) {

      List<Integer> series = new ArrayList<>();
      for (int i = 0; i < 100; i++) {
         series.add(i + (i + 1));
      }

      System.out.println(series);
   }

}
