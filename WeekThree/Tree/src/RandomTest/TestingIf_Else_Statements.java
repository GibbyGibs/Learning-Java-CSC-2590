import java.util.Scanner;

public class TestingIf_Else_Statements {
    public static void main(String[] args) {

        int carYear;

        Scanner input = new Scanner(System.in);
        carYear = input.nextInt();

        if (carYear < 1967) {
            System.out.println("Probably has few safety features.");
        } else if (carYear > 2000) {
            System.out.println("Probably has head rests.");
            System.out.println("Probably has anti-lock brakes.");
            System.out.println("Probably has tire-pressure monitor.");
        } else if (carYear > 1992) {
            System.out.println("Probably has head rests.");
            System.out.println("Probably has anti-lock brakes.");
        } else if (carYear > 1969) {
            System.out.println("Probably has head rests.");
        }

        input.close();
    }
}
