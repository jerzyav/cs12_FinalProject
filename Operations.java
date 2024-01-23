import java.util.ArrayList;

public class Operations {

    double a, b;

    double add(UserInput userInput, MiscValues miscValues) {
        System.out.println("Addition in the form a + b.");
        a = userInput.get_a_b("a", miscValues);
        b = userInput.get_a_b("b", miscValues);

        return a + b;
    }

    double subtract(UserInput userInput, MiscValues miscValues) {
        System.out.println("Subtraction in the form a - b.");
        a = userInput.get_a_b("a", miscValues);
        b = userInput.get_a_b("b", miscValues);

        return a - b;
    }

    double multiply(UserInput userInput, MiscValues miscValues) {
        System.out.println("Multiplication in the form a * b.");
        a = userInput.get_a_b("a", miscValues);
        b = userInput.get_a_b("b", miscValues);

        return a * b;
    }

    double divide(UserInput userInput, MiscValues miscValues) {
        System.out.println("Division in the form a / b.");
        a = userInput.get_a_b("a", miscValues);
        b = userInput.get_a_b("b", miscValues);
        if (b == 0) {
            System.out.println("[!] Error: Division by 0 is undefined.");
            return Double.NaN;
        }
        return a / b;
    }

    double square(UserInput userInput, MiscValues miscValues) {
        System.out.println("Square of a.");
        a = userInput.get_a_b("a", miscValues);

        return a * a;
    }

    double square_root(UserInput userInput, MiscValues miscValues) {
        System.out.println("Square root of a.");
        a = userInput.get_a_b("a", miscValues);

        if (a < 0) {
            System.out.println("[!] Error: Square root of a negative is imaginary.");
            return Double.NaN;
        }

        return Math.sqrt(a);
    }

    double power(UserInput userInput, MiscValues miscValues) {
        System.out.println("Power in the form of a ^ b.");
        a = userInput.get_a_b("a", miscValues);
        b = userInput.get_a_b("b", miscValues);

        return Math.pow(a,b);
    }

    double factorial(UserInput userInput, MiscValues miscValues) {
        System.out.println("Factorial in the form of a!.");
        a = userInput.get_a_b("a", miscValues);

        if (a < 0) {
            System.out.println("[!] Error: Factorial of a negative number is undefined.");
            return Double.NaN;
        }

        double result = 1;
        for (int i = 2; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    ArrayList<Double> sort_list(UserInput userInput, MiscValues miscValues) {
        System.out.println("Sorting a list of numbers, from least to greatest.");
        ArrayList<Double> unsortedList = userInput.get_unchecked_list(miscValues);

        return unsortedList;
    }

    double search_list(UserInput userInput, MiscValues miscValues) {
        ArrayList<Double> sortedList = userInput.get_sorted_list(miscValues);
        double itemToSearch = userInput.get_a_b("item", miscValues);

        return -1;
    }

}
