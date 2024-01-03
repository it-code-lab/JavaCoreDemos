import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter a day number (1-7)
        System.out.print("Enter a day number (1-7): ");
        int dayNumber = scanner.nextInt();

        // Using a switch statement to determine the day of the week
        String dayOfWeek;

        switch (dayNumber) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid day number";
        }

        // Displaying the day of the week
        System.out.println("Day of the week: " + dayOfWeek);

        // Closing the Scanner
        scanner.close();
    }
}
