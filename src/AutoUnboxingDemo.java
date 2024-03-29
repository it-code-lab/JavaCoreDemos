public class AutoUnboxingDemo {

    public static void main(String[] args) {
        // Autoboxing: Converting int to Integer
        Integer wrappedInt = 42;

        // Autoboxing: Converting double to Double
        Double wrappedDouble = 3.14;


        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);

        // Auto-unboxing: Converting Integer to int
        int unboxedInt = wrappedInt;  // Auto-unboxing

        // Auto-unboxing: Converting Double to double
        double unboxedDouble = wrappedDouble;  // Auto-unboxing


        // Display the unboxed values
        System.out.println("\nUnboxed int: " + unboxedInt);
        System.out.println("Unboxed double: " + unboxedDouble);
    }
}
