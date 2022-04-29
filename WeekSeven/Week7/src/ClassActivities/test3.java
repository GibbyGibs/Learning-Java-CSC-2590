package WeekSeven.Week7.src.ClassActivities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //int number;
        Scanner input = new Scanner(System.in);
        boolean complete = false;
        do{
            System.out.println("Enter a Number: ");
            try{
                throw new BankError("You gave me a wrong number");
                //number = input.nextInt();
                //System.out.println("Number entered: " + number);

            }
            catch (InputMismatchException ex){
                System.out.println("You did not give me a number");
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
                System.out.println("Something went wrong");
            }
            finally{
                complete = true;
            }
        }while(!complete);
        

        

        input.close();
    }
}
