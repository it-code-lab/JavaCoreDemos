package parttwo;

// Interface definition
interface Vehicle {
    void start();  // Abstract method (no method body)
    void stop();   // Abstract method (no method body)
}

// Class implementing the Vehicle interface
class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    // Additional method specific to the Car class
    public void drive() {
        System.out.println("Car is driving");
    }
}

public class InterfaceImplementationDemo {

    public static void main(String[] args) {
        // Creating an instance of the class that implements the interface
        Car myCar = new Car();

        // Calling methods defined in the interface
        myCar.start();  // Output: Car started
        myCar.stop();   // Output: Car stopped

        // Calling an additional method specific to the Car class
        myCar.drive();  // Output: Car is driving
    }
}
