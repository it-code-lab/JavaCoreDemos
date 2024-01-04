public class LocalVariableDemo {

    public static void main(String[] args) {
        // Declaration and initialization of a local variable
        int localVar = 42;

        // Display the value of the local variable
        System.out.println("Local Variable: " + localVar);

        // Using a local variable in a block of code
        if (localVar > 0) {
            // Creating a new local variable within the block
            int anotherVar = localVar + 10;

            // Displaying the value of the new local variable
            System.out.println("Another Local Variable: " + anotherVar);
        } // The 'anotherVar' variable is not accessible outside the block

        // Attempting to access 'anotherVar' outside the block will result in a compilation error
        //System.out.println("Trying to access anotherVar outside the block: " + anotherVar);
    }
}
