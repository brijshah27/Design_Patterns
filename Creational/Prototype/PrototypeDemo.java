package Creational.Prototype;

public class PrototypeDemo {

    public static void main(String[] args){
        Prototype object1 = new Prototype();
        System.out.println(object1);
        Prototype object2 = (Prototype) object1.clone();
        System.out.println(object2);
    }
}
