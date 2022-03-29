package Labs;

import java.util.Scanner;

public class Expression_For_Calories_Burned_During_Workout {
    public static void main(String[] args) {
        int years;
        double pounds;
        double beatsPerMin;
        double minutes;
        double yourValue;

        Scanner scnr = new Scanner(System.in);

        years = scnr.nextInt();
        pounds = scnr.nextDouble();
        beatsPerMin = scnr.nextDouble();
        minutes = scnr.nextDouble();

        yourValue = ((years * 0.2757) + (pounds * 0.03295) + (beatsPerMin * 1.0781) - 75.4991) * minutes / 8.368;

        System.out.print("Calories: ");
        System.out.printf("%.2f", yourValue);
        System.out.println(" calories");

        scnr.close();

        // The following equation estimates the average calories burned for a person
        // when exercising, which is based on a scientific journal article (source):

        // Calories = ( (Age x 0.2757) + (Weight x 0.03295) + (Heart Rate x 1.0781) —
        // 75.4991 ) x Time / 8.368

        // Write a program using inputs age (years), weight (pounds), heart rate (beats
        // per minute), and time (minutes), respectively. Output the average calories
        // burned for a person.

        // Output each floating-point value with two digits after the decimal point,
        // which can be achieved as follows:
        // System.out.printf("%.2f", yourValue);
    }
}
