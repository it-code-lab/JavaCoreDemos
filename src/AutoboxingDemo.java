public class AutoboxingDemo {

    public static void main(String[] args) {
        // Autoboxing: Converting int to Integer
        int primitiveInt = 42;
        Integer wrappedInt = primitiveInt;  // Autoboxing

        // Autoboxing: Converting double to Double
        double primitiveDouble = 3.14;
        Double wrappedDouble = primitiveDouble;  // Autoboxing

        // Autoboxing: Converting char to Character
        char primitiveChar = 'A';
        Character wrappedChar = primitiveChar;  // Autoboxing

        // Display the values
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Wrapped Character: " + wrappedChar);

        // Unboxing: Converting Integer to int
        int unboxedInt = wrappedInt;  // Unboxing

        // Unboxing: Converting Double to double
        double unboxedDouble = wrappedDouble;  // Unboxing

        // Unboxing: Converting Character to char
        char unboxedChar = wrappedChar;  // Unboxing

        // Display the unboxed values
        System.out.println("\nUnboxed int: " + unboxedInt);
        System.out.println("Unboxed double: " + unboxedDouble);
        System.out.println("Unboxed char: " + unboxedChar);
    }
}
