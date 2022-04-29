package WeekSeven.Week7.src.ClassActivities.Classes;

public class shirt implements RetailItem {
    private double price;

    public shirt(double price){
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
