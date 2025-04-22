package looselyCoupling;

public class Car {
    Engine engine;

    public Car(Engine engine)
    {
        this.engine = engine;
    }

    public void drive()
    {

        int start = engine.start();

        if(start==1)
        {
            System.out.println("Car starts with the petrol Engine");
        }
        else if(start ==2)
        {
            System.out.println("Car starts with the Diesel Engine");
        }
        else
        {
            System.out.println("Car doesn't starts due to some reason...!!");
        }
    }

}
