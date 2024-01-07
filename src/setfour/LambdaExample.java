package setfour;

// Traditional approach without lambda expression
interface DemoFunctionalInterface {
    void myMethod();
}

public class LambdaExample {
    public static void main(String[] args) {
        // Using an anonymous class
        DemoFunctionalInterface traditionalApproach = new DemoFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Hello, world!");
            }
        };
        traditionalApproach.myMethod();

        // Using a lambda expression
        DemoFunctionalInterface lambdaApproach = () -> System.out.println("Hello, world!");
        lambdaApproach.myMethod();
    }
}