package WeekThree.Week3.src.Assignments;

import java.util.Scanner;

public class Problem1_2 {
    public static void main(String[] args) {
        /*
         * Scanner input = new Scanner(System.in);
         * System.out.
         * println("Enter two numbers between 1 and 400 that you would like to process"
         * );
         * int firstNum = input.nextInt();
         * int secondNum = input.nextInt();
         * double calculatedAnswer;
         * double providedAnswer;
         * boolean result;
         * 
         * 
         * // checks firstNum to see if input is in range
         * if (firstNum < 1 || firstNum > 400) {
         * System.out.println("Sorry " + firstNum +
         * " is not a valid input please try again");
         * firstNum = input.nextInt();
         * }
         * 
         * // checks secondNum to see if input is in range
         * if (secondNum < 1 || secondNum > 400) {
         * System.out.println("Sorry " + secondNum +
         * " is not a valid input please try again");
         * secondNum = input.nextInt();
         * }
         * 
         * // Prompts the user to add, subtract, multiply, or divide
         * System.out.
         * println("Enter whether you want to add, subtract, muliply, divide.");
         * String getMath = input.next();
         * 
         * // Prompts the user for what they think the answer is.
         * System.out.println("what do you think the answer is?");
         * providedAnswer = input.nextDouble();
         * 
         * // calculatedAnswer is what is returned from calulatedNumbers
         * calculatedAnswer = calculateNumbers(getMath, firstNum, secondNum);
         * result = validateAnswers(calculatedAnswer, providedAnswer);
         * 
         * System.out.println("Would you like to play again?");
         * String again = input.next();
         * 
         * boolean reRun = playAgain(again);
         * 
         * 
         * input.close();
         */

        beginGame();
    }

    /**
     * this is where the main code runs
     */
    public static void beginGame() {
        // Spacer
        System.out.println("");
        Scanner input = new Scanner(System.in);

        // prompts the user for two numbers
        System.out.println("Enter two numbers between 1 and 400 that you would like to process");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        double calculatedAnswer;
        double providedAnswer;
        boolean result;

        // checks firstNum to see if input is in range
        if (firstNum < 1 || firstNum > 400) {
            System.out.println("Sorry " + firstNum + " is not a valid input please try again");
            firstNum = input.nextInt();
        }

        // checks secondNum to see if input is in range
        if (secondNum < 1 || secondNum > 400) {
            System.out.println("Sorry " + secondNum + " is not a valid input please try again");
            secondNum = input.nextInt();
        }

        // Prompts the user to add, subtract, multiply, or divide
        System.out.println("Enter whether you want to add, subtract, multiply, divide.");
        String getMath = input.next();

        // Prompts the user for what they think the answer is.
        System.out.println("what do you think the answer is?");
        providedAnswer = input.nextDouble();

        // calculatedAnswer is what is returned from calulatedNumbers
        calculatedAnswer = calculateNumbers(getMath, firstNum, secondNum);
        result = validateAnswers(calculatedAnswer, providedAnswer);

        System.out.println("Would you like to play again? Enter \"Y\" or \"N\"");
        String again = input.next();

        playAgain(again);

        input.close();
    }

    /**
     * this calculates the users numbers and whether they want to add, subtract,
     * multiply, or divide
     * 
     * @param math does the user want to add, subtract, multiply, or divide
     * @param num1 the users first Number they want to calculate
     * @param num2 the users second number that the want to calculate
     * @return the calculated number
     */
    public static double calculateNumbers(String math, int num1, int num2) {

        double finalNum = 0;
        boolean checkVal = true;

        while (checkVal == true) {

            if (math.equals("add")) {
                finalNum = num1 + num2;
                checkVal = false;
            } else if (math.equals("subtract")) {
                finalNum = num1 - num2;
                checkVal = false;
            } else if (math.equals("multiply")) {
                finalNum = num1 * num2;
                checkVal = false;
            } else if (math.equals("divide")) {
                finalNum = num1 / num2;
                checkVal = false;
            }
        }
        // System.out.println(finalNum);

        return finalNum;
    }

    /**
     * Checks to see if the Player guess is the calculated answer
     * 
     * @param calculatedAnswer passes in the calculatednumber from the function
     *                         calculatedNumbers
     * @param providedAnswer   the users guess to what the answer is
     * @return returns true if the user guesses correctly returns false if the user
     *         guesses incorrectly
     */
    public static boolean validateAnswers(double calculatedAnswer, double providedAnswer) {
        Scanner input = new Scanner(System.in);
        int chances = 0;
        int lives = 2;

        // runs until the user is out of lives
        while (chances != lives) {
            if (calculatedAnswer == providedAnswer) {
                System.out.println("Congrats you got the correct answer!");
                return true;
            } else if (providedAnswer != calculatedAnswer) {
                System.out.println("Sorry that was the wrong answer try again!");
                System.out.println("You have: " + (lives - chances) + " left");
                chances++;
                providedAnswer = input.nextDouble();
            }
        }
        System.out.println("Sorry you ran out of lives\n");

        return false;
    }

    /**
     * this will let the game play again if the user inputs Y
     * 
     * @param again lets the user play again
     */
    public static void playAgain(String again) {

        if (again.equals("Y")) {
            beginGame();
        } else {
            System.out.println("Program Ended!");
        }
    }
}
