package WeekSeven.Week7.src.Labs;

import java.util.Scanner;

import WeekSeven.Week7.src.Labs.Classes.Dog;
import WeekSeven.Week7.src.Labs.Classes.Pet;

public class PetInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Pet myPet = new Pet();
        Dog myDog = new Dog();

        String petName, dogName, dogBreed;
        int petAge, dogAge;

        petName = scnr.nextLine();
        petAge = scnr.nextInt();
        scnr.nextLine();
        dogName = scnr.next();
        dogAge = scnr.nextInt();
        scnr.nextLine();
        dogBreed = scnr.nextLine();

        
        myPet.setName(petName);
        myPet.setAge(petAge);

        
        // printInfo
        myDog.setName(dogName);
        myDog.setAge(dogAge);
        myDog.setBreed(dogBreed);

        
        myPet.printInfo();
        myDog.printInfo();
        System.out.println("Breed: " + myDog.getBreed());

        scnr.close();
    }
}
