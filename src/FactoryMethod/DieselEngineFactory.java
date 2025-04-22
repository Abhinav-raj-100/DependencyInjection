package FactoryMethod;


// factory method for the enginefactory class.
public class DieselEngineFactory extends EngineFactory{

    @Override
    public IEngine createInstance() {
        return new DieselEngine();
    }
}
