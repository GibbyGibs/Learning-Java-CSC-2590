import java.util.Scanner;

public class InterstateHighWays {
    public static void main(String[] args) {

        Begin();
    }

    public static void Begin() {
        try (Scanner input = new Scanner(System.in)) {
            int highwayNumber = input.nextInt();
            MainHighways(highwayNumber);
        }

        // System.out.println("What is the highway number\n");

    }

    public static void MainHighways(int highWay) {
        boolean Stop = false;
        while (Stop != true) {
            if (highWay > 0 && highWay <= 99) {
                if (highWay % 2 == 0) {
                    System.out.println("I-" + highWay + " is primary, going east/west.");
                    Stop = true;
                } else if (highWay % 2 == 1) {
                    System.out.println("I-" + highWay + " is primary, going north/south.");
                    Stop = true;
                }
            } else if (highWay >= 100 && highWay <= 999) {
                if (highWay % 2 == 0) {
                    System.out.println(
                            "I-" + highWay + " is auxiliary, serving I-" + highWay % 100 + ", going east/west.");
                    Stop = true;
                } else if (highWay % 2 == 1) {
                    System.out.println(
                            "I-" + highWay + " is auxiliary, serving I-" + highWay % 100 + ", going north/south.");
                    Stop = true;
                } else if (highWay == 100 || highWay == 200 || highWay == 300 || highWay == 400 || highWay == 500
                        || highWay == 600 || highWay == 700 || highWay == 800 || highWay == 900) {
                    System.out.println(highWay + " is not a valid interstate highway number.");
                    Stop = true;
                } else {
                    System.out.println(highWay + "is not a valid interstate highway number.");
                    Stop = true;
                }

            }

        }

        // return 0; // ! this needs to change once above is done

    }

}
