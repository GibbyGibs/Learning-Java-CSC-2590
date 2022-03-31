//import java.util.Scanner;

public class ActivityFour {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);

        String name1 = "Joe";
        String name2 = "joe";
        String name3 = "JOE";

        if(name1.equals(name2)){
            System.out.printf("%s is equal to %s\n", name1, name2);
        }
        else{
            System.out.printf("%s is NOT equal to %s\n", name1,name2);
        }

        if (name1.equalsIgnoreCase(name3)){
            System.out.printf("%s is equal to %s\n", name1,name3);
        }
        else {
            System.out.printf("%s is NOT equal to %s\n", name1,name3);
        }

    }
}
