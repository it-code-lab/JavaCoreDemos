public class MyClass {
    // Properties
    int number;
    String text;

    // Constructor
    public MyClass(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass myObject = new MyClass(42, "Hello, World!");

        // Accessing object properties and methods
        myObject.display();
    }
}