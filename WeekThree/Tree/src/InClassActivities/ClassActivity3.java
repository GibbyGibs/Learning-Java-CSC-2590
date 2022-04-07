import java.util.Scanner;

import java.io.*;

import java.io.File;
import java.io.IOException;

public class ClassActivity3 {
    public static void main(String[] args) throws IOException{
       String fileName = getFileName();
       openFile(fileName); 
    }


    /**
     * This method ask the user for the file name to open
     * @return the file name to open
     */
    public static String getFileName(){
        String name = "";
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter the file name");
            name = input.nextLine();

            if (name == null || name.isBlank()){
                System.out.println("the file cannot be null or blank\nPlease try again!");
            }
        }while(name.isBlank() || name == null);

        return name;
    }
    /**
     * writes the contentes of the filwe to the console
     * @param name the name of the file to open and write from
     * @throws IOException if the file is not found
     */
    public static void openFile(String name) throws IOException{
        File myFile = new File(name);
        Scanner file = new Scanner(myFile);
        while(file.hasNext()){
            System.out.println(file.nextLine());
        }
        file.close();
        System.out.println("End of file!");
    }
}
