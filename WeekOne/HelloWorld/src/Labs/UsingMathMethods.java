package Labs;

import java.util.Scanner;

public class UsingMathMethods {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double x;
        double y;
        double z;
        double temp1;
        double temp2;
        double temp3;
        double temp4;

        x = scnr.nextDouble();
        y = scnr.nextDouble();
        z = scnr.nextDouble();

        temp1 = Math.pow(x, z);
        temp2 = Math.pow(x, Math.pow(y, z));
        temp3 = Math.abs(y);
        temp4 = Math.sqrt(Math.pow(x * y, z));

        System.out.println(temp1 + " " + temp2 + " " + temp3 + " " + temp4);


        scnr.close();
    }
}
