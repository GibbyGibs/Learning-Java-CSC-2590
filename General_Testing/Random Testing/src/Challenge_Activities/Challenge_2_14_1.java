package Challenge_Activities;

import java.util.Scanner;

public class Challenge_2_14_1 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        char letterToQuit;
        int numPresses;

        letterToQuit = scnr.next().charAt(0);
        numPresses = scnr.nextInt();

        if (numPresses == 2 && letterToQuit == 'q')
            System.out.println("You have sucessfully quit");

        scnr.close();
    }
}
