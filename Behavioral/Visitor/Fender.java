package Behavioral.Visitor;

public class Fender implements TvPart {
    @Override
    public void accept(TvPartVisitor visitor) {
        visitor.visit(this);
    }
}
