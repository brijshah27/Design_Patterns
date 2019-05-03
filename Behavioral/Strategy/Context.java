package Behavioral.Strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int excecuteStrategy(int a, int b){
        return this.strategy.doOperation(a,b);
    }
}
