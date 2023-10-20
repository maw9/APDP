package OOP;

public class CustomClass implements CustomInterface{

    @Override
    public void method1() {
        System.out.println("Method 1 implemented");
    }



    public static void main(String[] args) {
        CustomInterface customInterface = new CustomClass();
        customInterface.method1();
        customInterface.method2();
        CustomInterface.method3();
    }
}
