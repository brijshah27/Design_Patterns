package Behavioral.Strategy;

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a*b;
    }
}
