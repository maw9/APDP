package quiz_oop_p1;

public class Cube1 extends Square{

    int depth;

    public Cube1(int height, int width, int depth) {
        super(height, width);
        this.depth = depth;
    }
    @Override
    public void computeSurfaceArea() {
        int area = width * height * depth;
        System.out.println("Surface area of a cube");
        System.out.printf("Height = %5d \n Width = %5d \n Depth = %5d \n Surface Area = %5d ", height, width, depth, area);
    }

}
