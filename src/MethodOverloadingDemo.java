public class MethodOverloadingDemo {

    // Method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method with a String parameter
    public String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        // Create an instance of the class
        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        // Call different overloaded methods
        int sum1 = obj.add(2, 3);
        int sum2 = obj.add(5, 7, 10);
        double sum3 = obj.add(3.5, 2.5);
        String concatenatedString = obj.add("Hello, ", "World!");

        // Display the results
        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
        System.out.println("Concatenated String: " + concatenatedString);
    }
}
