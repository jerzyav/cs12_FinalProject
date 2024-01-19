public class Operations {

    double add(double x, double y) {
        return x + y;
    }

    double subtract(double x, double y) {
        return x - y;
    }

    double multiply(double x, double y) {
        return x * y;
    }

    double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
    }

    double square(double x) {
        return x * x;
    }

    double square_root(double x) {
        return Math.sqrt(x);
    }

    double power(double x, double y) {
        return Math.pow(x, y);
    }

    double factorial(double x) {
        if (x < 0) {
            System.out.println("Error: Factorial of a negative number is undefined.");
            return Double.NaN;
        }

        double result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}
