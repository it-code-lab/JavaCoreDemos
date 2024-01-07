import java.util.Scanner;

public class ExceptionHandlingDemo {

    // Method that throws a custom exception
    private static void divideAndPrintResult(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        int result = numerator / denominator;
        System.out.println("Result of division: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Calling the method that may throw an exception
            divideAndPrintResult(numerator, denominator);

        } catch (ArithmeticException e) {
            // Catching the specific exception (ArithmeticException)
            System.out.println("Exception caught: " + e.getMessage());

        } catch (Exception e) {
            // Catching a more general exception (Exception)
            System.out.println("General Exception caught: " + e.getMessage());

        } finally {
            // The finally block is executed regardless of whether an exception occurred or not
            System.out.println("Finally block executed");

            // Closing resources (e.g., Scanner)
            scanner.close();
        }
    }
}
