public class VolatileDemo {

    // Volatile variable
    private volatile boolean flag = false;

    // Method to toggle the value of the volatile variable
    public void toggleFlag() {
        flag = !flag;
    }

    // Method to display the value of the volatile variable
    public void displayFlag() {
        System.out.println("Flag: " + flag);
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        VolatileDemo volatileInstance = new VolatileDemo();

        // Creating and starting two threads
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                volatileInstance.toggleFlag();
                volatileInstance.displayFlag();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                volatileInstance.toggleFlag();
                volatileInstance.displayFlag();
            }
        });

        thread1.start();
        thread2.start();
    }
}
