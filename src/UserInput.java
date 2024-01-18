import java.util.Scanner;

public class UserInput {
    private String x, y;
    private double[] unsortedArray, sortedArray;
    private boolean enabledANS;
    Scanner scanner = new Scanner(System.in);

    UserInput() {
        this.enabledANS = false;
    }

    void enable_ANS_input() {
        enabledANS = true;
    }

    void show_tips_with_ANS() {
        if (enabledANS) {
            System.out.println("TIP: To use previous result, enter 'ANS'.");
        }
    }

    double get_X(Results results) {
        show_tips_with_ANS();
        System.out.println("(?) Enter a value for x: ");
        System.out.print("--> ");
        x = scanner.nextLine().strip().toUpperCase();

        if (x.equals("ANS")) {
            return results.get_ANS();
        }
        return Double.parseDouble(x);
    }

    double get_Y(Results results) {
        show_tips_with_ANS();
        System.out.println("(?) Enter a value for y: ");
        System.out.print("--> ");
        y = scanner.nextLine().strip().toUpperCase();

        if (y.equals("ANS")) {
            return results.get_ANS();
        }
        return Double.parseDouble(y);
    }

    void ask_unsorted_array() {
        System.out.print("Unsorted Array: ");
    }

    void ask_sorted_array() {
        System.out.print("Sorted Array: ");
    }
}
