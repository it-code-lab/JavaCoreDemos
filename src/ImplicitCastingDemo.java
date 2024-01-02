public class ImplicitCastingDemo {

    public static void main(String[] args) {
        // Implicit casting from int to double
        int intValue = 42;
        double doubleValue = intValue; // Implicit casting

        // Display the values before and after casting
        System.out.println("Original int value: " + intValue);
        System.out.println("After implicit casting to double: " + doubleValue);

        // Implicit casting from float to double
        float floatValue = 3.14f;
        double anotherDoubleValue = floatValue; // Implicit casting

        // Display the values before and after casting
        System.out.println("\nOriginal float value: " + floatValue);
        System.out.println("After implicit casting to double: " + anotherDoubleValue);
    }
}
