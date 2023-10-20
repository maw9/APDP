package quiz_oop_p1;

public class Square {

    int height;
    int width;
    int surfaceArea;

    public Square(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void computeSurfaceArea() {
        surfaceArea = height * width;
        System.out.println("Surface area of a square");
        System.out.printf("Height = %5d \n Width = %5d \n Surface Area = %5d ", height, width, surfaceArea);
    }

}
