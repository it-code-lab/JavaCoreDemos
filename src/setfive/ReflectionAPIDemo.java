package setfive;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

class MyClass {
    private String privateField;

    public MyClass() {
        this.privateField = "Default Value";
    }

    public void myMethod(String message) {
        System.out.println("Executing myMethod: " + message);
    }
}

public class ReflectionAPIDemo {

    public static void main(String[] args) throws Exception {
        // Obtaining Class object using reflection
        Class<?> myClass = MyClass.class;

        // Getting constructors
        Constructor<?>[] constructors = myClass.getDeclaredConstructors();
        System.out.println("Constructors:");
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        // Getting methods
        Method[] methods = myClass.getDeclaredMethods();
        System.out.println("\nMethods:");
        for (Method method : methods) {
            System.out.println(method);
        }

        // Creating an instance using reflection
        Object myObject = myClass.newInstance();

        // Accessing and modifying private field using reflection
        Field privateField = myClass.getDeclaredField("privateField");
        privateField.setAccessible(true); // Allow accessing private fields
        privateField.set(myObject, "New Value");

        // Calling a method with reflection
        Method myMethod = myClass.getDeclaredMethod("myMethod", String.class);
        myMethod.invoke(myObject, "Hello from Reflection!");

        // Accessing the modified private field value
        System.out.println("\nModified Private Field Value: " + privateField.get(myObject));
    }
}
