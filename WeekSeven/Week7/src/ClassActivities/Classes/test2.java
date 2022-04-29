package WeekSeven.Week7.src.ClassActivities.Classes;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        RetailItem cd = new CD(8.99);
        RetailItem shirt = new shirt(12.50);
        ArrayList<RetailItem> item = new ArrayList<RetailItem> ();
        item.add(shirt);
        item.add(cd);

        for(RetailItem i: item){
            System.out.println("\nPrice: " + i.getRetailPrive());
        }
    }
}
