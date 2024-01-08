package setfour;

public class StringBufferDemo {

    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("memory reference: " + System.identityHashCode(stringBuffer));
        System.out.println("StringBuffer after creation: " + stringBuffer);


        // Appending additional characters
        stringBuffer.append(" World");
        System.out.println("StringBuffer after append: " + stringBuffer);


        // Inserting characters at a specific position
        stringBuffer.insert(5, " Java");
        System.out.println("StringBuffer after insert: " + stringBuffer);

        // Deleting characters from a specific position
        stringBuffer.delete(11, 16);
        System.out.println("StringBuffer after delete: " + stringBuffer);

        // Reversing the contents
        stringBuffer.reverse();
        System.out.println("StringBuffer after reverse: " + stringBuffer);

        // Getting the length of the StringBuffer
        int length = stringBuffer.length();
        System.out.println("Length of StringBuffer: " + length);
        System.out.println("memory reference: " + System.identityHashCode(stringBuffer));

    }
}
