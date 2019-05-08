package Behavioral.Visitor;

public interface TvPartVisitor {

    void visit(Wheel wheel);
    void visit(Fender fender);
    void visit(Oil oil);
    void visit(PartsOrder partsOrder);

}
