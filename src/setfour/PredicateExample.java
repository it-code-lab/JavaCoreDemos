package setfour;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using a Predicate to filter even numbers
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // Filtering the list based on the Predicate
        System.out.println("Even numbers:");
        numbers.stream().filter(isEven).forEach(System.out::println);

        // Using a Predicate to filter numbers greater than 5
        Predicate<Integer> isGreaterThan5 = n -> n > 5;

        // Filtering the list based on the new Predicate
        System.out.println("Numbers greater than 5:");
        numbers.stream().filter(isGreaterThan5).forEach(System.out::println);
    }
}