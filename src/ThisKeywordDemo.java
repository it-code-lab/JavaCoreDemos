public class ThisKeywordDemo {

    // Instance variable
    private int instanceVar;

    // Constructor
    public ThisKeywordDemo(int instanceVar) {
        // Using "this" keyword to distinguish between instance variable and constructor parameter
        this.instanceVar = instanceVar;
    }

    // Method to display the instance variable
    public void displayInstanceVar() {
        // Using "this" keyword to refer to the instance variable
        System.out.println("Instance Variable: " + this.instanceVar);
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        ThisKeywordDemo obj = new ThisKeywordDemo(42);

        // Calling the method to display the instance variable
        obj.displayInstanceVar();  // Output: Instance Variable: 42
    }
}
