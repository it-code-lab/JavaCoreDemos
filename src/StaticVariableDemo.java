public class StaticVariableDemo {

    // Static variable
    static int staticCounter = 0;

    // Constructor
    public StaticVariableDemo() {
        // Incrementing the static counter in the constructor
        staticCounter++;
    }

    public static void main(String[] args) {
        // Creating instances of StaticVariableDemo
        StaticVariableDemo instance1 = new StaticVariableDemo();
        StaticVariableDemo instance2 = new StaticVariableDemo();
        StaticVariableDemo instance3 = new StaticVariableDemo();

        // Displaying the static counter value without a static method
        System.out.println("Static Counter: " + staticCounter);  // Output: Static Counter: 3
    }
}
