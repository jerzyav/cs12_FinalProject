import java.util.Scanner;

public class HomePage {
    Scanner scanner = new Scanner(System.in);

    void display() {
        String[] allFunctions = {
                "Quit.",
                "Addition. x + y",
                "Subtraction. x - y",
                "Multiplication. x * y",
                "Division. x / y",
                "Square x^2",
                "Square root of x.",
                "Power. x^y ",
                "Factorial of x.",
                "Search a sorted list",
                "Sort a list.",
        };

        System.out.println("--*--*- Calculator, by Jerzy and Gabe -*--*--");
        for (int i = 0; i < allFunctions.length; i++) {
            System.out.println( i + ". " + allFunctions[i]);
        }
        System.out.println("--*---*---*---*---*---*---*---*---*---*---*--");
    }

    int ask_operation() {
        int operator;
        System.out.println("(?) Enter the number of your selection.");
        System.out.print("--> ");
        operator = scanner.nextInt();

        return operator;
    }

    boolean go_home_or_quit() {
        System.out.println("(?) 0. Quit. | 1. Return to the home page.");
        System.out.println("--> ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Exiting program...");
                System.out.print("--*---*---*---*---*---*---*---*---*---*---*--");
                return false;

            case 1:
                System.out.println("Back to home page.");
                System.out.print("--*---*---*---*---*---*---*---*---*---*---*--");
                return true;
        }
        return false;
    }
}
