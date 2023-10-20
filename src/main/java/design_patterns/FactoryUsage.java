package design_patterns;

public class FactoryUsage {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("circle");
        Shape rectangle = factory.getShape("rectangle");
        Shape square = factory.getShape("square");

        circle.draw();
        rectangle.draw();
        square.draw();
    }

}

class ShapeFactory {

    public Shape getShape(String type) {
        if (type == null) return null;

        if (type.equalsIgnoreCase("circle"))
            return new Circle();
        else if (type.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else if (type.equalsIgnoreCase("square")) {
            return new Square();
        }
        else return null;
    }

}

interface Shape {
    public abstract void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle's draw method.");
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle's draw method.");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square's draw method.");
    }
}
