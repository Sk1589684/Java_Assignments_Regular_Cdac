package Assignment4;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Employee> set = new HashSet<>();

        set.add(new Employee(1, "A", 50000, "IT", "Dev"));
        set.add(new Employee(2, "B", 60000, "HR", "Mgr"));
        set.add(new Employee(1, "C", 70000, "IT", "Lead")); // duplicate ID

        for (Employee e : set) {
            System.out.println(e);
        }
    }
}
