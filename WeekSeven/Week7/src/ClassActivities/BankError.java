package WeekSeven.Week7.src.ClassActivities;

public class BankError extends Exception{
    public BankError(String message){
        super(message);
    }
    public BankError(String message, double value){
        super("Value: "+ value + message);
    }
}
