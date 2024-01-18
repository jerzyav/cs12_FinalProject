public class Calculator {
    void run() {
        HomePage homepage = new HomePage();
        UserInput userInput = new UserInput();
        Operations operations = new Operations();
        Results results = new Results();

        boolean running = true;
        while (running) {
            double answer;
            homepage.display();
            int userOperator = homepage.ask_operation();

            switch (userOperator) {
                // quit program
                case 0:
                    System.out.println("Program exited.");
                    running = false;
                    break;
                // addition
                case 1:
                    answer = operations.add(userInput.get_X(results), userInput.get_Y(results));
                    results.store(answer);
                    results.display(answer);
                    break;
                // subtraction
                case 2:
                    answer = operations.subtract(userInput.get_X(results), userInput.get_Y(results));
                    results.store(answer);
                    results.display(answer);
                    break;
                // multiplication
                case 3:
                    answer = operations.multiply(userInput.get_X(results), userInput.get_Y(results));
                    results.store(answer);
                    results.display(answer);
                    break;
                // division
                case 4:
                    answer = operations.divide(userInput.get_X(results), userInput.get_Y(results));
                    results.store(answer);
                    results.display(answer);
                    break;

                default:
                    System.out.println("Please try again.");
                    break;
            }
            userInput.enable_ANS_input();

            // prevents repeating exit prompt if user already entered 0 to quit
            if (userOperator != 0) {
                running = homepage.go_home_or_quit();
            }
        }

    }
}
