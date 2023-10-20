package quiz_exe;

import java.util.ArrayList;

public class Circle {

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class ExeOne {

    public static void main(String[] args) {

        ArrayList<Circle> arr = new ArrayList<>();

        while (Math.random() >= 0.01) {
            arr.add(new Circle(Math.random() * 100));
        }

        for (Circle each: arr) {
            System.out.println("Area of circle: " + each.calculateArea());
        }
    }

}
