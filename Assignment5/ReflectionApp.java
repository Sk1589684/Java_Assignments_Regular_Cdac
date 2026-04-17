package Assignment5;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionApp {

	 public static void analyzeClass(Class<?> cls) {
	     System.out.println("\nClass Name: " + cls.getName());

	     Method[] methods = cls.getDeclaredMethods();

	     for (Method m : methods) {
	         System.out.println("\nMethod Name: " + m.getName());

	         Parameter[] params = m.getParameters();

	         System.out.println("Parameter Count: " + params.length);

	         for (Parameter p : params) {
	             System.out.println("Param Name: " + p.getName() +
	                                " | Type: " + p.getType().getSimpleName());
	         }

	         // Invoke method if parameters >= 3
	         if (params.length >= 3) {
	             try {
	                 Object obj = cls.getDeclaredConstructor().newInstance();

	                 Object[] args = new Object[params.length];

	                 // Dummy values based on type
	                 for (int i = 0; i < params.length; i++) {
	                     Class<?> type = params[i].getType();

	                     if (type == int.class)
	                         args[i] = 1;
	                     else if (type == String.class)
	                         args[i] = "test";
	                     else
	                         args[i] = null;
	                 }

	                 m.invoke(obj, args);

	             } catch (Exception e) {
	                 System.out.println("Error invoking method: " + e);
	             }
	         }
	     }
	 }

	 public static void main(String[] args) {

	     analyzeClass(Rectangle.class);
	     analyzeClass(Student.class);
	     analyzeClass(Friend.class);
	     analyzeClass(MyClass.class);
	 }
	}