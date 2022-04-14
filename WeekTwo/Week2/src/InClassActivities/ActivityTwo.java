package WeekTwo.Week2.src.InClassActivities;

import java.util.Scanner;

public class ActivityTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstNum;
        double secondNum;

        double calculatedScore;

        System.out.println("Enter 2 numbers. Make sure the second is not 0");
        
        firstNum = input.nextDouble();
        secondNum = input.nextDouble();

        if(secondNum != 0){
            calculatedScore = (firstNum / secondNum);
            System.out.printf("Your score is %.2f", calculatedScore);
        }
        else{
            System.out.println("Your second number cannot be 0");
        }

        input.close();
    }
}
