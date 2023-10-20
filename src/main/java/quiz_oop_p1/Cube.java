package quiz_oop_p1;

public class Cube {

    public int calculateCube(int num) {
        return  num + num + num;
    }

    public static void main(String[] args) {
        Cube cube = new Cube();
        int result = cube.calculateCube(5);
        System.out.println("Cube result : " + result);
    }

}
