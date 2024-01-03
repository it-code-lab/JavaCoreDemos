public class FinalVariableDemo {

    // Declaration of a final variable
    final int finalVar = 10;

    // Method to display the value of the final variable
    public void displayFinalVariable() {
        System.out.println("Final Variable: " + finalVar);
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        FinalVariableDemo instance = new FinalVariableDemo();

        // Accessing and displaying the final variable using the object
        instance.displayFinalVariable();  // Output: Final Variable: 10

        // Attempting to modify the value of the final variable will result in a compilation error
        // instance.finalVar = 20;  // Uncommenting this line will result in a compilation error
    }
}
