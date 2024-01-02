public class ExplicitCastingDemo {

    public static void main(String[] args) {
        // Explicit casting from double to int
        double doubleValue = 123.456;
        int intValue = (int) doubleValue; // Explicit casting

        // Display the values before and after casting
        System.out.println("Original double value: " + doubleValue);
        System.out.println("After explicit casting to int: " + intValue);

        // Explicit casting from long to int
        long longValue = 9876543210L;
        int anotherIntValue = (int) longValue; // Explicit casting

        // Display the values before and after casting
        System.out.println("\nOriginal long value: " + longValue);
        System.out.println("After explicit casting to int: " + anotherIntValue);
    }
}
