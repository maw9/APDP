package OOP;

public class Triangle extends Shape{

    public Triangle() {
        System.out.println("This is called from triangle constructor");
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
    }

    @Override
    public void draw() {
        System.out.println("This is Triangle's draw method");
    }
}
