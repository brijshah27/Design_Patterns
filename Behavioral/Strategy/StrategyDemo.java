package Behavioral.Strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("12 + 6 = " + context.excecuteStrategy(12,5));

        context = new Context(new OperationMultiply());
        System.out.println("5 * 7 = "+ context.excecuteStrategy(5,7));
    }
}
