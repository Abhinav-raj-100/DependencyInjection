package FactoryMethod;

// example of factory method and achieving the loose coupling.
public class Car {
    private IEngine engine;


    // setter method for dependency injection
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
