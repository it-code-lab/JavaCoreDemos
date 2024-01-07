package setfour;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo {

    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using Stream API to filter even numbers, double them, and then print the result
        numbers.stream()
                .filter(n -> n % 2 == 0)          // Filter even numbers
                .map(n -> n * 2)                  // Double the numbers
                .forEach(System.out::println);   // Print the result
    }
}
