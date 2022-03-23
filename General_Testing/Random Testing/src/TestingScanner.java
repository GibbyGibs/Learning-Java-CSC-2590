import java.util.Scanner;

public class TestingScanner {
    public static void main(String[] args) {        
        System.out.println("");

        int wage;

        Scanner scnr = new Scanner(System.in);
        wage = scnr.nextInt();

        scnr.close(); // This stops scanning for input from line 9

        System.out.print("The salary is ");
        System.out.println(wage * 40 * 52);
    }
}
