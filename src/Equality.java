public class Equality {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = str1; // Both str1 and str3 reference the same object

        boolean usingEqualityOperator = (str1 == str2); // false, different objects in memory
        boolean usingEqualityOperator2 = (str1 == str3); // true, same object in memory

        System.out.println(usingEqualityOperator); // Outputs: false
        System.out.println(usingEqualityOperator2); // Outputs: true
    }
}