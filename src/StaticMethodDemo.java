// Class with static method
class StaticMethodClass {

    // Static variable
    static int staticCounter = 0;

    // Static method
    public static void incrementCounter() {
        staticCounter++;
    }

    // Method to display the static counter value
    public static void displayStaticCounter() {
        System.out.println("Static Counter: " + staticCounter);
    }
}

// Another class calling the static method
public class StaticMethodDemo {

    public static void main(String[] args) {
        // Calling the static method from the other class to increment the counter
        StaticMethodClass.incrementCounter();

        // Displaying the static counter value using the static method from the other class
        StaticMethodClass.displayStaticCounter();  // Output: Static Counter: 1

        // Creating another instance and calling the static method again
        StaticMethodClass.incrementCounter();

        // Displaying the updated static counter value
        StaticMethodClass.displayStaticCounter();  // Output: Static Counter: 2
    }
}
