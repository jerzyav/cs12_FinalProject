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
                "Square. x^2",
                "Square root of x.",
                "Power. x^y",
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

        while (true) {
            try {
                operator = scanner.nextInt();

                // Check if the input is within the valid range
                if (operator >= 0 && operator <= 10) {
                    break;  // Valid input, exit the loop
                } else {
                    System.out.println("Invalid input. Please enter a number between 0 and 10.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();  // Consume the invalid input to avoid an infinite loop
            }
        }

        return operator;
    }

    boolean go_home_or_quit() {
        int choice;
        while (true) {
            try {
                System.out.println("(?) 0. Quit | 1. Return to the home page.");
                System.out.print("--> ");
                choice = scanner.nextInt();

                if (choice == 0 || choice == 1) {
                    break;  // Valid input, exit the loop
                } else {
                    System.out.println("Invalid input. Please enter 0 or 1.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();  // Consume the invalid input to avoid an infinite loop
            }
        }

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
