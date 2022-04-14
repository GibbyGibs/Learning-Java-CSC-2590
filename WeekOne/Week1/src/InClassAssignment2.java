package WeekOne.Week1.src;

import java.util.Scanner;


public class InClassAssignment2 {
    public static void main(String[] args) {
        System.out.println("");

        Scanner input = new Scanner(System.in);
        final double SALES_PERCENT = 0.62;

        System.out.println("Enter the predicted sales amount: ");
        double generatedRev = input.nextDouble();

        input.close(); // This stops the scanning process on line 8

        double totalValue = generatedRev * SALES_PERCENT;

        System.out.println("With predicted sales of " + generatedRev + ", and sales percent of " + SALES_PERCENT + " the result " + totalValue);
    }
}
