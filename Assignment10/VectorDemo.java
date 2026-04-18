package Assignment10;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {

        // Step 1: Create Vector
        Vector<String> vec = new Vector<>();

        // Step 2: Add elements
        vec.add("Apple");
        vec.add("Banana");
        vec.add("Mango");
        vec.add("Orange");
        vec.add("Grapes");

        // Step 3: Use Enumeration to traverse
        Enumeration<String> en = vec.elements();

        System.out.println("Vector Elements using Enumeration:");

        while (en.hasMoreElements()) {
            String element = en.nextElement();
            System.out.println(element);
        }
    }
}
