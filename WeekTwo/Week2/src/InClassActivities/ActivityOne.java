package WeekTwo.Week2.src.InClassActivities;

import java.util.Scanner;

public class ActivityOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double score1;
        double score2;
        double score3;

        double calculatedScore;

        // Ask for three scores
        System.out.println("Please enter 3 numbers that you want calculated");
        score1 = input.nextDouble(); // first Grade
        score2 = input.nextDouble(); // Second Grade
        score3 = input.nextDouble(); // Third Grade

        // Calculated the average score of the three inputs
        calculatedScore = (score1 + score2 + score3) / 3.0;

        // Checks to see if score is about 95
        if (calculatedScore > 95) {
            System.out.println("Your score is greater than 95");
        }

        // sees if the students average score is below 60
        else if (calculatedScore < 60) {
            System.out.println("Your score is less than 60 and you have failed the semester");
        }

        System.out.println(calculatedScore);
        input.close();
    }
}
