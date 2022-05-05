package WeekSeven.Week7.src.Labs;

import java.util.Scanner;

import WeekSeven.Week7.src.Labs.Classes.Car;

public class CarValue {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        Car myCar = new Car();
        
        int userYear = scnr.nextInt();
        int userPrice = scnr.nextInt();
        int userCurrentYear = scnr.nextInt();
        
        myCar.setModelYear(userYear);
        myCar.setPurchasePrice(userPrice);
        myCar.calcCurrentValue(userCurrentYear);
        
        myCar.printInfo();

        scnr.close();
     }
}
