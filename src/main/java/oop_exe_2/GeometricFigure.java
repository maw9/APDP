package oop_exe_2;

public abstract class GeometricFigure {

    double width;
    double height;
    String figType;
    double area;

    public abstract double figArea();

    public GeometricFigure(double width, double height, String figType) {
        this.width = width;
        this.height = height;
        this.figType = figType;
    }
}

interface Sides {
    public void printSides();
}

class Square extends GeometricFigure implements Sides {
    public Square(double width, double height, String figType) {
        super(width, height, figType);
    }

    @Override
    public double figArea() {
        area = width * height;
        return area;
    }

    @Override
    public void printSides() {
        System.out.println("Square's Width: " + width + ", Height: " + height);
    }
}

class Triangle extends GeometricFigure implements Sides {
    public Triangle(double width, double height, String figType) {
        super(width, height, figType);
    }

    @Override
    public double figArea() {
        area = 0.5 * width * height;
        return area;
    }

    @Override
    public void printSides() {
        System.out.println("Triangle's Width: " + width + ", Height: " + height);
    }
}

class Program {
    public static void main(String[] args) {
        Square square = new Square(2, 2, "Square");
        Triangle triangle = new Triangle(2, 4, "Triangle");

        System.out.println("Area of square: " + square.figArea());
        System.out.println("Area of triangle: " + triangle.figArea());

        square.printSides();
        triangle.printSides();
    }
}
