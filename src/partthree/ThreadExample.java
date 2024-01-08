package partthree;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
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


public class ThreadExample {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("Thread1");
        MyThread myThread2 = new MyThread("Thread2");
        myThread1.start();  // This invokes the run method in a new thread
        myThread2.start();
    }
}