package setsix;

// Product interface
interface Product {
    void display();
}

// Concrete product implementations
class ConcreteProductA implements Product {
    @Override
    public void display() {
        System.out.println("Product A");
    }
}

class ConcreteProductB implements Product {
    @Override
    public void display() {
        System.out.println("Product B");
    }
}

// Creator interface with the factory method
interface Creator {
    Product createProduct();
}

// Concrete creator implementations with factory methods
class ConcreteCreatorA implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}

public class FactoryMethodPatternDemo {

    public static void main(String[] args) {
        // Creating products using creators
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        productA.display();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.createProduct();
        productB.display();
    }
}
