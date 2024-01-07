package setfour;

class Animal {
    // Class representing a generic Animal
}

class Dog extends Animal {
    // Class representing a specific type of Animal (Dog)
}

class Cat extends Animal {
    // Class representing a specific type of Animal (Cat)
}

public class InstanceOfDemo {

    public static void main(String[] args) {
        // Creating instances of different classes
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Using instanceof to check the type of objects
        System.out.println("Is genericAnimal an instance of Animal? " + (genericAnimal instanceof Animal));
        System.out.println("Is myDog an instance of Dog? " + (myDog instanceof Dog));
        System.out.println("Is myDog an instance of Animal? " + (myDog instanceof Animal));
        System.out.println("Is myCat an instance of Cat? " + (myCat instanceof Cat));
        System.out.println("Is myCat an instance of Animal? " + (myCat instanceof Animal));
    }
}
