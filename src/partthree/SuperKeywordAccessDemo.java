package partthree;

class Animal {

    // Instance variable in the superclass
    private String species;

    // Constructor in the superclass
    public Animal(String species) {
        this.species = species;
    }

    // Method in the superclass
    public void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

class Dog extends Animal {

    // Additional instance variable in the subclass
    private String breed;

    // Constructor in the subclass
    public Dog(String species, String breed) {
        super(species); // Call the constructor of the superclass
        this.breed = breed;
    }

    // Method in the subclass that overrides a method in the superclass
    @Override
    public void displaySpecies() {
        // Using super to call the overridden method in the superclass
        super.displaySpecies();
        System.out.println("Breed: " + breed);
    }
}

public class SuperKeywordAccessDemo {

    public static void main(String[] args) {
        // Creating an instance of the subclass
        Dog myDog = new Dog("Canine", "Labrador");

        // Calling the overridden method in the subclass
        myDog.displaySpecies();
    }
}
