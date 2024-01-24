import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    Scanner scanner;

    UserInput() {
        scanner = new Scanner(System.in);
    }


    public double get_user_number(String variable, StoredValues storedValues) {
        double userNum = 0;

        // prompts user for a value; once per set of input(s) to avoid repetition
        if (variable.equals("a")) {

            // includes ANS tip when available
            if (!storedValues.ans_empty()) {
                System.out.println("[?] Enter a value (a number, 'pi, 'e', 'ANS') for...");
            }
            else {
                System.out.println("[?] Enter a value (a number, 'pi, 'e') for...");
            }
        }

        boolean success = false;
        while (!success) {
            try {
                System.out.print("--> " + variable + ": ");
                String inputNum = scanner.nextLine().strip().toUpperCase();

                // restart loop if there is no ANS yet
                if (storedValues.ans_empty() && inputNum.equals("ANS")) {
                    System.out.println("[!] Invalid input. There is no previous result.");
                    continue;
                }

                userNum = switch (inputNum) {
                    case "PI" -> storedValues.get_PI();
                    case "E" -> storedValues.get_E();
                    case "ANS" -> storedValues.get_ANS();
                    default -> Double.parseDouble(inputNum);
                };

                success = true;
            }
            catch (Exception e) {
                if (!storedValues.ans_empty()) {
                    System.out.println("[!] Invalid input. Please enter a number, pi, e, or ANS.");
                }
                else {
                    System.out.println("[!] Invalid input. Please enter a number, pi, or e.");
                }
            }
        }
        return userNum;
    }

    public ArrayList<Double> get_unsorted_list(StoredValues storedValues) {
        ArrayList<Double> unsortedList = new ArrayList<>();
        double item;

        System.out.println("[?] Enter your numbers one at a time, then enter 'done'.");

        int i = 1;
        boolean listDone = false;
        while (!listDone) {
            try {
                System.out.print("--> " + i + " / 'done': ");
                String input = scanner.nextLine().strip().toUpperCase();

                if (input.equals("DONE") && unsortedList.isEmpty()) {
                    System.out.println("[!] The list must have at least 1 number.");
                }
                else if (input.equals("DONE")){
                    listDone = true;
                }

                else if (storedValues.ans_empty() && input.equals("ANS")) {
                    System.out.println("[!] Invalid input. There is no previous result.");
                }

                else {
                    item = switch (input) {
                        case "PI" -> storedValues.get_PI();
                        case "E" -> storedValues.get_E();
                        case "ANS" -> storedValues.get_ANS();
                        default -> Double.parseDouble(input);
                    };
                    unsortedList.add(item);
                    i += 1;

                }
            }
            catch (Exception e) {
                System.out.println("[!] Invalid input. Enter a number, pi, or e, then 'done'.");
            }
        }
        return unsortedList;
    }

    public boolean get_user_list(StoredValues storedValues) {
    boolean useRecentList = true;

        System.out.println("[?] 0. Enter your new list manually.");
        System.out.println("[?] 1. Use the most recently sorted list.");

        boolean success = false;
        while (!success) {
            try {
                System.out.print("--> ");
                int choice = scanner.nextInt();

                if (choice == 0) {
                    scanner.nextLine();
                    useRecentList = false;
                    success = true;
                }
                else if (choice == 1) {
                    scanner.nextLine();
                    useRecentList = true;
                    success = true;
                }
                else {
                    scanner.nextLine();
                    System.out.println("[!] Invalid input. Please enter '0' or '1'.");
                }
            }
            catch (Exception e) {
                System.out.println("[!] Invalid input. Please enter '0' or '1'.");
                scanner.nextLine();     // clear scanner
            }
        }
        return useRecentList;
    }

    public int get_user_operation() {
    int operator = 0;
    System.out.println("[?] Enter the number of your selection.");

    boolean success = false;
    while (!success) {
        try {
            System.out.print("--> ");
            operator = scanner.nextInt();

            if (operator >= 0 && operator <= 10) {
                scanner.nextLine(); // clear scanner
                success = true;
            }
            else {
                System.out.println("[!] Invalid input. Please enter a number from 0 to 10.");
            }
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("[!] Invalid input. Please enter a number.");
            scanner.nextLine(); // clear scanner
        }
    }

    System.out.println("--*---*---*---*---*---*---*--*---*---*---*---*---*---*--");
    return operator;
    }
}
