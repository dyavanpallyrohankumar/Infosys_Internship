package Java_Beyond_Basics.Lambda_Expression;

@FunctionalInterface
interface OperationZero {
    void display();
}

@FunctionalInterface
interface OperationResult {
    String checkResult(int num1, int num2, String result);
}

@FunctionalInterface
interface OperationRate {
    void processRate(double rate);
}

@FunctionalInterface
interface OperationOne {
    int addHundred(int num);
}

@FunctionalInterface
interface OperationMulti {
    void displayNumbers(int num1, int num2, int num3);
}

class LamdaVsMethodExample {

    void showMessage() {
        System.out.println(" No Arguments passed in this Method ");
    }

    int addHundredMethod(int num) {
        return num + 100;
    }

    void processRateMethod(double rate) {
        rate = rate * 100;
        System.out.println(" One argument passed: " + rate);
    }

    void displayNumbersMethod(int num1, int num2, int num3) {
        System.out.println(" Multiple arguments passed: " + num1 + "," + num2 + "," + num3);
    }

    String checkResultMethod(int num1, int num2, String result) {
        if (num1 + num2 > 100)
            result = "Pass";
        else
            result = "Fail";
        return result;
    }

}

class Lamda_Methods {

    static void main(String[] args) {
        LamdaVsMethodExample lme = new LamdaVsMethodExample();

        System.out.println(" ===== NORMAL METHOD EXECUTION ===== ");
        lme.showMessage();
        System.out.println("Add Hundred : " + lme.addHundredMethod(20));
        lme.processRateMethod(2.5);
        lme.displayNumbersMethod(10, 20, 30);
        System.out.println("Result :" + lme.checkResultMethod(50, 60, ""));

        System.out.println("\n==== LAMBDA EXPRESSION EXECUTION =====");
        OperationZero zero = () -> System.out.println("No Arguments passed in this Lambda Expression");
        zero.display();

        OperationZero zeroWithGreetings = () -> System.out.println("Greetings for the day");
        zeroWithGreetings.display();

        OperationZero zeroWithWelcomeMsg = () -> System.out.println("Welcome to Infosys....");
        zeroWithWelcomeMsg.display();
    }

}
