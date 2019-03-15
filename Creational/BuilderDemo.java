package Creational;

public class BuilderDemo {

    public static void main(String[] args) {

        //create object of build which will build the builder class
        Builder.Build object= new Builder.Build();

        //add properties to build
        object.addA("string A is present");

        object.addB("string B is present");

        object.addC("string C is present");

        object.addD("string D is present");

        //build builder class
        Builder result = object.build();

        //access results of builder
        System.out.println(result.getAddA());
        System.out.println(result.getAddB());
        System.out.println(result.getAddC());
        System.out.println(result.getAddD());
    }
}
