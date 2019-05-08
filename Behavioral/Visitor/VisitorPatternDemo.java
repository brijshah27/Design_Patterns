package Behavioral.Visitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        order.accept(new TvPartDisplayVisitor());
        order.accept(new TvPartDisplayVisitor());
    }
}
