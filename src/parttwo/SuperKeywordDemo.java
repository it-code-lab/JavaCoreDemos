package parttwo;

class Animal {

    private String species;

    // Constructor in the superclass
    public Animal(String species) {
        this.species = species;
        System.out.println("Animal constructor called");
    }

    public void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

class Dog extends Animal {

    private String breed;

    // Constructor in the subclass
    public Dog(String species, String breed) {
        super(species); // Call the constructor of the superclass
        this.breed = breed;
        System.out.println("Dog constructor called");
    }

    // Additional method in the subclass
    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

public class SuperKeywordDemo {

    public static void main(String[] args) {
        // Creating an instance of the subclass
        Dog myDog = new Dog("Canine", "Labrador");

        // Calling methods from both the superclass and the subclass
        myDog.displaySpecies(); // Output: Species: Canine
        myDog.displayBreed();   // Output: Breed: Labrador
    }
}

