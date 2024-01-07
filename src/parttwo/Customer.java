package parttwo;

import java.util.Set;
import java.util.TreeSet;

public class Customer implements Comparable<Customer> {
    private int id;
    private String name;
    private String address;

    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Customer other) {
        return this.name.compareTo(other.name);
    }

    public static void main(String[] args) {
        // Create a TreeSet with a natural ordering based on the compareTo method
        Set<Customer> sortedCustomers = new TreeSet<>();

        // Add customers to the TreeSet
        sortedCustomers.add(new Customer(1, "John", "123 Main St"));
        sortedCustomers.add(new Customer(2, "Alice", "456 Oak St"));
        sortedCustomers.add(new Customer(3, "Bob", "789 Pine St"));

        // Adding a new customer automatically places it in sorted order
        sortedCustomers.add(new Customer(4, "Charlie", "555 Elm St"));

        // Print the sorted customers
        for (Customer customer : sortedCustomers) {
            System.out.println(customer.getName());
        }
    }
}