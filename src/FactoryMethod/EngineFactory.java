package FactoryMethod;


// this is the factory method that is an abstract class EngineFactory which further have been implemented by the
// PetrolEngineFactory and // DieselEngineFactory.
public abstract class EngineFactory {

    public abstract IEngine createInstance();

}
