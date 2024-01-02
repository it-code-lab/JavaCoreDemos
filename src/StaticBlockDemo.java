public class StaticBlockDemo {

    // Static variable
    static int staticCounter;

    // Static block for initialization
    static {
        System.out.println("Static block is executed during class loading.");
        // Initializing the static variable
        staticCounter = 42;
    }

    // Method to display the static counter value
    public static void displayStaticCounter() {
        System.out.println("Static Counter: " + staticCounter);
    }

    public static void main(String[] args) {
        // Displaying the static counter value
        displayStaticCounter();  // Output: Static Counter: 42
    }
}
