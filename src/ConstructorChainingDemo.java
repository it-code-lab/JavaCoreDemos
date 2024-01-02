public class ConstructorChainingDemo {

    private int value1;
    private int value2;

    // Constructor with one parameter
    public ConstructorChainingDemo(int value1) {
        // Call the parameterized constructor using "this" keyword
        this(value1, 0);
    }

    // Parameterized constructor with two parameters
    public ConstructorChainingDemo(int value1, int value2) {
        // Assign values to instance variables
        this.value1 = value1;
        this.value2 = value2;
    }

    // Method to display values
    public void displayValues() {
        System.out.println("Value1: " + value1);
        System.out.println("Value2: " + value2);
    }

    public static void main(String[] args) {
        // Create an instance using the constructor with one parameter
        ConstructorChainingDemo obj1 = new ConstructorChainingDemo(10);

        // Display values
        System.out.println("Object 1:");
        obj1.displayValues();

        // Create an instance using the parameterized constructor
        ConstructorChainingDemo obj2 = new ConstructorChainingDemo(20, 30);

        // Display values
        System.out.println("\nObject 2:");
        obj2.displayValues();
    }
}
