package Labs;

import java.util.Scanner;

public class PrasingStrings {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        Scanner inSS = null;
        String userInput;                           //Holds all of what the user puts in
        String firstName;                           //Firstname
        String lastName;                            //Lastname
        Boolean isDone = false;                     //keeps the while loop going till the user quits

        System.out.println();   //Seperator
        System.out.println("Enter your first name and lastname seperated by a comma ");
        System.out.println("To exit press \"q\" and then press enter");
        System.out.println();   //Seporator


        //Checks to see if the user is done
        while (!isDone) {

            userInput = Input.nextLine();           //
            inSS = new Scanner(userInput); 

            firstName = inSS.next();
            
            if (firstName.equals("q")){
                isDone = true;
            }
            else {
                lastName = inSS.next();

                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);

                inSS.close();
                Input.close();
            }
        }

    }
}
