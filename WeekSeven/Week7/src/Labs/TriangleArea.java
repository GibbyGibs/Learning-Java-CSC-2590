package WeekSeven.Week7.src.Labs;

import java.util.Scanner;

import WeekSeven.Week7.src.Labs.Classes.Triangle;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      
      // setHeight())
      triangle1.setBase(scnr.nextDouble());
      triangle1.setHeight(scnr.nextDouble());

      
      // setHeight())
      triangle2.setBase(scnr.nextDouble());
      triangle2.setHeight(scnr.nextDouble());

      
      if (triangle1.getArea() > triangle2.getArea()) {
         System.out.println("Triangle with larger area:");
         triangle1.printInfo();
      } else {
         System.out.println("Triangle with larger area:");
         triangle2.printInfo();
      }

      

      scnr.close();
   }
}
