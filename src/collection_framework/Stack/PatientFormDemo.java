
package collection_framework.Stack;

import java.util.Scanner;
import java.util.Stack;

class PatientFormService {
    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();

    public void saveStep(String step) {
        undoStack.push(step);
        redoStack.clear();
        System.out.println("Step saved: " + step);
    }

    public String redoStep() {
        if (!redoStack.isEmpty()) {
            String step = redoStack.pop();
            undoStack.push(step);
            System.out.println("step reversed");
        }
        return null;

    }

    public void showCurrentForm() {

    }
}

class PatientFormDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientFormService formService = new PatientFormService();
        boolean exit = false;
        System.out.println("========= Patient Form Demo ==========");
        while (!exit) {
            System.out.println(
                    "\n choose a option \n1.Enter form step\n2.undo last step\n3.redo step\n4.show curent form\n5.exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter the step");
                    String input = sc.nextLine();
                    formService.saveStep(input);
                    break;

                case 2:
                    break;

                case 3:
                   System.out.println(formService.redoStep()); 
                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("thank you");
                    return;

                default:
                    System.out.println("enter proper input");
                    break;
            }

        }
    }

}