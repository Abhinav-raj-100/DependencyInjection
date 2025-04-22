package FactoryMethod;

public class DieselEngine implements  IEngine{


    @Override
    public void start() {
        System.out.println("Car Starts with Diesel Engine...");
    }
}
