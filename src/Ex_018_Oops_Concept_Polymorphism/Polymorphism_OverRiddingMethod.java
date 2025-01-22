package Ex_018_Oops_Concept_Polymorphism;

// Method OverRinding or Run time Polymorphism
class Vehicle{
    void start()
    {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle{
    void start()
    {
        System.out.println("Car is started using car");
    }
}
public class Polymorphism_OverRiddingMethod {
    public static void main(String[] args) {

        Car obj = new Car();
        obj.start();
    }
}
