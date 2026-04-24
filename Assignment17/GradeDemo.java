package Assignment17;

import java.util.*;

enum Grade {
    Distinction(80, 100),
    First(65, 79),
    Second(50, 64),
    Pass(40, 49),
    Fail(0, 39);

    int min, max;

    Grade(int min, int max) {
        this.min = min;
        this.max = max;
    }

    void display() {
        System.out.println("Min Marks: " + min);
        System.out.println("Max Marks: " + max);
    }
}

public class GradeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Grade (Distinction, First, Second, Pass, Fail): ");
        String input = sc.next();

        Grade g = Grade.valueOf(input);

        g.display();
    }
}