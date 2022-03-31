import java.util.Scanner;


public class ActivittFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers of hours worked: ");

        double hours = input.nextDouble();
        double total = hours > 5 ? hours*50: 0;

        System.out.printf("The total due is $%.2f", total);
        input.close();
    }
}
