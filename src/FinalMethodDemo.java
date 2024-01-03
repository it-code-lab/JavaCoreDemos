// Base class with a final method
class BaseClass {

    // Final method
    final void displayMessage() {
        System.out.println("This is a final method in the base class.");
    }
}

// Subclass attempting to override the final method (which will result in a compilation error)
class SubClass extends BaseClass {

    // Uncommenting the following method will result in a compilation error
    /*
    void displayMessage() {
        System.out.println("Attempting to override the final method.");
    }
    */
}

public class FinalMethodDemo {

    public static void main(String[] args) {
        // Creating an instance of the base class
        BaseClass baseInstance = new BaseClass();

        // Calling the final method from the base class
        baseInstance.displayMessage();  // Output: This is a final method in the base class.

        // Creating an instance of the subclass
        SubClass subInstance = new SubClass();

        // Uncommenting the following line will result in a compilation error
        // subInstance.displayMessage();
    }
}
