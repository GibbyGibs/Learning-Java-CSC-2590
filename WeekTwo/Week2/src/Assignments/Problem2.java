package WeekTwo.Week2.src.Assignments;

/**
//***********************************************************************
'Project: Assignment 1
'Programmer: Cody Gibson
'Company Info:  CSM  
'Date: 03 31 2022
'Description:  Problem Number 2.  
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

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double hoursWorked;
        double hourlyPay;

        System.out.println("Weekly Pay Calculator\n");


        // gets the hours the the employee worked
        System.out.print("Enter the Employee's hours worked this week: ");
        hoursWorked = input.nextDouble();
    
        System.out.println(); //Spacer

        // gets the houly pay of the employee
        System.out.print("Enter the Employee's hourly pay: ");
        hourlyPay = input.nextDouble();

        System.out.println(); //Spacer

        
        //calculates employee's overtime pay if over 40
        if(hoursWorked > 40){
            double calcOverTimeHours = hoursWorked - 40;
            double overTimeHours = calcOverTimeHours / 2;
            //System.out.println(overTimeHours);
            double calcOverPay = overTimeHours * hourlyPay;

            // Adds the calulated overtime pay to the normal pay
            double overTimeTotal = calcOverPay + (hoursWorked * hourlyPay);

            System.out.println("The employee's pay: " + overTimeTotal);
        }
        // calculates the standard pay of the employee with out overtime
        else if (hoursWorked <= 40){
            double noOvertotalPay = hoursWorked * hourlyPay;
            System.out.println("The employee's pay: " + noOvertotalPay);
        }
        input.close();
    }
}
