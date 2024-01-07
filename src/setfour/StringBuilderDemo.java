package setfour;

public class StringBuilderDemo {

    public static void main(String[] args) {
        // Creating a StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println("StringBuilder after creation: " + stringBuilder);

        // Appending additional characters
        stringBuilder.append(" World");
        System.out.println("StringBuilder after append: " + stringBuilder);

        // Inserting characters at a specific position
        stringBuilder.insert(5, " Java");
        System.out.println("StringBuilder after insert: " + stringBuilder);

        // Deleting characters from a specific position
        stringBuilder.delete(11, 16);
        System.out.println("StringBuilder after delete: " + stringBuilder);

        // Reversing the contents
        stringBuilder.reverse();
        System.out.println("StringBuilder after reverse: " + stringBuilder);

        // Getting the length of the StringBuilder
        int length = stringBuilder.length();
        System.out.println("Length of StringBuilder: " + length);

    }
}
