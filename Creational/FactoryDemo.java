package Creational;

public class FactoryDemo {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
    }
}
