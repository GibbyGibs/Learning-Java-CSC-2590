package WeekThree.Week3.src.RandomTest;

import java.util.Scanner;

public class TestingSwitchStatements2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        char origLetter;

        origLetter = scnr.next().charAt(0);

        switch (origLetter) {
            case 'a':
                System.out.println("Alpha");
                break;
            case 'A':
                System.out.println("Alpha");
                break;
            case 'b':
                System.out.println("Beta");
                break;
            case 'B':
                System.out.println("Beta");
                break;
            default:
                System.out.println("Unknown");
                break;
        }

        scnr.close();
    }
}
