package inheritance;

class Addition {
    
    void additionOfNumbers(int a, int b) {
        System.out.println("the addition is " + (a + b));
    }

}

class ADD2 extends Addition {
  
    void additionOfNumbers(int a, int b) {
        System.out.println("the sub is " + (a - b));
    }

}

public class MethodOverriding {

    public static void main(String[] args) {
        Addition obj = new ADD2();

        obj.additionOfNumbers(5, 540);

    }

}