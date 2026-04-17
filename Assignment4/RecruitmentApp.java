package Assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RecruitmentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Student, List<String>> map = new HashMap<>();

        int ch;
        do {
            System.out.println("1.Add Student 2.Add Skill 3.Display 4.Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Student s = new Student(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
                    map.put(s, new ArrayList<>());
                    break;

                case 2:
                    int id = sc.nextInt();
                    for (Student st : map.keySet()) {
                        if (st.sid == id) {
                            map.get(st).add(sc.next());
                        }
                    }
                    break;

                case 3:
                    for (Student st : map.keySet()) {
                        System.out.println(st + " Skills: " + map.get(st));
                    }
                    break;
            }
        } while (ch != 4);
    }
}
