package Assignment6;

import java.lang.reflect.Method;

public class AnnotationDemo {
    public static void main(String[] args) {

        MyClass obj = new MyClass();

        Method[] methods = MyClass.class.getDeclaredMethods();

        System.out.println("Invoking Annotated Methods:\n");

        for (Method m : methods) {

            // Check if annotation is present
            if (m.isAnnotationPresent(CustomAnnotation.class)) {
                try {
                    m.invoke(obj);   // invoke annotated method
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("\nMethods NOT Annotated:\n");

        for (Method m : methods) {
            if (!m.isAnnotationPresent(CustomAnnotation.class)) {
                System.out.println(m.getName());
            }
        }
    }
}