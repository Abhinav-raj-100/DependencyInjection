package FactoryMethod;


// Petrol factory Method that implemented the EngineFactory class.
public class PetrolEngineFactory extends EngineFactory{
    @Override
    public IEngine createInstance() {
        return new  PetrolEngine();
    }
}
