public class InClassAssignment2 {
    public static void main(String[] args) {
        System.out.println("");

        final double SALES_PERCENT = 0.62;
        int generatedRev = 4600000;

        double totalValue = generatedRev * SALES_PERCENT;

        System.out.println("With predicted sales of " + generatedRev + ", and sales percent of " + SALES_PERCENT + " the result " + totalValue);
    }
}
