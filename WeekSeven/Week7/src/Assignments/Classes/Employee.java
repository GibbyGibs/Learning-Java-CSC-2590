package WeekSeven.Week7.src.Assignments.Classes;

public class Employee {
    private String EmpName;
    private String EmpID;
    private String hireDate;

    /**
     * 
     */
    public Employee(){

    }

    /**
     * Constructer used to imput data into class
     * @param empName Gets the Employee name
     * @param empID Gets the Employee ID
     * @param hireDate Gets the Hire Date
     */
    public Employee(String empName, String empID, String hireDate) {
        EmpName = empName;
        EmpID = empID;
        this.hireDate = hireDate;
    }

    /**
     * Returns the Employee name
     * @return 
     */
    public String getEmpName() {
        return this.EmpName;
    }

    /**
     * sets the Employee name
     * @param EmpName sets the Employee name from what was given
     */
    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    /**
     * gets the employee id from input
     * @return
     */
    public String getEmpID() {
        return this.EmpID;
    }

    /**
     * sets Emp ID
     * @param EmpID sets the Employee id
     */
    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    /**
     * gets the hire date from input
     * @return gets the hire date from input
     */
    public String getHireDate() {
        return this.hireDate;
    }

    /**
     * sets the hire date
     * @param hireDate sets the hire date from the getter
     */
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * Checks to see if the Employee ID meets the paramaters to be valid
     * @return returns the EmpID base on whether it meets requirements
     */
    public String validateEmployeeID(){
        if (Character.isLetter(EmpID.charAt(0))){
            return EmpID = "INVALID EMPLOYEE NUMBER";
        }
        else if(Character.isLetter(EmpID.charAt(1))){
            return EmpID = "INVALID EMPLOYEE NUMBER";
        }
        else if(Character.isLetter(EmpID.charAt(2))){
            return EmpID = "INVALID EMPLOYEE NUMBER";
        }
        else if (Character.isDigit(EmpID.charAt(4))){
            return EmpID = "INVALID EMPLOYEE NUMBER";
        }     
        else if (EmpID.charAt(4) >= 'A' && EmpID.charAt(4) <= 'M' || EmpID.charAt(4) >= 'a' && EmpID.charAt(4) <= 'm'){
            return EmpID;
        }
        else if (EmpID.charAt(4) >= 'M' || EmpID.charAt(4) >= 'm' ){
            return EmpID = "INVALID EMPLOYEE NUMBER";
        }

        return EmpID;
    }

    public String toString(){
        return String.format("\nName: %s\nEmployee ID: %s\nHire Date: %s", this.EmpName, validateEmployeeID(), this.hireDate);
    }

}
