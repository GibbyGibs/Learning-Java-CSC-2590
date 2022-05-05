package WeekSeven.Week7.src.Labs;

import java.util.Scanner;
import java.util.InputMismatchException;

public class NameAgeChecker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String inputName;
        int age;

        inputName = scnr.next();
        while (!inputName.equals("-1")) {
            // Insert a try/catch statement to catch the exception.
            try{
                

                

            }
            catch(InputMismatchException ex){
                age = 0;
                System.out.println(inputName + age);
            }
            age = scnr.nextInt();
            System.out.println(inputName + " " + (age + 1));

            inputName = scnr.next();
        }

        scnr.close();
    }
}
