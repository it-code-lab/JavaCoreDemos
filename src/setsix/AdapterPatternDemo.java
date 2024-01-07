package setsix;

// Target interface
interface Target {
    void request();
}

// Adaptee (the class with an incompatible interface)
class Adaptee {
    public void specificRequest() {
        System.out.println("Specific Request from Adaptee");
    }
}

// Adapter class implementing the Target interface and wrapping the Adaptee
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

// Client code using the Target interface
public class AdapterPatternDemo {

    public static void main(String[] args) {
        // Using the Adapter to make the Adaptee compatible with the Target interface
        Adaptee adaptee = new Adaptee();
        Target targetAdapter = new Adapter(adaptee);

        // Client interacts with the Target interface
        targetAdapter.request();
    }
}
