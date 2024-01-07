package partthree;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkDemo {

    public static void main(String[] args) {
        // Creating an ExecutorService with a fixed-size thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submitting tasks for execution
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskId + " executed by thread: " + Thread.currentThread().getName());
            });
        }

        // Shutting down the ExecutorService
        executorService.shutdown();
    }
}

