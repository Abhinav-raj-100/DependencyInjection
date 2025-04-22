package isa;

// here this is is-A relation ship for a class Car in which it extends Engine class and depends on it.
public class Car extends Engine{

    public void drive()
    {
        int s = super.start();
        if(s>0)
        {
            System.out.println("Car Started...");
        }
        else
        {
            System.out.println("Car not Started....Oopss!!");
        }
    }
}
