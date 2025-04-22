package FactoryMethod;

public class DieselEngineFactory extends EngineFactory{

    @Override
    public IEngine createInstance() {
        return new DieselEngine();
    }
}
