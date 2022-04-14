package WeekTwo.Week2.src.InClassActivities;

import java.util.Scanner;

public class ActivitySix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do{
            System.out.println("Enter a number between 1 and 100");
            number = input.nextInt();

            if (number < 1 || number > 100){
                System.out.printf("%d is not between 1 and 100.\nPlease try again!\n", number);
            }

        } while (number < 1 || number > 100);
        
            System.out.println("you entered" + number);
        


        input.close();
    }
}
