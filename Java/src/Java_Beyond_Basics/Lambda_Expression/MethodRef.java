package Java_Beyond_Basics.Lambda_Expression;

interface MRDemoInterface {
    public String getLowerName(String s);
}

public class MethodRef {
    public static void main(String[] args) {
        MRDemoInterface withoutMethodReference = (str) -> str.toLowerCase();
        MRDemoInterface withMethodReference = String::toLowerCase;

        System.out.println(withoutMethodReference.getLowerName("TFGWVSGV"));
        System.out.println(withMethodReference.getLowerName("TFGWVSGV"));
    }
}
