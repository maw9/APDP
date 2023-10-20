package design_patterns;

public class FacadeUsage {

    public static void main(String[] args) {
        ShapeMaker maker = new ShapeMaker();
        maker.drawCircle();
        maker.drawRectangle();
        maker.drawSquare();
    }

}

interface FacadeShape {
    void draw();
}

class FacadeRectangle implements FacadeShape {

    @Override
    public void draw() {
        System.out.println("FacadeRectangle::draw");
    }
}

class FacadeCircle implements FacadeShape {

    @Override
    public void draw() {
        System.out.println("FacadeCircle::draw");
    }
}

class FacadeSquare implements FacadeShape {

    @Override
    public void draw() {
        System.out.println("FacadeSquare::draw");
    }
}

class ShapeMaker {

    private final FacadeShape circle;
    private final FacadeShape rectangle;
    private final FacadeShape square;

    public ShapeMaker() {
        circle = new FacadeCircle();
        rectangle = new FacadeRectangle();
        square = new FacadeSquare();
    }

    void drawCircle() {
        circle.draw();
    }

    void drawRectangle() {
        rectangle.draw();
    }

    void drawSquare() {
        square.draw();
    }
}

