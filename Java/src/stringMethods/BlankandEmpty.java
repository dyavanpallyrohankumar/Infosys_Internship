package stringMethods;

public class BlankandEmpty {
    public static void main(String[] args) {
        String str = " ";

        String str2 = "";

        System.out.println("string 1 is given with space so that we can keep it not empty  -- " + str.isBlank());
        System.out.println("string 2 is given with empty  -- " + str2.isEmpty());

    }

}