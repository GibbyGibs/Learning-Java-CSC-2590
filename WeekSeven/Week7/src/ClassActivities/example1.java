package WeekSeven.Week7.src.ClassActivities;

//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;

import WeekSeven.Week7.src.ClassActivities.Classes.Person;

public class example1 {
    public static void main(String[] args) {
        
        Person person = new Person("John Doe", 18, 65, 165, 4);

        System.out.println(person);
        
        // File myfile = new File("test.txt");
        // PrintWriter wr = new PrintWriter(myfile);
        // wr.write(person.toString());
        // wr.close();

    }
}
