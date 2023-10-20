package design_patterns;

public class StrategyUsage {

    public static void main(String[] args) {
        OperationAdd add = new OperationAdd();
        Context context = new Context(add);
        System.out.println("Result = " + context.executeStrategy(1, 1));

        OperationSubtract subtract = new OperationSubtract();
        context = new Context(subtract);
        System.out.println("Result = " + context.executeStrategy(2, 1));


        OperationMultiply multiply = new OperationMultiply();
        context = new Context(multiply);
        System.out.println("Result = " + context.executeStrategy(15, 15));
    }

}

interface Strategy {

    int doOperation(int num1, int num2);

}

class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

class OperationSubtract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}