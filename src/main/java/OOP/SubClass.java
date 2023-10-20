package OOP;

public class SubClass extends SuperClass {

    int num = 10;

    @Override
    public void display() {
        System.out.println("It is a sub class's display");
    }

    public void myMethod() {
        SubClass subClass = new SubClass();
        subClass.display();
        System.out.println("num property of sub class is " + this.num);

        super.display();
        System.out.println("num property of super class is " + super.num);
    }

    public static void main(String[] args) {
        SubClass program = new SubClass();
        program.myMethod();
    }
}
