import java.util.Scanner;

public class PrintingStringsInAlphabeticalOrd {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstString;
        String secondString;

        firstString = scnr.next();
        secondString = scnr.next();

        if (firstString.compareTo(secondString) < 0) {
            System.out.print(firstString + " ");
            System.out.println(secondString);
        } else {
            System.out.print(secondString + " ");
            System.out.println(firstString);
        }

        scnr.close();
    }
}
