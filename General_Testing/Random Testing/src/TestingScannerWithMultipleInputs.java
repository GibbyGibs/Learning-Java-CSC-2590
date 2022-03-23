import java.util.Scanner;


public class TestingScannerWithMultipleInputs {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int birthMonth;
        int birthYear;
        
        birthMonth = scnr.nextInt();
        birthYear = scnr.nextInt();

        scnr.close();
        
        System.out.println(birthMonth+"/"+birthYear);
    }
    
}
