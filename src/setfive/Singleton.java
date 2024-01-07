package setfive;

public class Singleton {

    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {
        // Initialization code, if any
    }

    // Public method to get the instance (creating it if necessary)
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods of the singleton class
    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }

    public static void main(String[] args) {
        // Getting the singleton instance
        Singleton singleton = Singleton.getInstance();

        // Using methods of the singleton instance
        singleton.showMessage();
    }
}
