package Assignment11;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteCSV {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        int ch;
        do {
            System.out.println("1. Add Student 2. Exit");
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.println("Enter id, name, degree, email:");
                list.add(new Student(sc.nextInt(), sc.next(), sc.next(), sc.next()));
            }

        } while (ch != 2);

        // Write to CSV file
        FileWriter fw = new FileWriter("students.csv");
        for (Student s : list) {
            fw.write(s.toCSV() + "\n");
        }
        fw.close();

        System.out.println("Data written to CSV file.");
    }
}
