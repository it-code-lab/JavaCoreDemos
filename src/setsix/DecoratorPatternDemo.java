package setsix;

// Component interface
interface Coffee {
    String getDescription();
    double cost();
}

// Concrete component
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}

// Decorator abstract class
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }
}

// Concrete decorator classes
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Milk";
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Sugar";
    }

    @Override
    public double cost() {
        return super.cost() + 0.2;
    }
}

// Client code
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        // Creating a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Simple Coffee: " + simpleCoffee.getDescription() + ", Cost: $" + simpleCoffee.cost());

        // Decorating the coffee with Milk
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Milk Coffee: " + milkCoffee.getDescription() + ", Cost: $" + milkCoffee.cost());

        // Decorating the coffee with Sugar
        Coffee sugarCoffee = new SugarDecorator(simpleCoffee);
        System.out.println("Sugar Coffee: " + sugarCoffee.getDescription() + ", Cost: $" + sugarCoffee.cost());

        // Combining multiple decorators
        Coffee milkAndSugarCoffee = new SugarDecorator(new MilkDecorator(simpleCoffee));
        System.out.println("Milk and Sugar Coffee: " + milkAndSugarCoffee.getDescription() + ", Cost: $" + milkAndSugarCoffee.cost());
    }
}
