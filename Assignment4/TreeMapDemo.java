package Assignment4;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, Employee> map = new TreeMap<>();

        map.put(1, new Employee(1, "A", 50000, "IT", "Dev"));
        map.put(2, new Employee(2, "B", 60000, "HR", "Mgr"));

        for (Employee e : map.values()) {
            System.out.println(e);
        }
    }
}