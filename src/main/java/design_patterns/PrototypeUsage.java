package design_patterns;

import OOP.Shape;

import java.util.Hashtable;

public class PrototypeUsage {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        ProtoShape circle = ShapeCache.getShape("1");
        ProtoShape rectangle = ShapeCache.getShape("2");
        ProtoShape rectangle1 = ShapeCache.getShape("2");

        System.out.println(rectangle);
        System.out.println(rectangle1);

        circle.draw();
        rectangle.draw();
    }

}

class ShapeCache {

    private static final Hashtable<String, ProtoShape> hashMap = new Hashtable<>();

    public static void loadCache() {
        ProtoShape circle = new ProtoCircle();
        circle.setId("1");
        ProtoShape rectangle = new ProtoRectangle();
        rectangle.setId("2");

        hashMap.put(circle.getId(), circle);
        hashMap.put(rectangle.getId(), rectangle);
    }

    public static ProtoShape getShape(String shapeId) {
        return (ProtoShape) hashMap.get(shapeId).clone();
    }

}

class ProtoCircle extends ProtoShape {

    public ProtoCircle() {}

    @Override
    public void draw() {
        System.out.println("Inside circle::draw method");
    }
}

class ProtoRectangle extends ProtoShape {

    public ProtoRectangle() {}

    @Override
    public void draw() {
        System.out.println("Inside rectangle::draw method");
    }
}

abstract class ProtoShape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }

    /*@Override
    public ProtoShape clone() {
        try {
            ProtoShape clone = (ProtoShape) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }*/
}
