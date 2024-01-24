public class Operations {
    private double a, b;

    Operations(){}

    double add(UserInput userInput, StoredValues storedValues) {
        System.out.println("Addition in the form a + b.");
        a = userInput.get_user_number("a", storedValues);
        b = userInput.get_user_number("b", storedValues);

        return a + b;
    }

    double subtract(UserInput userInput, StoredValues storedValues) {
        System.out.println("Subtraction in the form a - b.");
        a = userInput.get_user_number("a", storedValues);
        b = userInput.get_user_number("b", storedValues);

        return a - b;
    }

    double multiply(UserInput userInput, StoredValues storedValues) {
        System.out.println("Multiplication in the form a * b.");
        a = userInput.get_user_number("a", storedValues);
        b = userInput.get_user_number("b", storedValues);

        return a * b;
    }

    double divide(UserInput userInput, StoredValues storedValues) {
        System.out.println("Division in the form a / b.");
        a = userInput.get_user_number("a", storedValues);
        b = userInput.get_user_number("b", storedValues);
        if (b == 0) {
            System.out.println("[!] Error: Division by 0 is undefined.");
            return Double.NaN;
        }
        return a / b;
    }

    double square(UserInput userInput, StoredValues storedValues) {
        System.out.println("Square of a.");
        a = userInput.get_user_number("a", storedValues);


        return a * a;
    }

    double square_root(UserInput userInput, StoredValues storedValues) {
        System.out.println("Square root of a.");
        a = userInput.get_user_number("a", storedValues);

        if (a < 0) {
            System.out.println("[!] Error: Square root of a negative is imaginary.");
            return Double.NaN;
        }

        return Math.sqrt(a);
    }

    double power(UserInput userInput, StoredValues storedValues) {
        System.out.println("Power in the form of a ^ b.");
        a = userInput.get_user_number("a", storedValues);
        b = userInput.get_user_number("b", storedValues);

        return Math.pow(a,b);
    }

    double factorial(UserInput userInput, StoredValues storedValues) {
        System.out.println("Factorial in the form of a!.");
        a = userInput.get_user_number("a", storedValues);

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
}
