public class ThisKeywordReturnDemo {

    private int value;

    // Setter method returning the current instance
    public ThisKeywordReturnDemo setValue(int value) {
        this.value = value;
        // Returning the current instance (this)
        return this;
    }

    // Getter method to retrieve the value
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Create an instance and chain method calls
        ThisKeywordReturnDemo obj = new ThisKeywordReturnDemo();

        // Chain multiple method calls and display the final value
        int finalValue = obj.setValue(42).setValue(10).getValue();

        System.out.println("Final Value: " + finalValue);
    }
}
