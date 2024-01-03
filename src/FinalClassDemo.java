// Final class that cannot be subclassed
final class FinalClass {

    // Method in the final class
    void displayMessage() {
        System.out.println("This is a method in the final class.");
    }
}

// Uncommenting the following line will result in a compilation error
// class SubClass extends FinalClass {}

public class FinalClassDemo {

    public static void main(String[] args) {
        // Creating an instance of the final class
        FinalClass finalInstance = new FinalClass();

        // Calling the method from the final class
        finalInstance.displayMessage();  // Output: This is a method in the final class.
    }
}
