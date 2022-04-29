package WeekSeven.Week7.src.ClassActivities.Classes;

public class CD implements RetailItem {
    private double price;

    public CD(double price){
        this.price = price;
    }

    @Override
    public double getRetailPrive() {
        return this.price;
    }

    @Override
    public void setRetailPrive(double price) {
        this.price = price;
    }

    
    
}
