package setfour;

// Functional Interface with a single abstract method
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod(String message);
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        MyFunctionalInterface functionalInterface = message -> System.out.println("Message: " + message);

        // Calling the abstract method defined in the functional interface
        functionalInterface.myMethod("Hello, Functional Interface!");
    }
}
