import java.util.ArrayList;

public class Calculator {
    public void run() {
        UserDisplay userDisplay = new UserDisplay();

        StoredValues storedValues = new StoredValues();
        Operations operations = new Operations();
        ListOperations listOperations = new ListOperations(storedValues);

        UserInput userInput = new UserInput(storedValues);

        boolean running = true;
        while (running) {
            userDisplay.display_homepage(storedValues);

            // ask user which operation to use
            int userOperator = userInput.get_user_operation();
            double answer;

            switch (userOperator) {
                // in each case, answer will be stored and displayed
                // after getting first results, it will enable ANS functions

                // quit program
                case 0:
                    System.out.println("Exiting program.");
                    System.out.println("-*--*--*---*---*---*---*---*---*---*---*---*---*---*--*--*-");
                    running = false;
                    break;

                // addition
                case 1:
                    answer = operations.add(userInput);
                    storedValues.store(answer);
                    UserDisplay.display_result(answer);
                    break;

                // subtraction
                case 2:
                    answer = operations.subtract(userInput);
                    storedValues.store(answer);
                    UserDisplay.display_result(answer);
                    break;

                // multiplication
                case 3:
                    answer = operations.multiply(userInput);
                    storedValues.store(answer);
                    userDisplay.display_result(answer);
                    break;

                // division
                case 4:
                    answer = operations.divide(userInput);
                    storedValues.store(answer);
                    userDisplay.display_result(answer);
                    break;

                // square
                case 5:
                    answer = operations.square(userInput);
                    storedValues.store(answer);
                    userDisplay.display_result(answer);
                    break;

                // square root
                case 6:
                    answer = operations.square_root(userInput);
                    storedValues.store(answer);
                    userDisplay.display_result(answer);
                    break;

                // power
                case 7:
                    answer = operations.power(userInput);
                    storedValues.store(answer);
                    userDisplay.display_result(answer);
                    break;

                // factorial
                case 8:
                    answer = operations.factorial(userInput);
                    storedValues.store(answer);
                    UserDisplay.display_result(answer);
                    break;

                // sort a list
                case 9:
                    ArrayList<Double> sortedList = listOperations.sort_list(userInput);
                    storedValues.store(sortedList);
                    UserDisplay.display_result(sortedList);
                    break;

                // search a list
                case 10:
                    int index = listOperations.search_list(userInput);
                    storedValues.store(index);
                    UserDisplay.display_result(index);
                    break;

            }
        }

    }
}
