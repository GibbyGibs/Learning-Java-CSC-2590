package WeekThree.Week3.src.RandomTest;

import java.util.Scanner;

public class StringComparisonDetectWord {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userString;

        userString = scnr.next();

        if (userString.equals("Quit")) {
            System.out.println("Goodbye");
        }
        else{
            System.out.println("Hello");
        }

        scnr.close();
    }
}
