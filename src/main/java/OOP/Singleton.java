package OOP;

public class Singleton {

    private Singleton() {}

    public static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}

class runSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("Ref of 1 => " + singleton1);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Ref of 2 => " + singleton2);

        Singleton singleton3 = Singleton.getInstance();
        System.out.println("Ref of 3 => " + singleton3);

    }
}
