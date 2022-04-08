
/**
***********************************************************************
'Project: Assignment 2
'Programmer: Cody Gibson
'Company Info:  CSM  
'Date: 04 7 2022
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

import java.time.Year;
import java.util.Scanner;

public class Problem2_2 {
    public static void main(String[] args) {
        beginning();
    }

    /**
     * This is running the main code
     */
    public static void beginning() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12");
        int monthNumber = input.nextInt();
        String monthName = "";
        boolean leap;

        // ! checks to see if the user inputed a number between 1 and 12
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Sorry that is a invalid entry");
            monthNumber = input.nextInt();
        }

        System.out.println("Enter a year after 1899");
        int yearNumber = input.nextInt();

        // ! checks to see if the user entered a date before 1899
        if (yearNumber < 1899) {
            System.out.println("Sorry that is a invalid year");
            yearNumber = input.nextInt();
        }

        monthName = getMonthString(monthNumber);

        leap = isLeapYear(yearNumber);

        int daysInTheMonth = getMonthDays(monthName, yearNumber);

        System.out.printf("The month is: %s, Leap year: %b, There is %d days in %s ", monthName, leap, daysInTheMonth, monthName);

    }

    /**
     * This takes in the number from the user and turns it into the month name
     * @param month Passes in the users number to turn into the name of the month
     * @return returns the name of the month using the number the user gives
     */
    public static String getMonthString(int month) {
        // TODO: do Cases for the number of months (the "TODO:" is part of a extention that i use to color comments)
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "Febuary";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        return monthName;

    }
    /**
     * 
     * @param month takes in the month and uses it to calculate the number of days in the month
     * @param year determines how many days are in the month by giving a remander
     * @return returns the amount of days in the month that was selected
     */
    public static int getMonthDays(String month, int year) {
        // TODO: return number of days the given month and year (the "TODO:" is part of a extention that i use to color comments)
        int days = 0;

        if (year % 2 == 0){
            //days equal 365
            if (month.equals("January")){
                days = 31;
            }
            else if (month.equals("Febuary")){
                days = 28;
            }
            else if (month.equals("March")){
                days = 31;
            }
            else if (month.equals("April")){
                days = 30;
            }
            else if (month.equals("May")){
                days = 31;
            }
            else if (month.equals("June")){
                days = 30;
            }
            else if (month.equals("July")){
                days = 31;
            }
            else if (month.equals("August")){
                days = 31;
            }
            else if (month.equals("September")){
                days = 30;
            }
            else if (month.equals("October")){
                days = 31;
            }
            else if (month.equals("November")){
                days = 30;
            }
            else if (month.equals("December")){
                days = 31;
            }
        }
        else if (year % 2 == 1){
            //days equal 366
            if (month.equals("January")){
                days = 31;
            }
            else if (month.equals("Febuary")){
                days = 29;
            }
            else if (month.equals("March")){
                days = 31;
            }
            else if (month.equals("April")){
                days = 30;
            }
            else if (month.equals("May")){
                days = 31;
            }
            else if (month.equals("June")){
                days = 30;
            }
            else if (month.equals("July")){
                days = 31;
            }
            else if (month.equals("August")){
                days = 31;
            }
            else if (month.equals("September")){
                days = 30;
            }
            else if (month.equals("October")){
                days = 31;
            }
            else if (month.equals("November")){
                days = 30;
            }
            else if (month.equals("December")){
                days = 31;
            }
        }
        return days;
    }

    /**
     * 
     * @param year passes in the year to see if it is a leap year
     * @return returns true or false and determines whether it is a leap year or not
     */
    public static boolean isLeapYear(int year) {
        
        // ! determines whether it is a leap year or not
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 ==0)){
            return true;
        }
        return false;
    }

}

