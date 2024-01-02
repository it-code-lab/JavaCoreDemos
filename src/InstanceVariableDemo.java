public class InstanceVariableDemo {

    // Instance variable
    int instanceVar = 42;

    // Constructor
    public InstanceVariableDemo() {
        // Accessing the instance variable within the constructor
        System.out.println("Inside constructor - Instance Variable: " + instanceVar);
    }

    // Method to display the instance variable
    public void displayInstanceVariable() {
        // Accessing the instance variable within a method
        System.out.println("Inside method - Instance Variable: " + instanceVar);
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        InstanceVariableDemo instance = new InstanceVariableDemo();

        // Accessing the instance variable using the object
        System.out.println("Outside the class - Instance Variable: " + instance.instanceVar);

        // Calling a method that accesses the instance variable
        instance.displayInstanceVariable();
    }
}
