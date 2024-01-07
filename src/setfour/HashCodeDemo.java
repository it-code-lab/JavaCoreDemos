package setfour;

public class HashCodeDemo {
    private int value;
    private String name;

    // Constructor

    public HashCodeDemo(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // Override hashCode method

    @Override
    public int hashCode() {
        int result = 17; // A prime number to start with
        result = 31 * result + value;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    // Other methods...

    public static void main(String[] args) {
        HashCodeDemo obj1 = new HashCodeDemo(42, "Example");
        HashCodeDemo obj2 = new HashCodeDemo(42, "Example");

        System.out.println(obj1.equals(obj2));    // This should print true
        System.out.println(obj1.hashCode() == obj2.hashCode());  // This should also print true
    }
}