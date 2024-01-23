import java.util.ArrayList;

public class Calculator {
    void run() {
        HomePage homepage = new HomePage();
        UserInput userInput = new UserInput();
        Operations operations = new Operations();
        Results results = new Results();
        MiscValues miscValues = new MiscValues();

        boolean running = true;
        while (running) {
            homepage.display();

            double answer;
            int userOperator = userInput.ask_operation();
            switch (userOperator) {
                // quit program
                case 0:
                    System.out.println("Exiting program.");
                    System.out.println("-*--*--*---*---*---*---*---*---*---*---*---*---*---*--*--*-");
                    running = false;
                    break;

                // addition
                case 1:
                    answer = operations.add(userInput, miscValues);
                    miscValues.store(answer);
                    userInput.enable_ANS_input();
                    results.display(answer);
                    break;

                // subtraction
                case 2:
                    answer = operations.subtract(userInput, miscValues);
                    miscValues.store(answer);
                    userInput.enable_ANS_input();
                    results.display(answer);
                    break;

                // multiplication
                case 3:
                    answer = operations.multiply(userInput, miscValues);
                    miscValues.store(answer);
                    userInput.enable_ANS_input();
                    results.display(answer);
                    break;

                // division
                case 4:
                    answer = operations.divide(userInput, miscValues);
                    userInput.enable_ANS_input();
                    miscValues.store(answer);
                    results.display(answer);
                    break;

                // square
                case 5:
                    answer = operations.square(userInput, miscValues);
                    miscValues.store(answer);
                    userInput.enable_ANS_input();
                    results.display(answer);
                    break;

                // square root
                case 6:
                    answer = operations.square_root(userInput, miscValues);
                    miscValues.store(answer);
                    userInput.enable_ANS_input();
                    results.display(answer);
                    break;

                // power
                case 7:
                    answer = operations.power(userInput, miscValues);
                    miscValues.store(answer);
                    userInput.enable_ANS_input();
                    results.display(answer);
                    break;

                // factorial
                case 8:
                    answer = operations.factorial(userInput, miscValues);
                    miscValues.store(answer);
                    userInput.enable_ANS_input();
                    results.display(answer);
                    break;

                // sort a list
                case 9:
                    ArrayList<Double> answerList = operations.sort_list(userInput, miscValues);
                    miscValues.store(answerList);
                    userInput.enable_ANS_list_input();
                    results.display(answerList);
                    break;

                // search a list
                case 10:
                    answer = operations.search_list(userInput, miscValues);
                    results.display(answer);
                    break;

            }
            // prevents repeating exit prompt if user already entered 0 to quit in homepage
            if (userOperator != 0) {
                running = userInput.go_home_or_quit();
            }
        }

    }
}
