package quiz_oop_p1;

public class DemoSquare {

    public static void main(String[] args) {
        Square square = new Square(20, 20);
        Cube1 cube1 = new Cube1(20, 20, 10);
        square.computeSurfaceArea();
        cube1.computeSurfaceArea();
    }

}
