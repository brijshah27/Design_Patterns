package Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;
public class PartsOrder {

    private List<TvPart> parts = new ArrayList<>();

    public PartsOrder() {
    }

    public void accept(TvPartVisitor visitor) {
        for (TvPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }

    public void addPart(TvPart part) {
        parts.add(part);
    }

    public List getParts() {
        return this.parts;
    }
}
