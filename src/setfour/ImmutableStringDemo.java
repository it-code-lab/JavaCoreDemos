package setfour;

public class ImmutableStringDemo {

    public static void main(String[] args) {
        // Creating a string
        String testString = "Hello, World!";
        System.out.println("memory reference: " + System.identityHashCode(testString));

        // Concatenating strings creates a new string
        testString = testString.concat(" Welcome");
        System.out.println("memory reference: " + System.identityHashCode(testString));

    }
}
