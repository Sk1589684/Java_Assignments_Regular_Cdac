package Assignment6;

import java.lang.annotation.*;
import java.lang.reflect.*;

// ----------- Step 1: Create Custom Annotation -----------

@Retention(RetentionPolicy.RUNTIME)   // available at runtime
@Target(ElementType.METHOD)           // only for methods
@interface CustomAnnotation {
}

// ----------- Step 2: Create MyClass -----------

class MyClass {

    @CustomAnnotation
    public void method1() {
        System.out.println("method1 executed");
    }

    public void method2() {
        System.out.println("method2 executed");
    }

    @CustomAnnotation
    public void method3() {
        System.out.println("method3 executed");
    }

    public void method4() {
        System.out.println("method4 executed");
    }
}

// ----------- Step 3: Reflection Logic -----------


