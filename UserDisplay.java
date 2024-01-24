import java.util.ArrayList;

public class UserDisplay {

    UserDisplay() {};

    public static void display_homepage(StoredValues storedValues) {
        double ansAtHome = storedValues.get_ANS();
        String ansListStatus;

        if (storedValues.ans_list_empty()) {
            ansListStatus = "null";
        }
        else {
            ansListStatus = "full";
        }

        System.out.println("-*--*--*--*--*- Calculator, by Jerzy & Gabe -*--*--*--*--*-");
        System.out.println("   0. Quit                     7. Power. a ^ b");
        System.out.println("   1. Addition a + b           8. Factorial of a.");
        System.out.println("   2. Subtraction. a - b       9. Sort a list.");
        System.out.println("   3. Multiplication. a * b    10. Search a list.");
        System.out.println("   4. Division. a / b");
        System.out.println("   5. Square. a ^ 2           [ANS = "+ ansAtHome +"]");
        System.out.println("   6. Square root of a.       [ANS list = "+ ansListStatus +"]");
        System.out.println("-*--*--*---*---*---*---*---*---*---*---*---*---*---*--*--*-");
    }

    public static void display_result(double result) {
        System.out.println("-*--*--*---*---*---*---*---*---*---*---*---*---*---*--*--*-");
        System.out.println("Result: " + result);
        System.out.println("Saved to ANS.");
        System.out.println("-*--*--*---*---*---*---*---*---*---*---*---*---*---*--*--*-");

    }

    public static void display_result(ArrayList<Double> answerList) {
        System.out.println("-*--*--*---*---*---*---*---*---*---*---*---*---*---*--*--*-");
        System.out.println("Result: " + answerList);
        System.out.println("(Saved list to ANS.)");
        System.out.print("-*--*--*---*---*---*---*---*---*---*---*---*---*---*--*--*-");
        System.out.println();
    }

    public static void display_result(int index) {
        System.out.println("-*--*--*---*---*---*---*---*---*---*---*---*---*---*--*--*-");
        if (index == -1) {
            System.out.println("Result: Item not found in the list.");
        }
        else {
            System.out.println("Result: index " + index);
        }
        System.out.println("(Saved list to ANS.)");
        System.out.println("-*--*--*---*---*---*---*---*---*---*---*---*---*---*--*--*-");
    }
}