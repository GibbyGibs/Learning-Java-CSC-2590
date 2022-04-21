package WeekSix.Week6.src.Assignments.Problem1_6_Folder;

import WeekSix.Week6.src.Assignments.Problem1_6_Folder.Classes.Rainfall;

public class CAG_P01 {
    public static void main(String[] args) {
        double[] incomingRain = { 6.50, 4.0, 10.0, 3.0, 5.75, 7.25, 3.25, 8.75, 12.50, 9.50, 1.25, 2.50 };
        Rainfall finishedTotal = new Rainfall();

        finishedTotal.setinputRainfall(incomingRain);
        finishedTotal.settingMonths();

        // System.out.println(finishedTotal.monthWithleastRain(incomingRain));
        // System.out.println(test1);
        // test1(incomingRain);
        // System.out.print(finishedTotal.finalOutput(incomingRain));
        // ! Need to finish the output of the assignment
    }
}
