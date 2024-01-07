// Custom exception class
class CustomException extends Exception {

    // Constructor with a custom message
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    // Method that may throw a custom exception
    private static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or older");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            // Calling the method that may throw a custom exception
            validateAge(15);

        } catch (CustomException e) {
            // Catching and handling the custom exception
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}
