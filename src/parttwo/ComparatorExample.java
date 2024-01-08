package parttwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Create a custom comparator to sort people by age in ascending order
        Comparator<Person> ageComparator = (p1, p2) -> p1.getAge() - p2.getAge();

        // Use the custom comparator to sort the list
        Collections.sort(people, ageComparator);

        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}