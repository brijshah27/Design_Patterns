package Creational;

public class ShapeFactory {

    public Shape getShape(String type){
        return new Circle();
    }
}
