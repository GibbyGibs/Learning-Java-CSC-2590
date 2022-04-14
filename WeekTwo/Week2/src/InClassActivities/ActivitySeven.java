package WeekTwo.Week2.src.InClassActivities;

import java.util.Scanner;

public class ActivitySeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userInput;
        int total = 0;
        boolean quit = false;

        while(quit){
            System.out.println("Enter your number: ");
            
            userInput = input.nextInt();
            
            if(userInput != -999){             
                
                userInput += total;
            }
            else if(userInput == -999){
                quit = true;
            }
        }

    input.close();

    }
}
