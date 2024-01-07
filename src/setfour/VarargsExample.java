package setfour;

public class VarargsExample {

    // Method with variable arguments
    public static int sum(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {
        // Calling the sum method with different numbers of arguments
        int result1 = sum(1, 2, 3, 4, 5);
        int result2 = sum(10, 20, 30);
        int result3 = sum(5);

        System.out.println("Result 1: " + result1);  // Output: 15
        System.out.println("Result 2: " + result2);  // Output: 60
        System.out.println("Result 3: " + result3);  // Output: 5
    }
}