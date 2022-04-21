package WeekSix.Week6.src.ClassActivities;

public class example4 {
    public static void main(String[] args) {
        double[] items = new double[5];

        items[0] = 82;
        items[1] = 85.30;
        items[2] = 71.50;
        items[3] = 79.25;
        items[4] = 90.55;

        double[] secondArray = new double[items.length]; // line 13-16 Copies the first array and assigns the OG data to the second array
        for (int i = 0; i < items.length; i++){
            secondArray[i] = items[i];
        }


        outputarray(items);
        //getAverage(items);
        //outputMaxValue(items);
        outputarray(secondArray);
    }

    public static void outputarray(double[] array) {
        for (int i = array.length-1; i >= 0; i--) {             //going from the back of the list
            System.out.println("Index " + i + ": " + array[i]);
        }
        // int i =0;
        // for (double item: array){
        //     System.out.println("Index " + i + ": " + item);
        //     i++;
        // }
    }

    public static void alternativeOutput(double[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.println("Index " + i + ": " + array);
            i++;
        }
    }

    public static void getAverage(double[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.printf("the Average is %.2f\n", total / array.length);
    }

    public static void outputMaxValue(double[] array) {
        double max = array[0];

        for (int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("The max valus is " + max);
    }
}
