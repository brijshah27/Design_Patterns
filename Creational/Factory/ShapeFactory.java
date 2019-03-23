package Creational.Factory;

public class ShapeFactory {

    public Shape getShape(String type){
        return new Circle();
    }
}
