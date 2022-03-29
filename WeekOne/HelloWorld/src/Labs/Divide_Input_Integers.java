package Labs;

import java.util.Scanner;

public class Divide_Input_Integers {
    public static void main(String[] args) {
        int userNum;
        int divNum;
        int temp1;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Please enter the number you would like to divide: ");

        // Gets the number that the user wants to divide
        userNum = scnr.nextInt();

        System.out.print("Please enter the number you would like to divide by: ");

        // gets the number that the user wants to divde by
        divNum = scnr.nextInt();

        temp1 = userNum / divNum;
        System.out.print(temp1 + " ");
        temp1 = temp1 / divNum;
        System.out.print(temp1 + " ");
        temp1 = temp1 / divNum;
        System.out.print(temp1);

        // System.out.println(userNum);
        // System.out.println(divNum);

        scnr.close();

    }
}
