package FactoryMethod;

public class Car {
    private IEngine engine;


    public void drive(EngineFactory engineFactory)
    {
        engine =  engineFactory.createInstance();
        engine.start();
    }

    public static void main(String [] args)
    {
        Car car =  new Car();

        car.drive(new PetrolEngineFactory());

        car.drive(new DieselEngineFactory());
    }

}
