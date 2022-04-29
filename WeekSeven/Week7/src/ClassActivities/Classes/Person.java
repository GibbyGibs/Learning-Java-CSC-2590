package WeekSeven.Week7.src.ClassActivities.Classes;


public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private int numLimbs;

    public Person(){

    }

    public Person(String name, int age, int height, int weight, int numLimbs){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.numLimbs = numLimbs;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumLimbs() {
        return this.numLimbs;
    }

    public void setNumLimbs(int numLimbs) {
        this.numLimbs = numLimbs;
    }

    public void setName(String fname, String lname){
        this.name = fname + " " + lname;
    }

    @Override
    public String toString(){

        return String.format("Name: %s\n" + "Age: %d\n" + "Height: %d\n" + "Weight: %d\n" + "Num of Limbs: %d", this.name, this.age, this.height, this.weight, this.numLimbs);
    }


}
