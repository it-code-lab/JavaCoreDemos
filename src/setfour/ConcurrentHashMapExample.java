package setfour;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Creating a concurrent hash map
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        // Adding elements in a thread-safe manner
        concurrentMap.put("Key 1", 1);
        concurrentMap.put("Key 2", 2);

        // Iterating over the concurrent map (safe for concurrent access)
        concurrentMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}