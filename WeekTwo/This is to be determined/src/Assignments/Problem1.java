
/**
//***********************************************************************
'Project: Assignment 1
'Programmer: Cody Gibson
'Company Info:  CSM  
'Date: 03 31 2022
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
        Scanner input = new Scanner(System.in);

        int userInput;
        int total = 0;
        boolean quit = false;

        while (quit != true) {
            System.out.print("Enter your number: ");

            userInput = input.nextInt();

            if (userInput != -999) {

                total += userInput;
            } 
            else if (userInput == -999) {
                quit = true;
                System.out.println("The sum is: " + total);
            }
        }

    }
}
