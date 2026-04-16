package AssignmentQ3;

import java.util.Scanner;

public class ExamApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Java Exam
        Question[] javaQ = {
            new Question(1,"Java is?", "Language","OS","Browser","IDE",1,1),
            new Question(2,"JVM stands for?", "Java VM","Virtual Machine","Both","None",3,1),
            new Question(3,"Which keyword?", "class","int","float","double",1,1),
            new Question(4,"OOP stands for?", "Object Oriented","Option","None","Other",1,1),
            new Question(5,"Extension?", ".java",".txt",".doc",".html",1,1)
        };

        // HTML Exam
        Question[] htmlQ = {
            new Question(1,"HTML stands for?", "Markup","Language","Both","None",3,1),
            new Question(2,"Tag for link?", "<a>","<p>","<div>","<h1>",1,1),
            new Question(3,"Tag for image?", "<img>","<pic>","<image>","<src>",1,1),
            new Question(4,"Tag for heading?", "<h1>","<p>","<br>","<hr>",1,1),
            new Question(5,"HTML is?", "Programming","Markup","OS","DB",2,1)
        };

        Exam javaExam = new Exam(1, "Java Test", "Java", "10-04-2026", javaQ);
        Exam htmlExam = new Exam(2, "HTML Test", "HTML", "10-04-2026", htmlQ);

        char choice;

        do {
            System.out.println("Choose Exam:");
            System.out.println("1. Java");
            System.out.println("2. HTML");

            int opt = sc.nextInt();
            int marks = 0;

            if (opt == 1) {
                marks = javaExam.conductExam(sc);
            } else if (opt == 2) {
                marks = htmlExam.conductExam(sc);
            }

            System.out.println("Total Marks: " + marks);

            if (marks >= 3)
                System.out.println("Congratulations! You passed.");
            else
                System.out.println("Better luck next time.");

            System.out.println("Do you want to continue? (y/n)");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}
