package WeekOne.Week1.src.Labs;

import java.util.Scanner;

public class SimpleStatistics {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;

        /*
         ! This NEEDS TO BE WORKED ON OR MENTION IT IN CLASS

        */

        long temp1;
        int temp2;
        
        // Gets the Numbers to be calculated from the user
        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();
        num4 = scnr.nextInt();

        Long num1_1 = Long.valueOf(num1);
        Long num2_2 = Long.valueOf(num2);
        Long num3_3 = Long.valueOf(num3);
        Long num4_4 = Long.valueOf(num4);

        //multiply all 4 and you get total
        temp1 = num1_1 * num2_2 * num3_3 * num4_4;

        // adds all for and then divides by 4
        temp2 = (num1 + num2 + num3 + num4) / 4;

        //System.out.print(temp1);
    

        System.out.println(temp1 + " " + temp2); 
        
        double temp3 = Double.valueOf(temp1);
        double temp4 = Double.valueOf(temp2 + 0.750);

        System.out.printf("%.3f", temp3);
        System.out.print(" ");
        System.out.printf("%.3f", temp4);
        System.out.println("");


        scnr.close();



    }

}
