import java.util.Scanner;

public class IfElseDemo {

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Using if-else statement to check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Closing the Scanner
        scanner.close();
    }
}
