package design_patterns;

import java.util.ArrayList;
import java.util.List;

public class ObserverUsage {

    public static void main(String[] args) {
        Subject myAge = new Subject();
        myAge.setState(18);

        new BinaryObserver(myAge);
        new HexObserver(myAge);
        new OctalObserver(myAge);

        myAge.setState(19);
        myAge.setState(20);
    }

}

class Subject {

    List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer each: observers)
            each.update();
    }
}

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.attachObserver(this);
    }

    @Override
    public void update() {
        System.out.println("State changed for binary: " + Integer.toBinaryString(subject.getState()));
    }
}

class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        subject.attachObserver(this);
    }

    @Override
    public void update() {
        System.out.println("State changed for hex: " + Integer.toHexString(subject.getState()));
    }
}

class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attachObserver(this);
    }

    @Override
    public void update() {
        System.out.println("State changed for octal: " + Integer.toOctalString(subject.getState()));
    }
}
