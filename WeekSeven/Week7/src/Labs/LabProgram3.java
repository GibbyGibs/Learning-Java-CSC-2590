package WeekSeven.Week7.src.Labs;

import java.util.Scanner;


public class LabProgram3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] names = { "Ryley", "Edan", "Reagan", "Henry", "Caius", "Jane", "Guto", "Sonya", "Tyrese", "Johnny" };
        int index;

        index = scnr.nextInt();
        /* Type your code here. */
        try {
                System.out.println("Name: " + names[index]);            
            //index = names[];
            
        } catch (Exception e) {
            
            if (index > 10){
                System.out.println("Exception! Index " + index +" out of bounds for length 10");
                System.out.println("The closest name is: " + names[9]);
            }
            else if (index < 0){
                System.out.println("Exception! Index " + index +" out of bounds for length 10");
                System.out.println("The closest name is: " + names[0]);
            }

        }

        scnr.close();
    }
}
