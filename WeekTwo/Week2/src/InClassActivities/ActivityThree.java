package WeekTwo.Week2.src.InClassActivities;

import java.util.Scanner;

public class ActivityThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Salary: ");
        double income = input.nextDouble();

        if (income > 30000) {
            System.out.print("Enter the years on the job: ");
            int years = input.nextInt();

            if (years >= 2) {
                System.out.println("you are qualified for the loan");
            } 
            else {
                System.out.println("you do not have enough years on the job");
            }
        } 
        else {
            System.out.println("Your salary is not high enough");
        }
        input.close();
    }
}
