package setsix;

// Abstract product interfaces
interface Button {
    void display();
}

interface Checkbox {
    void display();
}

// Concrete product implementations
class MacOSButton implements Button {
    @Override
    public void display() {
        System.out.println("MacOS Button");
    }
}

class WindowsButton implements Button {
    @Override
    public void display() {
        System.out.println("Windows Button");
    }
}

class MacOSCheckbox implements Checkbox {
    @Override
    public void display() {
        System.out.println("MacOS Checkbox");
    }
}

class WindowsCheckbox implements Checkbox {
    @Override
    public void display() {
        System.out.println("Windows Checkbox");
    }
}

// Abstract factory interface
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Concrete factory implementations
class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

// Client code using the abstract factory
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        // Creating a MacOS GUI using the MacOSFactory
        GUIFactory macosFactory = new MacOSFactory();
        Button macosButton = macosFactory.createButton();
        Checkbox macosCheckbox = macosFactory.createCheckbox();

        macosButton.display();
        macosCheckbox.display();

        // Creating a Windows GUI using the WindowsFactory
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        Checkbox windowsCheckbox = windowsFactory.createCheckbox();

        windowsButton.display();
        windowsCheckbox.display();
    }
}
