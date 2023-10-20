package design_patterns;

public class DecoratorUsage {


    public static void main(String[] args) {
        DecorShape circle = new DecorCircle();
        circle.draw();

        RedShapeDecorator decorator = new RedShapeDecorator(circle);
        decorator.draw();
    }


}

interface DecorShape {
    void draw();
}

class DecorCircle implements DecorShape {

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}

class DecorRectangle implements DecorShape {

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}

abstract class ShapeDecorator implements DecorShape {
    protected DecorShape decoratedShape;

    public ShapeDecorator(DecorShape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
}

class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(DecorShape decoratedShape) {
        super(decoratedShape);
    }


    @Override
    public void draw() {
        decoratedShape.draw();
        drawRedBorder();
    }

    public void drawRedBorder() {
        System.out.println("Drawing with red border");
    }
}
