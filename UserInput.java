import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    private boolean enabledANS, enabledAnsList;
    Scanner scanner = new Scanner(System.in);

    UserInput() {
        this.enabledANS = false;
        this.enabledAnsList = false;
    }

    public void enable_ANS_input() {
        // allows input to accept 'ANS'; is enabled after getting first result
        this.enabledANS = true;
    }

    public void enable_ANS_list_input() {
        // allows input to accept 'ANS' to store list from sorting (#9)
        // to be used for searching (#10); is enabled after first sorted list
        this.enabledAnsList = true;
    }

    public double get_a_b(String variable, MiscValues miscValues) {
        // prompt to ask user for a value, only for the first input to avoid repetition
        if (variable.equals("a")) {
            // includes ANS tip when available
            if (enabledANS) {
                System.out.println("[?] Enter a value (a number, 'pi, 'e', 'ANS') for...");
            } else {
                System.out.println("[?] Enter a value (a number, 'pi, 'e') for...");
            }
        }

        while (true) {
            try {
                System.out.print("--> " + variable + ": ");
                String inputAB = scanner.nextLine().strip().toUpperCase();

                if (!enabledANS && inputAB.equals("ANS")) {
                    System.out.println("[!] Invalid input. There is no previous result.");
                    continue;
                }

                return switch (inputAB) {
                    case "PI" -> miscValues.get_PI();
                    case "E" -> miscValues.get_E();
                    case "ANS" -> miscValues.get_ANS();
                    default -> Double.parseDouble(inputAB);
                };

            } catch (java.lang.NumberFormatException e) {
                if (enabledANS) {
                    System.out.println("[!] Invalid input. Please enter a number, pi, e, or ANS.");
                } else {
                    System.out.println("[!] Invalid input. Please enter a number, pi, or e.");
                }
            }
        }
    }

    ArrayList<Double> get_unchecked_list(MiscValues miscValues) {
        ArrayList<Double> unsortedList = new ArrayList<>();
        double item;

        System.out.println("[?] Enter your numbers one at a time, then enter 'done'.");

        int n = 1;
        while (true) {
            try {
                System.out.print("--> item " + n + " / 'done': ");
                String input = scanner.next().strip().toUpperCase();

                if (input.equals("DONE")) {
                    return unsortedList;
                }
                else if (!enabledANS && input.equals("ANS")) {
                    System.out.println("[!] Invalid input. There is no previous result.");
                    continue;
                }
                else {
                    item = switch (input) {
                        case "PI" -> miscValues.get_PI();
                        case "E" -> miscValues.get_E();
                        case "ANS" -> miscValues.get_ANS();
                        default -> Double.parseDouble(input);
                    };
                }

                unsortedList.add(item);
                n += 1;

            } catch (java.lang.NumberFormatException e) {
                System.out.println("[!] Invalid input. Please enter a number, pi, e, or 'done'.");
            }
        }
    }

    ArrayList<Double> get_sorted_list(MiscValues miscValues) {
        System.out.println("[?] 0. Enter numbers from your own sorted list manually.");

        if (enabledAnsList) {
            System.out.println("[?] 1. Use 'ANS' to use previously sorted list.");
        }

        while (true) {
            System.out.print("--> ");
            String input = scanner.nextLine().strip().toUpperCase();

            if (input.equals("ANS")) {
                return miscValues.get_ANS_list();
            }
            else if (input.equals("0")) {
                return get_unchecked_list(miscValues);
            }

        }
    }

    public int ask_operation() {
        int operator;
        System.out.println("[?] Enter the number of your selection.");

        while (true) {
            try {
                System.out.print("--> ");
                operator = scanner.nextInt();

                if (operator >= 0 && operator <= 10) {
                    break;
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
        scanner.nextLine(); // clear scanner
        System.out.println("--*---*---*---*---*---*---*--*---*---*---*---*---*---*--");
        return operator;
    }


    public boolean go_home_or_quit() {
        System.out.println("[?] 0. Quit. | 1. Return to the home page.");

        while (true) {
            try {
                System.out.print("--> ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 0:
                        System.out.println("Exiting program.");
                        System.out.print("--*---*---*---*---*---*---*--*---*---*---*---*---*---*--");
                        return false;

                    case 1:
                        scanner.nextLine();     // clear scanner
                        System.out.println("Back to home page.");
                        return true;

                    default:
                        // if user enters a different number
                        System.out.println("[!] Invalid input. Please enter a '0' or '1'.");
                }
            }
            catch (java.util.InputMismatchException e) {
                System.out.println("[!] Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }
}
