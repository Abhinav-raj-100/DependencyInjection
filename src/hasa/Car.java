package hasa;

public class Car {

    // here in this example has a relationship is follow in which the Engine compostion and aggregation is used here.
    Engine engine =  new Engine();

    public void drive()
    {
        int s =  engine.start();
        if(s>0)
        {
            System.out.println("Car started...!!");
        }
        else
        {
            System.out.println("Car not started oops....");
        }
    }
}
