package setfour;

public class ImmutableStringDemo {

    public static void main(String[] args) {
        // Creating a string
        String originalString = "Hello, World!";

        // Concatenating strings creates a new string
        String newString = originalString.concat(" Welcome");

        // Printing the original and new strings
        System.out.println("Original String: " + originalString);
        System.out.println("New String: " + newString);

        // Strings remain unchanged
        System.out.println("Original String after concatenation: " + originalString);

        // Reassigning a reference to a new string
        originalString = originalString.concat(" Goodbye");

        // Printing the updated original string
        System.out.println("Updated Original String: " + originalString);

        // Strings remain unchanged even after reassignment
        System.out.println("New String after reassignment: " + newString);
    }
}
