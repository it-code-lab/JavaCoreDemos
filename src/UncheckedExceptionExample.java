public class UncheckedExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length(); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("A NullPointerException occurred: " + e.getMessage());
        }
    }
}