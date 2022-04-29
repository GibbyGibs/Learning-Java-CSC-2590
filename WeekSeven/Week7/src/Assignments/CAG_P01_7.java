package WeekSeven.Week7.src.Assignments;

import WeekSeven.Week7.src.Assignments.Classes.Employee;
import WeekSeven.Week7.src.Assignments.Classes.ProductionWorker;

public class CAG_P01_7 {
    public static void main(String[] args) {
        Employee person = new Employee("John Doe", "000-L", "04/19/2021");
        ProductionWorker person1 = new ProductionWorker("Cody Gibson", "201-L", "04/14/2014", 2, 18.50);

        System.out.println(person.toString()); //Prints out Employee.java
        System.out.println(person1.toString()); //Prints out ProductionWorker.java
    }
}
