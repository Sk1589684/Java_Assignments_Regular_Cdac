package Assignment4;

import java.util.*;

class Student {
    int sid;
    String name, degree;
    double marks;

    Student(int sid, String name, String degree, double marks) {
        this.sid = sid;
        this.name = name;
        this.degree = degree;
        this.marks = marks;
    }

    public boolean equals(Object o) {
        return sid == ((Student)o).sid;
    }

    public int hashCode() {
        return sid;
    }

    public String toString() {
        return sid + " " + name + " " + degree;
    }
}

