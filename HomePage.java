import java.util.Scanner;

public class HomePage {
    void display() {

        String[] allFunctions = {
                "Quit.",
                "Addition. a + b",
                "Subtraction. a - b",
                "Multiplication. a * b",
                "Division. a / b",
                "Square. a ^ 2",
                "Square root of a.",
                "Power. a ^ b",
                "Factorial of a.",
                "Sort a list.",
                "Search in a sorted list."
        };

        System.out.println("-*--*--*--*--*- Calculator, by Jerzy & Gabe -*--*--*--*--*-");
        for (int i = 0; i < allFunctions.length; i++) {
            System.out.println( i + ". " + allFunctions[i]);
        }
        System.out.println("-*--*--*---*---*---*---*---*---*---*---*---*---*---*--*--*-");
    }

}