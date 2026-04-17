package Assignment4;

import java.util.*;

class Employee {
    int id;
    String name, dept, designation;
    double salary;

    Employee(int id, String name, double salary, String dept, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        this.designation = designation;
    }

    // Prevent duplicates based on id
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return this.id == e.id;
    }

    public int hashCode() {
        return id;
    }

    public String toString() {
        return id + " " + name + " " + dept + " " + designation + " " + salary;
    }
}

