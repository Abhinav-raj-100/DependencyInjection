package FieldInjection;

import java.lang.reflect.Field;

// here is the demostration of Field Injection and it's internally using setter method
// Reflection Api is the main hero in this approach.
public class Car {

    // here we need to inject the private variables using the reflection api's.
    private Engine engine;

    // setter function to Set the engine into the private field engine
    public void setEngine(Engine engine)
    {
        this.engine =  engine;
    }

    public void drive()
    {
        engine.start();
    }

    public static void main(String [] args) throws ClassNotFoundException,
            NoSuchFieldException, IllegalAccessException, InstantiationException {


        // here we finding the class using the absolute class path .
       Class<?> myclass =   Class.forName("FieldInjection.Car");


       // here we get the declareField which declared in the class car.
        Field field = myclass.getDeclaredField("engine");

        // here we set the field setAccessible as true to access the private field using reflection api's.
        field.setAccessible(true);

        // making a new object of Car class like new
        Object instance =  myclass.newInstance();

        // here we explicitly type casting the instance into the Car type and store into another variable in car.
        Car car =  (Car) instance;

        // here we call the setter function to set the engine using setter method for private variable.
        car.setEngine(new PetrolEngine());

        // and now we call the function.
        car.drive();

    }
}
