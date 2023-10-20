package design_patterns;

public class StateUsage {

    public static void main(String[] args) {
        StateContext context = new StateContext();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(startState.toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(stopState.toString());

    }

}

interface State {
    void doAction(StateContext context);
}

class StartState implements State {

    @Override
    public void doAction(StateContext context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}

class StopState implements State {

    @Override
    public void doAction(StateContext context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}

class StateContext {
    State state;

    public StateContext() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

