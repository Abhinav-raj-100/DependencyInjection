package looselyCoupling;

public class Main {

    public static void main(String [] args)
    {
        Car car =  new Car(new DieselEngine());
        car.drive();
    }
}
