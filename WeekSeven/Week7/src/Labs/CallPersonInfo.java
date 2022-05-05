package WeekSeven.Week7.src.Labs;

import WeekSeven.Week7.src.Labs.Classes.PersonInfo;

import java.util.Scanner;

public class CallPersonInfo {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        PersonInfo person1 = new PersonInfo();
        int personsKid;

        personsKid = scnr.nextInt();

        person1.setNumKids(personsKid);

        System.out.println("Kids: " + personsKid);
        System.out.println("New baby, kids now: " + person1.getNumKids());

        scnr.close();
    }
}
