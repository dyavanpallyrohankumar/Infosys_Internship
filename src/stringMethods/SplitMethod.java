package stringMethods;

public class SplitMethod {
    public static void main(String[] args) {
        String str = "apple,banana,watermelon";
        String fruits[] = str.split(",");
        System.out.println("before split  " + str);
        System.out.println("Splits");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println("======================================================================");
        String names = "hi|hello|akjhfd|flaksjdf|asdlkjv|sadfgvd";
        String indname[] = names.split("\\|");
        System.out.println("before split  " + names);
        System.out.println("Splits");
        
        for (int i = 0; i < indname.length; i++) {
            System.out.println(indname[i]);
        }
    }

}

