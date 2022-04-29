package WeekSeven.Week7.src.ClassActivities.Classes;

public class Student extends Person{
    private String idNumber;
    private double myGPA;

    // !Constructers
    public Student(){
        super();
        idNumber = "";
        myGPA = 0.0;
    }

    public Student(String name, int age, int height, int weight, int numLimbs, String idNumber, Double gpa){
        super(name, age, height, weight, numLimbs);
        this.idNumber = idNumber;
        this.myGPA = gpa;
    }

    public Student(String name, int age, String idNumber, double gpa){
        super();
        super.setName(name);
        super.setAge(age);
        this.idNumber = idNumber;
        this.myGPA = gpa;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getMyGPA() {
        return this.myGPA;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }

    public void setName (String name){
        if(name.length() > 0){
            super.setName(name);
        }
    }

    @Override
    public String toString(){

        return String.format("\nID: %s\nName: %s\nAge: %d\nGPA: %.2f", this.idNumber,super.getName(), super.getAge(), this.myGPA);
    }

}
