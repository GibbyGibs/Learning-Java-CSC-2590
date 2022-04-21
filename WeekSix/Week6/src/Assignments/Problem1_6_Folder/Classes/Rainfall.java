package WeekSix.Week6.src.Assignments.Problem1_6_Folder.Classes;

import java.time.Month;

import javax.sound.sampled.SourceDataLine;

public class Rainfall {
    private double[] inputRainfall = new double[12];
    private String[] months = new String[12];

    public void settingMonths() {
        months[0] = "January";
        months[1] = "Febuary";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "Augest";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "December";
    }

    public void setinputRainfall(double[] rain) {
        this.inputRainfall = rain;
    }

    public double totalRain(double[] rain) {
        double totalRain = 0.0;

        for (int i = 0; i < rain.length; i++) {
            totalRain += rain[i];
        }
        return totalRain;
    }

    public double averageRainFall(double[] rain) {
        double average = 0;

        for (int i = 0; i < rain.length; i++) {
            average += rain[i];
        }

        return average / rain.length;
    }

    public double monthMostRain(double[] rain) {
        double max = rain[0];

        for (int i = 0; i < rain.length; i++) {
            if (max < rain[i]) {
                max = rain[i];
            }
        }
        return max;
    }

    public String monthWithMaxRain(double[] rain) {
        String maxMonth = " ";
        double max = 0;

        for (int i = 0; i < rain.length; i++) {
            if (max < rain[i]) {
                max = rain[i];
                maxMonth = months[i];
            }
        }
        return maxMonth;
    }

    public double monthleastRain(double[] rain) {
        double min = rain[0];

        for (int i = 0; i < rain.length; i++) {
            if (min > rain[i]) {
                min = rain[i];
            }
        }
        return min;
    }

    public String monthWithleastRain(double[] rain) {
        String leastMonth = " ";
        double min = 999;

        for (int i = 0; i < rain.length; i++) {
            if (min > rain[i]) {
                min = rain[i];
                leastMonth = months[i];
            }
        }
        return leastMonth;
    }

    public String toString(double[] rain) {

        String temp1 = "Month               Rain\n";
        for (int i = 0; i < months.length; i++) {
            temp1 += String.format("%-10s          %.2f\n", months[i], inputRainfall[i]);
        }
        System.out.printf("The total rainfall");
        return temp1;
    }

    public void finalOutput(double[] rain) {
        String temp2 = toString();
        System.out.println(temp2);
        System.out.printf("The total rainfall for this year is %d\n", totalRain(rain));
        System.out.println("");

    }
}
