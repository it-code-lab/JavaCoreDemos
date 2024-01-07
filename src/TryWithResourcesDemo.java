import java.util.Scanner;

public class TryWithResourcesDemo {

    public static void main(String[] args) {
        // Using try-with-resources with a Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
        } catch (Exception e) {
            // Exception handling, if necessary
            System.out.println("An error occurred: " + e.getMessage());
        }
        // Scanner is automatically closed when the try block is exited
    }
}
