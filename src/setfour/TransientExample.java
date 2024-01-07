package setfour;

import java.io.*;

class Person implements Serializable {
    private String name;
    private transient int age; // The 'age' field is marked as transient

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class TransientExample {
    public static void main(String[] args) {
        // Serialize a Person object
        try {
            Person person = new Person("Alice", 30);

            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Person object serialized and saved to person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize a Person object
        try {
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Person deserializedPerson = (Person) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Person object deserialized: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}