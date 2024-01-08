package partthree;

class MyRunnable implements Runnable {

    String name;
    public MyRunnable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public MyRunnable() {
    }

    public void run() {
        // Code to be executed in the new thread
        try {
            Thread.sleep(1000);  // Simulate some work
            System.out.println(getName() + " processing");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable("Runnable1");
        Thread thread1 = new Thread(myRunnable1);

        MyRunnable myRunnable2 = new MyRunnable("Runnable2");
        Thread thread2 = new Thread(myRunnable2);

        thread1.start();  // This invokes the run method in a new thread
        thread2.start();
    }
}
