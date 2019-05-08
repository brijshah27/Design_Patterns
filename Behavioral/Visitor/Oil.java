package Behavioral.Visitor;

public class Oil implements TvPart {
    @Override
    public void accept(TvPartVisitor visitor) {
        visitor.visit(this);
    }
}
