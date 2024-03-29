public class OuterClass {

    // Static variable in the outer class
    static int outerStaticVariable = 10;

    // Static nested class
    static class StaticNestedClass {

        // Static variable in the nested class
        static int nestedStaticVariable = 20;

        // Static method in the nested class
        static void displayNestedStaticVariable() {
            System.out.println("Nested Static Variable: " + nestedStaticVariable);
        }
    }

    public static void main(String[] args) {
        // Accessing the static variable in the outer class
        System.out.println("Outer Static Variable: " + outerStaticVariable);  // Output: Outer Static Variable: 10


        // Calling the static method in the nested class
        OuterClass.StaticNestedClass.displayNestedStaticVariable();  // Output: Nested Static Variable: 20
    }
}
