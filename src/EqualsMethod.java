public class EqualsMethod {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        boolean usingEqualsMethod = str1.equals(str2);

        System.out.println(usingEqualsMethod); // Outputs: true
    }
}
