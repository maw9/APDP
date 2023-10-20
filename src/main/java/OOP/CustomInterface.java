package OOP;

public interface CustomInterface {

    public void method1();

    public default void method2() {
        System.out.println("Inside default method 2");
        method4();
        method5();
    }

    public static void method3() {
        System.out.println("Inside static method 3");
        method5();
    }

    private void method4() {
        System.out.println("Non static private method");
    }

    private static void method5() {
        System.out.println("Private static private method");
    }

}
