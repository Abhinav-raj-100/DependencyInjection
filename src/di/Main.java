package di;

public class Main {

    public static void main(String [] args)
    {
//        Car car = new Car(new PetrolEngine());
        Car.setEngine(new PetrolEngine());
        Car.drive();
    }
}
