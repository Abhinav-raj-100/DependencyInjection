package FactoryMethod;

public class PetrolEngineFactory extends EngineFactory{
    @Override
    public IEngine createInstance() {
        return new  PetrolEngine();
    }
}
