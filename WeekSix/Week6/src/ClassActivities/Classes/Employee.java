package WeekSix.Week6.src.ClassActivities.Classes;

public class Employee {
    private int idNumber;
    private String name, department, position;

    // Constructers
    public Employee(int id, String n) {
        // if (id > 0) {
        // this.idNumber = id;
        // }
        this.setID(id);
        this.setName(n);
    }

    public Employee(int id, String n, String d) {
        // if (id > 0) {
        // this.idNumber = id;
        // }
        this.setID(id);
        this.setName(n);
        this.setDepartment(d);
    }

    public Employee(int id, String n, String d, String p) {
        // if (id > 0) {
        // this.idNumber = id;
        // }
        this.setID(id);
        this.setName(n);
        this.setDepartment(d);
        this.setPosition(p);
    }
    // End of Cd onsturcters

    // Setters
    public void setName(String n) {
        if (isValid(n)) {
            this.name = n;
        }
    }

    public void setDepartment(String d) {
        if (isValid(d)) {
            this.department = d;
        }
    }

    public void setPosition(String p) {
        if (isValid(p)) {
            this.position = p;
        }
    }

    public void setID(int i) {
        if (i > 0) {
            this.idNumber = i;
        }
    }
    //End of Setters

    //Getters
    public int getID() {
        return this.idNumber;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nName: %s\nDepartment: %s\nPosition: %s\n", this.idNumber, this.name,
                this.department, this.position);
    }
    //End of Getters

    private boolean isValid(String value) {
        return value.trim().length() > 0;
    }
}
