package WeekSeven.Week7.src.Assignments.Classes;

public class ProductionWorker extends Employee {
    private int Shift;
    private double hourlyRate;

    // Constructers
    public ProductionWorker(int shift, double hourlyRate) {
        Shift = shift;
        this.hourlyRate = hourlyRate;
    }

    public ProductionWorker(String empName, String empID, String hireDate, int shift, double hourlyRate) {
        super(empName, empID, hireDate);
        Shift = shift;
        this.hourlyRate = hourlyRate;
    }

    //End of constructers

    public int getShift() {
        return this.Shift;
    }

    public void setShift(int Shift) {
        this.Shift = Shift;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * this converts the int shift into a string to output day/night
     * @param Shift equals 1 or 2, 1 = day, 2 = night
     * @return returns whether is is day or night
     */
    public String convertShift(int Shift){
        //String conShift = "";

        if(getShift() == 1){
            return "Day";
        }
        
        return "Night";
    }

    
    public String toString(){
        return String.format("\nName: %s\nEmployee ID: %s\nHire Date: %s\nShift: %s\nHourly Pay: %.2f", super.getEmpName(), super.validateEmployeeID(), super.getHireDate(), convertShift(Shift), this.hourlyRate);
    }

}
