package di;

public class Car {

    private static IEngine engine;

    public static void setEngine(IEngine engine)
    {
        Car.engine = engine;
    }
    public Car(IEngine engine)
    {
        Car.engine = engine;
    }

    public static void drive() {
        int start =  engine.start();
        if(start>=1)
        {
            System.out.println("engine started....");
        }
        else
        {
            System.out.println("Engine in trouble....");
        }

    }



}
