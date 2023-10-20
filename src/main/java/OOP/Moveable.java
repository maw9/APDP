package OOP;

public interface Moveable {

    public default void sayAbility() {
        System.out.println("I can move.");
    }
    public abstract void move();

}

class Car implements Moveable {

    @Override
    public void move() {
        System.out.println("I move by using four wheels.");
    }
}

class Ship implements Moveable {

    @Override
    public void sayAbility() {
        System.out.println("I can surf across the sea.");
    }

    @Override
    public void move() {
        System.out.println("I move by using propellers.");
    }
}

class Plane implements Moveable {

    @Override
    public void sayAbility() {
        System.out.println("I can fly.");
    }

    @Override
    public void move() {
        System.out.println("I move by using engine power and wings.");
    }
}

class Travel {

    Moveable car = new Car();
    Moveable ship = new Ship();
    Moveable plane = new Plane();

    public void sayAbilityAndMethod(Moveable vehicle) {
        vehicle.sayAbility();
        System.out.print("And ");
        vehicle.move();
    }

    public static void main(String[] args) {
        Travel program = new Travel();
        program.sayAbilityAndMethod(program.car);
        program.sayAbilityAndMethod(program.ship);
        program.sayAbilityAndMethod(program.plane);
    }

}