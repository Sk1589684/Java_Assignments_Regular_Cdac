package Assignment11;

import java.io.*;
import java.util.*;

class Student {
    int id;
    String name, degree, email;

    Student(int id, String name, String degree, String email) {
        this.id = id;
        this.name = name;
        this.degree = degree;
        this.email = email;
    }

    // Convert to CSV format
    public String toCSV() {
        return id + "," + name + "," + degree + "," + email;
    }
}

