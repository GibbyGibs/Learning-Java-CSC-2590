
/**
***********************************************************************
'Project: Assignment 2
'Programmer: Cody Gibson
'Company Info:  CSM  
'Date: 04 7 2022
'Description:  Problem Number 1.  
'    
'   LINE 1 AT LEAST 3 LINES OF PROGRAM DESCRIPTION
'   LINE 2 AT LEAST 3 LINES OF PROGRAM DESCRIPTION
'   LINE 3 AT LEAST 3 LINES OF PROGRAM DESCRIPTION
'
'	--------------------------------------------------------------------------
'   							HONOR CODE: 
'	I pledge that this program represents my own program code, I have received 
'	help from no one and I have given help to no one.
'	
'								OR
'
'	I received help from NAME OR NO ONE in designing and debugging my program.
'	I given help to NAME OR NO ONE in designing and debugging my program.
'-----------------------------------------------------------------------------
'
'  LINE LENGTH - AVOID LINES LONGER THAN 80 CHARACTERS
'  SCALE BELOW IS TO CALIBRATE SCREENSHOTS
'  DO NOT HAVE YOUR CODE OR SCREENSHOT EXTEND BEYOND THE SCALE
0........1.........2.........3.........4.........5.........6.........7.........8
12345678901234567890123456789012345678901234567890123456789012345678901234567890
*/

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner numberinput = new Scanner(System.in);
        System.out.println("Enter two numbers between 1 and 400 that you would like to process");
        double firstNum = numberinput.nextDouble();
        double secondNum = numberinput.nextDouble();

        do {
            if (userInput < 1 && userInput > 400) {
                System.out.println("Sorry thoes are invalid numbers try again!");
            }

        } while (userInput < 1 && userInput > 400);

        System.out.println("Enter whether you want to add, subtract, muliply, divide.");
        String userInput = numberinput.nextString();

        calculateNumbers(numberinput, firstNum, secondNum);

    }

    public static double calculateNumbers(Sting math, int num1, int num2) {

        double finalNum;
        boolean checkVal;

        while (!checkVal) {

            if (userInput.equals("add")) {
                finalNum = firstNum + secondNum;
                checkVal = true;
            } else if (userInput.equals("subtract")) {
                finalNum = firstNum - secondNum;
                checkVal = true;
            } else if (userInput.equals("muliply")) {
                finalNum = firstNum * secondNum;
                checkVal = true;
            } else if (userInput.equals("divide")) {
                finalNum = finalNum / secondNum;
                checkVal = true;
            } else {
                System.out.println("Invalid entry try again!");
            }
        }
        System.out.println("End of program");
        return finalNum;
    }

    // public static boolean validateAnsers(double calculatedAnswer, double
    // providedAnser) {

    // }
}
