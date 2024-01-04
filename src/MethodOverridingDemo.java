class Animal {

    // Method in the superclass
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {

    // Overriding the makeSound method in the subclass
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // New method specific to the Dog class
    void barkTwice() {
        System.out.println("Bark! Bark!");
    }
}

public class MethodOverridingDemo {

    public static void main(String[] args) {
        // Create an instance of the superclass
        Animal genericAnimal = new Animal();

        // Call the makeSound method of the superclass
        genericAnimal.makeSound();  // Output: Some generic sound

        // Create an instance of the subclass
        Dog myDog = new Dog();

        // Call the overridden makeSound method of the subclass
        myDog.makeSound();  // Output: Woof! Woof!

    }
}
