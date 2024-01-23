//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class UserInput {
//    private boolean enabledANS;
//    Scanner scanner = new Scanner(System.in);
//
//    UserInput() {
//        this.enabledANS = false;
//    }
//
//    public void enable_ANS_input() {
//        // allows input to accept ANS; is enabled after getting first result
//        this.enabledANS = true;
//    }
//
//    public double get_a_b(String variable, MiscValues miscValues) {
//        // prompt to ask user for a value, only for the first input to avoid repetition
//        if (variable.equals("a")) {
//            // includes ANS tip when available
//            if (enabledANS) {
//                System.out.println("[?] Enter a value (a number, 'pi, 'e', 'ANS') for");
//            } else {
//                System.out.println("[?] Enter a value (a number, 'pi, 'e') for");
//            }
//        }
//
//        while (true) {
//            try {
//                System.out.print("--> " + variable + ": ");
//                String inputAB = scanner.nextLine().strip().toUpperCase();
//
//                if (!enabledANS && inputAB.equals("ANS")) {
//                    System.out.println("[!] Invalid input. There is no previous result.");
//                    continue;
//                }
//
//                return switch (inputAB) {
//                    case "PI" -> miscValues.get_PI();
//                    case "E" -> miscValues.get_E();
//                    case "ANS" -> miscValues.get_ANS();
//                    default -> Double.parseDouble(inputAB);
//                };
//
//            } catch (java.lang.NumberFormatException e) {
//                if (enabledANS) {
//                    System.out.println("(!) Invalid input. Please enter a number, pi, e, or ANS.");
//                } else {
//                    System.out.println("(!) Invalid input. Please enter a number, pi, or e.");
//                }
//            }
//        }
//    }
//
//    ArrayList<Double> get_unsorted_list(MiscValues miscValues) {
//        ArrayList<Double> unsortedList = new ArrayList<>();
//        double item;
//
//        System.out.println("[?] Enter your numbers one at a time, then enter 'done'.");
//
//        int n = 1;
//        while (true) {
//            try {
//                System.out.print("--> item " + n + ": ");
//                String input = scanner.next().strip().toUpperCase();
//
//                if (input.equals("DONE")) {
//                    return unsortedList;
//                }
//
//                if (!enabledANS && input.equals("ANS")) {
//                    System.out.println("[!] Invalid input. There is no previous result.");
//                    continue;
//                }
//
//                item = check_value(input, miscValues);
//                unsortedList.add(item);
//                n += 1;
//
//            } catch (java.lang.NumberFormatException e) {
//                System.out.println("[!] Invalid input. Please enter a number or 'done'.");
//            }
//        }
//
//    }
//
//
//
//
//    private double check_value(String input, MiscValues miscValues) {
//        while (true) {
//            try {
//                return switch (input) {
//                    case "PI" -> miscValues.get_PI();
//                    case "E" -> miscValues.get_E();
//                    case "ANS" -> miscValues.get_ANS();
//                    default -> Double.parseDouble(input);
//                };
//            } catch (java.lang.NumberFormatException e) {
//                System.out.println("[!] Invalid input.");
//                System.out.println("    Please enter a number, pi, e, or 'done'.");
//            }
//        }
//    }
//
//    public int ask_operation() {
//        int operator;
//        System.out.println("[?] Enter the number of your selection.");
//
//        while (true) {
//            try {
//                System.out.print("--> ");
//                operator = scanner.nextInt();
//
//                if (operator >= 0 && operator <= 10) {
//                    break;
//                }
//                else {
//                    System.out.println("[!] Invalid input. Please enter a number from 0 to 10.");
//                }
//            }
//            catch (java.util.InputMismatchException e) {
//                System.out.println("[!] Invalid input. Please enter a number.");
//                scanner.nextLine();
//            }
//
//        }
//        scanner.nextLine();     // clear scanner
//        System.out.println("--*---*---*---*---*---*---*--*---*---*---*---*---*---*--");
//        return operator;
//    }
//
//
//    public boolean go_home_or_quit() {
//        System.out.println("[?] 0. Quit. | 1. Return to the home page.");
//
//        while (true) {
//            try {
//                System.out.print("--> ");
//                int choice = scanner.nextInt();
//
//                switch (choice) {
//                    case 0:
//                        System.out.println("Exiting program...");
//                        System.out.print("--*---*---*---*---*---*---*--*---*---*---*---*---*---*--");
//                        return false;
//
//                    case 1:
//                        scanner.nextLine();     // clear scanner
//                        System.out.println("Back to home page.");
//                        return true;
//
//                    default:
//                        // if user enters a different number
//                        System.out.println("[!] Invalid input. Please enter a '0' or '1'.");
//                }
//            }
//            catch (java.util.InputMismatchException e) {
//                System.out.println("[!] Invalid input. Please enter a number.");
//                scanner.nextLine();
//            }
//        }
//    }
//}
