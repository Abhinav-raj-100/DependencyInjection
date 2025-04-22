package FieldInjection;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Car starts with the Petrol engine...!!");
    }
}
