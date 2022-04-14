package WeekThree.Week3.src.InClassActivities;

public class ClassActivity2 {
    public static void main(String[] args) {
        calculateRetail(59.99, 10);
        calculateRetail(199.99, 5);
        calculateRetail(1599.99, 6.5);
    }

    public static void calculateRetail(double wholeSale, double markUpPercentage){
        double result = wholeSale * (1+markUpPercentage/100);
        System.out.printf("Wholesale: %.2f, Markup Percentage: %.2f, Result: %.2f\n", wholeSale, markUpPercentage, result);
    }

    public static double calculateRetail2(double wholeSale, double markUpPercentage){
        double result = wholeSale * (1+markUpPercentage/100);
        return result;
    }

    public static double calculateRetail(double wholeSale, int markUpPercentage){
        double result = wholeSale * (1+markUpPercentage/100);
        return result;
    }

}
