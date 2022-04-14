package WeekSix.Week6.src.ClassActivities;

import WeekSix.Week6.src.ClassActivities.Classes.Rectangle;


public class example1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        r1.setWidth(10);
        System.out.println("Length: " + r1.getLength());
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Area: " + r1.getArea());
    }
}
