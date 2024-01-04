public class AutoboxingDemo {

    public static void main(String[] args) {
        // Autoboxing: Converting int to Integer
        int primitiveInt = 42;
        Integer wrappedInt = primitiveInt;  // Autoboxing

        // Autoboxing: Converting double to Double
        double primitiveDouble = 3.14;
        Double wrappedDouble = primitiveDouble;  // Autoboxing


        // Display the values
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
    }
}
