package Creational.AbstractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String type) {
        if(type.equals("RECTANGLE")){
            return new Rectangle();
        }
        if(type.equals("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}
