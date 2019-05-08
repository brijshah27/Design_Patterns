package Behavioral.Visitor;

public class TvPartDisplayVisitor implements TvPartVisitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println("Display wheel");
    }

    @Override
    public void visit(Fender fender) {
        System.out.println("Display fender");
    }

    @Override
    public void visit(Oil oil) {
        System.out.println("Display oil");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("Display full order");
    }
}
