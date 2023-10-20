package design_patterns;

public class SingletonUsage {

    public static void main(String[] args) {
        SingletonObject object = SingletonObject.getInstance("Kaung Maw");
        object.showMessage();
        SingletonObject object1 = SingletonObject.getInstance("Nilar");
        object.showMessage();

        System.out.println(object);
        System.out.println(object1);
    }

}

class SingletonObject {

    public String name;

    private static SingletonObject instance;
    private static boolean isCreated = false;


    private SingletonObject(String name) {
        this.name = name;
    }

    public static SingletonObject getInstance(String name) {
        if (!isCreated) {
            instance = new SingletonObject(name);
            isCreated = true;
        }

        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, " + name);
    }
}
