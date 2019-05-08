package Behavioral.Visitor;

public class Wheel implements TvPart {
    @Override
    public void accept(TvPartVisitor visitor) {
        visitor.visit(this);
    }
}
