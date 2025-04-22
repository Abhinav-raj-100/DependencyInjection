package FactoryMethod;

public class PetrolEngine implements IEngine {

    @Override
    public void start() {
        System.out.println("Car starts with Petrol Engine");
    }
}
