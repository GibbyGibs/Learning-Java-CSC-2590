package WeekSix.Week6.src.ClassActivities.Classes;

public class Rectangle {
    private double width, length;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double w) {
        if (w >= 0){
            this.width = w;
        }

    }

    public void setLength(double l) {
        if(l >= 0){
            this.length = l;
        }
    }

    public double getArea() {
        return this.length * this.width;
    }
}
