package setfour;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SynchronizedCollectionExample {
    public static void main(String[] args) {
        // Creating a synchronized list
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());

        // Adding elements in a thread-safe manner
        synchronized (synchronizedList) {
            synchronizedList.add("Item 1");
            synchronizedList.add("Item 2");
        }

        // Iterating over the synchronized list
        synchronized (synchronizedList) {
            for (String item : synchronizedList) {
                System.out.println(item);
            }
        }
    }
}