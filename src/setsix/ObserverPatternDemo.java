package setsix;

import java.util.ArrayList;
import java.util.List;

// Subject interface
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete subject class
class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers(); // Notify observers when the state changes
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}

// Observer interface
interface Observer {
    void update(int state);
}

// Concrete observer classes
class ConcreteObserverA implements Observer {
    @Override
    public void update(int state) {
        System.out.println("Observer A updated with state: " + state);
    }
}

class ConcreteObserverB implements Observer {
    @Override
    public void update(int state) {
        System.out.println("Observer B updated with state: " + state);
    }
}

// Client code
public class ObserverPatternDemo {

    public static void main(String[] args) {
        // Creating a subject
        ConcreteSubject subject = new ConcreteSubject();

        // Creating observers
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();

        // Registering observers with the subject
        subject.registerObserver(observerA);
        subject.registerObserver(observerB);

        // Changing the state of the subject will notify the observers
        subject.setState(1);
        subject.setState(2);

        // Unregistering an observer
        subject.removeObserver(observerA);

        // Changing the state again
        subject.setState(3);
    }
}
