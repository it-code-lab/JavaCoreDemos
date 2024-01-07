package setfour;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Custom annotation definition
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyCustomAnnotation {
    String value() default "Default Value";
    int count() default 1;
}

// Class using the custom annotation
public class CustomAnnotationDemo {

    // Applying the custom annotation to a method
    @MyCustomAnnotation(value = "Hello Annotation", count = 3)
    public static void myAnnotatedMethod() {
        System.out.println("Executing annotated method");
    }

    public static void main(String[] args) {
        // Retrieving and displaying values from the annotation
        MyCustomAnnotation annotation = null;
        try {
            annotation = CustomAnnotationDemo.class
                    .getDeclaredMethod("myAnnotatedMethod")
                    .getAnnotation(MyCustomAnnotation.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        System.out.println("Annotation Value: " + annotation.value());
        System.out.println("Annotation Count: " + annotation.count());
    }
}

